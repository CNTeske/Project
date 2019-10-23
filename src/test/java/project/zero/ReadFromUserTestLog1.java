package project.zero;

import static org.junit.Assert.assertEquals;
import java.io.ByteArrayInputStream;

import org.junit.Test;

public class ReadFromUserTestLog1 {
	@Test
	public void ReadLogInUserlog1(){
		String testingString = "Alice\ntestpass1\n";
		ByteArrayInputStream in = new ByteArrayInputStream(testingString.getBytes());
		System.setIn(in);
		Integer test = ReadFromUser.readLogIn(0);
		Integer result = 1;
		assertEquals("Mocked login should return 1", test, result);
		System.setIn(System.in);
	}
}
