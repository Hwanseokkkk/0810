
public class AnnoymousInnerClassDemo {
	public static void main(String[] args) {
//		Car car = new Car();  현재까지 사용했던
//		car.print();          방법
		
//		Car car = new Car() { //private, public, static 불가
//			@Override //상속관계도 아닌데 클래스를 재정의를 할 수있다.
//			public void print() {
//				System.out.println("Hello, Java World!!!");
//			}
//		}; //까 먹 지 말 자 세미쿨론;;;;;;;;;;;;;;;;;;;;;;;;;;;
//		car.print();

		MyInterface mi = new MyInterface() {
			@Override
			public int calculate(int a, int b) {
				return a + b;
			}
		};
		int result = mi.calculate(5, 7);
		System.out.println("result = " + result);
		mi = new MyInterface() {
			@Override
			public int calculate(int a, int b) {
				return a * b;
			}
		};
		result = mi.calculate(5, 7);
		System.out.println("result = " + result);
	}
}