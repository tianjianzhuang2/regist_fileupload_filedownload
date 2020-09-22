package com.tjz.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tjz.pojo.Datum;
import com.tjz.pojo.Users;
import com.tjz.service.DatumService;

@Controller
public class DatumController {
	@Resource
	private DatumService datumServiceImpl;
	
	@RequestMapping("/show")
	public String show(HttpServletRequest request){
		List<Datum> list = datumServiceImpl.selAll();
		request.setAttribute("list", list);
		return "/main.jsp";
	}
	
	@RequestMapping("/download")
	public void download(int id,String fname,HttpServletResponse response,HttpServletRequest request) throws IOException{
		datumServiceImpl.updCount(id, (Users) request.getSession().getAttribute("users"), fname);
		response.setHeader("Content-Disposition", "attachment;filename=" + fname);
		ServletOutputStream os = response.getOutputStream();
		File file = new File(request.getServletContext().getRealPath("files"),fname);
		os.write(FileUtils.readFileToByteArray(file));
		os.flush();
		os.close();
	}
}
