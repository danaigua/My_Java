package JOB;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class _10_18_queue_study {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<>();
		queue.add("小花");
		queue.add("小黑");
		queue.add("小白");
		queue.add("小灰");
		queue.add("小丽");
		//先进先出
		//请求队列，消息队列，任务队列
		//Deque双端队列，两边都可以操作
		/**
		 * Stack类代表先进后出的堆栈
		 * 堆栈和堆内存，栈内存还不一样
		 * 堆栈表示一种数据结构
		 * 堆内存和栈内存表示一块地址
		 */
		Stack<String> s = new Stack<>();
		s.push("lily");
		
		/**
		 * 面向对象里面：一对多和多对多的关系
		 */
		Teacher t1= new Teacher("张老师",18,"女");
		Student s1 = new Student("小李",10);
		Student s2 = new Student("小白",12);
		Student s3 = new Student("小黑",13);
		//关联关系
		t1.getStudents().add(s1);
		t1.getStudents().add(s2);
		t1.getStudents().add(s3);
		s1.setTeacher(t1);
		s2.setTeacher(t1);
		s3.setTeacher(t1);
		/**
		 * 多对多
		 * 在开发中不建议直接采用多对多关系
		 * 多对多关系可以拆分为两个一对多的关系（采用中间量连起来）
		 */
		}

}
class Teacher{
	private String name;
	private int age;
	private String sex;
	private HashSet<Student> students = new HashSet<>();//一个老师对应多个学生
	
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