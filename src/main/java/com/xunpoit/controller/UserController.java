package com.xunpoit.controller;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xunpoit.domain.User;

@Controller
public class UserController {

    @RequestMapping("/showUser")
   	public String showList(Model model){
       	User user0=new User(110,"张三","男","恩施");
    	User user1=new User(120,"李四","男","武汉");
    	/*List list=new ArrayList();
    	list.add(user0);
    	list.add(user1);
    	model.addAttribute("list", list);*/
    	Map<String,User> map=new HashMap<>();
    	map.put("u1", user0);
    	map.put("u2", user1);
    	model.addAttribute("userMap", map);
    	return "userMap";
   	}
}
