package com.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
import java.util.Map;

public class BeeCostResponse {

    private String status;
    private Map<String, List<BeeCostProduct>> data;

    public BeeCostResponse() {
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Map<String, List<BeeCostProduct>> getData() {
        return data;
    }

    public void setData(Map<String, List<BeeCostProduct>> data) {
        this.data = data;
    }
}
