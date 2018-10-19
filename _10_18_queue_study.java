package JOB;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class _10_18_queue_study {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<>();
		queue.add("С��");
		queue.add("С��");
		queue.add("С��");
		queue.add("С��");
		queue.add("С��");
		//�Ƚ��ȳ�
		//������У���Ϣ���У��������
		//Deque˫�˶��У����߶����Բ���
		/**
		 * Stack������Ƚ�����Ķ�ջ
		 * ��ջ�Ͷ��ڴ棬ջ�ڴ滹��һ��
		 * ��ջ��ʾһ�����ݽṹ
		 * ���ڴ��ջ�ڴ��ʾһ���ַ
		 */
		Stack<String> s = new Stack<>();
		s.push("lily");
		
		/**
		 * ����������棺һ�Զ�Ͷ�Զ�Ĺ�ϵ
		 */
		Teacher t1= new Teacher("����ʦ",18,"Ů");
		Student s1 = new Student("С��",10);
		Student s2 = new Student("С��",12);
		Student s3 = new Student("С��",13);
		//������ϵ
		t1.getStudents().add(s1);
		t1.getStudents().add(s2);
		t1.getStudents().add(s3);
		s1.setTeacher(t1);
		s2.setTeacher(t1);
		s3.setTeacher(t1);
		/**
		 * ��Զ�
		 * �ڿ����в�����ֱ�Ӳ��ö�Զ��ϵ
		 * ��Զ��ϵ���Բ��Ϊ����һ�Զ�Ĺ�ϵ�������м�����������
		 */
		}

}
class Teacher{
	private String name;
	private int age;
	private String sex;
	private HashSet<Student> students = new HashSet<>();//һ����ʦ��Ӧ���ѧ��
	
	public HashSet<Student> getStudents() {
		return students;
	}
	public void setStudents(HashSet<Student> students) {
		this.students = students;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	@Override
	public String toString() {
		return "Teacher [name=" + name + ", age=" + age + ", sex=" + sex + "]";
	}
	public Teacher(String name, int age, String sex) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	public Teacher() {
		super();
	}
	
}
class Student{
	private String name;
	private int age;
	private Teacher teacher;
	private int sid;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Student() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
class StudentAndCourse{
	private int id;
	private int sid;
	private int cid;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	
}
class Course{
	private int cid;

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}
	
}