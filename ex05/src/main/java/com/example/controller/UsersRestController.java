package com.example.controller;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.example.dao.UserDAO;
import com.example.domain.UserVO;

@RestController
@RequestMapping("/users")
public class UsersRestController {
	@Autowired
	UserDAO dao;
	
	@GetMapping("/{uid}") //테스트 /users/blue
	public UserVO read(@PathVariable("uid") String uid) {
		return dao.read(uid);
	}
	
	@PostMapping("/update")
	public void update(@RequestBody UserVO vo) {
		dao.update(vo);
	}
	
	@PostMapping("/photo/{uid}")
	public void photo(@PathVariable("uid") String uid, MultipartHttpServletRequest multi) throws Exception {
		MultipartFile file=multi.getFile("file");
		if(!file.isEmpty()) {
			String filePath = "/upload/photo/";
			String fileName = System.currentTimeMillis() + ".jpg";
			file.transferTo(new File("c:" + filePath + fileName));
			dao.updatePhoto(filePath+fileName, uid);
		}
	}
	
	@PostMapping("/update/pass")
	public void pass(@RequestBody UserVO vo) {
		dao.updatePass(vo.getUpass(), vo.getUid() );
	}
	
}
