public class Engine implements Command {

	@Override
	public void execute(MarsRover rover, Coordinates coordinates, CompassDirection compassDirection) {


		switch (compassDirection.getCompassDirection()) {
			case "E" -> coordinates.changePosition(1, 0);
			case "S" -> coordinates.changePosition(0, -1);
			case "W" -> coordinates.changePosition(-1, 0);
			case "N" -> coordinates.changePosition(0, 1);
		}
	}
}
