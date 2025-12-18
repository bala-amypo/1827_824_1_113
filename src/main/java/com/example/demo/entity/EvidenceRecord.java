import java.time.LocalDateTime;

public class EvidenceRecord {

    private Long id;                         

    
    private String integrityCase;

    
    private String evidenceType;

    private String content;
    private String submittedBy;
    private LocalDateTime submittedAt;

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIntegrityCase() {
        return integrityCase;
    }

    public void setIntegrityCase(String integrityCase) {
        this.integrityCase = integrityCase;
    }

    public String getEvidenceType() {
        return evidenceType;
    }

    public void setEvidenceType(String evidenceType) {
        this.evidenceType = evidenceType;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSubmittedBy() {
        return submittedBy;
    }

    public void setSubmittedBy(String submittedBy) {
        this.submittedBy = submittedBy;
    }

    public LocalDateTime getSubmittedAt() {
        return submittedAt;
    }

    public void setSubmittedAt(LocalDateTime submittedAt) {
        this.submittedAt = submittedAt;
    }
    public EvidenceRecord()(
                         Long id,
                         String integrityCase,
                         String email,
                         String program,
                         Interger yearLevel,
                         Boolean isRepeatOffender
                         LocalDateTime createdAt) {
                              this.id = id;
                              this.studentId = studentId;
                               this.name = name;
                                this.email = email;
                                 this.program = program;
                                this.yearLevel = yearLevel;
                                 this.isRepeatOffender = isRepeatOffender;
                                  this.createdAt = createdAt;
       
    }
    public EvidenceRecord(){

    }

}