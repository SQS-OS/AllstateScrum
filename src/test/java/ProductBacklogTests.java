import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.*;


public class ProductBacklogTests {

	@Test
	public void RetrieveBackLogItemByPriority() {
		
		//Arrange
		IBacklogItem pbi = Mockito.mock(IBacklogItem.class);
		Mockito.when(pbi.getName()).thenReturn("A");
		
		ProductBacklog backlog = new ProductBacklog();
		
		//Act
		backlog.AddItem(pbi);
		IBacklogItem retrievedPbi = backlog.GetItemByPriority(1);
		
		//Assert
		assertEquals(pbi.getName(), retrievedPbi.getName());
	}
}