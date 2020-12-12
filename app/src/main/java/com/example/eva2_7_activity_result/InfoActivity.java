package com.example.eva2_7_activity_result;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class InfoActivity extends AppCompatActivity {

    EditText edtTxtDatos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        edtTxtDatos = findViewById(R.id.edtTxtDatos);
    }

    public void onClick2(View view){
        //Devolver los datos.
        Intent intent = new Intent();
                String sCade =edtTxtDatos.getText().toString();
                intent.putExtra("Datos",sCade);
                setResult(Activity.RESULT_OK,intent);
                finish();

    }
}