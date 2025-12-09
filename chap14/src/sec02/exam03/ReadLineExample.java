package sec02.exam03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class ReadLineExample {

	public static void main(String[] args) throws Exception {
		// 문자 기반 파일 입력 스트림
		Reader reader = new FileReader(ReadLineExample.class.getResource("language.txt").getPath());
		
		BufferedReader br = new BufferedReader(reader); // 한 문자씩 읽는 것 보다 라인(행) 단위로 문자열을 읽어 성능 향상
		
		while (true) {
			String data = br.readLine(); // 더 이상 읽을 수 없을때 null 반환
			if (data == null) break;
//			System.out.println(data);
		}
		
		br.close();
		
		// Quiz. ReadLineExample.java 파일을 읽어 콘솔에 출력해보기

		Reader reader2 = new FileReader("src/sec02/exam03/ReadLineExample.java");
				
		
		BufferedReader br2 = new BufferedReader(reader2); // 한 문자씩 읽는 것 보다 라인(행) 단위로 문자열을 읽어 성능 향상
		
		int lineNumber = 1;
		while (true) {
			String data2 = br2.readLine(); // 더 이상 읽을 수 없을때 null 반환
			if (data2 == null) break;
			System.out.println(lineNumber + " " + data2);
			lineNumber++;
		}
		
		br2.close();
		System.out.println();
		
		}
}
