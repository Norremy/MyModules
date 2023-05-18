package sg.edu.rp.c346.id22030544.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {
    TextView tvDisplay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);
        tvDisplay = findViewById(R.id.textViewDisplay);

        Intent intentReceived = getIntent();

        tvDisplay.setText(intentReceived.getStringExtra("display"));
    }
}