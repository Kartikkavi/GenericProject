package geneic;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class MaximumFloatTest {

	@Test
	void givenFloat_WhenMaxAtFirst_ReturnSame() {
		MaximumFloat  maxNum = new MaximumFloat();
	        float result = maxNum.getFloatMaxNum(97.33f, 123.3f, 1.1f);
	        Assertions.assertEquals(123.3f,result);
	  
		
	}
	@Test
	void givenFloat_WhenMaxAtsecond_ReturnSame() {
		MaximumFloat  maxNum = new MaximumFloat();
	        float result = maxNum.getFloatMaxNum(123.3f,1.1f,97.33f);
	        Assertions.assertEquals(123.3f, result);
	  
		
	}
	@Test
	void givenFloat_WhenMaxAtThird_ReturnSame() {
		MaximumFloat  maxNum = new MaximumFloat();
	        float result = maxNum.getFloatMaxNum(1.1f,97.33f,123.3f);
	        Assertions.assertEquals(123.3f, result);
	  
		
	}

}
