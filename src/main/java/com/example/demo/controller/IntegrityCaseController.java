@RestController
@RequestMapping("/api/cases")
@Tag(name = "Integrity Case Controller", description = "Integrity case APIs")
public class IntegrityCaseController {

    private final IntegrityCaseService service;

    public IntegrityCaseController(IntegrityCaseService service) {
        this.service = service;
    }

    @PostMapping
    public IntegrityCase createCase(@RequestBody IntegrityCase integrityCase) {
        return service.createCase(integrityCase);
    }

    @PutMapping("/{id}/status")
    public IntegrityCase updateStatus(
            @PathVariable Long id,
            @RequestParam String status) {
        return service.updateCaseStatus(id, status);
    }

    @GetMapping("/student/{studentId}")
    public List<IntegrityCase> getCasesByStudent(@PathVariable Long studentId) {
        return service.getCasesByStudent(studentId);
    }

    @GetMapping("/{id}")
    public IntegrityCase getCaseById(@PathVariable Long id) {
        return service.getCaseById(id);
    }

    @GetMapping
    public List<IntegrityCase> getAllCases() {
        return service.getAllCases();
    }
}
