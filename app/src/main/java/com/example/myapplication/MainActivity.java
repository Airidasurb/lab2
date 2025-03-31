package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText txtInput;
    private Spinner spinnerCountType;
    private Button btnCalculate;
    private TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtInput = findViewById(R.id.txtInput);
        spinnerCountType = findViewById(R.id.spinnerCountType);
        btnCalculate = findViewById(R.id.btnCalculate);
        txtResult = findViewById(R.id.txtResult);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this, R.array.count_options, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerCountType.setAdapter(adapter);

        TextAnalyzer analyzer = new TextAnalyzer();

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = txtInput.getText().toString().trim();
                if (input.isEmpty()) {
                    Toast.makeText(MainActivity.this, getString(R.string.toast_empty_input), Toast.LENGTH_SHORT).show();
                    return;
                }

                String choice = spinnerCountType.getSelectedItem().toString();
                int result = 0;

                if (choice.equals(getResources().getString(R.string.spinner_option_words))) {
                    result = analyzer.countWords(input);
                } else if (choice.equals(getResources().getString(R.string.spinner_option_characters))) {
                    result = analyzer.countCharacters(input);
                }

                txtResult.setText(getString(R.string.result_label) + " " + result);
            }
        });
    }
}
