package ca.ualberta.cs.lonelytwitter;

import android.util.Log;

import java.util.Date;

public class ImportantLonelyTweet extends LonelyTweet {

	private static final long serialVersionUID = 1L;

	public ImportantLonelyTweet() {
	}

	public ImportantLonelyTweet(String text) {
		this.tweetDate = new Date();
		this.tweetBody = text;
	}

	@Override
	public String toString() {
		String s = getTweetDate() + " | " + getTweetBody().toUpperCase();
		Log.i("toString():", s);
		return s;
	}
}