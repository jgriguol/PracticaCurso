package com.dydsistemas.demoler.practica1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txtUsuario, txtPass;
    TextView tvUsuario, tvPass;
    Button btnLogin;

    String usuario="jgriguol";
    String password="123456";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvUsuario = (TextView) findViewById(R.id.tvUsuario);
        txtUsuario = (EditText) findViewById(R.id.txtUsuario);
        tvPass = (TextView) findViewById(R.id.tvPass);
        txtPass = (EditText) findViewById(R.id.txtPass);
        btnLogin = (Button) findViewById(R.id.btnLogin);

        btnLogin.setText("Login");


    }

    public void submit(View v){
        String user;
        String pass;
        user = txtUsuario.getText().toString();
        pass = txtPass.getText().toString();
        if(user.equals(usuario) && pass.equals(password)){
            //llamo activity
            Toast toast1 = Toast.makeText(getApplicationContext(), "Usuario y Clave correctos...", Toast.LENGTH_SHORT);
            toast1.show();
        }
        else{
            Toast toast1 = Toast.makeText(getApplicationContext(), "Usuario y/o Clave erroneos...", Toast.LENGTH_SHORT);
            toast1.show();
            txtPass.setText("");
            txtUsuario.setText("");
        }

    }
}
