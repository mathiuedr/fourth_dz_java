import org.json.JSONException;
import org.json.JSONObject;

public class User{
    int id;
    String name,company,username,email,address,zip,state,country,phone,photo;

    /**
     * Create user object with parameters
     */
    public  User(int id,String name,String company, String username,
                        String email, String address, String zip, String state,
                        String country, String phone, String photo) {
        this.id=id;
        this.name=name;
        this.email=email;
        this.company=company;
        this.username=username;
        this.address=address;
        this.zip=zip;
        this.state=state;
        this.country=country;
        this.phone=phone;
        this.photo=photo;
    }

    /**
     * Create user object with JSON object: JSON object must contain all parameters from constructor of user with objects
     * in the same order
     * @param obj JSON object
     * @throws JSONException If something is wrong with JSONobject
     */
    public User(JSONObject obj) throws JSONException {

        this(obj.getInt("id"),obj.getString("name"),obj.getString("company"),
                obj.getString("username"),obj.getString("email"),obj.getString("address"),
                obj.getString("zip"),obj.getString("state"),obj.getString("country")
                ,obj.getString("phone"),obj.getString("photo"));
    }

    @Override
    public String toString() {
        return
                "\nPrinting user by id - " + id +":"+
                "\nname - " + name +
                "\ncompany - " + company  +
                "\nusername -" + username +
                "\nemail - " + email +
                "\naddress - " + address +
                "\nzip - " + zip +
                "\nstate - " + state +
                "\ncountry - " + country +
                "\nphone - " + phone +
                "\nphoto - " + photo;
    }
}