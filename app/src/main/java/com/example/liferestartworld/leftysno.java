package com.example.liferestartworld;

import android.content.Context;

import java.util.ArrayList;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class leftysno {


    static public boolean ysno(Context context, int include, ArrayList belift) {
      int  c1 =0;
        boolean event;

                for (int c = 0; c < belift.size(); c++) {

                    int get = Integer.parseInt(String.valueOf(belift.get(c)));
                    if (get == include) {

                       return event = true;

                    }

                }
                if(include == 0){
                    return event = true;
                }


        return event = false;


    }



    static public boolean ysno2(Context context, int include, ArrayList belift) {

        for (int c = 0; c < belift.size(); c++) {

            int get = Integer.parseInt(String.valueOf(belift.get(c)));
            if (get == include) {



                return false;

            }


        }
        if(include == 0){
            return  true;
        }


   return  true;
    }


//資料重複檢查
    static public boolean dataduplication(ArrayList belift,String lifenumber){
        for(int i =0;i<belift.size();i++){
if(lifenumber.equals(belift.get(i))){

    return false;

}
        }

return true;
    }


















//屬性檢查
    static public boolean strif(String include , Context context,int age, int str, int ige, int fbg,int  lok){
        Random v = new Random();

        int we=0;
        //屬性判斷
if(include.contains("<")){

    String[] tokens= include.split("<");


    we =Integer.parseInt(tokens[1]);
    if(include.contains("age")){
        if(age<we){
            return true;
        }

    }
    if(include.contains("str")){
        if(str<we){
            return true;
        }

    }
    if(include.contains("ige")){
        if(ige<we){
            return true;
        }

    }

    if(include.contains("fbg")){
        if(fbg<we){
            return true;
        }

    }

    if(include.contains("lok")){
        if(lok<we){
            return true;
        }

    }

}
        if(include.contains("=")){
            String[] tokens= include.split("=");
            we =Integer.parseInt(tokens[1]);
            if(include.contains("age")){
                if(age==we){
                    return true;
                }

            }
            if(include.contains("str")){
                if(str==we){
                    return true;
                }

            }
            if(include.contains("ige")){
                if(ige==we){
                    return true;
                }

            }

            if(include.contains("fbg")){
                if(fbg==we){
                    return true;
                }

            }

            if(include.contains("lok")){
                if(lok==we){
                    return true;
                }

            }
        }

        if(include.contains(">")){
            String[] tokens= include.split(">");
            we =Integer.parseInt(tokens[1]);
            if(include.contains("age")){
                if(age>we){
                    return true;
                }

            }
            if(include.contains("str")){
                if(str>we){
                    return true;
                }

            }
            if(include.contains("ige")){
                if(ige>we){
                    return true;
                }

            }

            if(include.contains("fbg")){
                if(fbg>we){
                    return true;
                }

            }

            if(include.contains("lok")){
                if(lok>we){
                    return true;
                }

            }
        }



if(include.equals("")){
    return true;
}

        return false;

    }















}