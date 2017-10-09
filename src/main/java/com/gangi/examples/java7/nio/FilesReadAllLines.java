package com.gangi.examples.java7.nio;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FilesReadAllLines {

	public static void main(String[] args) {
		
		//Path filePath = Paths.get("/Users/pgangi/work/myowngit/java7-examples/java7-examples", "pom.xml");

		Path filePath = Paths.get("/Users/pgangi/work/myowngit/java7-examples/java7-examples/pom.xml");
	    try {
	      List<String> lines = Files.readAllLines(filePath, Charset.defaultCharset());

	      for (String line : lines) {
	        System.out.println(line);
	      }
	    } catch (IOException e) {
	      System.out.println(e);
	    }

	 }

}
