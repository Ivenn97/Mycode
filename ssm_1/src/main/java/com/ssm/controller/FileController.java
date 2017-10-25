package com.ssm.controller;

import java.io.File;
import java.io.IOException;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.ssm.service.IUserService;

@Controller
@RequestMapping("/file")
public class FileController {
	
	 @Resource
	 private IUserService userService;
	
	 @RequestMapping("/uploadFile")
	 @ResponseBody
	 public String uploadFile(MultipartFile file) {
		 //异常测试
         int i = 1/0;
         
		 System.out.println(file.getSize());
		 System.out.println(file.getContentType());
		 System.out.println(file.getOriginalFilename());
		 File file1 = new File("d://111.jpg");
		 //保存数据库
		 try {
			 //直接将文件输出去
			file.transferTo(file1);
		} catch (Exception e) {
			e.printStackTrace();
		} 
		 return "上传成功";
	 }
	 
	 
	 //单个异常处理
	 
	 
	 
}
