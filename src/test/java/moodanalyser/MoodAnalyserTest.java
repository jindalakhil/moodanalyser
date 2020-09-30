package moodanalyser;

import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.Assert;

public class MoodAnalyserTest {
	@Test
	public void givenMsg_When_Sad_returnSad() throws MoodException {
		MoodAnalyser moodfinder = new MoodAnalyser("this is sad message");
		Assert.assertEquals("SAD", moodfinder.analyseMood());
	}
	
	@Test
	public void givenMsg_When_Happy_returnHappy() throws MoodException {
		MoodAnalyser moodfinder = new MoodAnalyser("this is happy message");
		//String mood = moodfinder.analyseMood("this is happy message");
		Assert.assertEquals("HAPPY", moodfinder.analyseMood());
	}
	
	@Test
	public void givenMsg_When_Null() throws MoodException {
		MoodAnalyser moodfinder = new MoodAnalyser(null);
		try {
		ExpectedException e = ExpectedException.none();
		e.expect(MoodException.class);
		} catch (Exception e) {
			e.printStackTrace();
			Assert.assertEquals("Null Exception", moodfinder.analyseMood());
		}
	}
	
	@Test
	public void givenMsg_When_Empty() throws MoodException {
		MoodAnalyser moodfinder = new MoodAnalyser("");
		try {
		ExpectedException e = ExpectedException.none();
		e.expect(MoodException.class);
		moodfinder.analyseMood();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
}
