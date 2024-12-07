import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


public class JSONparser {
    /**
     *Parse JSON array from url
     * @param url_string url that passes json array
     * @return Array of JSON objects from entered url
     * @throws MalformedURLException If something is wrong with the given url
     * @throws IOException if an IO error occurs while reading content of response
     * @throws JSONException If JSON is malformed or something went wrong with it
     */
    public static JSONObject[] parseJSONArray(String url_string) throws MalformedURLException,IOException, JSONException {
            URL url = new URL(url_string);
            InputStream input = url.openStream();
            InputStreamReader isr = new InputStreamReader(input);
            BufferedReader reader = new BufferedReader(isr);
            StringBuilder json = new StringBuilder();
            int c;
            while ((c = reader.read()) != -1) {
                json.append((char) c);
            }
            JSONArray arr = new JSONArray(json.toString());
            JSONObject[] json_obj_array = new JSONObject[arr.length()];

            for (int i = 0; i < arr.length(); i++) {
                json_obj_array[i]=arr.getJSONObject(i);
            }

            return json_obj_array;
    }

}
