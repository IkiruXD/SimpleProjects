package db_examlpe.Entity;

import java.util.ArrayList;

public class PasswordsList {

    private ArrayList<Password> passwords;

    public PasswordsList(String passworld) {
        this.passwords = new ArrayList<Password>();
        this.passwords.add(new Password(passworld));
    }

    public ArrayList<Password> getPasswords() {
        return passwords;
    }

    public void setList(ArrayList<Password> passwords) {
        this.passwords = passwords;
    }

    //проверка на добавление
    public boolean canBeAdded(String password) {

        return true;
    }

    public boolean isSimilar() {
        ArrayList<Character> sc1 = new ArrayList<>();
        String temp;
        char[] chemp;
        int size = 0;
        int counter = 0;
        for (Password pass : passwords) {
            temp = pass.getPassword().toString();
            chemp = temp.toCharArray();
            for (char c : chemp) {
                if (!sc1.contains(c)) {
                    sc1.add(c);
                    counter++;
                }
            }
            size = chemp.length;
        }
        if ((float) counter / size < 1.8) {
            System.out.println("tfk");
            return false;
        }
        return true;
    }

    //добавление
    public boolean add(String password) {
        for (Password pass : passwords) {
            if (pass.getPassword().equals(password)) {
                return false;
            }
        }
        if (!Password.isValid(password)) {
            return false;
        }
        // todo Проверка наличия схожего пароля


        passwords.get(passwords.size() - 1).setActive(false);
        passwords.add(new Password(password));
        return true;
    }

    @Override
    public String toString() {
        return "" + passwords;
    }
}

