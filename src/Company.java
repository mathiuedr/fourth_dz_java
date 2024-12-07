import org.json.JSONException;
import org.json.JSONObject;

public class Company {
    int id,employeeCount,marketCap;
    String name,industry,logo,address,zip,domain,country,ceoName;

    /**
     * Create company object with parameters
     */
    public  Company(int id,String name,String address, String zip,
                 String country, int employeeCount , String industry,
                 int marketCap , String domain, String logo,String ceoName) {
        this.id=id;
        this.name=name;
        this.industry=industry;
        this.employeeCount=employeeCount;
        this.address=address;
        this.zip=zip;
        this.marketCap=marketCap;
        this.country=country;
        this.domain=domain;
        this.logo=logo;
        this.ceoName = ceoName;
    }

    /**
     * Create company object with JSON object: JSON object must contain all parameters from constructor of company with objects
     * in the same order
     * @param obj JSON object
     * @throws JSONException If something is wrong with JSONobject
     */
    public Company(JSONObject obj) throws JSONException {

        this(obj.getInt("id"),obj.getString("name"),obj.getString("address"),
                obj.getString("zip"),obj.getString("country"),obj.getInt("employeeCount"),
                obj.getString("industry"),obj.getInt("marketCap"),obj.getString("domain")
                ,obj.getString("logo"),obj.getString("ceoName"));
    }

    @Override
    public String toString() {
        return
                "\nPrinting company by id - " + id + ":"+
                "\nemployeeCount - " + employeeCount +
                "\nmarketCap - " + marketCap+
                "\nname - " + name +
                "\nindustry - " + industry +
                "\nlogo - " + logo +  
                "\naddress - " + address +  
                "\nzip - " + zip +  
                "\ndomain - " + domain +  
                "\ncountry - " + country +  
                "\nceoName - " + ceoName;
                
    }
}
