public class MoveForward implements Command {
    @Override
    public void execute(MarsRover rover) {
        rover.coordinates.moveForward();
    }
}
