package com.betosoft.nuevaaplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity implements View.OnClickListener {
    private TextView edtPara, edtAsunto;
    private Button btnEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtPara = findViewById(R.id.edtPara);
        edtAsunto = findViewById(R.id.edtAsunto);
        btnEnviar = findViewById(R.id.btnEnviar);
        btnEnviar.setOnClickListener(this);

        edtPara.setText("SAludos Programas");
    }

    @Override
    public void onClick(View view) {
        edtAsunto.setText(edtPara.getText());
    }
}