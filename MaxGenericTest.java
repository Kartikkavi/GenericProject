package geneic;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class MaxGenericTest {


	@Test
	void givenStrings_whenMaxAtFirst_returnSame() {
		MaxString maxString = new MaxString();
	        String result = maxString.getMaxstring("peach", "apple", "banana");
	        Assertions.assertEquals( "peach", result);
	  
	}
	@Test
	void givenStrings_whenMaxAtsecond_returnSame() {
		MaxString maxString = new MaxString();
	        String result = maxString.getMaxstring("apple", "peach", "banana");
	        Assertions.assertEquals( "peach", result);
	  
	}
	@Test
	void givenStrings_whenMaxAtThird_returnSame() {
		MaxString maxString = new MaxString();
	        String result = maxString.getMaxstring( "banana","peach","apple");
	        Assertions.assertEquals( "peach", result);
	  
	}
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
	@Test
	void givenInteger_WhenMaxAtFirst_returnSame() {
		MaximumNum maxNum =new MaximumNum();
		int result = maxNum.getIntMaxNum(3,1,2);
		Assert.assertEquals(3, result);
	}

	@Test
	void givenInteger_WhenMaxAtsecond_returnSame() {
		MaximumNum maxNum =new MaximumNum();
		int result = maxNum.getIntMaxNum(20, 50, 70);
		Assert.assertEquals(70, result);
	}
	@Test
	void givenInteger_WhenMaxAtThird_returnSame() {
		MaximumNum maxNum =new MaximumNum();
		int result = maxNum.getIntMaxNum(20, 70, 50);
		Assert.assertEquals(70, result);
	}
}

