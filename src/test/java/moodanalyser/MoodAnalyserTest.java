package moodanalyser;

import org.junit.Test;

import org.junit.Assert;

public class MoodAnalyserTest {
	@Test
	public void givenMsg_When_Sad_returnSad() {
		MoodAnalyser moodfinder = new MoodAnalyser("this is sad message");
		Assert.assertEquals("SAD", moodfinder.analyseMood());
	}
	
	@Test
	public void givenMsg_When_Happy_returnHappy() {
		MoodAnalyser moodfinder = new MoodAnalyser("this is happy message");
		//String mood = moodfinder.analyseMood("this is happy message");
		Assert.assertEquals("HAPPY", moodfinder.analyseMood());
	}
	
	@Test(expected = NullPointerException.class)
	public void givenMsg_When_Null() {
		MoodAnalyser moodfinder = new MoodAnalyser(null);
		//String mood = moodfinder.analyseMood("this is happy message");
		 moodfinder.analyseMood();
	}
	
}
