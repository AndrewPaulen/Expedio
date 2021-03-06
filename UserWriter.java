
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
public class UserWriter extends UserConstants{
    
    public static void saveUsers(ArrayList<User> newUserList){
        UserSingleton users = UserSingleton.getInstance();
        JSONArray jsonUsers = new JSONArray();

        //creating all the json objects
        for(int i=0; i < newUserList.size();i++){
            jsonUsers.add(getUserJSON(newUserList.get(i)));
        }

        //write JSON file
        try(FileWriter file = new FileWriter(USER_FILE_NAME)){
            file.write(jsonUsers.toJSONString());
            file.flush();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }

    public static JSONObject getUserJSON(User user){
        JSONObject userDetails = new JSONObject();
        userDetails.put(USER_ID, user.getId().toString());
        userDetails.put(USER_USER_NAME, user.getUserName());
        userDetails.put(USER_FIRST_NAME, user.getFirstName());
        userDetails.put(USER_LAST_NAME, user.getLastName());
        userDetails.put(USER_AGE, user.getAge());
        userDetails.put(USER_PHONE_NUMBER, user.getPhoneNumber());

        return userDetails;
    }
}
