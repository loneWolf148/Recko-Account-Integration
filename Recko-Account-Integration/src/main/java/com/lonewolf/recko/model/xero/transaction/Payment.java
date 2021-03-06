package com.lonewolf.recko.model.xero.transaction;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@Setter(AccessLevel.NONE)
public class Payment {

    @JsonProperty("JournalLineID")
    private String paymentId;

    @JsonProperty("AccountID")
    private String accountId;

    @JsonProperty("AccountName")
    private String accountHolder;

    @JsonProperty("GrossAmount")
    private double amount;
}
