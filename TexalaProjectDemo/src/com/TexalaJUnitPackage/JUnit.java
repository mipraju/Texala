package com.TexalaJUnitPackage;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.TexalaSevice.Service;

public class JUnit {
	 Service service = new Service();
	    private String fileName = "C:\\Users\\Avadhut\\workspace\\New folder\\TexalaProjectDemo\\web-content.txt";
	    
	    public String getFileName() {
			return fileName;
		}

		public void setFileName(String fileName) {
			this.fileName = fileName;
		}
	    
	    @Test
	    public void testGetHtmlDataWithWrongPath() throws Exception{
	        Assertions.assertNull(service.getHtmlData("ancsd.com/"));
	    }

	    @Test
	    public void testGetHtmlDataWithCorrectPath() throws Exception{
	        String htmlData = service.getHtmlData("http://www.google.com/");
	        Assertions.assertNotNull(htmlData);
	    }

		

}
