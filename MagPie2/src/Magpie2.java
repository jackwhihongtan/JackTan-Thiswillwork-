
public class Magpie2 {

	//Get a default greeting and return a greeting	
	public String getGreeting() {
		return "Hello, let's talk.";
	}

	/**
	 * Gives a response to a user statement
	 * takes in a user statement
	 * returns a response based on given rules
	 */
	public String getResponse(String statement) {
		String response = "";
		if (statement.trim().equals ("")) {
		 response = "Say something, please.";
		}
		else if (statement.indexOf("no") >= 0) {
			response = "Why so negative?";
		} 
			else if (statement.indexOf("potatoes") >= 0) {
				response = "So do you like potatoes with molasses?";
			}
			else if (statement.indexOf("nani") >= 0) {
				response = "omae wa mou shindeiru.";
			}
			else if (statement.indexOf("Kill") >=0) {
				response = "Call 1-800-273-8255";
			}
			else if (statement.indexOf("Life") >=0) {
				response = "Did life give you lemons?";
			} else if (statement.indexOf("Ms.Dreyer") >= 0
				|| statement.indexOf("Ms.Ip") >= 0) {
			response = "She sounds like a good teacher.";
			}
		  else if  (statement.indexOf("Mr.deHeer") >= 0
				|| statement.indexOf("Mr.Lamont") >= 0
				|| statement.indexOf("Mr.Knox") >= 0
				|| statement.indexOf("Mr.Cancilla") >= 0
				|| statement.indexOf("Ms.Ip") >= 0
				|| statement.indexOf("Mr.Millstein") >= 0) {
			response = "He sounds like a good teacher";
		} else {
			response = getRandomResponse();
		}
		return response;
		}
	

	/**
	 * Pick a default response to use if nothing else fits.
	 * returns a non- string
	 */
	private String getRandomResponse() {
		final int NUMBER_OF_RESPONSES = 6;
		double r = Math.random();
		int whichResponse = (int) (r * NUMBER_OF_RESPONSES);
		String response = "";

		if (whichResponse == 0) {
			response = "Interesting, tell me more.";
		} else if (whichResponse == 1) {
			response = "Hmmm.";
		} else if (whichResponse == 2) {
			response = "Do you really think so?";
		} else if (whichResponse == 3) {
			response = "You don't say.";
		}  else if (whichResponse == 4) {
			response = "So how is your day?";
		}  else if (whichResponse == 5) {
			response = "That is not cool.";
		}

		return response;
	}
}
