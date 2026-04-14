Here are your **concise + interview-ready revision notes** for Quick Sort 👇

---

# 🔴 4. Quick Sort

## 🔹 Core Concept

* **Divide & Conquer algorithm**
* Pick a **pivot element**, partition array into:

  * Elements **< pivot**
  * Elements **> pivot**
* Recursively sort both halves

👉 Key idea: *Correct position of pivot is fixed after partition*

---

## 🔹 Pseudocode (Lomuto Partition)

```
quickSort(arr, low, high):
    if low < high:
        p = partition(arr, low, high)
        quickSort(arr, low, p-1)
        quickSort(arr, p+1, high)

partition(arr, low, high):
    pivot = arr[high]
    i = low - 1
    for j = low to high-1:
        if arr[j] < pivot:
            i++
            swap(arr[i], arr[j])
    swap(arr[i+1], arr[high])
    return i+1
```

---

## 🔹 Implementations

### 🐍 Python (Lomuto)

```python
def quick_sort(arr, low, high):
    if low < high:
        p = partition(arr, low, high)
        quick_sort(arr, low, p - 1)
        quick_sort(arr, p + 1, high)

def partition(arr, low, high):
    pivot = arr[high]
    i = low - 1
    for j in range(low, high):
        if arr[j] < pivot:
            i += 1
            arr[i], arr[j] = arr[j], arr[i]
    arr[i+1], arr[high] = arr[high], arr[i+1]
    return i + 1
```

---

### ☕ Java (Lomuto)

```java
public static void quickSort(int[] arr, int low, int high) {
    if (low < high) {
        int p = partition(arr, low, high);
        quickSort(arr, low, p - 1);
        quickSort(arr, p + 1, high);
    }
}

public static int partition(int[] arr, int low, int high) {
    int pivot = arr[high];
    int i = low - 1;

    for (int j = low; j < high; j++) {
        if (arr[j] < pivot) {
            i++;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    int temp = arr[i + 1];
    arr[i + 1] = arr[high];
    arr[high] = temp;

    return i + 1;
}
```

---

## 🔹 Multiple Approaches

### 1. Lomuto Partition

* Simple
* More swaps

### 2. Hoare Partition

```
pivot = arr[low]
i = low - 1, j = high + 1
while true:
    do i++ while arr[i] < pivot
    do j-- while arr[j] > pivot
    if i >= j return j
    swap(arr[i], arr[j])
```

* Fewer swaps
* Faster in practice ⭐

---

### 3. Randomized Quick Sort

* Choose random pivot → avoids worst case

---

### 4. Median-of-Three

* Pivot = median of (first, middle, last)
* Improves performance on sorted arrays

---

## 🔹 Complexity

| Case    | Time Complexity       |
| ------- | --------------------- |
| Best    | **O(n log n)**        |
| Average | **O(n log n)**        |
| Worst   | **O(n²)** (bad pivot) |

* Space: **O(log n)** (recursion stack)

---

## 🔹 Problem-Solving Strategy

### ✅ Use Quick Sort When:

* Need **fast average performance**
* Memory is limited (in-place sorting)
* Large datasets

---

### ⚠️ Avoid When:

* Already sorted arrays (if pivot poorly chosen)
* Need guaranteed O(n log n) → use Merge Sort

---

### 💡 Key Tricks

* Random pivot = avoids worst case ⭐
* Tail recursion optimization (reduce stack)
* Switch to insertion sort for small subarrays

---

## 🔹 Real-Life Applications

* Used in many libraries (optimized versions)
* Database sorting
* Search engines (ranking data)
* Large-scale data processing

---

## 🔹 Quick Revision Tips

* Pivot choice decides performance 🔥
* In-place algorithm ✔️
* Not stable ❌
* Faster than Merge Sort in practice (cache friendly)

---

# ⚡ Comparison with Previous Sorts

| Algorithm      | Best       | Worst | Stable | Use Case               |
| -------------- | ---------- | ----- | ------ | ---------------------- |
| Bubble Sort    | O(n)       | O(n²) | ✅      | Learning               |
| Selection Sort | O(n²)      | O(n²) | ❌      | Low swaps              |
| Insertion Sort | O(n)       | O(n²) | ✅      | Nearly sorted          |
| **Quick Sort** | O(n log n) | O(n²) | ❌      | General fast sorting ⭐ |

---

# 🚀 When Solving Problems

👉 If constraints:

* **n ≤ 10⁴ → any sort works**
* **n ≥ 10⁵ → Quick / Merge preferred**
* **Nearly sorted → Insertion Sort**
* **Memory tight → Quick Sort**

---

If you want next, I can give:

* 🔥 Dry run visualization (step-by-step)
* ⚔️ Quick Sort vs Merge Sort deep comparison
* 🧠 Interview problems based on partition logic

Just tell me 👍
