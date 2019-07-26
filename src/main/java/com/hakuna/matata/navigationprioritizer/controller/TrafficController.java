package com.hakuna.matata.navigationprioritizer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.hakuna.matata.navigationprioritizer.service.TrafficManagementService;
import com.hakuna.matata.navigationprioritizer.util.TrafficMgmt;

@RestController
@RequestMapping(path = "/api")
public class TrafficController {
    @Autowired
    private TrafficManagementService trafficManagementService;

    @GetMapping(path = "/signal")
    public TrafficMgmt getSignals() {
        return trafficManagementService.getAllSignals();
    }
}
