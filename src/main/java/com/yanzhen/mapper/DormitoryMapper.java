package com.yanzhen.mapper;

import java.util.List;
import java.util.Map;

import com.yanzhen.entity.Dormitory;

public interface DormitoryMapper {

	public int create(Dormitory dormitory);

	public int delete(Integer id);

	public int update(Dormitory dormitory);

	public int updateSelective(Dormitory dormitory);

	public List<Dormitory> query(Dormitory dormitory);

	public Dormitory detail(Integer id);

	public int count(Dormitory dormitory);

}