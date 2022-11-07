import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

class TestCheckPresence {
	
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
