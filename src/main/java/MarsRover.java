public class MarsRover {
    protected final Coordinates coordinates;
    private final CommandManager commandManager;
    private final CompassDirection compassDirection;

    public MarsRover(Coordinates coordinates, CommandManager commandManager, CompassDirection compassDirection) {
        this.coordinates = coordinates;
        this.commandManager = commandManager;
        this.compassDirection = compassDirection;
    }

    public String execute(String inputCommands) {
        for (char command : inputCommands.toCharArray()) {
            Command commandToExecute = commandManager.commandHub(command);
            commandToExecute.execute(this);
        }
        return commandManager.getFormattedPosition();
    }

    public CompassDirection getCompassDirection() {
        return compassDirection;
    }

    public void changePosition(int x, int y) {
        this.coordinates.changePosition(x, y);
    }

    public void changeDirection(String direction) {
        getCompassDirection().changeDirection(direction);
    }
}
