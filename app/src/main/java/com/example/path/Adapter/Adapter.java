package com.example.path.Adapter;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;

import androidx.recyclerview.widget.RecyclerView;

import com.example.path.Entity.User;
import com.example.path.R;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.myviewholder> {
    ArrayList<User> users;

    public Adapter(ArrayList<User> users) {
        this.users = users;
    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view =  LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_layout,parent,false);


       return new myviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myviewholder holder, int position) {

        holder.id.setText( String.valueOf(users.get(position).getId()));
        holder.que.setText(users.get(position).getQuestion());
        holder.c1.setText(users.get(position).getCard_1());
        holder.c2.setText(users.get(position).getCard_2());
        holder.c3.setText(users.get(position).getCard_3());
        holder.c4.setText(users.get(position).getCard_4());
        holder.c5.setText(users.get(position).getCard_5());




    }

    @Override
    public int getItemCount() {
        return users.size();
    }

    public static class myviewholder extends RecyclerView.ViewHolder{

        TextView id,que,c1,c2,c3,c4,c5;
        public myviewholder(@NonNull View itemView) {
            super(itemView);

            id=itemView.findViewById(R.id.text1);
            que=itemView.findViewById(R.id.text2);
            c1=itemView.findViewById(R.id.textid3);
            c2=itemView.findViewById(R.id.textid4);
            c3=itemView.findViewById(R.id.textid5);
            c4=itemView.findViewById(R.id.textid6);
            c5=itemView.findViewById(R.id.textid7);





        }
    }

}
