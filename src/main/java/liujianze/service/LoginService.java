package liujianze.service;

import liujianze.pojo.Login;

import javax.persistence.Table;

@Table(name = "login")
public interface LoginService {
    public boolean inserUser(String username,String password);

    public Login selectUser(String username, String password);
}
