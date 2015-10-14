import static org.junit.Assert.*;

import org.junit.Test;


public class BacklogItemTests {

	@Test
	public void TestBacklogItemHasName() {
		
		IBacklogItem backlogItem = new BacklogItem("A");
		
		assertTrue(backlogItem.getName()=="A");	
	}

}
