// package com.example.demo.controller;

// import com.example.demo.entity.PenaltyAction;
// import com.example.demo.service.PenaltyActionService;
// import io.swagger.v3.oas.annotations.tags.Tag;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;

// import java.util.List;

// @RestController
// @RequestMapping("/api/penalties")
// @Tag(name = "Penalty Actions")
// public class PenaltyActionController {

//     private final PenaltyActionService service;

//     public PenaltyActionController(PenaltyActionService service) {
//         this.service = service;
//     }

//     @PostMapping
//     public PenaltyAction addPenalty(@RequestBody PenaltyAction penalty) {
//         return service.addPenalty(penalty);
//     }

//     @GetMapping("/case/{caseId}")
//     public List<PenaltyAction> getPenaltiesByCase(@PathVariable Long caseId) {
//         return service.getPenaltiesByCase(caseId);
//     }

//     @GetMapping("/{id}")
//     public PenaltyAction getPenaltyById(@PathVariable Long id) {
//         return service.getPenaltyById(id);
//     }

//     @GetMapping
//     public List<PenaltyAction> getAllPenalties() {
//         return service.getAllPenalties();
//     }
// }
