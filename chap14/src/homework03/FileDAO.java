package homework03;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class FileDAO {
	
	public boolean checkName(String file) {
		File hw = new File("C:/Temp/hw");
		File[] contents = hw.listFiles();
		for (File files : contents) {
			if(files.getName().equals(file)) {
				return true;
			}
		}	return false;
	}
	
	public void fileSave(String file, String s) throws IOException {
		File files = new File("C:/Temp/hw/" + s);
		try {
			if(!files.exists()) files.createNewFile();
		} catch (IOException e) {
			System.out.println("이미 존재하는 파일 입니다.");
		}
		OutputStream os = new FileOutputStream("C:/Temp/hw/" + s);
		Writer writer = new OutputStreamWriter(os, "UTF-8");
		writer.write(s);
		writer.flush();
		writer.close();
	}
	
	public StringBuilder fileOpen(String file) {
		StringBuilder sb = new StringBuilder();
		try(BufferedReader br = new BufferedReader(new FileReader("C:/Temp/hw/" + file))) {
			String line = br.readLine();
			while(line != null) {
				sb.append(line).append("\n");
				line = br.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return sb;
	}
	
	public void fileEdit(String file, String s) {
		try(FileWriter fw = new FileWriter("C:/Temp/hw/" + file, true)) {
			fw.write(s);
		} catch (IOException e) {
		}
	}
	
}
