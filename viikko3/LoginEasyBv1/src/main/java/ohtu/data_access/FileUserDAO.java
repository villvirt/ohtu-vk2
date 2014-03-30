/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ohtu.data_access;


import java.util.List;
import ohtu.domain.User;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.BufferedWriter;

/**
 *
 * @author Blackstorm
 */
public class FileUserDAO implements UserDao {

    private List<User> users;
    private Scanner lukija;
    private File usersFile;
    private FileWriter fileKirjoittaja;
    private BufferedWriter kirjoittaja;

    public FileUserDAO(String textFilePath) throws Exception {
        users = new ArrayList<User>();
        this.usersFile = new File(textFilePath);
        try {
            lukija = new Scanner(this.usersFile);
        } catch (Exception e) {
            System.out.println("Tiedoston lukeminen epäonnistui. Virhe: " + e.getMessage());

            return;
        }

        while (lukija.hasNextLine()) {
            String userJaPw = lukija.nextLine();
            String delims = "[ ]+";
            String[] user = userJaPw.split(delims);
            users.add(new User(user[0], user[1]));
        }

        lukija.close();
    }

    @Override
    public List<User> listAll() {
        return users;
    }

    @Override
    public User findByName(String name) {
        for (User user : users) {
            if (user.getUsername().equals(name)) {
                return user;
            }
        }

        return null;
    }

    @Override
    public void add(User user) {
        users.add(user);
        try {
            kirjoitaUserFileen(user);
        } catch (Exception e) {
            System.out.println("Virhe tiedostoon kirjotettaessa: " + e.getMessage());
        }
    }

    private void kirjoitaUserFileen(User user) throws Exception {

        fileKirjoittaja = new FileWriter(this.usersFile, true);
        kirjoittaja = new BufferedWriter(fileKirjoittaja);

        kirjoittaja.append(user.getUsername() + " " + user.getPassword());
        kirjoittaja.newLine();

        kirjoittaja.close();
    }
}
