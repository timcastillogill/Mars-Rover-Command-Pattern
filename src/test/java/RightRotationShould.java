import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class RightRotationShould {

	@Mock
	MarsRover rover;
	@Mock
	CompassDirection compassDirection;
	private RightRotation rightRotation;

	@BeforeEach
	void setUp() {
		rightRotation = new RightRotation();
	}

	@Test
	public void move_rover_one_space_forward_when_facing_north() {
		given(rover.getCompassDirection()).willReturn(compassDirection);
		given(compassDirection.getStringCompassDirection()).willReturn("N");
		rightRotation.execute(rover);
		verify(rover).changeDirection("E");
	}

	@Test
	public void move_rover_one_space_forward_when_facing_east() {
		given(rover.getCompassDirection()).willReturn(compassDirection);
		given(compassDirection.getStringCompassDirection()).willReturn("E");
		rightRotation.execute(rover);
		verify(rover).changeDirection("S");
	}

	@Test
	public void move_rover_one_space_forward_when_facing_south() {
		given(rover.getCompassDirection()).willReturn(compassDirection);
		given(compassDirection.getStringCompassDirection()).willReturn("S");
		rightRotation.execute(rover);
		verify(rover).changeDirection("W");
	}

	@Test
	public void move_rover_one_space_forward_when_facing_west() {
		given(rover.getCompassDirection()).willReturn(compassDirection);
		given(compassDirection.getStringCompassDirection()).willReturn("W");
		rightRotation.execute(rover);
		verify(rover).changeDirection("N");
	}
}