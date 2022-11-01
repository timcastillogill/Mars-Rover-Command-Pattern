public class Engine implements Command {

	@Override
	public void execute(MarsRover rover) {

		switch (rover.getCompassDirection().getStringCompassDirection()) {
			case "E" -> rover.changePosition(1, 0);
			case "S" -> rover.changePosition(0, -1);
			case "W" -> rover.changePosition(-1, 0);
			case "N" -> rover.changePosition(0, 1);
		}
	}

}
