package S3_control_flow;

public class DoWhileLoop {
	public static void main(String[] args) {
		int i = 0;
		boolean isReady = false;
		do {
			System.out.println("Value of i is " + i);
			i++;
		} while (isReady);
	}
}
