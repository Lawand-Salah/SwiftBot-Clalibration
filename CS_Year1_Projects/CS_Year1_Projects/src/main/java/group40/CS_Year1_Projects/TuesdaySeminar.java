import java.util.Iterator;

public class TuesdaySeminar {

	public static void main(String[] args) {
		double j, j2w;
		
		for(j = -1000; j<=0;j+=10) {
			j2w = JoulesToWattHours(j);
			System.out.println(j + " " + j2w);
		}
		j = 0.0001;
		j2w = JoulesToWattHours(j);
		System.out.println(j + " " + j2w);
		for (j= 1000000; j <= 2000000; j += 10000) {
			j2w = JoulesToWattHours(j);
			System.out.println(j + " " + j2w);
		}
		for (j = 3600; j <= 36000; j+=900) {
			j2w = JoulesToWattHours(j);
			System.out.println(j + " " + j2w);
		}

	}
	
	public static double JoulesToWattHours(double j) {
		if(j <= 0) {
			return -1.0;
		}
		else if( j > 1000000) {
			return -2.0;
		} else {
			return j/3600.0;
		}
	}

}
