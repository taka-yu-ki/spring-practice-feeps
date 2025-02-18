package jp.co.spring_practice_feeps.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import jp.co.spring_practice_feeps.entity.TrainingUser;

public interface TrainingUserRepository extends JpaRepository<TrainingUser, Long> {
	TrainingUser findByUserIdAndPassword(String userId, String password);

	// lesson04_02
	@Query("SELECT u FROM TrainingUser u WHERE u.userId LIKE :keyword")
	List<TrainingUser> findByName(@Param("keyword") String keyword);

	// lesson_04_03
	@Query("SELECT COUNT(u) FROM TrainingUser u WHERE u.userId LIKE :keyword")
	int countByName(@Param("keyword") String keyword);
}