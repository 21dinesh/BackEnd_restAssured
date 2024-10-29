package MokingTest;

import org.mockito.Mockito;

class PANcard {
	public  String isvalid(String panCard) {
		if (panCard.matches("[A-Z]{5}[0-9]{4}[A-Z]") == true) {
			return "is Valid pan";
		} else {
			return "is invalid pan";
		}
	}

	public static PANcard getMockObject() {
		PANcard mocObj = Mockito.mock(PANcard.class);
		Mockito.when(mocObj.isvalid("ASDFG12345A")).thenReturn("valid PAN card");
		Mockito.when(mocObj.isvalid("ASDFG12342L")).thenReturn("valid PAN card");
		Mockito.when(mocObj.isvalid("ABCDE1234C")).thenReturn("invalid PAN card");
		return mocObj;
	}
}

public class MockingTest {

	public static void main(String[] args) {
		PANcard obj = PANcard.getMockObject();
		System.out.println(obj.isvalid("ASDFG12345A"));
	}
}
