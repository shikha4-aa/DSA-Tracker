📌 1. What is the Base Case?
This is your lifeline. If this is wrong or missing, your recursion is infinite hell.

Ask: When should I stop the recursion?

For N-Queens: if (col == n) → meaning I’ve placed all queens.

✅ Write this separately in your notes:
Base Case: Stop when <condition>. Add result if valid.

📌 2. What Choices Do I Have at Each Step?
Every backtracking is about making a decision from multiple choices.

N-Queens: For each column, I can try placing queen in any row.

Subsets: Include or exclude current element.

Permutations: Choose any unused number.

✅ Note:
At step i, I can choose from <what?>

📌 3. How Do I Know If My Choice Is Valid?
This is the core constraint logic.

N-Queens: Check isSafe — left, upper-left diagonal, lower-left diagonal.

Sudoku: Check if number already in row/col/box.

✅ Note this as your:
Constraint Check: <condition(s)>

📌 4. How Do I Make a Choice (Modify State)?
This is where you update your board/array to reflect your decision.

Place 'Q' on board.

Add number to current path.

Mark as visited.

✅ Note:
Make Move: Modify state before going deeper

📌 5. How Do I Undo the Choice (Backtrack)?
Crucial. Every time you go deeper, you must undo before moving to the next choice.

Remove 'Q'

Pop from list

Mark cell unvisited

✅ Note:
Backtrack Step: Undo the state after returning

📌 6. What Data Structures Am I Using for State?
Stack? List? Array? Set? Know what stores your partial answer and what tracks your visited.

For board problems: Use 2D array.

For subsets: Use list.

For permutations: Use boolean[] or HashSet.

✅ Note:
State Tracking: Using <X> to track current answer / visited

📌 7. Am I Repeating States? Should I Prune?
This is where optimization kicks in.

Skip duplicate numbers in combinations.

Don’t check cells again in Word Search.

Memoize in DP + Backtracking hybrid.

✅ Note:
Pruning Logic / Optimizations