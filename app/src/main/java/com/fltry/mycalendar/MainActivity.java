package com.fltry.mycalendar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    MyCalendar myCalendar;
    String[][] colors;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myCalendar = findViewById(R.id.myCalendar);
        colors = new String[][]{{"2019-1-3", "#ffffff", "#fda2a1"},
                {"2019-1-6", "#ffffff", "#a2c4fc"},
                {"2019-1-9", "#ffffff", "#a2c4fc"},
                {"2019-1-12", "#ffffff", "#a2c4fc"},
                {"2019-1-20", "#ffffff", "#fcbd7f"},
                {"2019-1-29", "#ffffff", "#fcbd7f"},
                {"2019-1-31", "#ffffff", "#fcbd7f"},
                {"2019-2-5", "#ffffff", "#fcbd7f"},
                {"2019-5-6", "#ffffff", "#a2c4fc"},
                {"2019-3-21", "#ffffff", "#fcbd7f"},
                {"2019-4-4", "#ffffff", "#a2c4fc"},
                {"2019-8-8", "#ffffff", "#fcbd7f"}
        };
        myCalendar.setDayColor(colors);


        myCalendar.setOnSelectClickListener(new MyCalendar.OnSelectClickListener() {
            @Override
            public void onSelect(String year, String month, String day) {
                Toast.makeText(MainActivity.this, "选择了：" + year + "年" + month + "月" + day + "日", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onMonthChange() {
                myCalendar.setDayColor(colors);
            }
        });
    }
}
