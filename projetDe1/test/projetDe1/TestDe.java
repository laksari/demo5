package projetDe1;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import bo.De;

public class TestDe {

		
		@Test
		public void testCtor(){
			
			De d = new De();
			Assert.assertNotNull(d);
		}
		
		@Test
		public void testLancer(){
			De d = new De();
			int resultat = (int) d.lancer();
			
			assertTrue(resultat>0 && resultat<7);
		}

}


