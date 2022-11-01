public class CommandManager {
	private final CommandFactory commandFactory;

	private final PositionPrinter positionPrinter;

	private final Coordinates coordinates;

	public CommandManager(CommandFactory commandFactory, PositionPrinter positionPrinter, Coordinates coordinates) {
		this.commandFactory = commandFactory;
		this.positionPrinter = positionPrinter;
		this.coordinates = coordinates;
	}

	public Command commandHub(char command) {
		return commandFactory.createCommand(command);
	}

	public String getFormattedPosition() {
		return positionPrinter.printMarsRoverPosition(coordinates);
	}
}
