public class CommandManager {
    private final Coordinates coordinates;
    private final CommandFactory commandFactory;

    public CommandManager(Coordinates coordinates, CommandFactory commandFactory) {
        this.coordinates = coordinates;
        this.commandFactory = commandFactory;
    }

    public Command commandHub(char command) {
        return commandFactory.createCommand(command);
    }

    public String getFormattedPosition() {
        return coordinates.currentMarsRoverPosition();
    }
}
