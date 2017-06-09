package com.util.bean;

public class Test {  
    public static void main(String[] args) {  
          
        IdcardInfoExtractor idcardInfo=new IdcardInfoExtractor("372323199001061825");  
        System.out.println("出生日期:"+idcardInfo.getYear()+"-"+idcardInfo.getMonth()+"-"+idcardInfo.getDay());  
        System.out.println("性别:"+idcardInfo.getGender());  
        System.out.println("年龄:"+idcardInfo.getAge());  
        System.out.println("省份:"+idcardInfo.getProvince());  
          
    }  
}  
