package com.example.path.DAO;


import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.path.Entity.User;

import java.util.List;

@Dao
public interface UserDao {
    @Query("SELECT * FROM qdata")
    List<User> getAll();

    @Insert
    void insertAll(User user);


}