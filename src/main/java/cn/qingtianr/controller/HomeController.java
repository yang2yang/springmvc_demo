package cn.qingtianr.controller;

import cn.qingtianr.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;

/**
 * Created by jack on 16-5-19.
 */

@Controller
public class HomeController {

//  这个method默认是什么呀?接口里面显示的是一个空的{}
    @RequestMapping(value = {"/","/home"},method = RequestMethod.GET)
    public String index(Model model){
        model.addAttribute("hello","haaaaahhhh");
        return "index";
    }

    @RequestMapping(value = "/hellohello")
//    public String hello(@RequestParam("username") String username, ModelMap model){
    public String hello(ModelMap model){
//        System.out.println("username = "+username);
        model.addAttribute("hello","hhhhhh");
//        model.addAttribute("hello", "say hello world");
//        model.addAttribute("username",username);
        return "hello";
    }

    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        model.addAttribute("hello","hhhhhhh");
        return "hello";
    }

    /**
     * 显示出第一次登录的表单
     * @param model
     * @return
     */
    @RequestMapping(value = "/login")
    public String createLogin(){
//        model.addAttribute(new User());
        return "login";
    }

    @RequestMapping(value = "/showLogin")
    public String showLogin(@ModelAttribute("user")User user){
        return "hello";
    }

//    @RequestMapping(method = RequestMethod.POST)
//    public String addUser(@Valid User user, BindingResult bindingResult){
//        return "redirect:/login/" + user.getUsername();
//    }
}
