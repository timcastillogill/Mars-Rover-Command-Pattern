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
	Coordinates coordinates;
	@Mock
	CompassDirection compassDirection;


	@Test
	public void move_rover_one_space_forward_when_facing_north() {
		RightRotation rightRotation = new RightRotation();
		given(compassDirection.getCompassDirection()).willReturn("N");
		rightRotation.execute(rover, coordinates, compassDirection);
		verify(compassDirection).changeDirection("E");
	}

	@Test
	public void move_rover_one_space_forward_when_facing_east() {
		RightRotation rightRotation = new RightRotation();
		given(compassDirection.getCompassDirection()).willReturn("E");
		rightRotation.execute(rover, coordinates, compassDirection);
		verify(compassDirection).changeDirection("S");
	}

	@Test
	public void move_rover_one_space_forward_when_facing_south() {
		RightRotation rightRotation = new RightRotation();
		given(compassDirection.getCompassDirection()).willReturn("S");
		rightRotation.execute(rover, coordinates, compassDirection);
		verify(compassDirection).changeDirection("W");
	}

	@Test
	public void move_rover_one_space_forward_when_facing_west() {
		RightRotation rightRotation = new RightRotation();
		given(compassDirection.getCompassDirection()).willReturn("W");
		rightRotation.execute(rover, coordinates, compassDirection);
		verify(compassDirection).changeDirection("N");
	}

}