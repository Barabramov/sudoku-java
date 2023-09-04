# sudoku-java
Graphic sudoku game program, build with scene builder.

## game progress:

- In the first stage (the board preparation stage) the application will show the user an empty initial board and the user will be able to insert digits in the empty slots according to the sudoku board he wants to solve. Entering a number and pressing enter in any cell will cause the program to check the correctness of the number (that is, that the number is correct and that he does not contradict the rules of the game so far). If the number is incorrect, a corresponding message will be displayed and the number will be deleted.
  
- At the end of the board preparation stage, the user will press the set button and then the user will not be able to change any more the set of numbers determined as part of preparing the board. The text color will be changed so that the user will see a difference between the fixed numbers and the numbers he will enter later.

- Now the user starts the solution phase. At this stage the user enters numbers in the empty cells and presses enter after entering each number. Pressing enter in any cell causes the program to check the correctness of the entered number. If the number is incorrect, a corresponding message will be displayed and the number will be deleted. The user can change the numbers they entered at this stage, but cannot change numbers that were entered during the board preparation phase.
  
- Pressing the clear button will clear the entire board and the user will be able to prepare new board. <br /><br />

### Illustrative example:
##### After adding values ​​in the empty board and defining the board with the set button, the game is ready. The values ​​defined on the board are colored red and cannot be changed, and the rest of the slots must be filled in according to the rules of the game.
![play](https://github.com/Barabramov/sudoku-java/assets/93996218/be3eb85a-8e9b-4a4d-bb74-2235d045e339) &nbsp;&nbsp;&nbsp; ![play2](https://github.com/Barabramov/sudoku-java/assets/93996218/fb03322c-2ab9-405a-8f1c-bb9618c617eb)



