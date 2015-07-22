package com.vincent;

import com.vincent.beans.StockData;
import com.vincent.stocklist.BankList;
import com.vincent.beans.Stock;
import com.vincent.service.DataService;
import com.vincent.util.Tools;

import java.util.List;

public class Test {

    public static void main(String[] args) throws Exception {

        List<Stock> banks = BankList.getBanksList();

        for (Stock bank : banks) {
            DataService dataService = new DataService();
            String data = dataService.getDataByStackID(bank.getId());
            StockData stockData = dataService.getStockData(data);
            //System.out.println(data);
            System.out.println(stockData.toString());
            String fileName = stockData.getDate().substring(0,10);
            String fileContent = stockData.toString() + "\n";
            Tools.WriteToFile(fileContent, fileName);
        }

    }


}
