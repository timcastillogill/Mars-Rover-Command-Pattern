public class RightRotation implements Command {

    @Override
    public void execute(MarsRover rover, Coordinates coordinates, CompassDirection compassDirection) {
        switch (compassDirection.getCompassDirection()) {
            case "E" -> compassDirection.changeDirection("S");
            case "S" -> compassDirection.changeDirection("W");
            case "W" -> compassDirection.changeDirection("N");
            case "N" -> compassDirection.changeDirection("E");
        }
    }
}
