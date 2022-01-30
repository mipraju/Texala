package com.TexalaSevice;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class Service {
	
	  private String fileName="C:\\Users\\Avadhut\\workspace\\New_folder\\TexalaProjectDemo\\web-content.txt";
		public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
		public String getHtmlData(String websiteName)throws IOException
		{
			 File file = new File(fileName);
		      if (file.createNewFile()) {
		        System.out.println("File created: " + file.getName());
		      } else {
		        System.out.println("File already exists.");
		      }
		URL url = new URL(websiteName);
		Scanner scanner = new Scanner(url.openStream());
		StringBuffer stringBuffer = new StringBuffer();
	       		      
	      while(scanner.hasNext()) {
	         stringBuffer.append(scanner.next());
	      }
	      String data = stringBuffer.toString();
	      FileWriter fileWriter = new FileWriter(fileName);
	      fileWriter.write(data);
	      fileWriter.close();
	      
	      System.out.println("HTML source code is written in the file");
	     return data;
	}
	
	}


