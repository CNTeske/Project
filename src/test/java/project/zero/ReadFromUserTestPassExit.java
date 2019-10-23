package project.zero;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;

import org.junit.Test;

public class ReadFromUserTestPassExit {
	@Test
	public void ReadLogInPassExit(){
		String testingString = "anything\nexit\n";
		ByteArrayInputStream in = new ByteArrayInputStream(testingString.getBytes());
		System.setIn(in);
		Integer test = ReadFromUser.readLogIn(0);
		Integer result = 0;
		assertEquals("Password containing 'exit' should return 0.", test, result);
		System.setIn(System.in);
	}
}
