package com.example.bonilla_quishpe_miguel_supletorio;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class UsuarioHelper_mebq extends SQLiteOpenHelper {

    private String createTable_Usuarios = "CREATE TABLE Usuarios (" +
            "ID INTEGER PRIMARY KEY AUTOINCREMENT," +
            "NOMBRE TEXT," +
            "APELLIDO TEXT," +
            "CONTRASEÑA TEXT," +
            "CORREO TEXT)";

    public UsuarioHelper_mebq(Context context, @Nullable String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db){
        db.execSQL(createTable_Usuarios);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS Usuarios");

    }
}
