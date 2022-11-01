public class Coordinates {

	private int x;
	private int y;
	private final CompassDirection compassDirection;


	public Coordinates(CompassDirection compassDirection) {
		this.compassDirection = compassDirection;
		this.x = 0;
		this.y = 0;
	}

	public void changePosition(int x, int y) {
		this.x += x;
		this.y += y;
		ifEdgeIsHit();
	}

	public CoordinatesDto toDto() {
		return new CoordinatesDto(this.x, this.y, compassDirection.getCompassDirection());
	}

	private void ifEdgeIsHit() {
		int MAX_BOARD_X = 9;
		int MAX_BOARD_Y = 9;
		int MIN_BOARD_Y = 0;
		int MIN_BOARD_X = 0;
		if (x < 0 && compassDirection.getCompassDirection().equals("W")) this.x = MAX_BOARD_X;
		if (y < 0 && compassDirection.getCompassDirection().equals("S")) this.y = MAX_BOARD_Y;
		if (y >= 10 && compassDirection.getCompassDirection().equals("N")) this.y = MIN_BOARD_Y;
		if (x >= 10 && compassDirection.getCompassDirection().equals("E")) this.x = MIN_BOARD_X;
	}

}
