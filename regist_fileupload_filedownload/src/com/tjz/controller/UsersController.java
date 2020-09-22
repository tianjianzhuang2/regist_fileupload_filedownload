package com.tjz.controller;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.tjz.pojo.Users;
import com.tjz.service.UsersService;

@Controller
public class UsersController {
	@Autowired
	private UsersService usersServiceImpl;
	
	@RequestMapping("/regist")
	public String regist(Users users,MultipartFile file,HttpServletRequest request){
		System.out.println(users.getPhoto() + "---" + users.getUsername());
		String fileName = UUID.randomUUID().toString() + "_" + file.getOriginalFilename();
		String path = request.getServletContext().getRealPath("images") + "/" + fileName;
		users.setPhoto(fileName);
		try {
			FileUtils.copyInputStreamToFile(file.getInputStream(), new File(path));
		} catch (IOException e) {
			e.printStackTrace();
		}
		int index = usersServiceImpl.insUsers(users);
		if(index > 0){
			request.getSession().setAttribute("users", users);
			return "redirect:/show";
		}else{
			return "redirect:/regist.jsp";
		}
	}
}
