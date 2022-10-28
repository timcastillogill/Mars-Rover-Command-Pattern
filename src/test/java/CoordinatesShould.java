import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CoordinatesShould {

	private Coordinates coordinates;

	@BeforeEach
	void setUp() {
		PositionPrinter positionPrinter = new PositionPrinter();
		coordinates = new Coordinates(positionPrinter);
	}

	@Test
	public void if_boundry_is_hit_west_on_0_y() {
		coordinates.changeDirection("W");
		coordinates.changePosition(-1, 0);
		assertThat(coordinates.currentMarsRoverPosition()).isEqualTo("9:0:W");
	}

	@Test
	public void if_boundry_is_hit_east_on_0_y() {
		coordinates.changeDirection("E");
		coordinates.changePosition(10, 0);
		assertThat(coordinates.currentMarsRoverPosition()).isEqualTo("0:0:E");
	}

	@Test
	public void if_boundry_is_hit_north_on_0_x() {
		coordinates.changeDirection("N");
		coordinates.changePosition(0, 10);
		assertThat(coordinates.currentMarsRoverPosition()).isEqualTo("0:0:N");
	}

	@Test
	public void if_boundry_is_hit_south_on_0_x() {
		coordinates.changeDirection("S");
		coordinates.changePosition(0, 9);
		assertThat(coordinates.currentMarsRoverPosition()).isEqualTo("0:9:S");
	}

	@Test
	public void if_boundry_is_hit_north_on_5_x() {
		coordinates.changeDirection("N");
		coordinates.changePosition(5, 10);
		assertThat(coordinates.currentMarsRoverPosition()).isEqualTo("5:0:N");
	}

	@Test
	public void if_boundry_is_hit_west_on_5_y() {
		coordinates.changeDirection("W");
		coordinates.changePosition(-1, 5);
		assertThat(coordinates.currentMarsRoverPosition()).isEqualTo("9:5:W");
	}

}