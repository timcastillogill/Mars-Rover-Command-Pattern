public class LeftRotation implements Command {
	@Override
	public void execute(MarsRover rover, Coordinates coordinates, CompassDirection compassDirection) {
		switch (compassDirection.getCompassDirection()) {
			case "W" -> compassDirection.changeDirection("S");
			case "S" -> compassDirection.changeDirection("E");
			case "E" -> compassDirection.changeDirection("N");
			case "N" -> compassDirection.changeDirection("W");
		}
	}
}
