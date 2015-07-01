package ch7;

public class Exercise7_18 {

	public static void main(String[] args) {
		Robot[] arr = { new DanceRobot(), new SingRobot(), new DrawRobot() };
		for (int i = 0; i < arr.length; i++)
			action(arr[i]);
	}

	private static void action(Robot r) {
		if (r instanceof DanceRobot) {
			((DanceRobot) r).dance();
		}
		if (r instanceof SingRobot) {
			((SingRobot) r).sing();
		}
		if (r instanceof DrawRobot) {
			((DrawRobot) r).draw();
		}
	}

}
