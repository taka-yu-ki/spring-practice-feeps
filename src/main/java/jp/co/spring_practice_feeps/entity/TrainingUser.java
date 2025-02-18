package jp.co.spring_practice_feeps.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "training_user")

@NamedQuery(name = "findByName", query = "SELECT u FROM TrainingUser u WHERE u.userId LIKE :keyword") // Lesson04_01

public class TrainingUser {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_training_user_gen")
	@SequenceGenerator(name = "seq_training_user_gen", sequenceName = "seq_training_user", allocationSize = 1)
	private long id;

//	@Column
	private String userId;

//	@Column
	private String password;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
