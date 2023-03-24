import java.util.Random;

public class TestDemo {

	public TestDemo() {
		
		
		
	}
	
public int addPositive(int a, int b) throws IllegalArgumentException {
	int sum = 0;
	
	if(a > 0 && b > 0) {
		return sum = a + b;
		
	} else
		
	throw new IllegalArgumentException("Both parameters must be positive!");

}
public int randomNumberSquared() {
	int sum = 0;
	
	int a = getRandomInt();
	return sum = a * a;
}


public int getRandomInt() {
		
		 Random random = new Random();
		 
		 return random.nextInt(10) + 1;
		
	}


}