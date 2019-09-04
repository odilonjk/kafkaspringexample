package com.krogercode.kafkaSpringExample.dtos;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;

import java.math.BigInteger;
import java.time.LocalDateTime;

public class TransactionDTO {

    @JsonProperty("TransactionId")
    private String transactionId;

    @JsonProperty("Value")
    private double value;

    @JsonProperty("PersonId")
    private BigInteger personId;

    @JsonProperty("CreationDate")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ssZ")
    private LocalDateTime creationDate;

    @Override
    public String toString() {
        return "TransactionDTO{" +
                "transactionId='" + transactionId + '\'' +
                ", value=" + value +
                ", userId=" + personId +
                ", creationDate=" + creationDate +
                '}';
    }

    public TransactionDTO(String transactionId, double value, BigInteger personId, LocalDateTime creationDate) {
        this.transactionId = transactionId;
        this.value = value;
        this.personId = personId;
        this.creationDate = creationDate;
    }

    public TransactionDTO() {
    }

    public String getTransactionId() {
        return transactionId;
    }

    public double getValue() {
        return value;
    }

    public BigInteger getPersonId() {
        return personId;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

}
