package twn.twitter;

import twitter4j.Twitter;
import twitter4j.TwitterFactory;

public class Main {

	public static void main(String[] args) {
		TwitterFactory factory = new TwitterFactory();
		Twitter twitter = factory.getInstance();
		//do the magic stuff
	}

}
