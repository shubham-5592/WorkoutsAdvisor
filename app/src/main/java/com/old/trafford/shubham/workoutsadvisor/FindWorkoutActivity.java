package com.old.trafford.shubham.workoutsadvisor;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

public class FindWorkoutActivity extends Activity {

    private WorkoutExpert expert = new WorkoutExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_workout);

    }

    public void onClickFindWorkout(View view){

        TextView workouts = (TextView) findViewById(R.id.workout);

        Spinner workoutType = (Spinner) findViewById(R.id.workoutType);

        String bodyPart = String.valueOf(workoutType.getSelectedItem());

        //workouts.setText(bodyPart);

        List<String> listWorkout = expert.listWorkouts(bodyPart);

        StringBuilder workoutFormatted = new StringBuilder();

        for (String excercise: listWorkout){

            workoutFormatted.append(excercise).append('\n');

        }
        workouts.setText(workoutFormatted);
    }


}
