package com.example.clarinetmaster.testaddcourse;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.clarinetmaster.testaddcourse.DB.dbHelper;

public class testDatabase extends AppCompatActivity {

    private ListView listView;

    private dbHelper mHelper;
    private SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_database);

        listView = (ListView) findViewById(R.id.DBListview);
        mHelper = new dbHelper(this);
        db = mHelper.getWritableDatabase();

    }
}
