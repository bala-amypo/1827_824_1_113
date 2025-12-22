// package com.example.demo.controller;

// import com.example.demo.entity.IntegrityCase;
// import com.example.demo.service.IntegrityCaseService;
// import io.swagger.v3.oas.annotations.tags.Tag;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.PutMapping;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestParam;
// import org.springframework.web.bind.annotation.RestController;

// import java.util.List;

// @RestController
// @RequestMapping("/api/cases")
// @Tag(name = "Integrity Cases")
// public class IntegrityCaseController {

//     private final IntegrityCaseService service;

//     public IntegrityCaseController(IntegrityCaseService service) {
//         this.service = service;
//     }

//     @PostMapping
//     public IntegrityCase createCase(@RequestBody IntegrityCase integrityCase) {
//         return service.createCase(integrityCase);
//     }

//     @PutMapping("/{id}/status")
//     public IntegrityCase updateStatus(
//             @PathVariable Long id,
//             @RequestParam String status) {
//         return service.updateCaseStatus(id, status);
//     }

//     @GetMapping("/student/{studentId}")
//     public List<IntegrityCase> getCasesByStudent(@PathVariable Long studentId) {
//         return service.getCasesByStudent(studentId);
//     }

//     @GetMapping("/{id}")
//     public IntegrityCase getCaseById(@PathVariable Long id) {
//         return service.getCaseById(id);
//     }

//     @GetMapping
//     public List<IntegrityCase> getAllCases() {
//         return service.getAllCases();
//     }
// }
