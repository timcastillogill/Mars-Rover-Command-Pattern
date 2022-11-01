public class PositionPrinter {

	private final Coordinates coordinates;
	private final CompassDirection compassDirection;

	public PositionPrinter(Coordinates coordinates, CompassDirection compassDirection) {
		this.coordinates = coordinates;
		this.compassDirection = compassDirection;
	}

	public String printMarsRoverPosition() {
		return coordinates.getX() + ":" + coordinates.getY() + ":" + compassDirection.getCompassDirection();
	}

}
