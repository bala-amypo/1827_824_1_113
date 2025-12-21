@RestController
@RequestMapping("/api/penalties")
@Tag(name = "Penalty Action Controller", description = "Penalty APIs")
public class PenaltyActionController {

    private final PenaltyActionService service;

    public PenaltyActionController(PenaltyActionService service) {
        this.service = service;
    }

    @PostMapping
    public PenaltyAction addPenalty(@RequestBody PenaltyAction penalty) {
        return service.addPenalty(penalty);
    }

    @GetMapping("/case/{caseId}")
    public List<PenaltyAction> getPenaltiesByCase(@PathVariable Long caseId) {
        return service.getPenaltiesByCase(caseId);
    }

    @GetMapping("/{id}")
    public PenaltyAction getPenaltyById(@PathVariable Long id) {
        return service.getPenaltyById(id);
    }

    @GetMapping
    public List<PenaltyAction> getAllPenalties() {
        return service.getAllPenalties();
    }
}
