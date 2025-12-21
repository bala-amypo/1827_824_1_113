@RestController
@RequestMapping("/api/repeat-offenders")
@Tag(name = "Repeat Offender Controller", description = "Repeat offender APIs")
public class RepeatOffenderRecordController {

    private final RepeatOffenderRecordService service;

    public RepeatOffenderRecordController(RepeatOffenderRecordService service) {
        this.service = service;
    }

    @PostMapping("/refresh/{studentId}")
    public void refresh(@PathVariable Long studentId) {
        service.refreshRepeatOffenderData(studentId);
    }

    @GetMapping("/student/{studentId}")
    public RepeatOffenderRecord getRecord(@PathVariable Long studentId) {
        return service.getRecordByStudent(studentId);
    }

    @GetMapping
    public List<RepeatOffenderRecord> getAll() {
        return service.getAllRepeatOffenders();
    }
}
