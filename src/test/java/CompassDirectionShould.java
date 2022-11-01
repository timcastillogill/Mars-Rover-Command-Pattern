import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CompassDirectionShould {

	@Test
	public void change_the_direction_to_E() {
		CompassDirection compassDirection = new CompassDirection();
		compassDirection.changeDirection("E");
		assertThat(compassDirection.getStringCompassDirection()).isEqualTo("E");
	}

}