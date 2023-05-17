package exception;

public class DanvalueException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DanvalueException (){
		System.out.println("1~999까지의 숫자만 가능합니다.");
	}
}
