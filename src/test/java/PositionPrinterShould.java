import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;

@ExtendWith(MockitoExtension.class)
class PositionPrinterShould {

	@Mock Coordinates coordinates;
	@Mock CompassDirection compassDirection;

	@Test
	public void print_the_current_position_of_the_mars_rover() {
		PositionPrinter positionPrinter = new PositionPrinter(coordinates, compassDirection);
		given(coordinates.getX()).willReturn(0);
		given(coordinates.getY()).willReturn(2);
		given(compassDirection.getCompassDirection()).willReturn("E");

		assertThat(positionPrinter.printMarsRoverPosition()).isEqualTo("0:2:E");
	}

}