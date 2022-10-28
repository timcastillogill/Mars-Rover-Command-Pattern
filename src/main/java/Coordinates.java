public class Coordinates {
	private String compassDirection;
	private int x;
	private int y;
	private final PositionPrinter positionPrinter;


	public Coordinates(PositionPrinter positionPrinter) {
		this.positionPrinter = positionPrinter;
		this.compassDirection = "N";
		this.x = 0;
		this.y = 0;
	}

	public String currentMarsRoverPosition() {
		return positionPrinter.printMarsRoverPosition(x, y, compassDirection);
	}

	public void changeDirection(String newDirection) {
		compassDirection = newDirection;
	}
	public void changePosition(int x, int y) {
		this.x += x;
		this.y += y;
		ifBoundaryIsHit();
	}

	private void ifBoundaryIsHit() {
		int MAX_BOARD_X = 9;
		int MAX_BOARD_Y = 9;
		int MIN_BOARD_Y = 0;
		int MIN_BOARD_X = 0;
		if (x < 0 && compassDirection.equals("W")) this.x = MAX_BOARD_X;
		if (y < 0 && compassDirection.equals("S")) this.y = MAX_BOARD_Y;
		if (y >= 10 && compassDirection.equals("N")) this.y = MIN_BOARD_Y;
		if (x >= 10 && compassDirection.equals("E")) this.x = MIN_BOARD_X;
	}


	public String getCompassDirection() {
		return compassDirection;
	}

}
