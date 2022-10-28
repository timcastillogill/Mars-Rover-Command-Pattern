public class RightRotation implements Command {

    @Override
    public void execute(MarsRover rover, Coordinates coordinates) {
        switch (rover.coordinates.getCompassDirection()) {
            case "E" -> rover.coordinates.changeDirection("S");
            case "S" -> rover.coordinates.changeDirection("W");
            case "W" -> rover.coordinates.changeDirection("N");
            case "N" -> rover.coordinates.changeDirection("E");
        }
    }
}
