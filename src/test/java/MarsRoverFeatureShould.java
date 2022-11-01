import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class MarsRoverFeatureShould {

	private MarsRover rover;

	@BeforeEach
	void setup() {
		CompassDirection compassDirection = new CompassDirection();
		Coordinates coordinates = new Coordinates(compassDirection);
		PositionPrinter positionPrinter = new PositionPrinter();
		CommandFactory commandFactory = new CommandFactory();
		CommandManager commandManager = new CommandManager(commandFactory, positionPrinter, coordinates);
	    rover = new MarsRover(coordinates, commandManager, compassDirection);
	}

	@ParameterizedTest
	@CsvSource({
		"R, 0:0:E",
		"RR, 0:0:S",
		"RRR, 0:0:W",
		"RRRR, 0:0:N",
	})
	public void rotate_right(String commands, String expected) {
		assertThat(rover.execute(commands)).isEqualTo(expected);
	}


	@ParameterizedTest
	@CsvSource({
		"L, 0:0:W",
		"LL, 0:0:S",
		"LLL, 0:0:E",
		"LLLL, 0:0:N",
	})
	public void rotate_left(String commands, String expected) {
		assertThat(rover.execute(commands)).isEqualTo(expected);
	}

	@ParameterizedTest
	@CsvSource({
		"M, 0:1:N",
		"MM, 0:2:N",
		"MMM, 0:3:N",

	})
	public void move_forward_without_turning(String commands, String expected) {
		assertThat(rover.execute(commands)).isEqualTo(expected);
	}

	@ParameterizedTest
	@CsvSource({
		"RM, 1:0:E",
		"RMM, 2:0:E",
		"MMRRM, 0:1:S",
		"RMMLL, 2:0:W",
		"MMMMRRRR, 0:4:N",
		"RMMLMMMRMMMM, 6:3:E",

	})
	public void move_forward_with_turns(String commands, String expected) {
		assertThat(rover.execute(commands)).isEqualTo(expected);
	}

	@ParameterizedTest
	@CsvSource({
		"LM, 9:0:W",
		"RMLLMM, 9:0:W",
		"RRM, 0:9:S",
		"MMMMMMMMMM, 0:0:N",
		"RMMMMMMMMMM, 0:0:E"

	})
	public void moves_to_opposite_wall_when_wall_is_hit(String commands, String expected) {
		assertThat(rover.execute(commands)).isEqualTo(expected);
	}

	@Test
	public void moves_more_out_of_game_border() {
		assertThat(rover.execute("RMLLMM")).isEqualTo("9:0:W");
	}
}
