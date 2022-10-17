public class MarsRover {
	private Coordinates coordinates = new Coordinates();
	private CommandManager commandManager = new CommandManager(coordinates);

	public String execute(String command) {
		for (char c : command.toCharArray()) {
			commandManager.commandHub(c);
		}
		return commandManager.getFormattedPosition();
	}
}
