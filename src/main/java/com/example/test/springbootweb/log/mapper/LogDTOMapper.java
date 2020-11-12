package com.example.test.springbootweb.log.mapper;

import com.example.test.springbootweb.log.domain.LogDTO;

public interface LogDTOMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LogDTO record);

    int insertSelective(LogDTO record);

    LogDTO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LogDTO record);

    int updateByPrimaryKey(LogDTO record);
}