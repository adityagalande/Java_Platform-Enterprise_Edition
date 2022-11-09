package suiteTest;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import codeSample.sampleArray;

class checkTrueOrFalse {

sampleArray sa = new sampleArray();
	
	@Test
	void testPresenceTrue() {
		assertTrue(sa.checkArray());
	}
	
	@Test
	void testPresenceFalse() {
		assertFalse("Unfortunately true",sa.checkArray());
	}

}
