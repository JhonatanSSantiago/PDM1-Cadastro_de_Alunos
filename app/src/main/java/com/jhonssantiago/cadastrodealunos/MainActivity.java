package com.jhonssantiago.cadastrodealunos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText nome, nota;
    private RadioButton sistemas, outro;
    private Button button;
    private Spinner spinner;
    private ArrayAdapter<String> adapter;
    private String idades[] = {"20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30"};
    private ProgressBar progressBar;
    private TextView resultado;
    private Aluno a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
}