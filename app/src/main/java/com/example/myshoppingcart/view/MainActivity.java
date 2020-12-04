package com.example.myshoppingcart.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.myshoppingcart.R;

public class MainActivity extends AppCompatActivity {

    EditText editTextItem;
    Button buttonSaveItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        buttonSaveItem = findViewById(R.id.buttonSaveItem);

        buttonSaveItem.setOnClickListener(v -> {
            insertNewItem();
        });

    }

    public void insertNewItem() {
        editTextItem = findViewById(R.id.editTextItem);
        Toast.makeText(getApplicationContext(), editTextItem.getText().toString(), Toast.LENGTH_LONG).show();
    }

}