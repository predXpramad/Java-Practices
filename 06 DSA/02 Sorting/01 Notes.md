---

# Sorting Algorithms: Comparative Study
> **Focus:** Bubble, Selection, and Insertion Sort

---

## 1. Bubble Sort
**Concept:** Compares adjacent elements and swaps them if they are in the wrong order. The largest element "bubbles" to the end of the array in each iteration.


### Pseudo Code
```text
Procedure BubbleSort(Array):
    n = Array.length
    For i from 0 to n - 1:
        swapped = false
        For j from 0 to n - i - 2:
            If Array[j] > Array[j + 1]:
                Swap(Array[j], Array[j + 1])
                swapped = true
        If swapped == false: Break // Optimization
```

### Implementation

#### Java
```java
public void bubbleSort(int[] nums) {
    int size = nums.length;
    for (int i = 0; i < size; i++) {
        boolean swapped = false;
        for (int j = 0; j < size - i - 1; j++) { 
            if (nums[j] > nums[j + 1]) {
                int temp = nums[j];
                nums[j] = nums[j + 1];
                nums[j + 1] = temp;
                swapped = true;
            }
        }
        if (!swapped) break; 
    }
}
```

#### Python
```python
def bubble_sort(nums):
    n = len(nums)
    for i in range(n):
        swapped = False
        for j in range(0, n - i - 1):
            if nums[j] > nums[j + 1]:
                nums[j], nums[j + 1] = nums[j + 1], nums[j]
                swapped = True
        if not swapped:
            break
```

---

## 2. Selection Sort
**Concept:** Scans the unsorted part to find the absolute minimum value and swaps it into its correct position once per pass.


### Pseudo Code
```text
Procedure SelectionSort(Array):
    n = Array.length
    For i from 0 to n - 1:
        minIndex = i
        For j from i + 1 to n - 1:
            If Array[j] < Array[minIndex]:
                minIndex = j
        Swap(Array[minIndex], Array[i])
```

### Implementation

#### Java
```java
public void selectionSort(int[] nums) {
    int size = nums.length;
    for (int i = 0; i < size - 1; i++) {
        int minIndex = i;
        for (int j = i + 1; j < size; j++) {
            if (nums[minIndex] > nums[j]) {
                minIndex = j;
            }
        }
        int temp = nums[minIndex];
        nums[minIndex] = nums[i];
        nums[i] = temp;
    }
}
```

#### Python
```python
def selection_sort(nums):
    n = len(nums)
    for i in range(n):
        min_idx = i
        for j in range(i + 1, n):
            if nums[j] < nums[min_idx]:
                min_idx = j
        nums[i], nums[min_idx] = nums[min_idx], nums[i]
```

---

## 3. Insertion Sort
**Concept:** Logically splits the array into sorted and unsorted sections. It picks an element and "inserts" it into the correct spot by shifting others.


### Pseudo Code
```text
Procedure InsertionSort(Array):
    For i from 1 to length - 1:
        key = Array[i]
        j = i - 1
        While j >= 0 and Array[j] > key:
            Array[j + 1] = Array[j]
            j = j - 1
        Array[j + 1] = key
```

### Implementation

#### Java
```java
public void insertionSort(int[] arr) {
    for (int i = 1; i < arr.length; i++) { 
        int key = arr[i]; 
        int j = i - 1;
        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j]; 
            j--;
        }
        arr[j + 1] = key; 
    }
}
```

#### Python
```python
def insertion_sort(arr):
    for i in range(1, len(arr)):
        key = arr[i]
        j = i - 1
        while j >= 0 and key < arr[j]:
            arr[j + 1] = arr[j]
            j -= 1
        arr[j + 1] = key
```

---

## 4. Complexity & Summary Table

| Algorithm | Best Case | Average/Worst | Space | Stable? | Key Mechanism |
| :--- | :--- | :--- | :--- | :--- | :--- |
| **Bubble** | $O(N)$ | $O(N^2)$ | $O(1)$ | Yes | Adjacent Swaps |
| **Selection** | $O(N^2)$ | $O(N^2)$ | $O(1)$ | No | Find Min Index |
| **Insertion** | $O(N)$ | $O(N^2)$ | $O(1)$ | Yes | Shifting Elements |

---

## 5. Efficiency Tips
* **Memory Writes:** Selection sort is the winner when "swapping" is expensive (it only swaps $O(N)$ times).
* **Small Data:** Insertion sort often beats $O(N \log N)$ algorithms for arrays smaller than 10-20 elements.
* **Early Exit:** Only Bubble and Insertion can achieve $O(N)$ in the best case if the array is already sorted.

---


---

## 1. Bubble Sort Applications
While rarely used for large datasets due to its $O(N^2)$ nature, it has specific niche uses:
* **Computer Graphics:** Used in "polygon filling" algorithms where the list of edges is nearly sorted, making the $O(N)$ best-case scenario very likely.
* **Simple Educational Tools:** It is the standard "first algorithm" to teach the concept of a "swap" and nested loops.
* **Near-Sorted Data:** If you only have one or two elements out of place in a massive list, a single pass of Bubble Sort can fix it.



## 2. Selection Sort Applications
The defining feature of Selection Sort is that it minimizes **swaps**.
* **Hardware Constraints:** In systems where "writing" to memory is much more expensive than "reading" (like EPROM or Flash memory), Selection Sort is preferred because it performs at most $O(N)$ swaps.
* **Finding the k-th Smallest Element:** You can stop the Selection Sort after $k$ iterations to find the $k$-th smallest element without sorting the entire array.



## 3. Insertion Sort Applications
This is the most "practical" of the three and is used in professional libraries.
* **Hybrid Sorting (Timsort):** Python's `sort()` and Java's `Arrays.sort()` use **Timsort**, which switches to Insertion Sort for small subarrays (usually size < 32) because its constant factors are smaller than QuickSort or MergeSort.
* **Online Algorithms:** If you are receiving data in a stream (one by one) and need to keep the list sorted at all times, Insertion Sort is the natural choice.
* **Real-time Systems:** Because it is stable and efficient for small $N$, it's used in systems where low latency is required for small chunks of data.



---

## How to use them in DSA Problems
When you're in an interview or a coding competition, look for these cues:

1.  **The "In-Place" Constraint:** If a problem asks you to sort with **$O(1)$ Extra Space**, all three are valid candidates.
2.  **The "Nearly Sorted" Hint:** If a problem states the input is "almost sorted," reach for **Insertion Sort**. It will outperform even the fastest $O(N \log N)$ algorithms in this specific case.
3.  **The "Minimal Swaps" Hint:** If the problem involves moving heavy objects (large data structures) where the cost of moving is high, **Selection Sort** is your best bet to minimize those moves.
4.  **Stability Requirement:** If you need to sort a list of objects (like sorting students by "Grade" then by "Name") and must keep the original relative order, avoid Selection Sort. Use **Insertion Sort** instead.