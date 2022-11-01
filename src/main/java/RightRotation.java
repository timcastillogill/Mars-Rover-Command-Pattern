public class RightRotation implements Command {

    @Override
    public void execute(MarsRover rover) {
        switch (rover.getCompassDirection().getStringCompassDirection()) {
            case "E" -> rover.changeDirection("S");
            case "S" -> rover.changeDirection("W");
            case "W" -> rover.changeDirection("N");
            case "N" -> rover.changeDirection("E");
        }
    }

}
