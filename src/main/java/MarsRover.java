public class MarsRover {
    protected final Coordinates coordinates = new Coordinates();
    private final CommandManager commandManager = new CommandManager(coordinates);

    public String execute(String inputCommands) {
        for (char command : inputCommands.toCharArray()) {
            Command commandToExecute = commandManager.commandHub(command);
            commandToExecute.execute(this);
        }
        return commandManager.getFormattedPosition();
    }
}
