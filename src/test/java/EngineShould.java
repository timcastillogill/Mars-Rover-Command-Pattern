import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class EngineShould {

	@Mock
	MarsRover rover;
	@Mock
	Coordinates coordinates;
	@Mock
	CompassDirection compassDirection;

	@Test
	public void move_rover_one_space_forward_when_facing_east() {
		Engine engine = new Engine();
		given(rover.getCompassDirection()).willReturn(compassDirection);
		given(compassDirection.getStringCompassDirection()).willReturn("E");
		engine.execute(rover);
		verify(rover).changePosition(1, 0);
	}

	@Test
	public void move_rover_one_space_forward_when_facing_south() {
		Engine engine = new Engine();
		given(rover.getCompassDirection()).willReturn(compassDirection);
		given(compassDirection.getStringCompassDirection()).willReturn("S");
		engine.execute(rover);
		verify(rover).changePosition(0, -1);
	}

	@Test
	public void move_rover_one_space_forward_when_facing_west() {
		Engine engine = new Engine();
		given(compassDirection.getStringCompassDirection()).willReturn("W");
		given(rover.getCompassDirection()).willReturn(compassDirection);
		engine.execute(rover);
		verify(rover).changePosition(-1, 0);
	}

	@Test
	public void move_rover_one_space_forward_when_facing_north() {
		Engine engine = new Engine();
		given(rover.getCompassDirection()).willReturn(compassDirection);
		given(compassDirection.getStringCompassDirection()).willReturn("N");
		engine.execute(rover);
		verify(rover).changePosition(0, 1);
	}

}