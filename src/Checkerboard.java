import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 * Class to create a custom checkerboard pane that inherits from GridPane
 */
public class Checkerboard extends GridPane {
    private int numberOfSquares;
    private int squareSize;
    private int paneSize;

    public Checkerboard() {
        this(20, 10, 300);
        drawCheckerboard();
    }

    public Checkerboard(int numberOfSquares, int squareSize) {
        this(numberOfSquares, squareSize, 300);
        drawCheckerboard();
    }

    public Checkerboard(int numberOfSquares, int squareSize, int paneSize) {
        this.numberOfSquares = numberOfSquares;
        this.squareSize = squareSize;
        this.paneSize = paneSize;
        drawCheckerboard();
    }

    public int getPaneSize() {
        return this.paneSize;
    }

    /**
     * Create alternating white and black grid squares and add them to the grid pane
     */
    public void drawCheckerboard() {

        // Add loop to add alternating squares
        for (int j = 0; j < numberOfSquares; j++) {

            for (int i = 0; i < numberOfSquares; i++) {
                Rectangle square = new Rectangle(squareSize, squareSize);

                if ((j + i) % 2 == 0) {
                    square.setFill(Color.WHITE);
                } else {
                    square.setFill(Color.BLACK);
                }

                /*
                 * Add square to grid at position [i, j]
                 * Where i is the row index and j is the column index
                 */
                add(square, i, j);

                // Bind size of grid squares to size of window divided by total number of grid squares
                square.widthProperty().bind(widthProperty().divide(numberOfSquares));
                square.heightProperty().bind(heightProperty().divide(numberOfSquares));

            }

        }
    }
}