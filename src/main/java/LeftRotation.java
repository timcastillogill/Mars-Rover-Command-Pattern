public class LeftRotation implements Command {
	@Override
	public void execute(MarsRover rover, Coordinates coordinates) {
		switch (rover.coordinates.getCompassDirection()) {
			case "W" -> rover.coordinates.changeDirection("S");
			case "S" -> rover.coordinates.changeDirection("E");
			case "E" -> rover.coordinates.changeDirection("N");
			case "N" -> rover.coordinates.changeDirection("W");
		}
	}
}
