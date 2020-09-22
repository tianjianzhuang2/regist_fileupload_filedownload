package com.tjz.mapper;

import java.util.List;

import com.tjz.pojo.Datum;

public interface DatumMapper {
	public abstract List<Datum> selDatum();
	
	public abstract int updCountById(int id);
}
