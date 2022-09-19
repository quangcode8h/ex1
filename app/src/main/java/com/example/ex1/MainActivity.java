package com.example.ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button mButtonSubmit;
    private TextView mTextResult;
    private EditText mTextInput;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        addAction();
    }

    private void addAction() {
        mButtonSubmit.setOnClickListener(this);
    }

    private void initView() {
        mButtonSubmit = findViewById(R.id.BtnSubmit);
        mTextInput = findViewById(R.id.TextInput);
        mTextResult = findViewById(R.id.TextView);
    }

    @Override
    public void onClick(View view) {
        String input = mTextInput.getText().toString();
        mTextResult.setText(getResources().getString(R.string.message)
        + ' ' + input + '!' + getResources().getString(R.string.nice_day_msg));
    }
}