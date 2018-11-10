package com.mms.db;

import javax.persistence.Persistence;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author afsar
 * @since 11/11/2018
 */
public abstract class CreditInfo extends Persistence {
    private long id;
    private Date entryDate;
    private BigDecimal amount;
    private String label;
}
