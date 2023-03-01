package com.example.liferestartworld;

import static com.example.liferestartworld.LifeMain.getJson;

import android.content.Context;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class leftSelet {






    static public String  leftInclude(String lifenumber,Context context,int number) throws JSONException {
        JSONArray array = new JSONArray(getJson("events.json",context));
        String include = "0" ;
        for (int i = 0; i < array.length(); i++) {
            JSONObject jsonObject = array.getJSONObject(i);
            //將檔案內所有資料跑一遍 查詢符合的id 並顯示出需要的資料
            String d = jsonObject.getString("id");
            String Str1 = new String(d);
            String Str2 = lifenumber;

//尋找輸入id
            if (Str1.equals(Str2)) {

                String Str3 = jsonObject.getString("include["+number+"]");
                String str = Str3;


                if(Str3.equals("")){
                    include = "0";
                    return include;
                }else {
                    include = jsonObject.getString("include["+number+"]");
                    return include;

                }




            }
        }

        return include;

    }



    static public String  leftEvent(String lifenumber,Context context) throws JSONException {
        JSONArray array = new JSONArray(getJson("events.json",context));
        String event = "";
        for (int i = 0; i < array.length(); i++) {
            JSONObject jsonObject = array.getJSONObject(i);
            //將檔案內所有資料跑一遍 查詢符合的id 並顯示出需要的資料
            String c = jsonObject.getString("id");
            String Str1 = new String(c);
            String Str2 = lifenumber;

            if (Str1.equals(Str2)) {


                event = jsonObject.getString("event");
                return event;
            }
        }

        return event;

    }




    static public String  leftExclude(String lifenumber,Context context) throws JSONException {
        JSONArray array = new JSONArray(getJson("events.json",context));
        String include = "0" ;
        for (int i = 0; i < array.length(); i++) {
            JSONObject jsonObject = array.getJSONObject(i);
            //將檔案內所有資料跑一遍 查詢符合的id 並顯示出需要的資料
            String d = jsonObject.getString("id");
            String Str1 = new String(d);
            String Str2 = lifenumber;

//尋找輸入id
            if (Str1.equals(Str2)) {

                String Str3 = jsonObject.getString("exclude");
                String str = Str3;


                if(Str3.equals("")){
                    include = "0";
                    return include;
                }else {
                    include = jsonObject.getString("exclude");
                    return include;

                }




            }
        }

        return include;

    }



    static public String  leftattributes(String lifenumber,Context context) throws JSONException {
        JSONArray array = new JSONArray(getJson("events.json",context));
        String include = "false" ;
        for (int i = 0; i < array.length(); i++) {
            JSONObject jsonObject = array.getJSONObject(i);
            //將檔案內所有資料跑一遍 查詢符合的id 並顯示出需要的資料
            String d = jsonObject.getString("id");
            String Str1 = new String(d);
            String Str2 = lifenumber;

//尋找輸入id
            if (Str1.equals(Str2)) {

                String Str3 = jsonObject.getString("attributes");

                if(Str3.equals("")){
                    include = "";
                    return include;
                }else {
                    include = jsonObject.getString("attributes");
                    return include;

                }

            }
        }

        return include;

    }

    static public String  leftbranch1(String lifenumber,Context context) throws JSONException {
        JSONArray array = new JSONArray(getJson("events.json",context));
        String include = "0" ;
        for (int i = 0; i < array.length(); i++) {
            JSONObject jsonObject = array.getJSONObject(i);
            //將檔案內所有資料跑一遍 查詢符合的id 並顯示出需要的資料
            String d = jsonObject.getString("id");
            String Str1 = new String(d);
            String Str2 = lifenumber;

//尋找輸入id
            if (Str1.equals(Str2)) {

                String Str3 = jsonObject.getString("branch[1]");
                String str = Str3;


                if(Str3.equals("")){
                    include = "0";
                    return include;
                }else {
                    include = jsonObject.getString("branch[1]");
                    return include;

                }




            }
        }

        return include;

    }

    static public String  leftbranch2(String lifenumber,Context context) throws JSONException {
        JSONArray array = new JSONArray(getJson("events.json",context));
        String include = "0" ;
        for (int i = 0; i < array.length(); i++) {
            JSONObject jsonObject = array.getJSONObject(i);
            //將檔案內所有資料跑一遍 查詢符合的id 並顯示出需要的資料
            String d = jsonObject.getString("id");
            String Str1 = new String(d);
            String Str2 = lifenumber;

//尋找輸入id
            if (Str1.equals(Str2)) {

                String Str3 = jsonObject.getString("branch[2]");
                String str = Str3;


                if(Str3.equals("")){
                    include = "0";
                    return include;
                }else {
                    include = jsonObject.getString("branch[2]");
                    return include;

                }




            }
        }

        return include;

    }
    static public String  leftbranch3(String lifenumber,Context context) throws JSONException {
        JSONArray array = new JSONArray(getJson("events.json",context));
        String include = "0" ;
        for (int i = 0; i < array.length(); i++) {
            JSONObject jsonObject = array.getJSONObject(i);
            //將檔案內所有資料跑一遍 查詢符合的id 並顯示出需要的資料
            String d = jsonObject.getString("id");
            String Str1 = new String(d);
            String Str2 = lifenumber;

//尋找輸入id
            if (Str1.equals(Str2)) {

                String Str3 = jsonObject.getString("branch[3]");
                String str = Str3;


                if(Str3.equals("")){
                    include = "0";
                    return include;
                }else {
                    include = jsonObject.getString("branch[3]");
                    return include;

                }




            }
        }

        return include;

    }


//屬性取值
    static public int  leftAnt(String lifenumber,Context context,String ant) throws JSONException {
        JSONArray array = new JSONArray(getJson("events.json",context));
        int event = 0;
        String eve = "";
        for (int i = 0; i < array.length(); i++) {
            JSONObject jsonObject = array.getJSONObject(i);
            //將檔案內所有資料跑一遍 查詢符合的id 並顯示出需要的資料
            String c = jsonObject.getString("id");
            String Str1 = new String(c);
            String Str2 = lifenumber;

            if (Str1.equals(Str2)) {


                eve = jsonObject.getString(ant);
                if(eve.equals("")){

                    return 0;
                }else {
event = Integer.valueOf(eve);
                    return event;
                }



            }
        }

        return 0;

    }
//讀取天賦
static public String  lefttalents(String lifenumber,String name,Context context) throws JSONException {
    JSONArray array = new JSONArray(getJson("talents.json",context));
    String include = "0" ;
    for (int i = 0; i < array.length(); i++) {
        JSONObject jsonObject = array.getJSONObject(i);
        //將檔案內所有資料跑一遍 查詢符合的id 並顯示出需要的資料
        String d = jsonObject.getString("$id");
        String Str1 = new String(d);
        String Str2 = lifenumber;

//尋找輸入id
        if (Str1.equals(Str2)) {

            String Str3 = jsonObject.getString(name);
            String str = Str3;


            if(Str3.equals("")){
                include = "0";
                return include;
            }else {
                include = jsonObject.getString(name);
                return include;

            }




        }
    }

    return include;

}
















}
