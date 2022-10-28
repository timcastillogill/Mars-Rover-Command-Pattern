import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class PositionPrinterShould {

	@Test
	public void print_the_current_position_of_the_mars_rover() {
		PositionPrinter positionPrinter = new PositionPrinter();

		assertThat(positionPrinter.printMarsRoverPosition(0, 2, "E")).isEqualTo("0:2:E");
	}

}