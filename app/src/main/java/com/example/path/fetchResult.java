package com.example.path;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.database.Cursor;
import android.os.Bundle;

import com.example.path.Adapter.Adapter;
import com.example.path.DAO.UserDao;
import com.example.path.DATABASE.AppDatabase;

public class fetchResult extends AppCompatActivity {

    static int qnum;
    static String card;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fetch_result);
        // Start the thread
        new DatabaseThread(this).start();


    }


    private class DatabaseThread extends Thread {
        private final Activity activity;

        public DatabaseThread(Activity activity) {
            this.activity = activity;
        }

        @Override
        public void run() {
            super.run();
            // Do your database operations here
            AppDatabase database = AppDatabase.getInstance(fetchResult.this);
            UserDao userDao = database.userDao();
            Cursor cursor = userDao.getAllUsers(qnum);

            activity.runOnUiThread(() -> {
                // Update your views here
                RecyclerView recyclerView = findViewById(R.id.my_recycler_view);
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(fetchResult.this);
                recyclerView.setLayoutManager(linearLayoutManager);
                Adapter adapter = new Adapter(cursor, card);
                recyclerView.setAdapter(adapter);

            });
        }
    }


}