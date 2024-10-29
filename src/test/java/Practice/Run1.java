package Practice;

import org.testng.annotations.Test;

import com.BankEnd.Testing.A;


public class Run1 {
	@Test
	public void sampleTest() {
		A a1 = new A();
		a1.a().b().c().d();
	}

}
