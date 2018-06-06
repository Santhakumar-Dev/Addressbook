package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import main.AddressBookEntry;
import main.AddressBookService;

public class AddressBookServiceTest {
	
	private AddressBookService service = new AddressBookService();

	@Before
	public void setUp() throws Exception {
		
		//Adding entries into the addressbook
		
		service.addContact("Smith", "Peter", "123 Kent Street");
		service.addContact("Bloggs", "Anna", "123 Kent Street");
		service.addContact("Smith", "Peter", "123 George Street");
		service.addContact("Smith", "Peter", "123 Kent Street");
		
	}

	@Test
	public void testGetAddresses() {

		String expectedResult = "123 George Street, 123 Kent Street";
				
		String resultOne = service.getAddresses("Smith", "Peter");
		assertEquals(expectedResult, resultOne);
		
		String resultTwo = service.getAddresses("Bloggs", "");
		assertNull(resultTwo);
		
	}

}
