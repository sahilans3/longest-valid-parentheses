# Longest Valid Parentheses

A Java solution to find the length of the longest valid (well-formed) parentheses substring.

## Problem Statement

Given a string containing just the characters `'('` and `')'`, return the length of the longest valid (well-formed) parentheses substring.

### Examples

- **Example 1:**
  - **Input:** `s = "(()"`
  - **Output:** `2`
  - **Explanation:** The longest valid parentheses substring is `"()"`.

- **Example 2:**
  - **Input:** `s = ")()())"`
  - **Output:** `4`
  - **Explanation:** The longest valid parentheses substring is `"()()"`.

- **Example 3:**
  - **Input:** `s = ""`
  - **Output:** `0`

### Constraints

- `0 <= s.length <= 3 * 10^4`
- `s[i]` is `'('` or `')'`.

---

## Approach

This solution uses a **Stack-based** approach:
1. Initialize a stack and push `-1` to serve as a base boundary for valid substrings.
2. Traverse through each character in the string:
   - If `'('` is encountered, push its index onto the stack.
   - If `')'` is encountered:
     - Pop the top index.
     - If the stack becomes empty, push the current index as the new base boundary.
     - Otherwise, compute the current valid length: `i - stack.peek()`, and update the maximum length.

### Complexity
- **Time Complexity:** $O(n)$ where $n$ is the length of the string.
- **Space Complexity:** $O(n)$ to store indices in the stack.

---

## How to Run

### Prerequisites
- Java Development Kit (JDK 8 or higher)

### Compilation and Execution
```bash
# Compile the Java file
javac LongestValidParentheses.java

# Run the program
java LongestValidParentheses
```

Or using Java 11+ single-file execution:
```bash
java LongestValidParentheses.java
```
