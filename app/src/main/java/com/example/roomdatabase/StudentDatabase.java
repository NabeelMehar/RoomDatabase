package com.example.roomdatabase;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = Student.class,exportSchema = false,version = 1)
public abstract class StudentDatabase extends RoomDatabase {

    public static final String DB_NAME="person_db";
    public static StudentDatabase INSTANCE;

    public static synchronized StudentDatabase getINSTANCE(Context context){
        if (INSTANCE==null) {
            INSTANCE = Room.databaseBuilder(context.getApplicationContext(), StudentDatabase.class, DB_NAME)
                    .fallbackToDestructiveMigration()
                    .build();
        }
        return INSTANCE;
    }

    public abstract StudentDao studentDao();
}
