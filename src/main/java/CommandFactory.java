public class CommandFactory {


	public Command createCommand(char command) {
		switch (command) {
			case 'R' -> { return new RightRotation(); }
			case 'L' -> { return new LeftRotation(); }
			case 'M' -> { return new MoveForward(); }
			default -> throw new RuntimeException("Unknown command");
		}
	}

}
