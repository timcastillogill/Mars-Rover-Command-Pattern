public class CommandManager {
	private final CommandFactory commandFactory;

	private final PositionPrinter positionPrinter;

	public CommandManager(CommandFactory commandFactory, PositionPrinter positionPrinter) {
		this.commandFactory = commandFactory;
		this.positionPrinter = positionPrinter;
	}

	public Command commandHub(char command) {
		return commandFactory.createCommand(command);
	}

	public String getFormattedPosition() {
		return positionPrinter.printMarsRoverPosition();
	}
}
