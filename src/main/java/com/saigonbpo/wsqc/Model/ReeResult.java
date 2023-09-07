package com.saigonbpo.wsqc.Model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ReeResult {
    private Long id;

    private String strMd5;

    @JsonProperty("Dice")
    private String dice;

    @JsonProperty("Total")
    private String totalDice;

    @JsonProperty("Money")
    private String moneyBet;

    @JsonProperty("Choose")
    private String chooseBet;

    @JsonProperty("Result")
    private String resultBet;

    @JsonProperty("Final")
    private String result;

    @JsonProperty("Money Player")
    private String moneyPlayer;

    @JsonProperty("Note")
    private String note;

    @JsonProperty("Created Date")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm:ss", timezone = "GMT+7")
    private Date insertDate;

    @JsonIgnore
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @JsonIgnore
    public String getStrMd5() {
        return strMd5;
    }

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

    public String getMoneyBet() {
        return moneyBet;
    }

    public void setMoneyBet(String moneyBet) {
        this.moneyBet = moneyBet;
    }

    public String getChooseBet() {
        return chooseBet;
    }

    public void setChooseBet(String chooseBet) {
        this.chooseBet = chooseBet;
    }

    public String getResultBet() {
        return resultBet;
    }

    public void setResultBet(String resultBet) {
        this.resultBet = resultBet;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getMoneyPlayer() {
        return moneyPlayer;
    }

    public void setMoneyPlayer(String moneyPlayer) {
        this.moneyPlayer = moneyPlayer;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Date getInsertDate() {
        return insertDate;
    }

    public void setInsertDate(Date insertDate) {
        this.insertDate = insertDate;
    }
}