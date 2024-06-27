package com.example.dao;

import java.util.HashMap;
import java.util.List;

import com.example.domain.AttachVO;
import com.example.domain.GoodsVO;
import com.example.domain.QueryVO;

public interface GoodsDAO {
	public void insert(GoodsVO vo);
	public GoodsVO read(String gid);
	public int total();
	public List<HashMap<String,Object>> list(QueryVO vo);
	public void delete(String gid);
	public void update(GoodsVO vo);
	public void updateImage(GoodsVO vo);
	public void updateContents(GoodsVO vo);
	public void insertAttach(AttachVO vo);
	public List<AttachVO> listAttach(String gid);
	public void deleteAttach(int aid);
}
