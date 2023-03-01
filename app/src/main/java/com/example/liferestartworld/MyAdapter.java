package com.example.liferestartworld;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    ArrayList<String> ItemList,ItemList2;

    //帶入ArrayList作為資料
    public MyAdapter(ArrayList<String> itemList,ArrayList<String> itemList2) {
        this.ItemList2 = itemList2;
        this.ItemList = itemList;

    }

    @Override
    //創建一個新的viewholder
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //負責找尋res/layout 下的佈局檔，功能類似findViewById()。
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item, parent, false);    //載入layout
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        //將正確的viewholder連接到正確的positon
        holder.fileTitle2.setText(ItemList.get(position));
        holder.fileTitle.setText(ItemList2.get(position));

        //滑動畫面時，將資料位置綁至新的欄位，用新數據將之取代(RecyclerView特色)
    }

    //RecyclerView長度
    @Override
    public int getItemCount() {
        return ItemList.size();
    }              //回傳titlelist總共有幾筆資料

    class ViewHolder extends RecyclerView.ViewHolder {           //綁定recycle的套件
        public TextView fileTitle,fileTitle2;
        public ViewHolder(View holder) {
            super(holder);
            //綁定元件ID
            fileTitle2 = (TextView) holder.findViewById(R.id.eventAge);
            fileTitle = (TextView) holder.findViewById(R.id.eventText);

        }









    }
}