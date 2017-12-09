package com.JavaConcepts.FileIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class UnZipFile {

	public static void main(String[] args) throws IOException {
		final String fileZip = "";
		final byte[] buffer = new byte[1024];
		final ZipInputStream zis = new ZipInputStream(new FileInputStream(fileZip));
		ZipEntry zipEntry = zis.getNextEntry();
		while(zipEntry!=null){
			final String fileName = zipEntry.getName();
			final File newFile = new File("src/main/success/unziptest"+fileName);
			final FileOutputStream fos = new FileOutputStream(newFile);
			int len;
			while((len=zis.read(buffer))>0){
				fos.write(buffer,0,len);
			}
			fos.close();
			zipEntry = zis.getNextEntry();
		}
		zis.closeEntry();
		zis.close();
	}
}
