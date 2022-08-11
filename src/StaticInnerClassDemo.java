
public class StaticInnerClassDemo {
	public static void main(String[] args) {
		//OuterClass.print(); // public쪽으로 접근하자
		OuterClass.InnerClass inner = new OuterClass.InnerClass();
		//System.out.println(inner.avg); //주소로 접근
		//System.out.println(OuterClass.InnerClass.flag); //스태틱이라 주소가 필요없어서 그냥 이름으로 접근...
		inner.show();
		
	}

}
