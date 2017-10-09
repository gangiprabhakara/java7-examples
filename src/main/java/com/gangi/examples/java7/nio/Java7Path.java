package com.gangi.examples.java7.nio;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Java7Path {

	public static void main(String[] args) throws IOException {
		Path filePath = Paths.get("/Users/pgangi/work/myowngit/java7-examples/java7-examples/pom.xml");
		System.out.println(filePath.getFileName());
		System.out.println(filePath.getFileSystem().getSeparator());
		System.out.println(filePath.getNameCount());
		System.out.println(filePath.getParent());
		System.out.println(filePath.getRoot());
		System.out.println(filePath.toFile());
		
		//System.out.println(Files.readAllLines(Paths.get(URI.create("http://www.google.com"))));
	}

}
