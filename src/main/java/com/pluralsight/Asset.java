package com.pluralsight;

import java.math.BigDecimal;

public class Asset {
    private BigDecimal originalCost;
    private String description;
    private String dateAcquired;

    // Constructor
    public Asset(BigDecimal originaCost, String description, String dateAcquired) {
        this.originalCost = originalCost;
        this.description = description;
        this.dateAcquired = dateAcquired;
    }

    public Asset() {
    }

    public Asset(String originalCost, String description, int dateAcquired) {
    }

    public Asset(BigDecimal originalCost, String description, int dateAcquired) {
    }

    // Getters
    public BigDecimal getOriginalCost() {
        return originalCost;
    }

    public String getDescription() {
        return description;
    }

    public String getDateAcquired() {
        return dateAcquired;
    }

    // Setter
    public void setOriginalCost(BigDecimal originalCost) {
        this.originalCost = originalCost;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDateAcquired(String dateAcquired) {
        this.dateAcquired = dateAcquired;
    }

    public BigDecimal getValue() {
        return originalCost;
    }

}

