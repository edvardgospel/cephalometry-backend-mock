package com.ortho.cephalometry.controller;

import com.ortho.cephalometry.domain.CephalometriesResponse;
import com.ortho.cephalometry.domain.CephalometryRequest;
import com.ortho.cephalometry.domain.CephalometryResponse;
import com.ortho.cephalometry.service.CephalometryService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor
public class CephalometryController {

    private final CephalometryService cephalometryService;

    @RequestMapping(value = "/cephalometry", method = RequestMethod.GET)
    public ResponseEntity<CephalometriesResponse> getCephalometries() {
        log.info("---getCephalometries() called---");
        return ResponseEntity.ok(cephalometryService.getCephalometries());
    }

    @PostMapping("/cephalometry")
    public ResponseEntity<CephalometryResponse> postCephalometry(@RequestBody CephalometryRequest cephalometryRequest) {
        log.info("---postCephalometries() called with {}---", cephalometryRequest);
        return ResponseEntity.ok(cephalometryService.postCephalometries());
    }

}
