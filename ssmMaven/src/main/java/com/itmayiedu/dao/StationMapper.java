package com.itmayiedu.dao;

import com.itmayiedu.model.Station;

public interface StationMapper {
    int deleteByPrimaryKey(Integer stationId);

    int insert(Station record);

    int insertSelective(Station record);

    Station selectByPrimaryKey(Integer stationId);

    int updateByPrimaryKeySelective(Station record);

    int updateByPrimaryKey(Station record);
    
    Station findByStation(Station record);
}