package studio2;

public class Pi {

	public static void main(String[] args) {
	
	double r = .5;
	double in = 0;
	
	for (int i=0; i<100000; i++) {
		
		double x = Math.random();
		double y = Math.random();
		
		if (Math.sqrt(x*x+y*y)<r) {
			in++;
		}
		
	}
	
	double pi = (in*4)/(100000.0*(r*r));
	System.out.println(pi);
			

	}

}
