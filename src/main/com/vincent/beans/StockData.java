package com.vincent.beans;

public class StockData {
    private String id;
    private String name;
    private float openPrice;
    private float yesterdayPrice;
    private float currentPrice;
    private float macPrice;
    private float minPrice;
    private String date;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getOpenPrice() {
        return openPrice;
    }

    public void setOpenPrice(float openPrice) {
        this.openPrice = openPrice;
    }

    public float getYesterdayPrice() {
        return yesterdayPrice;
    }

    public void setYesterdayPrice(float yesterdayPrice) {
        this.yesterdayPrice = yesterdayPrice;
    }

    public float getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(float currentPrice) {
        this.currentPrice = currentPrice;
    }

    public float getMacPrice() {
        return macPrice;
    }

    public void setMacPrice(float macPrice) {
        this.macPrice = macPrice;
    }

    public float getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(float minPrice) {
        this.minPrice = minPrice;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "StockData{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", openPrice=" + openPrice +
                ", yesterdayPrice=" + yesterdayPrice +
                ", currentPrice=" + currentPrice +
                ", macPrice=" + macPrice +
                ", minPrice=" + minPrice +
                ", date='" + date + '\'' +
                '}';
    }
}
