
public class OuterClass1 {
	private String name = "한지민"; // 바깥쪽 클래스의 멤버변수
	private static int age = 26; // 바깥쪽 클래스의 스태틱변수
	public void display() { // 바깥쪽 클래스의 멤버메소드
		System.out.println("name = " + this.name);
	}
	public static void print() { // 바깥쪽 클래스의 스태틱메소드
		System.out.println("Age = " + age);
	}
	
	public class InnerClass1 { //멤버클래스 << (static이 붙지않으면)
		public double avg = 89.5; //안쪽 클래스의 멤버변수
		//public static boolean flag = true; //안쪽 클래스의 스태틱변수
		public void show() { //안쪽 클래스의 멤버 메소드
			print();  
			display();
			System.out.println("나이 = " + age);
			System.out.println("이름 = " + name); //스태틱은 멤버에 접근할수없다. 접근 하려면 name이 속한 클래스주소가있어야한다.
		}
	}
}
