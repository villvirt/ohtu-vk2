package ohtu.services;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import ohtu.domain.User;
import java.util.ArrayList;
import java.util.List;
import ohtu.data_access.FileUserDAO;
import ohtu.data_access.UserDao;
import ohtu.data_access.InMemoryUserDao;

@Component
public class AuthenticationService {

    private UserDao userDao;
    
    @Autowired
    public AuthenticationService(FileUserDAO FileUserDao) {
        this.userDao = FileUserDao;
    }
    public AuthenticationService(InMemoryUserDao InMemoryUserDao){
        this.userDao = InMemoryUserDao;
    }

    public boolean logIn(String username, String password) {
        for (User user : userDao.listAll()) {
            if (user.getUsername().equals(username)
                    && user.getPassword().equals(password)) {
                return true;
            }
        }

        return false;
    }

    public boolean createUser(String username, String password){
        if (userDao.findByName(username) != null) {
            return false;
        }

        if (invalid(username, password)) {
            return false;
        }

        userDao.add(new User(username, password));

        return true;
    }

    private boolean invalid(String username, String password) {
        // validity check of username and password
        if (username.length()<3 || !username.matches("[a-zA-Z]*")){
            return true;
        }
        if(password.length()<8 || password.matches("[a-zA-Z]*") ){
            return true;
        }
        
        return false;
    }
}
