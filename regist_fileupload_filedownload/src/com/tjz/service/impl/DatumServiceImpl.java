package com.tjz.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.tjz.mapper.DatumMapper;
import com.tjz.pojo.Datum;
import com.tjz.pojo.Users;
import com.tjz.service.DatumService;

@Service
public class DatumServiceImpl implements DatumService {
	@Resource
	private DatumMapper datumMapper;

	@Override
	public List<Datum> selAll() {
		// TODO Auto-generated method stub
		return datumMapper.selDatum();
	}

	@Override
	public int updCount(int id,Users users,String fname) {
		Logger logger = Logger.getLogger(DatumServiceImpl.class);
		logger.info(users.getUsername() + "œ¬‘ÿ¡À "+ fname);
		return datumMapper.updCountById(id);
	}
}
