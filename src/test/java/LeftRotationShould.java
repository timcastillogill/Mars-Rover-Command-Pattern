import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class LeftRotationShould {

	@Mock
	MarsRover rover;
	@Mock
	Coordinates coordinates;
	@Mock
	CompassDirection compassDirection;

	@Test
	public void move_rover_one_space_forward_when_facing_west() {
		LeftRotation leftRotation = new LeftRotation();
		given(compassDirection.getCompassDirection()).willReturn("W");
		leftRotation.execute(rover, coordinates, compassDirection);
		verify(compassDirection).changeDirection("S");
	}

	@Test
	public void move_rover_one_space_forward_when_facing_south() {
		LeftRotation leftRotation = new LeftRotation();
		given(compassDirection.getCompassDirection()).willReturn("S");
		leftRotation.execute(rover, coordinates, compassDirection);
		verify(compassDirection).changeDirection("E");
	}

	@Test
	public void move_rover_one_space_forward_when_facing_east() {
		LeftRotation leftRotation = new LeftRotation();
		given(compassDirection.getCompassDirection()).willReturn("E");
		leftRotation.execute(rover, coordinates, compassDirection);
		verify(compassDirection).changeDirection("N");
	}

	@Test
	public void move_rover_one_space_forward_when_facing_north() {
		LeftRotation leftRotation = new LeftRotation();
		given(compassDirection.getCompassDirection()).willReturn("N");
		leftRotation.execute(rover, coordinates, compassDirection);
		verify(compassDirection).changeDirection("W");
	}


}