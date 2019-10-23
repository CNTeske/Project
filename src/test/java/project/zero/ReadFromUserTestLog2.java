package project.zero;

import static org.junit.Assert.assertEquals;
import java.io.ByteArrayInputStream;

import org.junit.Test;

public class ReadFromUserTestLog2 {
	@Test
	public void ReadLogInUserlog2(){
		String testingString = "Alice\ntestpass1\n";
		ByteArrayInputStream in = new ByteArrayInputStream(testingString.getBytes());
		System.setIn(in);
		Integer test = ReadFromUser.readLogIn(1);
		Integer result = 1;
		assertEquals("Mocked new user should return 1.", test, result);
		System.setIn(System.in);
	}	
}
