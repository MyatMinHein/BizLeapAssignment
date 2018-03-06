package com.bizleap.assignment.four;

/**
 * Created by M2h_Laptop on 1/16/2018.
 */
public class Entity {
    public static void main(String[] args) {

    }
}
class Employee {
    String eFname,eLname,eAge,eTitle,eSalary,eEmail,ePhone;
    Employee(String fn, String ln, String a, String t, String s, String e, String p){
        eFname = fn;
        eLname = ln;
        eAge = a;
        eTitle = t;
        eSalary = s;
        eEmail = e;
        ePhone = p;
    }
    protected String geteFname(){
        return eFname;
    }
    protected void seteFname(String eFname){
        this.eFname = eFname;
    }
    protected String geteLname(){
        return eLname;
    }
    protected void seteAge(String eAge){
        this.eAge = eAge;
    }
    protected String geteTitle(){
        return eTitle;
    }
    protected void seteTitle(String eTitle){
        this.eTitle = eTitle;
    }
    protected String geteSalary(){
        return eSalary;
    }
    protected void seteSalary(String eSalary){
        this.eSalary = eSalary;
    }
    protected String geteEmail(){
        return eEmail;
    }
    protected void seteEmail(String eEmail){
        this.eEmail = eEmail;
    }
    protected String getePhone(){
        return ePhone;
    }
    protected void setePhone(){
        this.ePhone = ePhone;
    }

}
class Company {
    String comName,cAddress,cPhone,cEmail,ceo;
    Company(String cn, String a, String p, String e, String Ceo){
        comName = cn;
        cAddress = a;
        cPhone = p;
        cEmail = e;
        ceo = Ceo;
    }
    protected String getcomName(){
        return comName;
    }
    protected void setcomName(String comName){
        this.comName = comName;
    }
    protected String getcAddress(){
        return cAddress;
    }
    protected void setcAddress(String cAddress){
        this.cAddress = cAddress;
    }
    protected String getcPhone(){
        return cPhone;
    }
    protected void setcPhone(String cPhone){
        this.cPhone = cPhone;
    }
    protected String getcEmail(){
        return cEmail;
    }
    protected void setcEmail(String cEmail){
        this.cEmail = cEmail;
    }
    protected String getceo(){
        return ceo;
    }
    protected void setceo(String ceo){
        this.ceo = ceo;
    }
}
