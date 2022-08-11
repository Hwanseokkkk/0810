
public class OuterClass2 {
	private String name = "한지민"; // 바깥쪽 클래스의 멤버변수
	private static int age = 26; // 바깥쪽 클래스의 스태틱변수
	public void display() { // 바깥쪽 클래스의 멤버메소드
	}
	public static void print() { // 바깥쪽 클래스의 스태틱메소드
	}
	public void mymethod() {
		boolean flag = true; // 로컬 변수
		class InnerClass2 { // 안쪽 클래스
			private double avg = 89.5;  //안쪽 클래스의 멤버변수
			//private static char grade = 'C'; //안쪽 클래스의 스태틱변수 << 스태틱은 사용안됨
			public void repair() {//안쪽 클래스의 멤버메소드
				//System.out.println("나는 로컬 이너클래스의 멤버 메소드");
				System.out.println("이름 = " + name);
				System.out.println("나이 = " + age);
				System.out.println("flag = " + flag); 
			} 
			//public static void sort() {} 
			//안쪽 클래스의 스태틱메소드 << 스태틱은 사용안됨
		}
			InnerClass2 inner = new InnerClass2();
			System.out.println(inner.avg);
			inner.repair();
		}
	}

