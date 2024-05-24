package S3_control_flow;

public class TraditionalSwitchChallenge {
	public static void main(String[] args) {
		char[] charArray = { 'A', 'B', 'C', 'D', 'E', 'F'};
		int index = (int) (Math.random() * charArray.length);
		char charValue = charArray[index];

		switch (charValue) {
			case 'A':
				System.out.println("A is able");
				break;
			case 'B':
				System.out.println("B is baker");
				break;
			case 'C':
				System.out.println("C is charlie");
				break;
			case 'D':
				System.out.println("D is dog");
				break;
			case 'E':
				System.out.println("E is easy");
				break;
			default:
				System.out.println("Not found");
				break;
		}
	}

}
