public class LeftRotation implements Command {
	@Override
	public void execute(MarsRover rover) {
		switch (rover.getCompassDirection().getStringCompassDirection()) {
			case "W" -> rover.changeDirection("S");
			case "S" -> rover.changeDirection("E");
			case "E" -> rover.changeDirection("N");
			case "N" -> rover.changeDirection("W");
		}
	}

}
