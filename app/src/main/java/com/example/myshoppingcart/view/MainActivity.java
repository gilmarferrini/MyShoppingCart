package com.example.myshoppingcart.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.myshoppingcart.R;
import com.example.myshoppingcart.adapter.ItemAdapter;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerViewItems;

    private EditText editTextItem;
    private Button buttonSaveItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // selecionar recycler view
        recyclerViewItems = findViewById(R.id.recyclerViewItems);


        // configurar o adapter
        ItemAdapter itemAdapter = new ItemAdapter();

        // CONFIGURAR O RECYCLER VIEW
        // configurar o tipo de layout do recycler view
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerViewItems.setLayoutManager(layoutManager);

        // otimizar a recycler view
        recyclerViewItems.setHasFixedSize(true);

        // adicionar linha para separar os itens
        recyclerViewItems.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));

        // set adapter
        recyclerViewItems.setAdapter(itemAdapter);

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