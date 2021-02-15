package QueueLab;

public class WaitLineMain {

	public static void main(String[] args) {
		
		WaitLine line = new WaitLine();
		
		line.simulate(10, 0.1, 4);
	}
}
