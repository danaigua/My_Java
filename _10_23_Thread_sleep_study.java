package JOB;

public class _10_23_Thread_sleep_study {
	public static void main(String[] args) {
		//sleep������ʹ��ǰ����ִ�е��߳���ָ���ĺ�������ͣ���ͷ�cpu��ʱ��Ƭ������ȡ����ϵͳʱ��͵��ȳ���ľ��Ⱥ�׼ȷ��
		//�̲߳��ᶪʧ������������Ȩ
		MyThread mt = new MyThread();
//		mt.start();//�����߳�
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