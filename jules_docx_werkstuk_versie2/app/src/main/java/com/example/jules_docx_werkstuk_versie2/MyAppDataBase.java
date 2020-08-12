package com.example.jules_docx_werkstuk_versie2;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {User.class}, version = 1)
public abstract class MyAppDataBase extends RoomDatabase {
    public abstract MyDao myDao();
}
