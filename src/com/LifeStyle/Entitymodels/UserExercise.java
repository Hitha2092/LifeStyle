package com.LifeStyle.Entitymodels;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.LifeStyle.Entitymodels.ExerciseList;
import com.LifeStyle.Entitymodels.UserExercise;
import com.LifeStyle.Entitymodels.UserProfile;
@Entity
@Table
public class UserExercise {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@OneToOne
	private ExerciseList exercise;
	
	@ManyToOne
	private UserProfile profile;
	
	@Basic
	@Column
//	@Temporal(TemporalType.String)
	private String date;
	
	@Basic
	@Column
	private long duration;

	public int getId() {
		return id;
	}

	

	public void setId(int id) {
		this.id = id;
	}



	public ExerciseList getExercise() {
		return exercise;
	}

	public void setExercise(ExerciseList exercise) {
		this.exercise = exercise;
	}

	public UserProfile getProfile() {
		return profile;
	}

	public void setProfile(UserProfile profile) {
		this.profile = profile;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public long getDuration() {
		return duration;
	}

	public void setDuration(long duration) {
		this.duration = duration;
	}
	

	public UserExercise() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public UserExercise(ExerciseList exercise, UserProfile profile, String date, long duration) {
		super();
//		this.id = id;
		this.exercise = exercise;
		this.profile = profile;
		this.date = date;
		this.duration = duration;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + (int) (duration ^ (duration >>> 32));
		result = prime * result + ((exercise == null) ? 0 : exercise.hashCode());
		result = prime * result + id;
		result = prime * result + ((profile == null) ? 0 : profile.hashCode());
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
		UserExercise other = (UserExercise) obj;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (duration != other.duration)
			return false;
		if (exercise == null) {
			if (other.exercise != null)
				return false;
		} else if (!exercise.equals(other.exercise))
			return false;
		if (id != other.id)
			return false;
		if (profile == null) {
			if (other.profile != null)
				return false;
		} else if (!profile.equals(other.profile))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "UserExercise [id=" + id + ", exercise=" + exercise + ", profile=" + profile + ", date=" + date
				+ ", duration=" + duration + "]";
	}
	
	

	

}
