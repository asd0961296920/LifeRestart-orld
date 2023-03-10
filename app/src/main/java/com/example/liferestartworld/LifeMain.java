package com.example.liferestartworld;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.liferestartworld.MyAdapter;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LifeMain extends AppCompatActivity {

    private Button next;
    private int age, str, ige, fbg, lok;
     RecyclerView recyclerView;
    private TextView textView,txtstr,txtige,txtfbg,txtlok;
    public static String  branch = "0";
    private int nb=1,nb2 = 1,nb3 = 1,nb4,nb5 = 0;
    private ArrayList<String> mData = new ArrayList<>();
    private ArrayList<String> mData2 = new ArrayList<>();
    private MyAdapter adapter;
    private String talents = "";
    private Random v2 = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lifeain);
        next = findViewById(R.id.next);
        textView = findViewById(R.id.textView);
        txtstr = findViewById(R.id.appearance);
        txtige = findViewById(R.id.intelligent);
        txtfbg = findViewById(R.id.strength);
        txtlok = findViewById(R.id.money);
        Intent intent = getIntent();
        txtstr.setText(intent.getStringExtra("d")+"");
        /*
        str = Integer.parseInt(intentc.getStringExtra("a"));

        txtstr.setText(""+str);
        ige = Integer.parseInt(intentc.getStringExtra("b"));
        txtige.setText(""+ige);
        fbg = Integer.parseInt(intentc.getStringExtra("c"));
        txtfbg.setText(""+fbg);
        lok = Integer.parseInt(intentc.getStringExtra("d"));
        txtlok.setText(""+lok);
*/


        recyclerView = findViewById(R.id.lifeExperience);

        Context context = this;


        // recyclerView.setLayoutManager(new LinearLayoutManager(this));     //??????????????????


        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        ArrayList belift = new ArrayList();
        str = 21;
        nb3 = v2.nextInt(10) + 1;

        //textView.setText("123");
