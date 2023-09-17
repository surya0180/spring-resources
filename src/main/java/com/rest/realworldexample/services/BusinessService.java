package com.rest.realworldexample.services;

import com.rest.realworldexample.models.DataService;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class BusinessService {
    private final DataService dataService;

    public BusinessService(DataService dataService) {
        super();
        this.dataService = dataService;
    }
    public int findMax() {
        return Arrays.stream(dataService.retrieveData()).max().orElse(0);
    }
}
