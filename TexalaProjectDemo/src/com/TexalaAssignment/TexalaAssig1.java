package com.TexalaAssignment;
import java.io.IOException;

import com.TexalaSevice.*;
public class TexalaAssig1 {

	public static void main(String[] args) {
		String websiteName="http://www.google.com/";
		Service service=new Service();
		try {
			service.getHtmlData(websiteName);
		}
		catch (IOException e) {
			e.printStackTrace();
		}
}
	}
	