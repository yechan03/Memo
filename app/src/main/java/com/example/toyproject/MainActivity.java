package com.example.toyproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Data> mArrayList;
    RecyclerAdapter mAdapter;
    RecyclerView recyclerView;
    Button button;
    EditText editText;
    String SwiftUi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view);
        button = findViewById(R.id.btn);
        editText = findViewById(R.id.ET);


        LinearLayoutManager mLinearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(mLinearLayoutManager);

        mArrayList = new ArrayList<>();
        mAdapter = new RecyclerAdapter(mArrayList);
        recyclerView.setAdapter(mAdapter);

        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(recyclerView.getContext(),mLinearLayoutManager.getOrientation());
        recyclerView.addItemDecoration(dividerItemDecoration);




        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                SwiftUi = editText.getText().toString();
                Data data = new Data(SwiftUi);
                mArrayList.add(data);
                mAdapter.notifyDataSetChanged();
                editText.setText("");
            }
        });

    }
}