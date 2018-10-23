package JOB;

public class _10_22_Thread_use {
	public static void main(String[] args) {
		MyThread mt = new MyThread();
		mt.start();//启动线程
		MyRunnable mr = new MyRunnable();
		Thread t2 = new Thread(mr);
		t2.start();

	}

}
//实现线程的第一种方式：继承Thread类
class MyThread extends Thread {
	@Override
	public void run() {
			for(int i = 0;i < 50; i++) {
				System.out.println(Thread.currentThread().getName()+"->"+i);
			}
		}
}
class MyRunnable implements Runnable{
	public void run() {
		for(int i = 0;i < 50; i++) {
			System.out.println(Thread.currentThread().getName()+"->"+i);
		}
		
	}
}