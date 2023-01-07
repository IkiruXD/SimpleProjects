package db_examlpe.Entity;

public class User {

    private String login;
    private PasswordsList passwords;
    private String name;

    public User(String login, String password, String name) {
        this.login = login;
        this.name = name;
        this.passwords = new PasswordsList(password);
        //проверка пароля по имени и логину????
        if(!passwords.getPasswords().get(0).isActive()||password.equals(this.getLogin())||password.equals(this.getName())){
            //генерация по правилам valid
            this.passwords.getPasswords().set(0,Password.generatePassword());
        }
    }
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public PasswordsList getPasswords() {
        return passwords;
    }

    public void setPasswords(PasswordsList passwords) {
        this.passwords = passwords;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User: "+
                "login='" + login + '\'' +
                ", name='" + name + '\'' +
                ", password='" + passwords + '\'' +
                '}';
    }
}

