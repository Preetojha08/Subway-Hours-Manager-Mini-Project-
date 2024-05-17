package com.example.mysubwayapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

public class HomeActivity extends AppCompatActivity {

    List<String> date;
    List<String> day;
    List<String> time;
    List<String> hours;

    RecyclerViewAdapter recyclerViewAdapter;
    RecyclerView recyclerView;

    TextView textViewPendingHours,textViewCompletedHours,textViewtotalhours;

    TextView lastweeksal,thisweeksal,byweeksal;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerViewSlotdeatils);

        List<String> date = new ArrayList<>();
        List<String> day = new ArrayList<>();
        List<String> time = new ArrayList<>();
        List<String> hours = new ArrayList<>();

        // Slot 1
        date.addAll(Arrays.asList("02-Jan-2023", "03-Jan-2023", "04-Jan-2023", "05-Jan-2023"));
        day.addAll(Arrays.asList("MON", "TUE", "WED", "THU"));
        time.addAll(Arrays.asList("08:00 to 16:00", "08:00 to 16:00", "08:00 to 16:00", "08:00 to 16:00"));
        hours.addAll(Arrays.asList("8 Hours", "8 Hours", "8 Hours", "8 Hours"));

        // Slot 2
        date.addAll(Arrays.asList("08-Jan-2023", "09-Jan-2023", "10-Jan-2023", "11-Jan-2023", "12-Jan-2023", "15-Jan-2023", "16-Jan-2023", "17-Jan-2023", "18-Jan-2023", "19-Jan-2023"));
        day.addAll(Arrays.asList("SUN", "MON", "TUE", "WED", "THU", "SUN", "MON", "TUE", "WED", "THU"));
        time.addAll(Arrays.asList("08:00 to 16:00", "08:00 to 16:00", "08:00 to 16:00", "08:00 to 16:00", "08:00 to 16:00", "08:00 to 16:00", "08:00 to 16:00", "08:00 to 16:00", "08:00 to 16:00", "08:00 to 16:00"));
        hours.addAll(Arrays.asList("3 Hours", "8 Hours", "8 Hours", "3 Hours", "8 Hours", "3 Hours", "8 Hours", "8 Hours", "3 Hours", "8 Hours"));

        // Slot 3
        date.addAll(Arrays.asList("22-Jan-2023", "23-Jan-2023", "24-Jan-2023", "25-Jan-2023", "26-Jan-2023"));
        day.addAll(Arrays.asList("SUN", "MON", "TUE", "WED", "THU"));
        time.addAll(Arrays.asList("08:00 to 16:00", "08:00 to 16:00", "08:00 to 16:00", "08:00 to 16:00", "08:00 to 16:00"));
        hours.addAll(Arrays.asList("3 Hours", "8 Hours", "8 Hours", "3 Hours", "8 Hours"));

        // Slot 4
        date.addAll(Arrays.asList("29-Jan-2023", "30-Jan-2023", "31-Jan-2023", "01-Feb-2023", "02-Feb-2023"));
        day.addAll(Arrays.asList("SUN", "MON", "TUE", "WED", "THU"));
        time.addAll(Arrays.asList("08:00 to 16:00", "08:00 to 16:00", "08:00 to 16:00", "08:00 to 16:00", "08:00 to 16:00"));
        hours.addAll(Arrays.asList("3 Hours", "8 Hours", "8 Hours", "3 Hours", "8 Hours"));

        // Slot 5
        date.addAll(Arrays.asList("05-Feb-2023", "06-Feb-2023", "07-Feb-2023", "08-Feb-2023", "09-Feb-2023"));
        day.addAll(Arrays.asList("SUN", "MON", "TUE", "WED", "THU"));
        time.addAll(Arrays.asList("08:00 to 16:00", "08:00 to 16:00", "08:00 to 16:00", "08:00 to 16:00", "08:00 to 16:00"));
        hours.addAll(Arrays.asList("3 Hours", "8 Hours", "8 Hours", "3 Hours", "8 Hours"));

        // Slot 6
        date.addAll(Arrays.asList("12-Feb-2023", "13-Feb-2023", "14-Feb-2023", "15-Feb-2023", "16-Feb-2023"));
        day.addAll(Arrays.asList("SUN", "MON", "TUE", "WED", "THU"));
        time.addAll(Arrays.asList("08:00 to 16:00", "08:00 to 16:00", "08:00 to 16:00", "08:00 to 16:00", "08:00 to 16:00"));
        hours.addAll(Arrays.asList("3 Hours", "8 Hours", "8 Hours", "3 Hours", "8 Hours"));

        // Slot 7
        date.addAll(Arrays.asList("19-Feb-2023", "20-Feb-2023", "21-Feb-2023", "22-Feb-2023", "23-Feb-2023"));
        day.addAll(Arrays.asList("SUN", "MON", "TUE", "WED", "THU"));
        time.addAll(Arrays.asList("Holiday", "08:00 to 16:00", "08:00 to 16:00", "08:00 to 16:00", "08:00 to 16:00"));
        hours.addAll(Arrays.asList("0 Hours", "8 Hours", "8 Hours", "3 Hours", "8 Hours"));

        // Slot 8
        date.addAll(Arrays.asList("26-Feb-2023", "27-Feb-2023", "28-Feb-2023", "29-Feb-2023", "01-Mar-2023"));
        day.addAll(Arrays.asList("SUN", "MON", "TUE", "WED", "THU"));
        time.addAll(Arrays.asList("08:00 to 16:00", "08:00 to 16:00", "08:00 to 16:00", "08:00 to 16:00", "08:00 to 16:00"));
        hours.addAll(Arrays.asList("3 Hours", "8 Hours", "8 Hours", "3 Hours", "8 Hours"));

        // Slot 9
        date.addAll(Arrays.asList("04-Mar-2023", "05-Mar-2023", "06-Mar-2023", "07-Mar-2023", "08-Mar-2023"));
        day.addAll(Arrays.asList("SAT", "SUN", "MON", "TUE", "WED"));
        time.addAll(Arrays.asList("08:00 to 16:00", "08:00 to 16:00", "08:00 to 16:00", "08:00 to 16:00", "08:00 to 16:00"));
        hours.addAll(Arrays.asList("3 Hours", "8 Hours", "8 Hours", "3 Hours", "8 Hours"));

        // Slot 10
        date.addAll(Arrays.asList("11-Mar-2023", "12-Mar-2023", "13-Mar-2023", "14-Mar-2023", "15-Mar-2023"));
        day.addAll(Arrays.asList("SAT", "SUN", "MON", "TUE", "WED"));
        time.addAll(Arrays.asList("08:00 to 16:00", "08:00 to 16:00", "08:00 to 16:00", "08:00 to 16:00", "08:00 to 16:00"));
        hours.addAll(Arrays.asList("3 Hours", "8 Hours", "8 Hours", "3 Hours", "8 Hours"));

        // Slot 11
        date.addAll(Arrays.asList("18-Mar-2023", "19-Mar-2023", "20-Mar-2023", "21-Mar-2023", "22-Mar-2023"));
        day.addAll(Arrays.asList("SAT", "SUN", "MON", "TUE", "WED"));
        time.addAll(Arrays.asList("08:00 to 16:00", "08:00 to 16:00", "08:00 to 16:00", "08:00 to 16:00", "08:00 to 16:00"));
        hours.addAll(Arrays.asList("3 Hours", "8 Hours", "8 Hours", "3 Hours", "8 Hours"));

        // Slot 12
        date.addAll(Arrays.asList("25-Mar-2023", "26-Mar-2023", "27-Mar-2023", "28-Mar-2023", "29-Mar-2023"));
        day.addAll(Arrays.asList("SAT", "SUN", "MON", "TUE", "WED"));
        time.addAll(Arrays.asList("08:00 to 16:00", "08:00 to 16:00", "08:00 to 16:00", "08:00 to 16:00", "08:00 to 16:00"));
        hours.addAll(Arrays.asList("3 Hours", "8 Hours", "8 Hours", "3 Hours", "8 Hours"));

        // Slot 13
        date.addAll(Arrays.asList("01-Apr-2023", "02-Apr-2023", "03-Apr-2023", "04-Apr-2023", "05-Apr-2023"));
        day.addAll(Arrays.asList("SAT", "SUN", "MON", "TUE", "WED"));
        time.addAll(Arrays.asList("08:00 to 16:00", "08:00 to 16:00", "08:00 to 16:00", "08:00 to 16:00", "08:00 to 16:00"));
        hours.addAll(Arrays.asList("3 Hours", "8 Hours", "8 Hours", "3 Hours", "8 Hours"));

        // Slot 14
        date.addAll(Arrays.asList("08-Apr-2023", "09-Apr-2023", "10-Apr-2023", "11-Apr-2023", "12-Apr-2023"));
        day.addAll(Arrays.asList("SAT", "SUN", "MON", "TUE", "WED"));
        time.addAll(Arrays.asList("08:00 to 16:00", "08:00 to 16:00", "08:00 to 16:00", "08:00 to 16:00", "08:00 to 16:00"));
        hours.addAll(Arrays.asList("3 Hours", "8 Hours", "3 Hours", "3 Hours", "8 Hours"));

        // Slot 15
        date.addAll(Arrays.asList("15-Apr-2023", "16-Apr-2023", "17-Apr-2023", "18-Apr-2023", "19-Apr-2023"));
        day.addAll(Arrays.asList("SAT", "SUN", "MON", "TUE", "WED"));
        time.addAll(Arrays.asList("08:00 to 16:00", "08:00 to 16:00", "08:00 to 16:00", "08:00 to 16:00", "08:00 to 16:00"));
        hours.addAll(Arrays.asList("3 Hours", "8 Hours", "8 Hours", "3 Hours", "8 Hours"));

        // Slot 16
        date.addAll(Arrays.asList("22-Apr-2023", "23-Apr-2023", "24-Apr-2023", "25-Apr-2023", "26-Apr-2023"));
        day.addAll(Arrays.asList("SAT", "SUN", "MON", "TUE", "WED"));
        time.addAll(Arrays.asList("08:00 to 15:00", "08:00 to 16:00", "08:00 to 16:00", "08:00 to 16:00", "08:00 to 16:00"));
        hours.addAll(Arrays.asList("7 Hours", "8 Hours", "8 Hours", "3 Hours", "8 Hours"));

        // Slot 17
        date.addAll(Arrays.asList("29-Apr-2023", "30-Apr-2023", "01-May-2023", "02-May-2023", "03-May-2023"));
        day.addAll(Arrays.asList("SAT", "SUN", "MON", "TUE", "WED"));
        time.addAll(Arrays.asList("08:00 to 16:00", "08:00 to 16:00", "08:00 to 16:00", "08:00 to 16:00", "08:00 to 16:00"));
        hours.addAll(Arrays.asList("3 Hours", "8 Hours", "8 Hours", "3 Hours", "8 Hours"));

        // Slot 18
        date.addAll(Arrays.asList("06-May-2023", "07-May-2023", "08-May-2023", "09-May-2023", "10-May-2023"));
        day.addAll(Arrays.asList("SAT", "SUN", "MON", "TUE", "WED"));
        time.addAll(Arrays.asList("08:00 to 16:00", "08:00 to 16:00", "08:00 to 16:00", "08:00 to 16:00", "08:00 to 16:00"));
        hours.addAll(Arrays.asList("3 Hours", "8 Hours", "8 Hours", "3 Hours", "8 Hours"));

        // Slot 19
        date.addAll(Arrays.asList("13-May-2023", "14-May-2023", "15-May-2023", "16-May-2023", "17-May-2023", "18-May-2023"));
        day.addAll(Arrays.asList("SAT", "SUN", "MON", "TUE", "WED", "THU"));
        time.addAll(Arrays.asList("08:00 to 16:00", "08:00 to 16:00", "08:00 to 16:00", "08:00 to 16:00", "08:00 to 16:00", "08:00 to 16:00"));
        hours.addAll(Arrays.asList("3 Hours", "8 Hours", "8 Hours", "3 Hours", "8 Hours", "7 Hours"));

        // Slot 20
        date.addAll(Arrays.asList("20-May-2023", "21-May-2023", "23-May-2023", "24-May-2023"));
        day.addAll(Arrays.asList("SAT", "SUN", "TUE", "WED"));
        time.addAll(Arrays.asList("08:00 to 16:00", "08:00 to 16:00", "08:00 to 16:00", "08:00 to 16:00"));
        hours.addAll(Arrays.asList("3 Hours", "8 Hours", "3 Hours", "8 Hours"));

        // Slot 21
        date.addAll(Arrays.asList("27-May-2023", "28-May-2023", "29-May-2023", "30-May-2023", "31-May-2023"));
        day.addAll(Arrays.asList("SAT", "SUN", "MON", "TUE", "WED"));
        time.addAll(Arrays.asList("08:00 to 16:00", "08:00 to 16:00", "08:00 to 16:00", "08:00 to 16:00", "08:00 to 16:00"));
        hours.addAll(Arrays.asList("3 Hours", "8 Hours", "8 Hours", "3 Hours", "8 Hours"));

        // Slot 22
        date.addAll(Arrays.asList("03-Jun-2023", "04-Jun-2023", "05-Jun-2023", "06-Jun-2023", "07-Jun-2023"));
        day.addAll(Arrays.asList("SAT", "SUN", "MON", "TUE", "WED"));
        time.addAll(Arrays.asList("08:00 to 16:00", "08:00 to 16:00", "08:00 to 16:00", "08:00 to 16:00", "08:00 to 16:00"));
        hours.addAll(Arrays.asList("3 Hours", "8 Hours", "8 Hours", "3 Hours", "8 Hours"));

        recyclerViewAdapter = new RecyclerViewAdapter(this,date,day,time,hours);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.setAdapter(recyclerViewAdapter);

        //Salary
        Calendar calendar = Calendar.getInstance();
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

        // Determine the day name and calculate the salary
        double salary = calculateSalary(dayOfWeek);

        lastweeksal = (TextView) findViewById(R.id.lastweekPaymentAmount);
        thisweeksal = (TextView) findViewById(R.id.thisweekPaymentAmount);
        byweeksal = (TextView) findViewById(R.id.biweeklyPaymentAmount);

        byweeksal.setText("$ 644.00");
        lastweeksal.setText("$ 322.00");
        thisweeksal.setText("$ "+salary);

        //Hours heading
        textViewCompletedHours = (TextView) findViewById(R.id.completed_hours_heading);
        textViewtotalhours = (TextView) findViewById(R.id.total_hours_heading);
        textViewPendingHours = (TextView) findViewById(R.id.pending_hours_heading);

        textViewtotalhours.setText("30 Hours");
        double heading_hours = calculateHours(dayOfWeek);
        double completed_hours =0;
        completed_hours= heading_hours + completed_hours;
        textViewCompletedHours.setText(heading_hours + " Hours");
        double pending_hours = 30-completed_hours;
        textViewPendingHours.setText(pending_hours+" Hours");

    }

    private double calculateSalary(int dayOfWeek) {
        switch (dayOfWeek) {
            case Calendar.MONDAY:
                return 48.30;
            case Calendar.TUESDAY: case Calendar.WEDNESDAY:
                return 128.81;
            case Calendar.THURSDAY:
                return 17.10;
            case Calendar.FRIDAY:
                return 80;
            default:
                return 0;
        }
    }

    private double calculateHours(int dayOfWeek) {
        switch (dayOfWeek) {
            case Calendar.MONDAY: case Calendar.THURSDAY:
                return 3.0;
            case Calendar.TUESDAY: case Calendar.WEDNESDAY: case Calendar.FRIDAY:
                return 8.0;
            default:
                return 0;
        }
    }
}