package JOB;

public class _10_23_Thread_daemon_yield {
	public static void main(String[] args) {
		//线程可以分为守护线程和用户线程
		//当运行的唯一线程都是守护线程时虚拟机将退出
		MyRunable4 mr4 = new MyRunable4();
		Thread t = new Thread(mr4);
		t.start();
		t.setDaemon(true);//把线程设置为守护线程，yield，让出时间片段 
		for(int i = 0; i < 50; i++) {
			System.out.println(Thread.currentThread().getName()+i);
		}
	}

}
class MyRunable4 implements Runnable{

	@Override
	public void run() {
		for(int i = 0; i < 50; i++) {
			System.out.println(i);
		}
	}
	
}