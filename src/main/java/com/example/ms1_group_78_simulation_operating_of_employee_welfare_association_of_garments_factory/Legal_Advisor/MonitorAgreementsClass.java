package com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory.Legal_Advisor;

public class MonitorAgreementsClass {
    private String labor,trade,compliance;

    public MonitorAgreementsClass(String labor, String trade, String compliance) {
        this.labor = labor;
        this.trade = trade;
        this.compliance = compliance;
    }

    public String getLabor() {
        return labor;
    }

    public void setLabor(String labor) {
        this.labor = labor;
    }

    public String getTrade() {
        return trade;
    }

    public void setTrade(String trade) {
        this.trade = trade;
    }

    public String getCompliance() {
        return compliance;
    }

    public void setCompliance(String compliance) {
        this.compliance = compliance;
    }

    @Override
    public String toString() {
        return "MonitorAgreementsClass{" +
                "labor='" + labor + '\'' +
                ", trade='" + trade + '\'' +
                ", compliance='" + compliance + '\'' +
                '}';
    }
}
