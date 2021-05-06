package geneic;

public class MaximumFloat {
	public Float getFloatMaxNum(Float x, Float y, Float z) {
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
}
