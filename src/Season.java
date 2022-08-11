/**
 * 
 * @author <font size = '7' color='blue'>Ayaan</font>
 * @version <b>1.0</b>
 * @since <i>2022-08-01</i>
 *
 */
//enum상수를 제일 먼저 써주어야한다.
public enum Season {
	SPRING(100), SUMMER(500), FALL(1000), WINTER(10000);
	
	private int value;
	Season(int value){ //Constructor
		this.value = value;
	}
public int getValue() {
	return this.value;
}
}
