package com.example.chimzquiz;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class viewquiz extends SQLiteOpenHelper {
    public static final String Database_Name = "Create_quiz.db";
    public static final String Table_Name = "Quiz_table";
    public static final String Col_1 = "Uh_oh";
    public static final String Col_2 = "View_quiz";






    public viewquiz(Context context) {
        super(context, Database_Name , null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
    db.execSQL("");


    }
    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
