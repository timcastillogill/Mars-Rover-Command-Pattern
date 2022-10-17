public class RightRotation implements Command {

	Coordinates coordinates;

	public RightRotation(Coordinates coordinates) {
		this.coordinates = coordinates;
	}

	@Override
	public void execute() {
		switch (coordinates.getCompassDirection()) {
			case "E":
				coordinates.changeDirection("S");
				break;
			case "S":
				coordinates.changeDirection("W");
				break;
			case "W":
				coordinates.changeDirection("N");
				break;
			case "N":
				coordinates.changeDirection("E");
				break;
		}
	}
}
