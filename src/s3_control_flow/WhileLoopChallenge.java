package s3_control_flow;

public class WhileLoopChallenge {
	public static void main(String[] args) {
		int number = 4;
		int finishNumber = 20;
		int count = 0;

		while (number <= finishNumber) {
			number++;
			if (!isEvenNumber(number)) {
				continue;
			}
			count++;
			System.out.println("Even number " + number);
			if (count == 5) {
				break;
			}
		}
		System.out.println("Total even numbers found = " + count);
	}

	public static boolean isEvenNumber(int number) {
		return number % 2 == 0;
	}
}
