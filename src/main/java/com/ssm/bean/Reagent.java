package com.ssm.bean;

public class Reagent {
    private Integer reagentId;

    private String reagentType;

    public Integer getReagentId() {
        return reagentId;
    }

    public void setReagentId(Integer reagentId) {
        this.reagentId = reagentId;
    }

    public String getReagentType() {
        return reagentType;
    }

    public void setReagentType(String reagentType) {
        this.reagentType = reagentType == null ? null : reagentType.trim();
    }
}