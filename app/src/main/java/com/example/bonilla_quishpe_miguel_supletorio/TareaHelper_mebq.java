package com.example.bonilla_quishpe_miguel_supletorio;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class TareaHelper_mebq extends SQLiteOpenHelper {
    private String createTable_Tareas = "CREATE TABLE Tareas (" +
            "ID INTEGER PRIMARY KEY AUTOINCREMENT," +
            "NOMBRE TEXT," +
            "DESCRIPCION TEXT," +
            "CHECK BOOL)";

    public TareaHelper_mebq(Context context, @Nullable String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db){
        db.execSQL(createTable_Tareas);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS Usuarios");

    }

}
