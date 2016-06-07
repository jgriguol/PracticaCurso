package com.dydsistemas.demoler.practica1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import android.widget.TextView;

/**
 * Created by HP on 6/6/2016.
 */
public class UsuarioActivity extends Activity {
    TextView tvUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usuario);

        tvUser = (TextView) findViewById(R.id.tvUser);

        Bundle bundle = getIntent().getExtras();
        tvUser.setText(bundle.getString("nombre"));
    }

    public void finalizar(View view) {
        finish();
    }
}
