# sudoku-java
Graphic sudoku game program, build with scene builder.

## game progress:

- In the first stage (the board preparation stage) the application will show the user an empty initial board and the user will be able to insert digits in the empty slots according to the sudoku board he wants to solve. Entering a number and pressing enter in any cell will cause the program to check the correctness of the number (that is, that the number is correct and that he does not contradict the rules of the game so far). If the number is incorrect, a corresponding message will be displayed and the number will be deleted.
  
- At the end of the board preparation stage, the user will press the set button and then the user will not be able to change any more the set of numbers determined as part of preparing the board. The text color will be changed so that the user will see a difference between the fixed numbers and the numbers he will enter later.

- Now the user starts the solution phase. At this stage the user enters numbers in the empty cells and presses enter after entering each number. Pressing enter in any cell causes the program to check the correctness of the entered number. If the number is incorrect, a corresponding message will be displayed and the number will be deleted. The user can change the numbers they entered at this stage, but cannot change numbers that were entered during the board preparation phase.
  
- Pressing the clear button will clear the entire board and the user will be able to prepare new board.

## Illustrative example:
##### 1) Place numbers on the blank board.
![fill empty board2](https://github.com/Barabramov/sudoku-java/assets/93996218/b3cffba6-55f3-4acc-b87f-54929d3750f6) &nbsp; ![fill empty board3](https://github.com/Barabramov/sudoku-java/assets/93996218/6bce367c-2d3d-4dfd-9a3b-87becff551f1)


##### 2) Setting the board - clicking the set button.
![set2](https://github.com/Barabramov/sudoku-java/assets/93996218/04119677-c8d0-483c-8796-3131d820d115)

##### 3) Start playing and fill the board.
![play](https://github.com/Barabramov/sudoku-java/assets/93996218/be3eb85a-8e9b-4a4d-bb74-2235d045e339) &nbsp; ![play2](https://github.com/Barabramov/sudoku-java/assets/93996218/fb03322c-2ab9-405a-8f1c-bb9618c617eb)



