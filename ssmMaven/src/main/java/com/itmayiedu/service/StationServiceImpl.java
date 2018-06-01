package com.itmayiedu.service;



import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itmayiedu.dao.StationMapper;
import com.itmayiedu.model.Station;

@Service("stationService")
public class StationServiceImpl implements IStationService {
	/**
	 * 点击变量名称按ctrl+shift+x
	 */
	private static Logger LOGGER = Logger.getLogger(StationServiceImpl.class);
	@Autowired
	private StationMapper stationMapper;

	public Double calcuStarttoEndtinatPrice(String trainnum, String startStation, String endStation) {
		LOGGER.info("calcuStarttoEndtinatPrice() 参数:trainnum=" + trainnum + ",startStation=" + startStation
				+ ",endStation=" + endStation);
		// 先查找出发站的车站信息
		Station startStationResult = findByStation(trainnum, startStation);
		Double resultPrice = null;
		if (startStationResult == null) {
			LOGGER.error("calcuStarttoEndtinatPrice() startStationResult is null");
			return resultPrice;
		}
		// 查找目的的车站信息
		Station endStationResult = findByStation(trainnum, endStation);
		if (endStationResult == null) {
			LOGGER.error("calcuStarttoEndtinatPrice() endStationResult is null");
			return resultPrice;
		}
		resultPrice = endStationResult.getStatiprice() - startStationResult.getStatiprice();
		LOGGER.info("calcuStarttoEndtinatPrice() resultPrice:"+resultPrice);
		return resultPrice;
	}

	/**
	 * 通过车次+车站名称得到对应价格
	 * 
	 * @param trainnum
	 * @param station
	 * @return
	 */
	private Station findByStation(String trainnum, String station) {
		Station stationEntity = new Station();
		stationEntity.setTrainnum(trainnum);
		stationEntity.setStation(station);
		return stationMapper.findByStation(stationEntity);

	}

}
