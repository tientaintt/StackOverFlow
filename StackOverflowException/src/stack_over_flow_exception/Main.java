package stack_over_flow_exception;

public class Main {
	public void increaseCount(int count) {
		count ++;
		increaseCount(count);
		increaseCount(count);
		increaseCount(count);
		increaseCount(count);
		increaseCount(count);
		increaseCount(count);
	}
	public static void main(String[] args) {
		Main main=new Main();
		main.increaseCount(0);
		
	}

}

