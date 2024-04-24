package com.quiz.assessment.Controller;

import com.quiz.assessment.EceptionHandling.AssessmentNotFoundException;
import com.quiz.assessment.entity.Assessment;
import com.quiz.assessment.service.AssessmentServiceimp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/assessements")
public class AssessmentController {

    @Autowired
    private AssessmentServiceimp assessmentService;

    //Create a new Assesssment
    @PostMapping("/add")
    public Assessment createNewAssessment(@RequestBody Assessment assessment){
        return assessmentService.createNewAssessment(assessment);
    }


    //List of Assessments
    @GetMapping("/all")
    public List<Assessment> getAllAssessments(){
        return assessmentService.getallAsessments();
    }

    //List of Assessments that are active
    @GetMapping("/Active")
    public List<Assessment> getAllActiveAssessments(){
        return assessmentService.getActiveAndUpcomingAssessments();
    }

    //List of Assessments that are completetd

    @GetMapping("/completed")
    public List<Assessment> getAllCompletedAssessmensts(){
        return assessmentService.getAllCompletedAssessmensts();
    }

    @GetMapping("/{assessmentName}")
    public Optional<Assessment> GetAssessmentByName(@PathVariable String assessmentName) throws AssessmentNotFoundException{
        return assessmentService.GetAssessmentByNmae(assessmentName);
    }

    //Updating Assessment Details
    @PutMapping("/update/{Id}")
    public Assessment updateAssessment(@PathVariable Long Id, @RequestBody Assessment assessment) throws AssessmentNotFoundException {
        return assessmentService.updateAssessment(Id,assessment);
    }



    @DeleteMapping("/delete/{Id}")

    public String deleteAssessment(@PathVariable Long Id){
        assessmentService.deleteassessment(Id);
        return "Successfully deleted the Assessment";
    }

    @PutMapping("/deactivate/{Id}")
    public String deactivateAssessment(@PathVariable Long Id) throws AssessmentNotFoundException {
        assessmentService.deactivateAssessment(Id);
        return "Successfully deactivated the Assessment";
    }







}
