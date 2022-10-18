public class CommandManager {
    private Coordinates coordinates;

    public CommandManager(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public Command commandHub(char command) {
        switch (command) {
            case 'R' -> {
                return new RightRotation();
            }
            case 'L' -> {
                return new LeftRotation();
            }
            case 'M' -> {
                return new MoveForward();
            }
            default -> throw new RuntimeException("Unknown command");
        }
    }

    public String getFormattedPosition() {
        return coordinates.currentMarsRoverPosition();
    }
}
