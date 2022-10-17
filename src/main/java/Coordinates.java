public class Coordinates {
	private String compassDirection;
	private int x;
	private int y;

	int MAX_BOARD_X = 9;
	int MAX_BOARD_Y = 9;
	int MIN_BOARD_Y = 0;
	int MIN_BOARD_X = 0;

	public Coordinates() {
		this.compassDirection = "N";
		this.x = 0;
		this.y = 0;
	}

	public String currentMarsRoverPosition() {
		return x + ":" + y + ":" + compassDirection;
	}

	public void changeDirection(String newDirection) {
		compassDirection = newDirection;
	}


	public String getCompassDirection() {
		return compassDirection;
	}

	public int moveForward() {

		Integer boundaryHit = ifBoundaryIsHit();
		if (boundaryHit != null) return boundaryHit;


		if (compassDirection == "E") return x++;
		if (compassDirection == "S") return y--;
		if (compassDirection == "W") return x--;
		if (compassDirection == "N") return y++;
		throw new RuntimeException();
	}

	private Integer ifBoundaryIsHit() {
		if (x == 0 && compassDirection == "W") return x = MAX_BOARD_X;
		if (y == 0 && compassDirection == "S") return y = MAX_BOARD_Y;
		if (y == 9 && compassDirection == "N") return y = 0;
		if (x == 9 && compassDirection == "E") return x = MIN_BOARD_X;
		return null;
	}
}
