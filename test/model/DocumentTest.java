package model;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import model.Document;
import Exceptions.NoDayException;
import Exceptions.TiException;
class DocumentTest {
	
	
	private Document mydocument;
	private void setupScenary1() {
		mydocument = new Document(2, "123456");
	}
	
	
	
	@Test
	void testAddDocument1() {
		setupScenary1();
		int prtype = mydocument.getType();
		try {
			int ntype = 1;
			mydocument.setType(ntype);
			fail(" not Ti Exception Excepted");
		}
		catch(TiException ti) {
			assertEquals(prtype, mydocument.getType());
		}catch(NoDayException nde) {
			fail(" not No day exception excepted");
		}
	}

}
