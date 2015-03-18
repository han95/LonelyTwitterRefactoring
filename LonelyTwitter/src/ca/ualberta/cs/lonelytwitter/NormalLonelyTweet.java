package ca.ualberta.cs.lonelytwitter;

import java.io.Serializable;
import java.util.Date;

import ca.ualberta.cs.lonelytwitter.model.LonelyTweet;

import android.util.Log;

public class NormalLonelyTweet extends LonelyTweet implements Serializable {

	private String thisIsntFinalStringForm;

	public NormalLonelyTweet() {
	}

	public NormalLonelyTweet(String text) {
		this.tweetDate = new Date();
		this.tweetBody = text;
	}

	@Override
	public String toString() {
		setThisIsntFinalStringForm(getTweetDate() + " | " + getTweetBody());
		Log.i("tweet", getThisIsntFinalStringForm());
		return getThisIsntFinalStringForm();
	}

	public String getThisIsntFinalStringForm() {
		return thisIsntFinalStringForm;
	}

	public void setThisIsntFinalStringForm(String thisIsntFinalStringForm) {
		this.thisIsntFinalStringForm = thisIsntFinalStringForm;
	}
}
