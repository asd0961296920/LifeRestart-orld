package com.example.liferestartworld;

import android.content.Context;
import android.content.res.AssetManager;
import android.os.Bundle;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.preference.PreferenceFragmentCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import org.json.JSONException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;

public class SettingsActivity extends AppCompatActivity {
    private Random v2 = new Random();

    private MyAdapter adapter;
    RecyclerView recyclerView;
private String c1 ="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings_activity);
        Context context = this;

         String lifenumber = "0";
        ArrayList be = new ArrayList();
        ArrayList be2 = new ArrayList();

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);



for(int i=0; i<10;i++){
    lifenumber =String.valueOf(1000+( v2.nextInt(100) + 1));
    try {
        c1 =leftSelet.lefttalents(lifenumber,"name", context);
        be2.add(c1);
        be.add("");
    } catch (JSONException e) {
        e.printStackTrace();
    }
    //顯示出來
    adapter = new MyAdapter(be,be2);
    recyclerView.setAdapter(adapter);



}

        linearLayoutManager.scrollToPositionWithOffset(adapter.getItemCount() - 1, Integer.MIN_VALUE);






}


//參考https://ithelp.ithome.com.tw/articles/10261088

    public static String getJson(String fileName, Context context) {
        //將json資料變成字串
        StringBuilder stringBuilder = new StringBuilder();
        try {
            //獲取assets資源管理器
            AssetManager assetManager = context.getAssets();
            //通過管理器開啟檔案並讀取
            BufferedReader bf = new BufferedReader(new InputStreamReader(
                    assetManager.open(fileName)));
            String line;
            while ((line = bf.readLine()) != null) {
                stringBuilder.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringBuilder.toString();
    }


}