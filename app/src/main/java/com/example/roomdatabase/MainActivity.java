package com.example.roomdatabase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "ZZZZ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AsyncTask.execute(new Runnable() {
            @Override
            public void run() {
                StudentDatabase db=StudentDatabase.getINSTANCE(MainActivity.this);

                db.studentDao().insertStudent(new Student("Nabeel","10th","B"));
                db.studentDao().insertStudent(new Student("Nayab","11th","C"));
                db.studentDao().insertStudent(new Student("Mohit","12th","D"));
                db.studentDao().insertStudent(new Student("Ganesh","1st year","E"));

                Log.d(TAG, "onCreate: "+db.studentDao().getStudents().toString());
            }
        });




    }
}
