public class LeftRotation implements Command {
	Coordinates coordinates;

	public LeftRotation(Coordinates coordinates) {
		this.coordinates = coordinates;
	}

	@Override
	public void execute() {
		switch (coordinates.getCompassDirection()) {
			case "W":
				coordinates.changeDirection("S");
				break;
			case "S":
				coordinates.changeDirection("E");
				break;
			case "E":
				coordinates.changeDirection("N");
				break;
			case "N":
				coordinates.changeDirection("W");
				break;
		}
	}
}
