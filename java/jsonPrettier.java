import org.json.JSONObject;
public class jsonPrettier
{
	public static void main(String[] args) {
		JSONObject jsonObject = new JSONObject("{\"employee\":{\"name\":\"sonoo\",\"married\":true}}");
        // To string method prints it with specified indentation
        System.out.println(jsonObject.toString(4));
	}
}
