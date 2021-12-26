package liujianze.controller;

import liujianze.pojo.Login;
import liujianze.service.LoginServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.persistence.Table;
import java.util.Map;

@Table(name = "login")
@Controller
public class LoginController {
    @Autowired
    private LoginServiceImpl loginServiceImp;

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @RequestMapping("/regist")
    public String regist(){
        return "regist";
    }
    @GetMapping("/dologin")
    public String doLogin(Login login, RedirectAttributes attributes){
        Login login1 = loginServiceImp.selectUser(login.getUsername(),login.getPassword());
        System.out.print(login1);
        if(login1==null){
            attributes.addFlashAttribute("message","登录失败");
            return "fail";
        }else {
            attributes.addFlashAttribute("message","登录成功");
            return "forward:/";
        }
    }
    @RequestMapping("/doregist")
    public String doRegist(Login login,Map<String,Object> map) {
        loginServiceImp.inserUser(login.getUsername(), login.getPassword());
        map.put("msg","注册成功");
        return "success";
    }

}
