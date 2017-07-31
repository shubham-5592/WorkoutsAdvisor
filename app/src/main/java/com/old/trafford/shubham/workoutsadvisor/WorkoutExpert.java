package com.old.trafford.shubham.workoutsadvisor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shubham on 31/7/17.
 */

public class WorkoutExpert {

    List<String> listWorkouts (String bodyPart)
    {
        List<String> workout = new ArrayList<String>();

        workout.add("Warm up");

        switch (bodyPart)
        {

            case "Legs" :
                workout.add("Lunges");
                workout.add("Squats");
                workout.add("Wide Squats");
                workout.add("machines");
                break;

            case "Chest" :
                workout.add("Push ups");
                workout.add("Dumble Fly");
                workout.add("Inclined Dumble Fly");
                workout.add("Dumble Press");
                workout.add("Inclined Dumble Press");
                break;

            case "Shoulder" :
                workout.add("Dumble Raise");
                workout.add("Machine Raise");
                workout.add("Front Raise");
                workout.add("Shrugs");
                workout.add("Side Raise");
                break;

            case "Abs" :
                workout.add("Crunches");
                workout.add("Plank");
                workout.add("Leg Raise");
                workout.add("Cycle Raise");
                workout.add("Frog");
                break;

            case "Back" :
                workout.add("Back");
                break;

            case "Triceps" :
                workout.add("Triceps");
                break;

            case "Biceps" :
                workout.add("Biceps");
                break;


        }

        return workout;

    }


}
