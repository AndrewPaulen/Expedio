import java.io.*;
import java.util.ArrayList;
import java.util.UUID;

import javax.management.DynamicMBean;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class UserLoader extends UserConstants{
    /**
     * @author David Wamai
     * a generic constructor that allows the methods of the UserLoader class
     * to be called elsewhere in the package
     */
    public UserLoader(){

    }
    /**
     * a method that loops through a json file and transposes each element into an array list. 
     * 
     * @return an array list of users based off of the corresponding json file
     * 
     */
    public static ArrayList<User> getUsers() {
        
        ArrayList<User> users = new ArrayList<User>();

        try {
            FileReader reader = new FileReader(USER_FILE_NAME);
            JSONParser parser = new JSONParser();
            JSONArray usersJSON = (JSONArray)new JSONParser().parse(reader);

            for (int i = 0; i < usersJSON.size(); i++){
                JSONObject userJSON = (JSONObject)usersJSON.get(i);
                UUID id = UUID.fromString((String)userJSON.get(USER_ID));
                String userName = (String)userJSON.get(USER_USER_NAME);
                String firstName = (String)userJSON.get(USER_FIRST_NAME);
                String lastName = (String)userJSON.get(USER_LAST_NAME);
                String age = ((String)userJSON.get(USER_AGE));
                String phoneNumber = (String)userJSON.get(USER_PHONE_NUMBER);

                users.add(new User(id, userName, firstName, lastName, age, phoneNumber));
            }
            return users;
        }
        catch (Exception e){
            e.printStackTrace();
        }
            return null;
    }
    /**
     * a meth
     * @param firstName
     * @param lastName
     * @return
     */
    public static User getUser(String username){
        ArrayList<User> users = getUsers();

        for (User user : users) {
            if(user.getUserName().equals(username)){
                return user;
            } 
        }
        System.out.println("user not found");
        return null;

    }
    
}
