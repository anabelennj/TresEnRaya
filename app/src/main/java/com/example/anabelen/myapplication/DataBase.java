package com.example.anabelen.myapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Ana Belen on 20/08/2016.
 */
public class DataBase extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "resultados.db";
    public static final String TABLE_NAME = "tabla_resultados";
    public static final String COL_1 = "Ganador";
    public static final String COL_2 = "Pasos";

    public DataBase(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + TABLE_NAME +"(GANADOR TEXT PRIMARY KEY,PASOS INTEGER)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }

    public boolean insertData(String ganador,int pasos) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_1,ganador);
        contentValues.put(COL_2,pasos);
        long result = db.insert(TABLE_NAME,null ,contentValues);
        if(result == -1)
            return false;
        else
            return true;
    }

    public Cursor getAllData(){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor resultado = db.rawQuery("select * from " + TABLE_NAME,null);
        return resultado;
    }
}
