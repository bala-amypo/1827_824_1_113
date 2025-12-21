@RestController
@RequestMapping("/api/evidence")
@Tag(name = "Evidence Record Controller", description = "Evidence APIs")
public class EvidenceRecordController {

    private final EvidenceRecordService service;

    public EvidenceRecordController(EvidenceRecordService service) {
        this.service = service;
    }

    @PostMapping
    public EvidenceRecord submitEvidence(@RequestBody EvidenceRecord evidence) {
        return service.submitEvidence(evidence);
    }

    @GetMapping("/case/{caseId}")
    public List<EvidenceRecord> getEvidenceByCase(@PathVariable Long caseId) {
        return service.getEvidenceByCase(caseId);
    }

    @GetMapping("/{id}")
    public EvidenceRecord getEvidenceById(@PathVariable Long id) {
        return service.getEvidenceById(id);
    }

    @GetMapping
    public List<EvidenceRecord> getAllEvidence() {
        return service.getAllEvidence();
    }
}
