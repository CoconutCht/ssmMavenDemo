package com.itmayiedu.service;

public interface IStationService {

	
	
	
	
	  /**
	   * @param trainnum 车次
	   * @param startStation 出发站
	   * @param endStation 目的地
	   * 计算出发站到目的地的车票价格
	   * @return
	   */
	  public Double  calcuStarttoEndtinatPrice(String trainnum,String startStation,String endStation);
	
	
}
