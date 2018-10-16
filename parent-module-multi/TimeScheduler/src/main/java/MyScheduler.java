import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class MyScheduler extends TimerTask {

	@Override
	public void run() {
		System.out.println("Scheduled Task is running" + new Date());
		completeTask();
		System.out.println("Task Finished");
	}

	private void completeTask() {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		TimerTask sc = new MyScheduler();
		Timer t = new Timer(true);
		t.scheduleAtFixedRate(sc, 0, 10 * 1000);
		try {
			Thread.sleep(120000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sc.cancel();
		System.out.println("timer cancel");
		try {
			Thread.sleep(30000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
