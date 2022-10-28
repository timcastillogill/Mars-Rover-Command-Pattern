public class MarsRover {
    protected final Coordinates coordinates;
    private final CommandManager commandManager;

    public MarsRover(Coordinates coordinates, CommandManager commandManager) {
        this.coordinates = coordinates;
        this.commandManager = commandManager;
    }

    public String execute(String inputCommands) {
        for (char command : inputCommands.toCharArray()) {
            Command commandToExecute = commandManager.commandHub(command);
            commandToExecute.execute(this, this.coordinates);
        }
        return commandManager.getFormattedPosition();
    }
}
