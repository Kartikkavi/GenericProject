package geneic;

public class MaxString {

		public String getMaxstring(String x, String y, String z) {
		   	if (x.compareTo(y) > 0) {
		      	if (x.compareTo(z) > 0) {
		         	return x;
		      	}
		    	}
		      if (y.compareTo(z) > 0) {
		        	return y;
		      }
		      	return z;
		    	}
			public static void main(String args[]){

				System.out.println("Welcome to Find Maximum String value");

			} 
		

	}


