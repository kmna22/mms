package com.mms.db;

/**
 * @author afsar
 * @since 11-November-2018
 */
public enum CreditLabel {
    DONATION("Donation"), MONTHLY_DONATION("Monthly Donation"),
    FRIDAY_COLLECTION("Friday Collection"), MONTHLY_NEIGHBOURHOOD_COLLECTION("Monthly Neighbourhood Collection");

    private String name;

    CreditLabel(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
