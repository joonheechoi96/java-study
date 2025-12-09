package sec03.exam03.quiz;

import java.io.File;

public class FileManager {
	
	private String dir;
	


	public void deleteFile(String dir) {
		File toDelete = new File(dir);
		File[] files = toDelete.listFiles();
		for (File file : files) {
			if (!file.isFile()) {
				System.out.println(file.getPath() + " -> 삭제 안됨");
			} else {
				System.out.println(file.getPath() + " -> 삭제 완료");
				file.delete();
			}
		}
	}
}
