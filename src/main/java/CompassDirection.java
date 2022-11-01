public class CompassDirection {
	private String compassDirection;

	public CompassDirection() {
		this.compassDirection = "N";
	}

	public void changeDirection(String newDirection) {
		compassDirection = newDirection;
	}

	public String getStringCompassDirection() {
		return compassDirection;
	}
}
