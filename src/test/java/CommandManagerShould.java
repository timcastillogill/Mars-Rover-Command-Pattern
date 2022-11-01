import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class CommandManagerShould {

	@Mock
	Coordinates coordinates;
	@Mock
	CommandFactory commandFactory;

	@Mock PositionPrinter positionPrinter;
	private CommandManager commandManager;

	@BeforeEach
	void setUp() {
		commandManager = new CommandManager(commandFactory, positionPrinter);
	}

	@Test
	public void command_created_for_command_factory() {
		commandManager.commandHub('R');
		verify(commandFactory).createCommand('R');
	}

	@Test
	public void position_formatter_called() {
		commandManager.getFormattedPosition();
		verify(positionPrinter).printMarsRoverPosition();
	}


}