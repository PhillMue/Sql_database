package com.android.mue.sqldb;

import android.app.Activity;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
    SQLiteDatabase db;
    TextView tv;
    EditText et1,et2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //initialize all view objects
        tv=(TextView)findViewById(R.id.textView1);
        et1=(EditText)findViewById(R.id.editText1);
        et2=(EditText)findViewById(R.id.editText2);
        db= openOrCreateDatabase("Mydb", MODE_PRIVATE, null);
        //create new table if not already exist
        db.execSQL("create table if not exists mytable(name varchar, sur_name varchar)");
    }
    public void insert(View v)
    {
        String name=et1.getText().toString();
        String sur_name=et2.getText().toString();
        et1.setText("");
        et2.setText("");

    }
}
