package vn.edu.assigment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CourseActivity extends AppCompatActivity {
    Button btnCourse, btnSubCourse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course);
        innit();
        onClick();
    }

    private void innit() {
        btnCourse = findViewById(R.id.btnCourse);
        btnSubCourse = findViewById(R.id.btnSubCourse);
    }

    private void onClick() {
        btnCourse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CourseActivity.this, InforCourseActivity.class));
            }
        });

        btnSubCourse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CourseActivity.this, SubCourseActivity.class));
            }
        });

    }
}
