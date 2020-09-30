package moodanalyser;

public class MoodException extends Exception {
	
	public enum expectedType{
		Null_EXCEPTION, EMPTY_EXCEPTION
	}
	
	public MoodException(expectedType type , String msg) {
		super(msg);
		System.out.println(type);
	}
}
