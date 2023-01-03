public class Main {
    public static void main(String[] args) {
        User Tobias = new User("email@live.dk","Tobias","Carlsen");
        User Simone = new User("gmail@live.dk","simanoe","toft");
        User Christian = new User("email@live.dk","CHristan","Duved");

        UserList.addUser(Tobias);
        UserList.addUser(Simone);
        UserList.addUser(Christian);
    }
}