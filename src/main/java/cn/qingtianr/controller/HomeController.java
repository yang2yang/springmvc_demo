package cn.qingtianr.controller;

import cn.qingtianr.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


/**
 * Created by jack on 16-5-19.
 */

@Controller
public class HomeController {

//  这个method默认是什么呀?接口里面显示的是一个空的{}

    /**
     * 纯粹返回一个页面
     * @return
     */
    @RequestMapping(value = {"/","/index"},method = RequestMethod.GET)
    public String index(){
        return "home";
    }

//  ModelMap和Model有什么区别呢？

    /**
     * 使用GET返回一个可以动态页面
     * @param username
     * @param model
     * @return
     */
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(@RequestParam("username") String username, ModelMap model){
        model.addAttribute("username",username);
        return "hello";
    }


    /**
     * 显示一个登录的表单页面
     * @return
     */
    @RequestMapping(value = "/login")
    public String createLogin(){
        return "login";
    }

    /**
     * 判断是否登录成功,若成功返回一个登录成功，转到hello界面
     * @param user
     * @return
     */
    @RequestMapping(value = "/showLogin")
    public String showLogin(@ModelAttribute("user")User user){
        return "hello";
    }

}
