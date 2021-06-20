package com.example.displaytables;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private EditText edittext;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        edittext = findViewById(R.id.editTextTextPersonName);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = edittext.getText().toString();
                int num = Integer.parseInt(s);
                textView = findViewById(R.id.textView1);
                textView.setText(num + " * 1 " +" = " + num * 1);
                textView = findViewById(R.id.textView2);
                textView.setText(num + " * 2 " +" = " + num * 2);
                textView = findViewById(R.id.textView3);
                textView.setText(num + " * 3 " +" = " + num * 3);
                textView = findViewById(R.id.textView4);
                textView.setText(num + " * 4 " +" = " + num * 4);
                textView = findViewById(R.id.textView5);
                textView.setText(num + " * 5 " +" = " + num * 5);
                textView = findViewById(R.id.textView6);
                textView.setText(num + " * 6 " +" = " + num * 6);
                textView = findViewById(R.id.textView7);
                textView.setText(num + " * 7 " +" = " + num * 7);
                textView = findViewById(R.id.textView8);
                textView.setText(num + " * 8 " +" = " + num * 8);
                textView = findViewById(R.id.textView9);
                textView.setText(num + " * 9 " +" = " + num * 9);
                textView = findViewById(R.id.textView10);
                textView.setText(num + " * 10 " +" = " + num * 10);
            }
        });

    }
}