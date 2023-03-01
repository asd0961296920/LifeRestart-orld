package com.example.liferestartworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class attribute extends AppCompatActivity {
    private Button b011,b012,b021,b022,b031,b032,b041,b042,life;
    private int a=0,b=0,c=0,d=0;
    private TextView t01,t02,t03,t04;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attribute);


        b011 = findViewById(R.id.b011);
        b012 = findViewById(R.id.b012);
        b021 = findViewById(R.id.b021);
        b022 = findViewById(R.id.b022);
        b031 = findViewById(R.id.b031);
        b032 = findViewById(R.id.b032);
        b041 = findViewById(R.id.b041);
        b042 = findViewById(R.id.b042);
        t01 = findViewById(R.id.c1);
        t02 = findViewById(R.id.c2);
        t03 = findViewById(R.id.c3);
        t04 = findViewById(R.id.c4);
        life = findViewById(R.id.lifeReStart10);



        life.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(attribute.this, LifeMain.class);
                intent.putExtra("a", a);
                /*
                intent.putExtra("b", b);
                intent.putExtra("c", c);
                intent.putExtra("d", d);
*/
                startActivity(intent);


            }
        });



        b011.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                a-=1;
            if(a<0){
                a = 0;
            }
            t01.setText(""+a);



            }
        });

        b012.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                a+=1;
                if(a<0){
                    a = 0;
                }
                t01.setText(""+a);



            }
        });
        b021.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                b-=1;
                if(b<0){
                    b = 0;
                }
                t02.setText(""+b);



            }
        });

        b022.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                b+=1;
                if(b<0){
                    b = 0;
                }
                t02.setText(""+b);



            }
        });
        b031.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                c-=1;
                if(c<0){
                    c = 0;
                }
                t03.setText(""+c);



            }
        });

        b032.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                c+=1;
                if(a<0){
                    c = 0;
                }
                t03.setText(""+c);



            }
        });
        b041.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                d-=1;
                if(d<0){
                    d = 0;
                }
                t04.setText(""+d);



            }
        });

        b042.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                d+=1;
                if(d<0){
                    a = 0;
                }
                t04.setText(""+d);



            }
        });



    }
}