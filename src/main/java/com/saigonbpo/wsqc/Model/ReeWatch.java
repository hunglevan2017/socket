package com.saigonbpo.wsqc.Model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ReeWatch {
    private Long id;

    private String strMd5;

    @JsonProperty("Dice")
    private String dice;

    @JsonProperty("Total")
    private String totalDice;

    @JsonProperty("Result")
    private String resultBet;


    @JsonProperty("Trend")
    private String trend;
    
    @JsonProperty("Time")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm:ss", timezone = "GMT+7")
    private Date insertDate;

    @JsonIgnore
    private String resultBetBin;


    @JsonIgnore
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStrMd5() {
        return strMd5;
    }

    @JsonIgnore
    public void setStrMd5(String strMd5) {
        this.strMd5 = strMd5;
    }

    public String getDice() {
        return dice;
    }

    public void setDice(String dice) {
        this.dice = dice;
    }

    public String getTotalDice() {
        return totalDice;
    }

    public void setTotalDice(String totalDice) {
        this.totalDice = totalDice;
    }

    public String getResultBet() {
        return resultBet;
    }

    public void setResultBet(String resultBet) {
        this.resultBet = resultBet;
    }

    public Date getInsertDate() {
        return insertDate;
    }

    public void setInsertDate(Date insertDate) {
        this.insertDate = insertDate;
    }

    public String getResultBetBin() {
        return resultBetBin;
    }

    public void setResultBetBin(String resultBetBin) {
        this.resultBetBin = resultBetBin;
    }

    public String getTrend() {
        return trend;
    }

    public void setTrend(String trend) {
        this.trend = trend;
    }
}