package com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.Member;

public class Financial_Aid {
    private String name,requestid,amount,reason;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRequestid() {
        return requestid;
    }

    public void setRequestid(String requestid) {
        this.requestid = requestid;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Financial_Aid(String name, String requestid, String amount, String reason) {
        this.name = name;
        this.requestid = requestid;
        this.amount = amount;
        this.reason = reason;
    }

    @Override
    public String toString() {
        return "Financial_Aid{" +
                "name='" + name + '\'' +
                ", requestid='" + requestid + '\'' +
                ", amount='" + amount + '\'' +
                ", reason='" + reason + '\'' +
                '}';
    }
}
