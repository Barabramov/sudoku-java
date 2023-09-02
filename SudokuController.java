import javax.swing.JOptionPane;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;

public class SudokuController {

	@FXML
	private GridPane gridPane;
	@FXML
	private Button clearButton;
	@FXML
	private Button setButton;
	final int SIZE = 9;
	private TextField[][] inputText = new TextField[SIZE][SIZE];

	
	public void initialize() {
		gridPane.setAlignment(Pos.CENTER);
		gridPane.setStyle("-fx-grid-lines-visible: true; -fx-padding: 10;");
		double w = (gridPane.getPrefWidth() - 5.0) / SIZE;
		double h = (gridPane.getPrefHeight() - 5.0) / SIZE;
		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				TextField thisField = new TextField();
				thisField.setPrefSize(w - 2, h - 2);
				textStyle(thisField, i, j);
				thisField.setOnKeyPressed(new EventHandler<KeyEvent>() {
					@Override
					public void handle(KeyEvent e) {
						handleInput(e);
					}
				});
				inputText[i][j] = thisField;
				gridPane.add(thisField, j, i);
			}
		}
	}
	

	
	/*
	 * recognizes the click action on the clearButton, and clears the numbers from the full squares .
	 */
	@FXML
	void clearBoard(ActionEvent event) {
		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				if (!inputText[i][j].getText().equals("")) {
					TextField thisField = (TextField) gridPane.getChildren().get(i * SIZE + j);
					thisField.setDisable(false);
					textStyle(thisField, i, j);
					thisField.setText("");
					inputText[i][j].setText("");
				}
			}
		}
	}
	

	
	/*
	 * recognizes the click action on the setButton, and updates the full squares definition- change style and cancel new changes.
	 */
	@FXML
	void setBoard(ActionEvent event) {
		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				if (!inputText[i][j].getText().equals("")) {
					TextField thisField = (TextField) gridPane.getChildren().get(i * SIZE + j);
					thisField.setStyle(
							"-fx-font-weight: bold;-fx-text-fill: red; -fx-font-size: 16;-fx-alignment: center;");
					thisField.setDisable(true);
				}
			}
		}
	}
	

	
	private void textStyle(TextField textField, int row, int col) {
		if (row < 3 || row > 5) {
			if (col < 3 || col > 5)
				textField.setStyle(
						"-fx-background-color: silver; -fx-text-fill: black; -fx-font-size: 16; -fx-alignment: center;");
			else {
				textField.setStyle(
						"-fx-background-color: white;-fx-text-fill: black; -fx-font-size: 16; -fx-alignment: center;");
			}
		} else {
			if (col > 2 && col < 6)
				textField.setStyle(
						"-fx-background-color: silver; -fx-text-fill: black; -fx-font-size: 16;-fx-alignment: center;");
			else {
				textField.setStyle(
						"-fx-background-color: white;-fx-text-fill: black; -fx-font-size: 16; -fx-alignment: center;");
			}
		}
	}


	
	/*
	 * handle user input, if the input is legal it adds the input to the board, if it's not it delete the input.
	 */
	private void handleInput(KeyEvent event) {
		if (event.getCode() == KeyCode.ENTER) {
			TextField textField = (TextField) event.getSource();
			int cInd = gridPane.getColumnIndex(textField);
			int rInd = gridPane.getRowIndex(textField);
			boolean legalInput = isLegal(textField.getText(), rInd, cInd);
			if (legalInput) {
				textField.setText(textField.getText());
				inputText[rInd][cInd].setText(textField.getText());
			} else
				textField.clear();
		}
	}


	
	/*
	 * check if the user input, stands in the rules of the game.
	 */
	private boolean isLegal(String textField, int row, int col) {
		try {
			int input = Integer.parseInt(textField);
			if (input <= 9 && input >= 1) {
				if (!checkRow(textField, row, col) || !checkCol(textField, row, col) || !checkCube(textField, row, col))
					return false;
				else {
					JOptionPane.showConfirmDialog(null, "Legal input", "Legal input", JOptionPane.CLOSED_OPTION);
					return true;
				}
			} else {
				JOptionPane.showConfirmDialog(null, "write number between 1-9", "Out of bounds number",
						JOptionPane.CLOSED_OPTION);
				return false;
			}
		} catch (NumberFormatException ex) {
			JOptionPane.showConfirmDialog(null, "write number between 1-9", "Illegal input", JOptionPane.CLOSED_OPTION);
			return false;
		}
	}


	
	private boolean checkRow(String textField, int row, int col) {
		for (int i = 0; i < SIZE; i++) {
			if (i != col && inputText[row][i].getText().equals(textField)) {
				JOptionPane.showConfirmDialog(null, "You already have this number in the row", "Illegal input",
						JOptionPane.CLOSED_OPTION);
				return false;
			}
		}
		return true;
	}


	
	private boolean checkCol(String textField, int row, int col) {
		for (int i = 0; i < SIZE; i++) {
			if (i != row && inputText[i][col].getText().equals(textField)) {
				JOptionPane.showConfirmDialog(null, "You already have this number in the column", "Illegal input",
						JOptionPane.CLOSED_OPTION);
				return false;
			}
		}
		return true;
	}


	
	private boolean checkCube(String textField, int row, int col) {
		int startColInd = col - (col % 3);
		int startRowInd = row - (row % 3);
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (startRowInd + i != row && startColInd + j != col) {
					if (inputText[startRowInd + i][startColInd + j].getText().equals(textField)) {
						JOptionPane.showConfirmDialog(null, "You already have this number in the cube", "Illegal input",
								JOptionPane.CLOSED_OPTION);
						return false;
					}
				}
			}
		}
		return true;
	}


} // end of class
