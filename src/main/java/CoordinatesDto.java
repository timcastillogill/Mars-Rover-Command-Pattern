public class CoordinatesDto {
	private final int x;
	private final int y;
	private final String compassDirection;

	public CoordinatesDto(int x, int y, String compassDirection) {
		this.x = x;
		this.y = y;
		this.compassDirection = compassDirection;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public String getCompassDirection() {
		return compassDirection;
	}
}
