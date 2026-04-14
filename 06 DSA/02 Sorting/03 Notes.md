Here are your **concise + high-value revision notes** for:

# 🔶 6. Divide and Conquer

---

## 🔹 Core Concept

* Break problem into **smaller subproblems**
* Solve each **recursively**
* **Combine** results to get final answer

👉 Pattern:

1. **Divide**
2. **Conquer**
3. **Combine**

---

## 🔹 General Recurrence Relation

Most divide & conquer algorithms follow:

[
T(n) = aT(n/b) + f(n)
]

* `a` → number of subproblems
* `n/b` → size of each subproblem
* `f(n)` → work done to divide/combine

---

## 🔹 Master Theorem (Quick Use)

Used to solve recurrence:

* If **f(n) < n^log_b(a)** → **O(n^log_b(a))**
* If **f(n) = n^log_b(a)** → **O(n^log_b(a) log n)**
* If **f(n) > n^log_b(a)** → **O(f(n))**

---

## 🔹 Generic Pseudocode

```id="5h3sui"
function divideAndConquer(problem):
    if problem is small:
        return solution

    divide problem into subproblems

    solve subproblems recursively

    combine results

    return result
```

---

## 🔹 Implementations (Example: Merge Sort)

### 🐍 Python

```python id="hvr5pr"
def merge_sort(arr):
    if len(arr) <= 1:
        return arr

    mid = len(arr) // 2
    left = merge_sort(arr[:mid])
    right = merge_sort(arr[mid:])

    return merge(left, right)

def merge(left, right):
    result = []
    i = j = 0

    while i < len(left) and j < len(right):
        if left[i] < right[j]:
            result.append(left[i])
            i += 1
        else:
            result.append(right[j])
            j += 1

    result.extend(left[i:])
    result.extend(right[j:])
    return result
```

---

### ☕ Java

```java id="0vdqew"
public static int[] mergeSort(int[] arr) {
    if (arr.length <= 1) return arr;

    int mid = arr.length / 2;

    int[] left = Arrays.copyOfRange(arr, 0, mid);
    int[] right = Arrays.copyOfRange(arr, mid, arr.length);

    left = mergeSort(left);
    right = mergeSort(right);

    return merge(left, right);
}

public static int[] merge(int[] left, int[] right) {
    int[] result = new int[left.length + right.length];
    int i = 0, j = 0, k = 0;

    while (i < left.length && j < right.length) {
        if (left[i] < right[j])
            result[k++] = left[i++];
        else
            result[k++] = right[j++];
    }

    while (i < left.length) result[k++] = left[i++];
    while (j < right.length) result[k++] = right[j++];

    return result;
}
```

---

## 🔹 Common Algorithms Using Divide & Conquer

* **Merge Sort**
* **Quick Sort**
* **Binary Search**
* **Strassen’s Matrix Multiplication**
* **Closest Pair of Points**
* **Karatsuba Multiplication**

---

## 🔹 Multiple Approaches

### 1. Pure Divide & Conquer

* Solve independently
* Combine results

### 2. Divide & Conquer + Optimization

* Memoization → becomes Dynamic Programming

### 3. Randomized Divide & Conquer

* Example: Randomized Quick Sort

---

## 🔹 Complexity Analysis

Depends on recurrence:

| Algorithm     | Recurrence            | Complexity     |
| ------------- | --------------------- | -------------- |
| Binary Search | T(n) = T(n/2) + O(1)  | O(log n)       |
| Merge Sort    | T(n) = 2T(n/2) + O(n) | O(n log n)     |
| Quick Sort    | T(n) = 2T(n/2) + O(n) | O(n log n) avg |

---

## 🔹 Problem-Solving Strategy

### ✅ When to Use

* Problem can be **split into independent parts**
* Subproblems are **similar to original**
* Need **efficient recursive solution**

---

### 🔍 Identify Pattern

* “Divide array into halves”
* “Solve left & right”
* “Combine results”

---

### ⚠️ Common Mistakes

* Overlapping subproblems → should use DP
* Incorrect combine step
* Stack overflow due to deep recursion

---

## 🔹 Real-Life Applications

* Searching in databases (Binary Search)
* Sorting large datasets
* Image processing (divide pixels)
* Parallel computing (multi-core systems)
* AI/ML algorithms (recursive splitting)

---

## 🔹 Quick Revision Tips

* Always think in **recursion tree** 🌳
* Use **Master Theorem** for time complexity
* Check:

  * Independent subproblems? ✔️ → Divide & Conquer
  * Overlapping? ❌ → Use DP

---

# ⚡ Key Insight (Interview Favorite)

👉 Difference:

| Technique           | Key Idea                |
| ------------------- | ----------------------- |
| Divide & Conquer    | Independent subproblems |
| Dynamic Programming | Overlapping subproblems |

---

# 🚀 How to Use in Problems

1. Check if problem can be split into smaller parts
2. Ensure subproblems are similar
3. Solve recursively
4. Carefully design **combine step** ⭐

---

If you want next, I can give:

* 🔥 Master Theorem shortcut tricks (super fast solving)
* 🧠 Important GATE/interview problems on Divide & Conquer
* ⚔️ Divide & Conquer vs Greedy vs DP comparison

Just tell me 👍
