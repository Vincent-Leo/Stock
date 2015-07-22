package com.vincent.util;

import java.io.FileWriter;

public class Tools {

    public static void WriteToFile(String input, String fileName) throws Exception{
        String path = "D:\\data\\" + fileName +".txt";
        FileWriter fileWriter = new FileWriter(path, true);
        fileWriter.write(input);
        fileWriter.flush();
        fileWriter.close();
    }

}
