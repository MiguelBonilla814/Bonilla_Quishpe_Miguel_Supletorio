package com.example.bonilla_quishpe_miguel_supletorio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class RegistroActivity_mebq extends AppCompatActivity {

    private EditText editText_nombre;
    private EditText editText_apellido;
    private EditText editText_cedula;
    private EditText editText_contraseña;
    private EditText editText_verificar_contraseña;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_mebq);

        editText_nombre = findViewById(R.id.editText_nombre_registro);
        editText_apellido = findViewById(R.id.editText_apellido_registro);
        editText_cedula = findViewById(R.id.editText_cedula_registro);
        editText_contraseña = findViewById(R.id.editText_contraseña_registro);
        editText_verificar_contraseña = findViewById(R.id.editText_contraseña_verificar);
    }

    public void Cancelar(View view){
        this.finish();
    }

    public void Registrar(View view){
        UsuarioHelper_mebq bd = new UsuarioHelper_mebq(this, "usuarioBD", null, 1);
        SQLiteDatabase sql = bd.getWritableDatabase();

        String nombre = editText_nombre.getText().toString();
        String apellido = editText_apellido.getText().toString();
        String cedula = editText_cedula.getText().toString();
        String contraseña = editText_contraseña.getText().toString();
        String contraseña_verificar = editText_verificar_contraseña.getText().toString();

        if(nombre.equals("") && apellido.equals("") && cedula.equals("") && contraseña.equals("")){
            Toast.makeText(this, "Los campos no deben de estar en blanco", Toast.LENGTH_SHORT).show();
        }
        else{
            if(contraseña.equals(contraseña_verificar)){
                ContentValues listaValores = new ContentValues();
                listaValores.put("NOMBRE", nombre);
                listaValores.put("APELLIDO", apellido);
                listaValores.put("CORREO", cedula);
                listaValores.put("CONTRASEÑA", contraseña);
                sql.insert("Usuarios", null, listaValores);
                sql.close();
                editText_nombre.setText("");
                editText_apellido.setText("");
                editText_cedula.setText("");
                editText_contraseña.setText("");
                editText_verificar_contraseña.setText("");
                Toast.makeText(this, "Usuario Ingresado Correctamente", Toast.LENGTH_SHORT).show();
            }
            else
                Toast.makeText(this, "Las contraseñas no coinciden", Toast.LENGTH_SHORT).show();
        }
    }
}