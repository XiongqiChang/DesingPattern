package com.ccnu.flyweight;

import java.util.HashMap;
import java.util.Map;

public class EmployeeFactory {

    private static  final Map<String,Employee> map = new HashMap<>();

    public static  Employee getManager(String departement){
        Manger manger = (Manger) map.get(departement);
        if (manger == null){
            manger = new Manger(departement);
            System.out.println("创建部门经理" + departement);
            String reprotContext = departement + "部门汇报的内容";
            manger.setReportContext(reprotContext);
            System.out.println("创建报告" + reprotContext);
            map.put(departement,manger);
        }

        return manger;
    }
}
