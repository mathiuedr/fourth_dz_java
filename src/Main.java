import org.json.JSONException;
import org.json.JSONObject;
import java.io.IOException;
import java.net.MalformedURLException;

public class Main {
    public static void main(String[] args) {
        try {
            JSONObject[] jsonUserObjects = JSONparser.parseJSONArray("https://fake-json-api.mock.beeceptor.com/users");
            System.out.println("\nВыводим объекты пользователей");
            for (JSONObject jsonUserObject : jsonUserObjects) {
               System.out.println(new User(jsonUserObject)); 
            }
            JSONObject[] jsonCompanyObjects = JSONparser.parseJSONArray("https://fake-json-api.mock.beeceptor.com/companies");
            System.out.println("Выводим объекты компаний");
            for (JSONObject jsonCompanyObject : jsonCompanyObjects) {
                System.out.println(new Company(jsonCompanyObject));
            }
        }
        catch (MalformedURLException e){
            System.out.println(e);
        }
        catch (IOException e){
            System.out.println(e);
        }
        catch (JSONException e){
            System.out.println(e);
        }
        
    }
}