package com.LifeStyle.Entitymodels;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table
@NamedQueries ({
@NamedQuery (query="SELECT e FROM ExerciseList e", name="queryExerciseAll"),
@NamedQuery (query="SELECT e FROM ExerciseList e WHERE e.exercise = :pExercise", name="queryByExercise")
})

public class ExerciseList {

	
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
		
		@Basic
		@Column
		private String exercise;
		
		@Basic
		@Column
		private double metValue;
		
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getExercise() {
			return exercise;
		}
		public void setExercise(String exercise) {
			this.exercise = exercise;
		}
		public double getMetValue() {
			return metValue;
		}
		public void setMetValue(double metValue) {
			this.metValue = metValue;
		}
		public ExerciseList() {
			super();
			// TODO Auto-generated constructor stub
		}
		public ExerciseList(int id, String exercise, double metValue) {
			super();
			this.id = id;
			this.exercise = exercise;
			this.metValue = metValue;
		}
		
		
		
		
		public ExerciseList(String exercise, double metValue) {
			super();
			this.exercise = exercise;
			this.metValue = metValue;
		}
		@Override
		public String toString() {
			return "Exercise_List [id=" + id + ", exercise=" + exercise + ", metValue=" + metValue + "]";
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((exercise == null) ? 0 : exercise.hashCode());
			result = prime * result + id;
			long temp;
			temp = Double.doubleToLongBits(metValue);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			ExerciseList other = (ExerciseList) obj;
			if (exercise == null) {
				if (other.exercise != null)
					return false;
			} else if (!exercise.equals(other.exercise))
				return false;
			if (id != other.id)
				return false;
			if (Double.doubleToLongBits(metValue) != Double.doubleToLongBits(other.metValue))
				return false;
			return true;
		}
		
	}

