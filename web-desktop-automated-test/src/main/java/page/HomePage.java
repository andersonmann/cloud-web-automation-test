/**
 * 
 */
package page;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;

import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;
import org.openqa.selenium.By;

import core.BasePage;

/**
 * @author andersonmann
 *
 */
public class HomePage extends BasePage {

	public void clickLogin() {
		click(By.id("btn-signin"));
	}

	// Method to mark test as pass / fail on BrowserStack

	public static void mark() throws URISyntaxException, UnsupportedEncodingException, IOException {
		URI uri = new URI(
				"https://andersonmann3:NtyGWz49mDrydwPCQtq6@api.browserstack.com/automate/sessions/<session-id>.json");
		HttpPut putRequest = new HttpPut(uri);

		ArrayList<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>();
		nameValuePairs.add((new BasicNameValuePair("status", "completed")));
		nameValuePairs.add((new BasicNameValuePair("reason", "")));
		putRequest.setEntity(new UrlEncodedFormEntity(nameValuePairs));

		HttpClientBuilder.create().build().execute(putRequest);
	}

}
