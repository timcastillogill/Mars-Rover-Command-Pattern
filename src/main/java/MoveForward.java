public class MoveForward implements Command {

	private final Coordinates coordinates;

	public MoveForward(Coordinates coordinates) {
		this.coordinates = coordinates;
	}


	@Override
	public void execute() {
		coordinates.moveForward();
	}
}
