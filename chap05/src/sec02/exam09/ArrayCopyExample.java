package sec02.exam09;

import java.util.Arrays;

public class ArrayCopyExample {

	public static void main(String[] args) {
		// 2. System.arraycopy() 메소드 이용
		String[] oldStrArray = {"java", "array", "copy"};
		String[] newStrArray = new String[5];
		
		System.arraycopy(oldStrArray, 0, newStrArray, 1, oldStrArray.length);
		
		for (int i = 0; i < newStrArray.length; i++) {
			System.out.print(newStrArray[i] + ", ");
		}
		
		System.out.println();
		
		// 3. Arrays.coptOf() 메소드 이용
		
		// Arrays.copyOf(T[] original, int newLength)
		// original: 복사할 원본 배열
		// newLength: 복사할 새 배열의 길이(기존보다 작거나 클 수 있음)
		String[] newStrArray2 = Arrays.copyOf(oldStrArray, oldStrArray.length + 2);
		
		for (int i = 0; i < newStrArray2.length; i++) {
			System.out.print(newStrArray2[i] + ", ");
		}
	}

}
