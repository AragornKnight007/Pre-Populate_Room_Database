package com.example.path;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;


import com.example.path.Adapter.Adapter;
import com.example.path.DAO.UserDao;
import com.example.path.DATABASE.AppDatabase;
import com.example.path.Entity.User;


import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();




    }
    private void initialize(){


        AppDatabase database = AppDatabase.getInstance(this);
        UserDao userDao = database.userDao();

       ArrayList<User> users = (ArrayList<User>) userDao.getAll();


        recyclerView = findViewById(R.id.my_recycler_view);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);


        Adapter adapter = new Adapter(users);
        recyclerView.setAdapter(adapter);
//        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
//        recyclerView.setLayoutManager(linearLayoutManager);









    }



}