package com.itmayiedu.model;

public class Station {
    private Integer stationId;

    private String trainnum;

    private String station;

    private String outtime;

    private Integer daytime;

    private Double statiprice;

    public Integer getStationId() {
        return stationId;
    }

    public void setStationId(Integer stationId) {
        this.stationId = stationId;
    }

    public String getTrainnum() {
        return trainnum;
    }

    public void setTrainnum(String trainnum) {
        this.trainnum = trainnum == null ? null : trainnum.trim();
    }

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station == null ? null : station.trim();
    }

    public String getOuttime() {
        return outtime;
    }

    public void setOuttime(String outtime) {
        this.outtime = outtime == null ? null : outtime.trim();
    }

    public Integer getDaytime() {
        return daytime;
    }

    public void setDaytime(Integer daytime) {
        this.daytime = daytime;
    }

    public Double getStatiprice() {
        return statiprice;
    }

    public void setStatiprice(Double statiprice) {
        this.statiprice = statiprice;
    }
}