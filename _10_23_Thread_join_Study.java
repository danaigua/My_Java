package JOB;

public class _10_23_Thread_join_Study {
	//join方法：让调用的线程先执行指定时间或者执行完毕在执行，会抛出中断异常InterruptedException
	public static void main(String[] args) throws InterruptedException {
		MyRunnable3 mr3 = new MyRunnable3();
		Thread t2 = new Thread(mr3);
		t2.start();
		/**
		 * 中断有两种：正常中断，异常中断
		 */
		MyRunnable2 mr2 = new MyRunnable2();
		Thread t = new Thread(mr2);
		t.start();
		for(int i = 0;i < 50;i++) {
			System.out.println(Thread.currentThread().getName()+"->");
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(i==20) {
//				t.join();//让t执行完毕，主线程在执行
//				t.interrupt();//会抛出异常，然后中断被移除，也可以理解为打了一个中断标记
				mr3.flag = false;
				
			}
		}
	}

}
class MyRunnable2 implements Runnable{

	@Override
	public void run() {
		for(int i = 0;i<50;i++) {
			if(Thread.interrupted()) {
				//测试当前线程是否中断,此方法会把中断状态清除
				break;//还是会抛出异常，然后把中断状态清除
			}
			System.out.println(Thread.currentThread().getName()+"->");
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				Thread.currentThread().interrupt();
				//打回标记
			}
		}
	}
	
}
class MyRunnable3 implements Runnable{
	//自定义标记来控制线程的中断：开发中比较推荐
	public boolean flag = true;
	public MyRunnable3() {
		flag = true;
	}
	@Override
	public void run() {
		int i = 0;
		while(flag) {
			System.out.println(Thread.currentThread().getName()+"->"+i++);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}