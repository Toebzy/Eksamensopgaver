import java.util.ArrayList;

public class UserList {

    public static void addUser(User u){
        ArrayList<User> userList = new ArrayList<User>();
       if(u.equalsMail(userList.contains(u.getEmail()))) {
           System.out.println("User already in list");
       }
       else{
           userList.add(u);
           System.out.println("user added to list");
       }

    }

}
