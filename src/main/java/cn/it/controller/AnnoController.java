package cn.it.controller;

import cn.it.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.Map;

/**
 *
 * 常用注解
 */

@Controller
@RequestMapping("/anno")
public class AnnoController {

    @RequestMapping("/testRequestParam")
    public String testRequestParam(@RequestParam(name = "name") String username){
        System.out.println("执行了..");
        System.out.println(username);
        return "success";
    }


    /**
     *@RequestBody 获取到请求体的内容
     * @param body
     * @return
     */
    @RequestMapping("/testRequestBody")
    public String testRequestBody(@RequestBody String body){
        System.out.println("执行了..");
        System.out.println(body);
        return "success";
    }

    /**
     *@PathVariable注解
     * @param id
     * @return
     */
    @RequestMapping("/testPathVariable/{sid}")
    public String testPathVariable(@PathVariable(value = "sid") String id){
        System.out.println("执行了..");
        System.out.println(id);
        return "success";
    }



//     @ModelAttribute注解 又返回值 先执行方法
//      @return
//
//    @RequestMapping(value = "/testModelAttribute")
//    public String testModelAttribute(User user){
//        System.out.println("执行了..");
//        System.out.println(user);
//        return "success";
//    }
//
//     该方法会先执行 有返回值
//    @ModelAttribute
//    public User showUser(String uname){
//        System.out.println("showUser执行了");
//        //通过用户名查询数据库(模拟)
//        User user =new User();
//        user.setUname(uname);
//        user.setAge(20);
//        user.setDate(new Date());
//        return user;
//    }



    /**
     * @ModelAttribute注解 无返回值
     * @param user
     * @return
     */
    @RequestMapping(value = "/testModelAttribute")
    public String testModelAttribute(@ModelAttribute("abc") User user){
        System.out.println("执行了..");
        System.out.println(user);
        return "success";
    }



    /**
     * 该方法会先执行 无返回值 存在集合map中
     * @param uname
     * @param map
     */
    @ModelAttribute
    public void showUser(String uname, Map<String,User> map) {
        System.out.println("showUser执行了");
        //通过用户名查询数据库(模拟)
        User user =new User();
        user.setUname(uname);
        user.setAge(20);
        user.setDate(new Date());
        map.put("abc",user);

    }
}
