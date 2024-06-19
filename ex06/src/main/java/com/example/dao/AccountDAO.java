package com.example.dao;

import java.util.*;

import com.example.domain.*;

public interface AccountDAO {
	public List<AccountVO> list();
	public AccountVO read(String uid);
	public void update(TradeVO vo);
}
