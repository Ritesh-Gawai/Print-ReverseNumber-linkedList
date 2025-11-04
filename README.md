# Print Linked List in Reverse

This is a simple Java program that reads a linked list and prints it in reverse order using **recursion**.

---

## 🧠 Problem Statement

Given a number `n` (the size of the linked list) and `n` integers representing the elements of the list, print the elements from **tail to head** (in reverse order).

---

## 🧩 Example

### Input:
5
2 6 8 10 1



### Output:
1 10 8 6 2


## 💡 Approach

We use **recursion** to traverse to the end of the linked list and print elements while the recursive calls return.

### Steps:
1. Build a linked list from the input.
2. Call the recursive `reverse()` method.
3. Print data during the returning phase of recursion.

---

## ⚙️ Code Structure
Print-LinkedList-in-Reverse/
├── src/
│ └── Main.java
└── README.md



---

## 🕒 Time & Space Complexity
| Operation | Complexity |
|------------|-------------|
| Time | O(n) |
| Space | O(n) (recursion stack) |

---

## 🧰 Technologies Used
- **Java**
- **Recursion**
- **Linked List**

---

## 🚀 How to Run

### 1️⃣ Compile the code:
```bash
javac src/Main.java
2️⃣ Run the program:
bash
Copy code
java src/Main
3️⃣ Example Run:
makefile

Input:
6
1 2 3 4 5 6

Output:
6 5 4 3 2 1


🧑‍💻 Author
Ritesh Gawai
📍 Aurangabad, Maharashtra
💼 Aspiring Java Developer
