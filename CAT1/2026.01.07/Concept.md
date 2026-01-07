# Celebrity Problem

> Given a party of `n` people represented as a 2D array, find the celebrity.  
> A celebrity is defined as someone who is known by everyone but does not know anyone else.

## `Approach`

* **Definition of Celebrity**  
  - Every person must know the celebrity.  
  - The celebrity must not know any of the guests.

* **Stack-based Candidate Selection**  
  - Push all persons into a stack.  
  - Pop out the top two persons and compare:  
    - If `arr[a][b] == 1`, then `a` knows `b` → discard `a`, keep `b`.  
    - Else, discard `b`, keep `a`.  
  - Repeat until one candidate remains in the stack.

* **Verification Step**  
  - For the candidate `cel`, check:  
    - `arr[i][cel] == 1` for all `i ≠ cel` (everyone knows `cel`).  
    - `arr[cel][i] == 0` for all `i ≠ cel` (`cel` knows no one).  
  - If both conditions hold → `cel` is the celebrity.  
  - Otherwise → no celebrity exists (`-1`).

## `Complexity`

- **Time Complexity:** Linear `O(n)`  
- **Space Complexity:** Linear `O(n)`

## `Notes`

- Use clear variable names (`personA`, `personB`, `candidate`) for readability.  
- Keep the verification step separate from candidate selection.  
- Return the celebrity index from the method instead of printing directly, for reusability.  
- Handle input safely (e.g., `try-with-resources` for `Scanner`).
