package cn.it.controller;


import cn.it.domain.Account;
import cn.it.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 入门请求参数绑定
 */
@Controller
@RequestMapping("/param")
public class ParamController {

    /**
     * 参数绑定测试
     * @return
     */
    @RequestMapping("/testParam")
    public String testParam(String username,String password){
        System.out.println("获取到了用户名:"+username);
        System.out.println("获取到了密码:"+password);
        return "success";
    }


    /**
     * 封装数据到JavaBean的类中
     * @return
     */
    @RequestMapping("/saveAccount")
    public String saveAccount(Account account){
        System.out.println(account);
        return "success";
    }


    /**
     * 自定义类型类型转换器
     * @return
     */
    @RequestMapping("/saveUser")
    public String saveUser(User user){
        System.out.println(user);
        return "success";
    }

}
