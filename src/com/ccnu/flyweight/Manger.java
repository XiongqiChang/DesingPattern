package com.ccnu.flyweight;

public class Manger implements Employee {
    @Override
    public void report() {
        System.out.println(reportContext);
    }
    private  String department;
    private String reportContext;

    public void setReportContext(String reportContext){
        this.reportContext = reportContext;
    }

    public Manger(String department){
        this.department = department;
    }
}
