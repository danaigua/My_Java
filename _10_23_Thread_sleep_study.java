package JOB;

public class _10_23_Thread_sleep_study {
	public static void main(String[] args) {
		//sleep方法，使当前正在执行的线程以指定的毫秒数暂停，释放cpu的时间片，具体取决于系统时间和调度程序的精度和准确性
		//线程不会丢失监视器的所有权
		MyThread mt = new MyThread();
//		mt.start();//启动线程
		MyRunnable mr = new MyRunnable();
		Thread t2 = new Thread(mr);
		t2.start();
		mt.start();
	}
}
class MyThread extends Thread {
	public void run() {
			for(int i = 0;i < 50; i++) {
				System.out.println(Thread.currentThread().getName()+"->"+i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
}
class MyRunnable2 implements Runnable{
	public void run() {
		for(int i = 0;i < 50; i++) {
			System.out.println(Thread.currentThread().getName()+"->"+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}