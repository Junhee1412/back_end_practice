package com.lec.ex05_file;

import java.io.File;
import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileMain {

	public static void main(String[] args) throws Exception {
		
		File dir   = new File("c:/temp/dir");
		File file1 = new File("c:/temp/dir/file1.txt");
		File file2 = new File("c:/temp/dir/file2.txt");
		
		// URI로 생성하는 방법
		File file3 = new File(new URI("file:///c:/temp/dir/file3.txt"));
		File file4 = new File(new URI("file:///c:/temp/file4.txt"));
		
		if(dir.exists() == false) { dir.mkdirs(); }
		if(!file1.exists()) {file1.createNewFile();}
		if(!file2.exists()) {file2.createNewFile();}
		if(!file3.exists()) {file3.createNewFile();}
		if(!file4.exists()) {file4.createNewFile();}
		
		File temp = new File("c:/temp");
		SimpleDateFormat sdf = new SimpleDateFormat("yy-mm-dd   a    HH:mm");
		File[] filelist = temp.listFiles();
		System.out.println("--------------------------------------------------");
		for(File file:filelist) {
			System.out.println(sdf.format(new Date(file.lastModified())));
			if(file.isDirectory()) {
				System.out.println("\t<DIR>\t" + file.getName());
			}else {
				System.out.println("\t"+file.length() + "\t"+file.getName());
			}
		}
	}
}
