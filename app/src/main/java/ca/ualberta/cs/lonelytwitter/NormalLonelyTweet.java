package ca.ualberta.cs.lonelytwitter;

import java.io.IOException;
import java.io.Serializable;
import java.util.Date;

public class NormalLonelyTweet extends LonelyTweet {

	private static final long serialVersionUID = 1L;

	public NormalLonelyTweet() {
	}

	public NormalLonelyTweet(String text) {
		this.tweetDate = new Date();
		this.tweetBody = text;
	}

	@Override
	public String toString() {
		return getTweetDate() + " | " + getTweetBody() ;
	}
}