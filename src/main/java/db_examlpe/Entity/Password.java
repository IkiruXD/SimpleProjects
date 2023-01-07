package db_examlpe.Entity;

import java.util.Random;

public class Password {
    private String password;
    private boolean isActive;

    public Password(String password) {
        if (isValid(password)) {
            this.setActive(true);
            this.password = password;
        } else {
            this.password = null;
        }
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //проверка валидности??? кол-во символов и прочее
    public static boolean isValid(String password) {
        //проверка длины и строки(пустая)
        if (password.length() < 8) {
            return false;
        }
        if (password.equals("")) {
            return false;
        }
        if (!password.matches(".*[A-Z]+.*")) {
            return false;
        }
        if (!password.matches(".*[0-9]+.*")) {
            return false;
        }
        return true;
    }

    public static Password generatePassword() {
        //example
        /*String password = new Random().ints(8, 33, 122).collect(StringBuilder::new,
                StringBuilder::appendCodePoint, StringBuilder::append).toString();
        return new Password(password);

         */
        return null;
    }

    @Override
    public String toString() {
        return password + '\'' + ", isActive=" + isActive + '}';
    }
}
