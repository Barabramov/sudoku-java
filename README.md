# Sudoku-Java
A graphical Sudoku game developed using Java and Scene Builder.

## Overview

The game has two main phases:
1. **Board Preparation**: Users fill in the initial Sudoku board they intend to solve.
2. **Solution Phase**: Players solve the board by filling in numbers following Sudoku rules.

## Gameplay Details

### 1. Board Preparation:

- Upon launching, the app presents an empty initial board.
- Users can fill in numbers to set up the Sudoku challenge they wish to tackle.
- After entering a digit in a cell and pressing `Enter`, the program verifies the number's validity based on Sudoku's rules.
    - If the entered number is invalid, an error message will pop up, and the input will be cleared.
- Once users finish setting up the board, they can finalize it by clicking the `Set` button.
    - Post this step, the initial numbers become immutable, and their text color changes to signify their permanence.

### 2. Solution Phase:

- Users can now solve the Sudoku puzzle by filling numbers in the empty cells.
- After inputting a number, pressing `Enter` will validate the number's correctness.
    - Incorrect numbers will trigger an error message and be automatically deleted.
- Players can modify numbers they input during this phase but can't alter the numbers set during the board preparation phase.

### 3. Resetting the Board:

- If users wish to start over, they can reset the board by clicking the `Clear` button, reverting it to its initial empty state.

## Visual Example:
Below are visual demonstrations of the game in action:
- On the left, you can see a board set with some initial numbers (colored red), which cannot be modified.
- On the right is the gameplay where players can fill in the remaining slots as per Sudoku rules.

![Game Setup](https://github.com/Barabramov/sudoku-java/assets/93996218/be3eb85a-8e9b-4a4d-bb74-2235d045e339) &nbsp;&nbsp;&nbsp; ![Gameplay](https://github.com/Barabramov/sudoku-java/assets/93996218/fb03322c-2ab9-405a-8f1c-bb9618c617eb)
