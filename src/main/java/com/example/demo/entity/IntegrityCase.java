package com.example.demo.entity;


public class IntegrityCase{
    private Long id;
    private string coursecode;
    private string instructorName;
    private string description;
    private Long yearLevel;
    private string status;
    private LocalDate incidentDate;
    private LocalDateTime createdAt;

     public Long getId(){
        return id;
     }
     public void setId(Long id){
        this.id=id;
     }
     public string getCoursecode(){
        return coursecode;
     }
     public void setCoursecode(string coursecode){
        this.coursecode=coursecode;
     }
     public string getInstructorName(){
        return instructorName;
     }
     public void setInstructorname(string instructorName){
        this.instructorname=instuctorName;
     }
      public string getdescription(){
        return description;
     }
     public void setdescription(string descripition){
        this.descripiton=descripition;
     }
     public string getstatus(){
        return status;
     }
      public void setstatus(string status){
        this.status=status;
     }
     public Localdate getincidentDate(){
        return incidentDate;
     }
      public void setincidentDate(string incidentDate){
        this.incidentDate=incidentDate;
     }
     public LocalDateTime getcreatedAt(){
        return createdAt;
     }
     public StudentProfile(Long id,string coursecode,string instructorName,string descripition,string status,string incidentDate,Boolean isRepeatOffender,LocalDateTime createdAt)
{
    this.id=id;
    this.studentId=studentId;
    this.name=name;
    this.email=email;
    this.program=program;
    this.yearLevel=yearLevel;
    this.isRepeatOffender=isRepeatOffender;
    this.createdAt=createdAt;
}
public StudentProfile()
{

}



}