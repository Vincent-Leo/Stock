package com.vincent.service;

import com.vincent.beans.StockData;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class DataService {

    public String getDataByStackID(String stackId) throws Exception {
        URL url = new URL("http://hq.sinajs.cn/list=" + stackId);
        URLConnection connection = url.openConnection();
        connection.setConnectTimeout(30000);
        BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream(), "GBK"));
        return br.readLine();
    }

    public StockData getStockData(String input) {
        if (input.startsWith("var hq_str_")) {
            StockData stockData = new StockData();
            String[] tmp = input.substring(11, input.length() - 5).replace("=\"", ",").split(",");
            stockData.setId(tmp[0]);
            stockData.setName(tmp[1]);
            stockData.setOpenPrice(Float.parseFloat(tmp[2]));
            stockData.setYesterdayPrice(Float.parseFloat(tmp[3]));
            stockData.setCurrentPrice(Float.parseFloat(tmp[4]));
            stockData.setMacPrice(Float.parseFloat(tmp[5]));
            stockData.setMinPrice(Float.parseFloat(tmp[6]));
            stockData.setDate(tmp[31] + " " + tmp[32]);

            return stockData;
        }
        return null;
    }


}
