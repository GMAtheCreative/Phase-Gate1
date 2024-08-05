import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LagbajaUnitTests{

	@Test
	public void positionTest(){
		PositionDetector positionCalculator = new PositionDetector();
		
		int[] position = positionCalculator.getPosition(40,70,60,80);

		assertArrayEquals(4,2,3,1);
	}
}