package dao;

import java.util.ArrayList;
import java.util.List;

import dto.Dto;

public class Dao {
	private List<Dto> list = new ArrayList<>();
	
	public void insert(Dto dto) {
		list.add(dto);
	}
	
	public List<Dto> allPrint(){
		return list;
	}
}
