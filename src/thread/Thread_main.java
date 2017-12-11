package thread;

public class Thread_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Thread_run th = new Thread_run();
		Thread_runnable th2 = new Thread_runnable();
		Thread_run[] s = new Thread_run[10];
		Thread_runnable[] t = new Thread_runnable[10];
		th.start();
		th2.run();
		for(int i=0;i<10;i++) {
			s[i]=new Thread_run();
			t[i]=new Thread_runnable();
			s[i].start();
			t[i].run();
			
		}
		
		try {
			th.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i = 0; i < 10; i++) {
			System.out.println("main‚©‚ço—Í@F  "+i);
			
		}
	}
}
