package serviceImpl;

import dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    private static UserService userService = new UserServiceImpl();

    public static UserService getInstance() {
        return userService;
    }

    @Override
    public String getPassword(String id) {
        return userDao.getPassword(id);
    }
}
