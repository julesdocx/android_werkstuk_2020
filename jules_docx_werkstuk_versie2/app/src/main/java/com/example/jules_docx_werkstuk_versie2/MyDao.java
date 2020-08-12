package com.example.jules_docx_werkstuk_versie2;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.jules_docx_werkstuk_versie2.User;

import java.util.List;

@Dao
public interface MyDao {
    User findByName(String first, String last);
    @Insert
    void insertUser(User... users);
    @Update
    void updateUsers(User... users);
    @Delete
    void delete(User user);
}
