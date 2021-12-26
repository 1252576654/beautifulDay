package liujianze.service;

import liujianze.dao.LoginDao;
import liujianze.pojo.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Table;

@Table(name = "login")
@Service
public class LoginServiceImpl implements LoginService{
    @Autowired
    private LoginDao loginDao;


    public boolean inserUser(String username, String password) {
        loginDao.inserUser(username,password);
        return true;
    }

    public Login selectUser(String username, String password) {

        System.out.println(username+" "+username);
        return loginDao.selectUser(username,password);

    }

}
