//import com.example.libs.Car; //직접 지정할 수 있다.
import com.example.product.Ballpen;


public class Main {
	public static void main(String[] args) {
		com.example.libs.Car sonata = new com.example.libs.Car("Silver Sonata");
		java.util.Date now = new java.util.Date(); //FQDN(Fully Qualified Domain Name)
		System.out.println(sonata); // sonata.toString
		
		Ballpen monami = new Ballpen();
		//System.out.println(monami.name);
		
		com.example.finance.Money lotto = 
				new com.example.finance.Money();
		System.out.println(lotto.balance);
	}
}