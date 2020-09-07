/**
 * 
 */
package util;

/**
 * @author andersonmann
 *
 */
/**
 * @author andersonmann
 *
 */
public class DataGenerator {

	/**
	 * This method generated a random user name
	 * 
	 * @return
	 */
	public String createUserName() {
		String prefix = "user-test";
		double random = Math.random() * 201;
		return prefix.concat(String.valueOf(random));
	}

	/**
	 * This method generated a random email
	 * 
	 * @return
	 */
	public String createEmailAddress() {
		String prefix = "emailtest";
		String provider = "@gmail.com";
		double random = Math.random() * 201;
		return prefix.concat(String.valueOf(random).concat(provider));
	}

}