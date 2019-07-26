package com.hakuna.matata.navigationprioritizer.service;

import com.hakuna.matata.navigationprioritizer.util.TrafficMgmt;
import org.springframework.stereotype.Service;

@Service
public class TrafficManagementService {
    private static TrafficMgmt list = new TrafficMgmt();
    static{
        list.getTypes();
    }
    public TrafficMgmt getAllSignals() {
        return list;
    }
}
