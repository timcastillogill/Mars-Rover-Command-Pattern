import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CompassDirectionShould {

	@Test
	public void change_the_direction_to_E() {
		CompassDirection compassDirection = new CompassDirection();
		compassDirection.changeDirection("E");
		assertThat(compassDirection.getCompassDirection()).isEqualTo("E");
	}

}