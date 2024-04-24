package com.quiz.assessment.repository;

import com.quiz.assessment.entity.Assessment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;


public interface AssessmentRepository extends JpaRepository<Assessment,Long> {


    Optional<Assessment> findAssessmentByAssessmentName(String assessmentName);

    @Query("SELECT a FROM Assessment a WHERE a.startTime <= :currentTime AND a.endTime >= :currentTime AND a.status = true")
    List<Assessment> findActiveAssessments(@Param("currentTime") LocalDateTime currentTime);

    @Query("SELECT a FROM Assessment a WHERE a.startTime > :currentTime AND a.status = true")
    List<Assessment> findUpcomingAssessments(@Param("currentTime") LocalDateTime currentTime);

    @Query("SELECT a FROM Assessment a WHERE a.startTime < :currentTime OR a.status = false")
    List<Assessment> findCompletedAssessments(@Param("currentTime") LocalDateTime currentTime);


}
