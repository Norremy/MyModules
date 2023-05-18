package sg.edu.rp.c346.id22030544.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    TextView tvC235;
    TextView tvC346;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvC235 = findViewById(R.id.tvC235);
        tvC346 = findViewById(R.id.tvC346);
        ArrayList<String> template = new ArrayList<String>();
        template.add("Module Code: ");
        template.add("Module Name: ");
        template.add("Academic Year: ");
        template.add("Semester: ");
        template.add("Module Credit: ");
        template.add("Venue: ");
        ArrayList<String> moduleCode = new ArrayList<String>();
        moduleCode.add("C235");
        moduleCode.add("C346");

        ArrayList<String> moduleName = new ArrayList<String>();
        moduleName.add("Android Programming");
        moduleName.add("IT security");

        ArrayList<String> venue = new ArrayList<String>();
        venue.add("W65D");
        venue.add("W66D");





        tvC346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent
            }
        });
    }
}