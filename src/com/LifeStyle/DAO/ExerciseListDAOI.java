package com.LifeStyle.DAO;

import java.util.List;

import com.LifeStyle.Entitymodels.ExerciseList;

public interface ExerciseListDAOI {

	boolean insertExercise(ExerciseList eItems);

	List<ExerciseList> getByExerciseName(String exercisename);

	ExerciseList findExercise(int id);

}
