import java.net.*;

public class URLclassExample1 {

	public static void main(String[] args)
		throws MalformedURLException
	{

		// creates a URL with string representation.
		URL url = new URL(
			"https://www.gmail.com/post/3038131");

		// print the string representation of the URL
		String s = url.toString();

		System.out.println("URL :" + s);
	}
}