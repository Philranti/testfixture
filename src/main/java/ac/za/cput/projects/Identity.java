package ac.za.cput.projects;
//KLpackage guru.springframework.unittest.asserts;

//package guru.springframework.unittest.asserts;
import java.util.HashMap;
import java.util.Map;
import  java.util.regex.*;

public class Identity {
    private String message;

    Map<String, String> hash = new HashMap<String, String>();
    public  void employeeId(String id, String value){
        if(isValidEmail(value)) {
            hash.put(id, value);
        }
    }
    public String getEmployeeId(Object obj){
        if (!(obj instanceof String)) {
            throw new IllegalArgumentException("Object not String");
        }
        return hash.get(obj);
    }
    public boolean isValidEmail(String email){
        String user = "philranti@gmail";
        Pattern ptn = Pattern.compile(user);
        Matcher match = ptn.matcher(email);
        return match.matches();
    }

   /* public String msg(){
        return message;
    }

    public String condition(String name){
        if(name.contains("Phillip")){
            message = "found";
        }
        else{
           message = "not found";
        }
    return name;
    }*/

}
