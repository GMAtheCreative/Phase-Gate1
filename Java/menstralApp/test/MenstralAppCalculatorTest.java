import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MenstralAppCalculatorTest{

	@Test
	public void daysMonthYear(){
		MenstralCycleCalculator cycleCalculator = new MenstralCycleCalculator();
		
		String result = cycleCalculator.menstralCycle(2, 4, 2024, 28);
		
		assertEquals("30/4/2024", result);
	}
}