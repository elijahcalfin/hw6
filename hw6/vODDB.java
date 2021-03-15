package hw6;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class vODDB {

	@Test
	void test() {
		DiceBag d = new DiceBag();
		DiceBag e = new DiceBag();
		OrderDie test1 = new OrderDie("Jeffrey", "red");
		OrderDie test2 = new OrderDie("James", "red");
		OrderDie test3 = new OrderDie("Jane", "blue");
		OrderDie test4 = new OrderDie("Janet", "blue");
		OrderDie test5 = new OrderDie("John", "blue");
		d.addToken(test1);
		e.addToken(test1);
		e.addToken(test2);
		e.addToken(test3);
		e.addToken(test4);
		e.addToken(test5);
		List<Token> bagAcquired = e.letsGetThisBag();
		String bagString = e.toString();
		
		assertTrue(d!=null);
		
		assertEquals(" Dice left: 5\nJeffrey red\nJames red\nJane blue\nJanet blue\nJohn blue\n",bagString);
		
		assertTrue((bagAcquired.get(0).toString().contains("red")==true));
		assertTrue((bagAcquired.get(1).toString().contains("red")==true));
		assertTrue((bagAcquired.get(2).toString().contains("blue")==true));
		assertTrue((bagAcquired.get(3).toString().contains("blue")==true));
		assertTrue((bagAcquired.get(4).toString().contains("blue")==true));
		
	}
	
}
