## Data Structures

> Data Structures is all about how we store and retrive data effectively. Rather than dumping all data at random and increasing the memory, we need to find a way store data effectively to retrive and work with data.

Storing Data efficiently means -
1. Performance (We use Algorithms to optimize it)
2. Memory

---

## Algorithm

It is set of instructions.

Example. -
```psuedocode
// Adding Two numbers
Step 1: Take Input of Num1
        Take Input of Num2
Step 2: Add Num1 and Num2 and assign it to 'Sum'.
        Sum = Num1 + Num2
Step 3: Return 'Sum' as Output
        Output Sum
```

The We convert the algorithm into to code to run in a machine.
```python
# Step 1
num1 = 5
num2 = 10

# Step 2
sum = num1 + num2

# Step 3
print(sum)
```

What we need is to figure 

**Introduction to Data Structures & Algorithms (DSA)**
*   **Data structures** are systems used to organize and store data efficiently, focusing on two main metrics: **performance speed and memory conservation**.
*   The entire software industry runs on data; programming languages process it, databases store it, and AI generates or understands it.
*   Companies heavily emphasize DSA in hiring to **reduce server computation costs**, provide a faster user experience, and filter job candidates.
*   **Algorithms** are simply sets of instructions used to perform operations or solve problems. 
*   Before algorithms are written in specific programming languages (like C++, Java, or Python), they are typically drafted as **pseudocode**, which outlines the generic steps required.

**Data Types and Abstract Data Types (ADT)**
*   Variables act as "boxes" for storing data and require specific types.
*   **Primitive data types** are built directly into the system, such as integers for numbers, floats for decimals, and strings for text.
*   **Complex or user-defined data types** represent physical entities in the virtual space, using structures or classes to group different primitive properties together.
*   An **Abstract Data Type (ADT)** pairs specific data with the exact operations that can be performed on it. 
*   Common ADT examples include:
    *   **Queue**: Follows a **First-In-First-Out (FIFO)** sequence (e.g., a line at a coffee shop where the first person in is the first served).
    *   **Stack**: Follows a **Last-In-First-Out (LIFO)** sequence (e.g., a stack of books where the last book placed on top is the first one removed).

**Arrays & Memory Operations**
*   An array allows you to store a sequence of multiple values under a **single variable name**.
*   Array memory is contiguous, with individual elements assigned an **index value starting from zero**.
*   **Reading an array is incredibly fast** because the computer calculates the exact memory address utilizing the index (e.g., `nums` tells the computer to jump directly to `base_memory_address + 3`).
*   **Searching is slow** because the computer does not inherently know where a value lives and must check locations sequentially from the first address.
*   **Inserting or deleting elements in the middle of an array is highly time-consuming**. You cannot simply create an empty space; you must systematically shift all subsequent elements one by one to accommodate the change.

**Algorithm Analysis & Time Complexity**
*   Every coding problem has multiple solutions. Developers analyze algorithms to pick the most efficient one based on **space complexity (reducing memory used) and time complexity (reducing execution time)**.
*   Time complexity should never be measured in actual seconds because processing speeds vary wildly across different computers.
*   Instead, an algorithm's speed is evaluated by calculating the **number of computational steps** it requires as the input data scales.

**Searching Algorithms & Pseudocode**
*   **Linear Search:** Compares a target value against each element in an array one by one. It is highly inefficient because, in the worst-case scenario (where the element is at the very end or doesn't exist), an array with 1,000 values will take 1,000 steps to check.
    *   *Pseudocode mentioned in the sources*:
    ```text
    procedure linear_search(A, target)
        n = length of A
        for i from 0 to n - 1
            if A[i] == target
                return i
        return -1
    ```

*   **Binary Search:** A vastly superior searching method that **requires a sorted array** to function. It drastically cuts down the search time by dividing the array in half repeatedly.
    *   The algorithm calculates a mid-value using the formula `mid = (start + end) / 2`.
    *   If the target is smaller than the mid-value, the algorithm skips the right half of the array. If the target is larger, it skips the left half.
    *   *Pseudocode mentioned in the sources*:
    ```text
    procedure binary_search(A, target)
        left = 0
        right = length of A - 1
        loop while left <= right
            mid = (left + right) / 2
            if A[mid] == target
                return mid
            else if A[mid] < target
                left = mid + 1
            else
                right = mid - 1
        return -1
    ```

**Big O Notation**
*   **Big O Notation** mathematically represents an algorithm's time complexity, tracking how the running time scales as the size of the input data (`n`) increases.
*   **O(1) - Constant Time:** The operation takes the exact same number of steps regardless of how large the dataset gets. Example: Reading a specific index directly from an array.
*   **O(n) - Linear Time:** The number of steps scales directly with the amount of data. This represents the worst-case scenario for a Linear Search.
*   **O(log n) - Logarithmic Time:** An incredibly efficient complexity where **doubling the data size only adds roughly one additional computational step**. Binary search operates at O(log n), making it exponentially faster than linear search for large datasets.

**Practical Implementation of Search Algorithms & Time Complexity**
*   **Performance Comparison:** When tested with a dataset of 1,000 values to find a target near the end, a linear search will take up to 1,000 computational steps. Binary search drastically reduces this; even when doubling the input size, it roughly only adds a single computational step, proving its $O(\log N)$ logarithmic time complexity. 
*   **Iterative Binary Search Implementation:** Binary search relies on updating `left` and `right` boundaries until the `target` matches the `mid` value.
    ```java
    public static int binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        
        while (left <= right) {
            int mid = (left + right) / 2;
            
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1; // target is in the right half
            } else {
                right = mid - 1; // target is in the left half
            }
        }
        return -1; // target not found
    }
    ```
*   **Recursive Binary Search Implementation:** Instead of a `while` loop, the algorithm can call itself recursively, adjusting the `left` and `right` parameters sent into the function.
    ```java
    public static int recursiveBinarySearch(int[] nums, int target, int left, int right) {
        if (left <= right) {
            int mid = (left + right) / 2;
            
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                return recursiveBinarySearch(nums, target, mid + 1, right);
            } else {
                return recursiveBinarySearch(nums, target, left, mid - 1);
            }
        }
        return -1;
    }
    ```

