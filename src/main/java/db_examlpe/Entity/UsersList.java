package db_examlpe.Entity;

import java.util.ArrayList;

public class UsersList {

    private ArrayList<User> users;

    public UsersList() {
        users = new ArrayList<User>();
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

    public boolean add(User user) {
        for (User user1 : users) {
            if (user1.getLogin().equals(user.getLogin())) {
                return false;
            }
        }
        users.add(user);
        return true;
    }

    public boolean removeUser(User user) {
        if (users.contains(user)) {
            users.remove(user);
        }
        return false;
    }

    // todo remove user by login or name
    public boolean removeUser(String value) {
        for (User user1 : users) {
            if (user1.getLogin().equals(value) || user1.getName().equals(value)) {
                return users.remove(user1);
            }
        }
        return false;
    }

    //todo find user by login or name
    public String find(String value) {

        for (User user1 : users) {
            if (user1.getLogin().equals(value) || user1.getName().equals(value)) {
                return user1.toString();
            }
        }
        return null;
    }

    @Override
    public String toString() {
        String result = "UsersList" + System.lineSeparator();
        for (User user : users) {
            result += user + System.lineSeparator();
        }
        return result;
    }
}

