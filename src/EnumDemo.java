import java.util.Arrays;

public class EnumDemo {
	public static void main(String[] args) {
		//Season season = Season.SUMMER;
		//System.out.println("season = " + season);
		Season[] array = Season.values();
//		System.out.println(Arrays.toString(array));
		for(Season season : array) {
			System.out.println(season + ",");
			System.out.println(season.ordinal()+ "," + season.getValue());
		}
	}

}
