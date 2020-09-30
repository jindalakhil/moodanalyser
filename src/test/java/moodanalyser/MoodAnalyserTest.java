package moodanalyser;

import org.junit.Test;

import org.junit.Assert;

public class MoodAnalyserTest {
	@Test
	public void givenMsg_When_Sad_returnSad() {
		MoodAnalyser moodfinder = new MoodAnalyser();
		String mood = moodfinder.analyseMood("this is sad message");
		Assert.assertEquals("SAD", mood);
	}
	
	@Test
	public void givenMsg_When_Happy_returnHappy() {
		MoodAnalyser moodfinder = new MoodAnalyser();
		String mood = moodfinder.analyseMood("this is happy message");
		Assert.assertEquals("HAPPY", mood);
	}
	
}
