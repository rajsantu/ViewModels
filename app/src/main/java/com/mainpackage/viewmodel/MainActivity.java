package com.mainpackage.viewmodel;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;


public class MainActivity extends AppCompatActivity {

    MainActivityViewModel mainActivityViewModel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        Button btn = findViewById(R.id.button);
        TextView textView = findViewById(R.id.textView);

        mainActivityViewModel = new ViewModelProvider(this).get(MainActivityViewModel.class);


        // Getting the initial Count
        textView.setText(String.format(getString(R.string.you_clicked_me_d_times), mainActivityViewModel.getInitialCounter()));


        btn.setOnClickListener(v -> {

            // Getting the Current Count
            textView.setText(String.format(getString(R.string.you_clicked_me_d_times), mainActivityViewModel.getCounter()));
        });


    }

}