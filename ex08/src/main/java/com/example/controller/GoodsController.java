package com.example.controller;

import java.io.File;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.example.dao.GoodsDAO;
import com.example.domain.GoodsVO;
import com.example.domain.NaverAPI;
import com.example.domain.QueryVO;
import com.example.service.GoodsService;

@RestController
@RequestMapping("/goods")
public class GoodsController {
	@Autowired
	GoodsService service;
	
	@Autowired
	GoodsDAO dao;
	
	@PostMapping("/update/contents")
	public void updateContents(@RequestBody GoodsVO vo) {
		dao.updateContents(vo);
	}
	
	@PostMapping("/update/image/{gid}")
	public void updateImage(@PathVariable("gid") String gid, MultipartHttpServletRequest multi) throws Exception {
		
		//파일업로드
		MultipartFile file = multi.getFile("byte");
		String filePath = "/upload/mall/";
		String fileName = gid + ".jpg";
		
		//이미 같은 파일이름이 존재할 시 이전에 있던 사진 삭제
		File oldFile = new File(filePath + fileName);
		if(oldFile.exists()) {
			oldFile.delete();
		}
		file.transferTo(new File("c:" + filePath + fileName));
		
		//이미지 이름 변경 및 테이블에 값을 변경
		GoodsVO vo = new GoodsVO();
		vo.setGid(gid);
		vo.setImage("/display?file="+ filePath + fileName);
		dao.updateImage(vo);
	}
	
	
	@PostMapping("/delete/{gid}")
	public void delete(@PathVariable("gid") String gid) {
		dao.delete(gid);
	}
	
	@GetMapping("/list") //테스트 /goods/list?page=1&size=3
	public HashMap<String,Object> list(QueryVO vo){
		return service.list(vo);
	}
	
	@PostMapping("/insert")
	public int insert(@RequestBody GoodsVO vo) {
		return service.insert(vo);
	}
	
	@GetMapping("/search") //테스트 /goods/search?query=노트북&page=1
	public String search(@RequestParam("query") String query, 
			@RequestParam("page") int page, @RequestParam("size") int size) {
		String result="";
		result=NaverAPI.search(query, page, size);
		return result;
	}
	
	@PostMapping("/update")
	public void update(@RequestBody GoodsVO vo) {
		dao.update(vo);
	}
	
	@GetMapping("/read/{gid}")
	public GoodsVO read(@PathVariable("gid") String gid) {
		return dao.read(gid);
	}
}
