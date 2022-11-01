import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;

@ExtendWith(MockitoExtension.class)
class CoordinatesShould {

	private Coordinates coordinates;
	private PositionPrinter positionPrinter;
	@Mock
	CompassDirection compassDirection;

	@BeforeEach
	void setUp() {
		coordinates = new Coordinates(compassDirection);
		positionPrinter = new PositionPrinter();
	}

	@Test
	public void wraps_around_world_when_hits_edge_facing_west_on_0_y() {
		given(compassDirection.getStringCompassDirection()).willReturn("W");
		coordinates.changePosition(-1, 0);
		assertThat(positionPrinter.printMarsRoverPosition(coordinates)).isEqualTo("9:0:W");
	}

	@Test
	public void wraps_around_world_when_hits_edge_facing_east_on_0_y() {
		given(compassDirection.getStringCompassDirection()).willReturn("E");
		coordinates.changePosition(10, 0);
		assertThat(positionPrinter.printMarsRoverPosition(coordinates)).isEqualTo("0:0:E");
	}

	@Test
	public void wraps_around_world_when_hits_edge_facing_north_on_0_x() {
		given(compassDirection.getStringCompassDirection()).willReturn("N");
		coordinates.changePosition(0, 10);
		assertThat(positionPrinter.printMarsRoverPosition(coordinates)).isEqualTo("0:0:N");
	}

	@Test
	public void wraps_around_world_when_hits_edge_facing_south_on_0_x() {
		given(compassDirection.getStringCompassDirection()).willReturn("S");
		coordinates.changePosition(0, 9);
		assertThat(positionPrinter.printMarsRoverPosition(coordinates)).isEqualTo("0:9:S");
	}

	@Test
	public void wraps_around_world_when_hits_edge_facing_north_on_5_x() {
		given(compassDirection.getStringCompassDirection()).willReturn("N");
		coordinates.changePosition(5, 10);
		assertThat(positionPrinter.printMarsRoverPosition(coordinates)).isEqualTo("5:0:N");
	}

	@Test
	public void wraps_around_world_when_hits_edge_facing_west_on_5_y() {
		given(compassDirection.getStringCompassDirection()).willReturn("W");
		coordinates.changePosition(-1, 5);
		assertThat(positionPrinter.printMarsRoverPosition(coordinates)).isEqualTo("9:5:W");
	}

}