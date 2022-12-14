package com.yanzhen.mapper;

import java.util.List;
import java.util.Map;

import com.yanzhen.entity.SelectionJoiner;

public interface SelectionJoinerMapper {

	public int create(SelectionJoiner selectionJoiner);

	public int delete(Integer id);

	public int update(SelectionJoiner selectionJoiner);

	public int updateSelective(SelectionJoiner selectionJoiner);

	public List<SelectionJoiner> query(SelectionJoiner selectionJoiner);

	public SelectionJoiner detail(Integer id);

	public int count(SelectionJoiner selectionJoiner);

}