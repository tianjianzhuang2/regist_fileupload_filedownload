package com.tjz.service;

import java.util.List;

import com.tjz.pojo.Datum;
import com.tjz.pojo.Users;

public interface DatumService {
	List<Datum> selAll();
	
	int updCount(int id,Users users,String name);
}
