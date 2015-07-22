package com.vincent.stocklist;

import com.vincent.beans.Stock;

import java.util.ArrayList;
import java.util.List;

public class BankList {

    public static List<Stock> getBanksList() throws Exception {
        List<Stock> banksList = new ArrayList<Stock>();
        String source = "sh601009:南京银行;sz000001:平安银行;sh601398:工商银行;sh601169:北京银行;sh600016:民生银行;sh601939:建设银行;sh601988:中国银行;sh601288:农业银行;sh601328:交通银行;sz002142:宁波银行;sh600036:招商银行;sh601166:兴业银行;sh600000:浦发银行;sh601818:光大银行;sh601998:中信银行;sh600015:华夏银行;";
        String[] sources = source.split(";");
        for(String item : sources) {
            String[] tmp = item.split(":");
            Stock bank = new Stock();
            bank.setId(tmp[0]);
            bank.setName(tmp[1]);
            banksList.add(bank);
        }
        return banksList;
    }


}
