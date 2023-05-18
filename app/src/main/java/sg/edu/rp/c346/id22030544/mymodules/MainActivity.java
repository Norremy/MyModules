package sg.edu.rp.c346.id22030544.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    TextView tvC346;
    TextView tvC235;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvC346 = findViewById(R.id.tvC346);
        tvC235 = findViewById(R.id.tvC235);
        ArrayList<Module> modules = new ArrayList<Module>();
        modules.add(new Module("C346","Android Programming",2020,1,4,"W64M"));
        modules.add(new Module("C235","IT Security",2020,1,4,"W65M"));

        tvC235.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for(int i =0; i<modules.size();i++){
                    if(modules.get(i).getModuleCode().equals("C235")){
                        Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                        intent.putExtra("display","Module Code: " + modules.get(i).getModuleCode() + "\nModule Name: " + modules.get(i).getModuleName() + "\nAcademic Year: " + modules.get(i).getAcademicYear() + "\nSemester: " + modules.get(i).getSemester() + "\nModule Credit: " + modules.get(i).getModuleCredit() + "\nVenue: " + modules.get(i).getVenue());

                        startActivity(intent);
                    }
                }


            }
        });
        tvC346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for(int i =0; i<modules.size();i++){
                    if(modules.get(i).getModuleCode().equals("C346")){
                        Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                        intent.putExtra("display","Module Code: " + modules.get(i).getModuleCode() + "\nModule Name: " + modules.get(i).getModuleName() + "\nAcademic Year: " + modules.get(i).getAcademicYear() + "\nSemester: " + modules.get(i).getSemester() + "\nModule Credit: " + modules.get(i).getModuleCredit() + "\nVenue: " + modules.get(i).getVenue());

                        startActivity(intent);
                    }
                }


            }
        });
    }
}
