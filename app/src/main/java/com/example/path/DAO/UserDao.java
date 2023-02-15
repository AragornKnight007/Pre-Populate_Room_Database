package com.example.path.DAO;


import android.database.Cursor;



import androidx.room.Dao;

import androidx.room.Query;


@Dao
public interface UserDao {
    @Query("SELECT * FROM qdata WHERE id = :userId")
    Cursor getAllUsers(int userId);



}