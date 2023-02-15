package com.example.path.Adapter;


import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;

import androidx.recyclerview.widget.RecyclerView;


import com.example.path.R;



public class Adapter extends RecyclerView.Adapter<Adapter.myviewholder> {


     Cursor cursor;

     String cname ;






    public Adapter(Cursor cursor , String cname ) {

        this.cursor =cursor;
        this.cname =cname;

    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view =  LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_layout,parent,false);


       return new myviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myviewholder holder, int position) {

        if (cursor.moveToNext()) {


                int QuestionIndex = cursor.getColumnIndex("Question");
                int Index = cursor.getColumnIndex(cname);

                String Question = cursor.getString(QuestionIndex);
                String Ans = cursor.getString(Index);

                holder.que.setText(Question);
                holder.ans.setText(Ans);


        }






    }

    @Override
    public int getItemCount() {
        return cursor.getCount();
    }

    public static class myviewholder extends RecyclerView.ViewHolder{

        TextView que,ans;
        public myviewholder(@NonNull View itemView) {
            super(itemView);

            que=itemView.findViewById(R.id.qustion);
            ans=itemView.findViewById(R.id.answer);





        }
    }

}
