package liujianze.dao;

import liujianze.pojo.Login;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import javax.persistence.Table;

@Table(name = "login")
@Mapper
@Repository
public interface LoginDao {
    public void inserUser(String username,String password);

    public Login selectUser(String username, String password);
}
