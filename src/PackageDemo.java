import com.example.product.Ballpen; //경로를 잘 지정해도 해당 클래스가 public이 아니라면 접근이 제한된다.


public class PackageDemo extends Ballpen{
	//Ballpen클래스는 import로 접근했지만 내부정보는 protected로 되어있어서 상속을 이용하였다.
	public static void main(String[] args) {
		//Ballpen ballpen = new Ballpen();
//		PackageDemo pd = new PackageDemo();
//		System.out.println(pd.name);
		//Math m = new Math();
		
	}

}
