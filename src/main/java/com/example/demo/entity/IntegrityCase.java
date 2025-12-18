

public class IntegrityCase {

    private Long id;                     
    private String courseCode;
    private String studentProfile;
    private String instructorName;
    private String description;
    private String status;               
    private LocalDate incidentDate;
    private LocalDateTime createdAt;

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public StudentProfile getStudentProfile() {
        return studentProfile;
    }

    public void setStudentProfile(StudentProfile studentProfile) {
        this.studentProfile = studentProfile;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getIncidentDate() {
        return incidentDate;
    }

    public void setIncidentDate(LocalDate incidentDate) {
        this.incidentDate = incidentDate;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
    public IntegrityCase(Long id,)
    
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