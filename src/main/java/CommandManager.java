public class CommandManager {

	private Coordinates coordinates;

	public CommandManager(Coordinates coordinates) {
		this.coordinates = coordinates;
	}

	public void commandHub(char command) {
		if (command == 'R')  {
			RightRotation rightRotation = new RightRotation(coordinates);
			rightRotation.execute();
		}
		if (command == 'L')  {
			LeftRotation leftRotation = new LeftRotation(coordinates);
			leftRotation.execute();
		}

		if (command == 'M') {
			MoveForward moveForward = new MoveForward(coordinates);
			moveForward.execute();
		}
	}

	public String getFormattedPosition() {
		return coordinates.currentMarsRoverPosition();
	}
}
