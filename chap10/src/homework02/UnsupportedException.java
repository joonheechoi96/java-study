package homework02;

public class UnsupportedException extends RuntimeException {
	
	public UnsupportedException() {
		super();
	}
	
	@Override
	public String getMessage() {
		return "원인을 알 수 없는 오류가 발생했습니다.";
	}
}
