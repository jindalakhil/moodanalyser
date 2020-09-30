package moodanalyser;

public class MoodAnalyser {
	private String msg;
	
	public MoodAnalyser() {
	}
	
	public MoodAnalyser(String msg) {
		this.msg =msg;
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome to mood analyser");
	}
	
	public String analyseMood() {
		try {
			if(msg.contains("sad")) {
				return "SAD";
			} else {
				return "HAPPY";
			}
		}catch (NullPointerException e) {
			return "HAPPY";
		}
		
	}
}
