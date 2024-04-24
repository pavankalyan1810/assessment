package com.quiz.assessment.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
public class Assessment {

    public Assessment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Assessment(Long id, String assessmentName, String targetBatch, LocalDateTime startTime,
			LocalDateTime endTime, int durationMinutes, int numberOfQuestions, int passingPercentage, Boolean isActive,
			Boolean status, int numberOfVoilation) {
		super();
		this.id = id;
		this.assessmentName = assessmentName;
		this.targetBatch = targetBatch;
		this.startTime = startTime;
		this.endTime = endTime;
		this.durationMinutes = durationMinutes;
		this.numberOfQuestions = numberOfQuestions;
		this.passingPercentage = passingPercentage;
		this.isActive = isActive;
		this.status = status;
		this.numberOfVoilation = numberOfVoilation;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAssessmentName() {
		return assessmentName;
	}

	public void setAssessmentName(String assessmentName) {
		this.assessmentName = assessmentName;
	}

	public String getTargetBatch() {
		return targetBatch;
	}

	public void setTargetBatch(String targetBatch) {
		this.targetBatch = targetBatch;
	}

	public LocalDateTime getStartTime() {
		return startTime;
	}

	public void setStartTime(LocalDateTime startTime) {
		this.startTime = startTime;
	}

	public LocalDateTime getEndTime() {
		return endTime;
	}

	public void setEndTime(LocalDateTime endTime) {
		this.endTime = endTime;
	}

	public int getDurationMinutes() {
		return durationMinutes;
	}

	public void setDurationMinutes(int durationMinutes) {
		this.durationMinutes = durationMinutes;
	}

	public int getNumberOfQuestions() {
		return numberOfQuestions;
	}

	public void setNumberOfQuestions(int numberOfQuestions) {
		this.numberOfQuestions = numberOfQuestions;
	}

	public int getPassingPercentage() {
		return passingPercentage;
	}

	public void setPassingPercentage(int passingPercentage) {
		this.passingPercentage = passingPercentage;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public int getNumberOfVoilation() {
		return numberOfVoilation;
	}

	public void setNumberOfVoilation(int numberOfVoilation) {
		this.numberOfVoilation = numberOfVoilation;
	}

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="assessment_name",unique = true)
    private String assessmentName;

    @Column(name = "target_batch")
    private String targetBatch;

    @Column(name = "start_time")
    private LocalDateTime startTime;

    @Column(name = "end_time")
    private LocalDateTime endTime;

    @Column(name = "duration_minutes")
    private int durationMinutes;

    @Column(name = "number_of_questions")
    private int numberOfQuestions;

    @Column(name = "passing_percentage")
    private int passingPercentage;

    @Column(name = "is_active", columnDefinition = "boolean default true")
    private Boolean isActive;

    @Column(name = "status", columnDefinition = "boolean default true")
    private Boolean status;

    @Column(name = "number_of_voilation")
    private int numberOfVoilation;

//    @Override
//    public String toString() {
//        return "Assessment{" +
//                "id=" + id +
//                ", assessmentName='" + assessmentName + '\'' +
//                ", targetBatch='" + targetBatch + '\'' +
//                ", startTime=" + startTime +
//                ", endTime=" + endTime +
//                ", durationMinutes=" + durationMinutes +
//                ", numberOfQuestions=" + numberOfQuestions +
//                ", passingPercentage=" + passingPercentage +
//                ", isActive=" + isActive +
//                ", status=" + status +
//                '}';
//    }
}
