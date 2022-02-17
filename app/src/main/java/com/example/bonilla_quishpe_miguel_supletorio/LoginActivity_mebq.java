package com.example.bonilla_quishpe_miguel_supletorio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity_mebq extends AppCompatActivity {

    private EditText editText_cedula;
    private EditText editText_contraseña;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_mebq);

        editText_cedula = findViewById(R.id.editText_cedula_login);
        editText_contraseña = findViewById(R.id.editText_contraseña_login);
    }

    public void abrirRegistro(View view){
        Intent intent = new Intent(this, RegistroActivity_mebq.class);
        startActivity(intent);
    }

    public void IniciarSesion(View view){
        UsuarioHelper_mebq bd = new UsuarioHelper_mebq(this, "usuarioBD", null, 1);
        SQLiteDatabase sql = bd.getReadableDatabase();

        String email = editText_cedula.getText().toString();
        String password = editText_contraseña.getText().toString();

        if(email.equals("") && password.equals("")){
            Toast.makeText(this, "No se permiten campos vacíos", Toast.LENGTH_SHORT).show();
        }
        else
        {
            String consulta = "SELECT * FROM Usuarios WHERE CORREO = '" + email + "' and CONTRASEÑA = '" + password +"'";
            Cursor cursor = sql.rawQuery(consulta, null);
            String c = "", p = "";
            if(cursor.moveToFirst()){
                c = cursor.getString(4);
                p = cursor.getString(3);
            }
            if(email.equals(c) && password.equals(p)){
                Intent intent = new Intent(this, PrincipalActivity_mebq.class);
                startActivity(intent);
                Toast.makeText(this, "Login correcto", Toast.LENGTH_SHORT).show();
            }
            else{
                Toast.makeText(this, "Usuario o contraseña incorrecta", Toast.LENGTH_SHORT).show();
            }
        }
        sql.close();
    }
}