package com.example.path.DATABASE;


import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.path.DAO.UserDao;
import com.example.path.Entity.User;



@Database(entities = {User.class},exportSchema = false, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract UserDao userDao();


    private static volatile AppDatabase INSTANCE;

    public static synchronized AppDatabase getInstance(Context context) {
        if (INSTANCE == null) {
            synchronized (AppDatabase.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                                    AppDatabase.class, "DATA_database")
                            .createFromAsset("aa.db")
                            .build();
                }
            }
        }
        return INSTANCE;
    }


}
