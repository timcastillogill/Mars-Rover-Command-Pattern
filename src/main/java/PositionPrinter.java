public class PositionPrinter {

	public String printMarsRoverPosition(Coordinates coordinates) {
		CoordinatesDto dtoCoordinates = coordinates.toDto();
		return dtoCoordinates.getX() + ":" + dtoCoordinates.getY() + ":" + dtoCoordinates.getCompassDirection();
	}

}