age = 0;

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//??????????????????
if(str<0){

    Intent intent = new Intent();
    intent.setClass(LifeMain.this , Over.class);
    startActivity(intent);
    return;
}





                try {
                    String event = "";
                    int include = 0;
                    int agee = 0;
                    String lifenumber = "0";
                    Random v = new Random();
                    int c1= 0;
                    String include2 ="";
                    ArrayList be = new ArrayList();
                    JSONArray array = new JSONArray(getJson("events.json",context));
boolean bch = true;












                    //????????????
                    if(age == 0){
                        //???????????????
                        if(leftSelet.lefttalents(talents,"grade",context).equals("1")){
                            //?????????????????????
                            if(nb == 1){
                                if(Integer.parseInt(leftSelet.lefttalents(talents,"effect:STR",context))>0){
                                    str= str + Integer.parseInt(leftSelet.lefttalents(talents,"effect:STR",context));
                                }
                                if(Integer.parseInt(leftSelet.lefttalents(talents,"effect:INT",context))>0){
                                    ige= ige + Integer.parseInt(leftSelet.lefttalents(talents,"effect:INT",context));
                                }
                                if(Integer.parseInt(leftSelet.lefttalents(talents,"effect:MNY",context))>0){
                                    fbg= fbg + Integer.parseInt(leftSelet.lefttalents(talents,"effect:MNY",context));
                                }
                                if(Integer.parseInt(leftSelet.lefttalents(talents,"effect:CHR",context))>0){
                                    lok= lok + Integer.parseInt(leftSelet.lefttalents(talents,"effect:CHR",context));
                                }

                                nb = 0;
                            }

                        }

                        if(bch) {
                            lifenumber = (10000 + (v.nextInt(2) + 1)) + "";
//???????????? ????????????

                            belift.add(lifenumber);
                            event = leftSelet.leftEvent(lifenumber, context);


                        }







                    }else if(age>=1&&age<=6){



















//????????????
                        if(bch) {
                            if (!branch.equals("0") && !branch.equals("")) {
                                //?????????????????????
                                lifenumber = branch;
                            } else {
                                //????????????????????????

/*
//?????????
                                if (age == 3) {
                                    lifenumber = 10220 + "";
                                } else {
                                    lifenumber = 10100 + (v.nextInt(27) + 1) + "";
                                }
*/
                                 lifenumber = 10100+(v.nextInt(27)+1)+"";
                            }




                        }




//??????????????????
while (true) {
//????????????
    while (true) {
        //??????????????????????????????
        while (true) {
            //??????????????????????????????
            while (true) {

                include = Integer.parseInt(leftSelet.leftInclude(lifenumber, context, 0));

                if (leftysno.ysno(context, include, belift)) {
//?????? ??????????????????
                    break;
                }
                //????????? ??????
                lifenumber = 10100 + (v.nextInt(27) + 1) + "";
            }
            include = Integer.parseInt(leftSelet.leftExclude(lifenumber, context));

            if (leftysno.ysno2(context, include, belift)) {

//?????? ??????????????????
                break;

            }
            //????????? ??????
            lifenumber = 10100 + (v.nextInt(27) + 1) + "";
        }

        include2 = leftSelet.leftattributes(lifenumber, context);


        if (leftysno.strif(include2, context, age, str, ige, fbg, lok)) {


//?????? ??????????????????
            break;
        }
        //????????? ??????
        lifenumber = 10100 + (v.nextInt(27) + 1) + "";
    }



   if(leftysno.dataduplication(belift,lifenumber)){

//?????????????????? ???????????? ???????????????

       str = str+ leftSelet.leftAnt(lifenumber, context,"STR");
       ige = ige+ leftSelet.leftAnt(lifenumber, context,"IGE");
       fbg = fbg+ leftSelet.leftAnt(lifenumber, context,"FBG");
       lok = lok+ leftSelet.leftAnt(lifenumber, context,"LOK");
       belift.add(lifenumber);
       event = leftSelet.leftEvent(lifenumber, context);
       //leftSelet.leftEvent(lifenumber, context)
       break;
   }


//????????? ??????
    lifenumber = 10100 + (v.nextInt(27) + 1) + "";


}


int ct =0;


//????????????100%???
if(!leftSelet.leftbranch1(lifenumber,context).equals("0")){

    branch = leftSelet.leftbranch1(lifenumber,context);


}else if(!leftSelet.leftbranch2(lifenumber,context).equals("0")|| !leftSelet.leftbranch3(lifenumber,context).equals("0")){



//????????????????????? ?????????
    if(!leftSelet.leftbranch2(lifenumber,context).equals("0") && leftSelet.leftbranch3(lifenumber,context).equals("0")){
    branch = leftSelet.leftbranch2(lifenumber,context);
}
//?????????????????? 30%???
else if(!leftSelet.leftbranch3(lifenumber,context).equals("0") && leftSelet.leftbranch2(lifenumber,context).equals("0")){
    ct = v.nextInt(10) + 1;
    if(ct<4){
        branch = leftSelet.leftbranch3(lifenumber,context);
    }

}

    //?????????????????????????????? 70%????????? 30%????????????
    else if(!leftSelet.leftbranch3(lifenumber,context).equals("0") && !leftSelet.leftbranch2(lifenumber,context).equals("0")){
        ct = v.nextInt(10) + 1;
        if(ct<7){
            branch = leftSelet.leftbranch2(lifenumber,context);
        }else if(ct>=7) {
            branch = leftSelet.leftbranch3(lifenumber,context);

        }

    }

}


















                    }else if(age>6){
                        lifenumber =10200+(v.nextInt(60)+1)+"";
                        event = leftSelet.leftEvent(lifenumber,context);
str = 1000;
                        for(int c=0;c<belift.size();c++ ){

                        }


                       belift.add(lifenumber);

                    }






//????????????
                    if(leftSelet.lefttalents(talents,"grade",context).equals("2")){
//?????????????????????
                        if(nb2 == 1) {
                            String yyy = leftSelet.lefttalents(talents, "condition", context);
                            if (leftysno.strif(yyy, context, age, str, ige, fbg, lok)) {
                                belift.add(lifenumber);
                                lifenumber = leftSelet.lefttalents(talents,"exclusive",context);
                                event = leftSelet.leftEvent(lifenumber, context);
                                nb2 = 0;
                                                            }
                        }

                    }


                    if(leftSelet.lefttalents(talents,"grade",context).equals("3")){

                        //?????????????????????*
                        nb4 = v.nextInt(20) + 1;
                        if(nb5 == 0) {
                            if (nb4 > 0) {
                                if (nb3 > 0) {
                                    String yyy = leftSelet.lefttalents(talents, "condition", context);
                                    if (leftysno.strif(yyy, context, age, str, ige, fbg, lok)) {

                                        lifenumber = leftSelet.lefttalents(talents, "exclusive", context);
                                        event = leftSelet.leftEvent(lifenumber, context);
                                        nb3 = nb3 - 1;


                                    }
                                }


                            }
                        }
                        nb5 = nb5 + 1;
                        if(nb5>=6) {

                        nb5 =0 ;
                        }
                    }


















                    //??????
                    mData2.add(age+"???");
                    //??????
                    mData.add(event);

                    //????????????
                    adapter = new MyAdapter(mData2,mData);
                    recyclerView.setAdapter(adapter);



                } catch (JSONException e) {
                    e.printStackTrace();
                }









age++;


                linearLayoutManager.scrollToPositionWithOffset(adapter.getItemCount() - 1, Integer.MIN_VALUE);








            }
        });






    }


//??????https://ithelp.ithome.com.tw/articles/10261088

    public static String getJson(String fileName, Context context) {
        //???json??????????????????
        StringBuilder stringBuilder = new StringBuilder();
        try {
            //??????assets???????????????
            AssetManager assetManager = context.getAssets();
            //????????????????????????????????????
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



