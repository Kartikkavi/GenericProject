package geneic;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MaxStringTest {

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
}
