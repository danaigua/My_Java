package JOB;

public class _10_23_Thread_daemon_yield {
	public static void main(String[] args) {
		//�߳̿��Է�Ϊ�ػ��̺߳��û��߳�
		//�����е�Ψһ�̶߳����ػ��߳�ʱ��������˳�
		MyRunable4 mr4 = new MyRunable4();
		Thread t = new Thread(mr4);
		t.start();
		t.setDaemon(true);//���߳�����Ϊ�ػ��̣߳�yield���ó�ʱ��Ƭ�� 
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