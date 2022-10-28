public class MoveForward implements Command {

	@Override
	public void execute(MarsRover rover, Coordinates coordinates) {


		switch (coordinates.getCompassDirection()) {
			case "E" -> coordinates.changePosition(1, 0);
			case "S" -> coordinates.changePosition(0, -1);
			case "W" -> coordinates.changePosition(-1, 0);
			case "N" -> coordinates.changePosition(0, 1);
		}
	}
}
