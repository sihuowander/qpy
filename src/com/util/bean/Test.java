package com.util.bean;

public class Test {  
    public static void main(String[] args) {  
          
        IdcardInfoExtractor idcardInfo=new IdcardInfoExtractor("372323199001061825");  
        System.out.println("��������:"+idcardInfo.getYear()+"-"+idcardInfo.getMonth()+"-"+idcardInfo.getDay());  
        System.out.println("�Ա�:"+idcardInfo.getGender());  
        System.out.println("����:"+idcardInfo.getAge());  
        System.out.println("ʡ��:"+idcardInfo.getProvince());  
          
    }  
}  
