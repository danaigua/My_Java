package JOB;

public class _10_22_Thread_use {
	public static void main(String[] args) {
		MyThread mt = new MyThread();
		mt.start();//�����߳�
		MyRunnable mr = new MyRunnable();
		Thread t2 = new Thread(mr);
		t2.start();

	}

}
//ʵ���̵߳ĵ�һ�ַ�ʽ���̳�Thread��
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