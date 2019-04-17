package com.example.hellotoastpractical3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // Properties
    private Button btnShowToast;
    private TextView txtCount;
    private Button btnCount;
    private int counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        counter = 0;
        initUI();
    }

    /**
     * Initialize UI components
     */
    private void initUI() {
        btnShowToast = findViewById(R.id.button_toast);
        txtCount = findViewById(R.id.show_count);
        btnCount = findViewById(R.id.button_count);
    }

    /**
     * Increment Counter
     *
     * @param view
     */
    public void incrementCount(View view) {
        counter++;
        txtCount.setText(String.valueOf(counter));
    }

    /**
     * Start HelloActivity
     *
     * @param view
     */
    public void showToast(View view) {
        Toast.makeText(this, "Hello Toast!", Toast.LENGTH_LONG).show();
    }
}
