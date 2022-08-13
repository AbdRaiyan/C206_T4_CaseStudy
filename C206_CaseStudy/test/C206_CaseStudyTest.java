import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_CaseStudyTest {
	//career 
	private career career1;
	private career career2;
	private career career3;
	
	//ArrayList
	ArrayList<career> careerList;

	public C206_CaseStudyTest() {
		super();
	}
	@Before
	public void setUp() throws Exception {
		//career putting the informations inside the variable
		career1 = (new career(1,"School Teacher"));
		career2 =(new career(2,"Accountant"));
		career3 =(new career (3,"IT Programmer"));
		
		//ArrayList
		careerList = new ArrayList <career>();
	}


//---------------------Career -----------------------------
	@Test
	public void testAddCareerInfo() {
		// Career list is not null, so that can add a new career - boundary
		assertNotNull("Test if there is valid career arraylist to add to", careerList);
		//Given an empty list, after adding 1 career, the size of the list is 1 - normal
		//The career just added is as same as the first item of the list	
		C206_CaseStudy.addCareerInfo(careerList, career1);
		assertEquals("Test that career arraylist size is 1", 1, careerList.size());	
		//The item just added is as same as the first item of the list
		assertSame("Test that quotation is added", career1, careerList.get(0));
						
		//Add another item. test The size of the list is 2?
		C206_CaseStudy.addCareerInfo(careerList, career2);
		assertEquals("Test that Quotation arraylist size is 2?", 2, careerList.size());
		assertSame("Test that Quotation is added same as 2nd item of the list?", career2, careerList.get(1));
		
	}
	@Test
	public void testDeleteCareerInfo(){
		//check Career list is not null, so that can delete an item
		C206_CaseStudy.addCareerInfo(careerList, career1);
		C206_CaseStudy.addCareerInfo(careerList, career2);
		C206_CaseStudy.addCareerInfo(careerList, career3);
		assertNotNull(careerList);
		
		//Given an empty list, after adding two Career, the size of the list is 3, after removing an career, then the size of list becomes 2.
		assertNotNull("Check if there is valid carerr arrayList to add to", careerList);
		
		assertEquals(3, careerList.size());
		assertEquals("Check that quotation arraylist size is 3", 3, careerList.size());
		careerList.remove(0);
		assertEquals(2, careerList.size());
		assertEquals("Check that quotation arraylist size is 2", 2, careerList.size());
		
		//Remove another item, then list is empty
		careerList.remove(0);
		careerList.remove(0);

		assertEquals(0, careerList.size());
		assertEquals("Check that quotation arraylist size is 0", 0, careerList.size());
	}
	

	
	@After
	public void tearDown() throws Exception {
	//career
		career1 = null;
		career2 = null;
		career3 = null;
	}

}