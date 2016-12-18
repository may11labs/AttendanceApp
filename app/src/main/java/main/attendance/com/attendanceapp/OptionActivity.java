package main.attendance.com.attendanceapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OptionActivity extends Activity
{
    Button btnAttendance;
    Button btnAcademics;
    Button btnReport;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option);

        btnAttendance = (Button) findViewById(R.id.btnAttendance);
        btnAcademics = (Button) findViewById(R.id.btnAcademics);
        btnReport = (Button) findViewById(R.id.btnReport);

        btnAttendance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(OptionActivity.this, AttendanceActivity.class));
            }
        });

        btnReport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(OptionActivity.this, AcademicsActivity.class));
            }
        });

        btnAcademics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(OptionActivity.this, ReportActivity.class));
            }
        });

    }
}
