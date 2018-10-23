package JOB;

public class _10_23_Thread_join_Study {
	//join�������õ��õ��߳���ִ��ָ��ʱ�����ִ�������ִ�У����׳��ж��쳣InterruptedException
	public static void main(String[] args) throws InterruptedException {
		MyRunnable3 mr3 = new MyRunnable3();
		Thread t2 = new Thread(mr3);
		t2.start();
		/**
		 * �ж������֣������жϣ��쳣�ж�
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
//				t.join();//��tִ����ϣ����߳���ִ��
//				t.interrupt();//���׳��쳣��Ȼ���жϱ��Ƴ���Ҳ�������Ϊ����һ���жϱ��
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
				//���Ե�ǰ�߳��Ƿ��ж�,�˷�������ж�״̬���
				break;//���ǻ��׳��쳣��Ȼ����ж�״̬���
			}
			System.out.println(Thread.currentThread().getName()+"->");
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				Thread.currentThread().interrupt();
				//��ر��
			}
		}
	}
	
}
class MyRunnable3 implements Runnable{
	//�Զ������������̵߳��жϣ������бȽ��Ƽ�
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