package com.cg.eis.bean;
import java.io.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDataThread {
	FileInputStream fromfile;
	FileOutputStream tofile;
	
	public void test(String s1,String s2) throws IOException
	{
		try {
			fromfile=new FileInputStream(s1);
			tofile=new FileOutputStream(s2);
		}
		catch (FileNotFoundException fe) {
			// TODO: handle exception
System.out.println("Exception is "+fe);	
throw fe;}
	}
	public void copycontents()throws IOException,InterruptedException
	{
		try
		{
			int i=fromfile.read();
			int charcount=0;
			while (i!=-1) {
				charcount++;
				if(charcount==10)
				{
					System.out.println("10 characters are copied");
					charcount=0;
					Thread.sleep(5000);
				}
				tofile.write(i);
				i=fromfile.read();
			}
		}
		catch (IOException ioe) {
			System.out.println("Exception "+ioe);
			throw ioe;
		}
	finally {
		if(fromfile!=null)
		{
			fromfile.close();
		}
		if(tofile!=null)
		{
			tofile.close();
		}
	}

}}
