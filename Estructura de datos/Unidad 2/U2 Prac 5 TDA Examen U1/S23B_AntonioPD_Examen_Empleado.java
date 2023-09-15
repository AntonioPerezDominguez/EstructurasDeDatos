/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen;

/**
 *
 * @author Microcomputadoras-I
 */
public class S23B_AntonioPD_Examen_Empleado {
    private String name;
    private String id;
    private String city;
    private String depto;
    private int age;
    private int yearStart;

    public S23B_AntonioPD_Examen_Empleado(String name, String city, String depto, int age, int yearStart) {
        this.name = name;
        this.id = genID();
        this.city = city;
        this.depto = depto;
        this.age = age;
        this.yearStart = yearStart;
    }

    @Override
    public String toString() {
        return "S23B_AntonioPD_Examen_Empleado{" + "name=" + name + ", id=" + id + ", city=" + city + ", depto=" + depto + ", age=" + age + ", yearStart=" + yearStart + '}';
    }
    public String genID(){
        String x="";
        x+=this.getName().charAt(0);
        x+=this.getName().charAt(1);
        x+=(int) (Math.random()*9)+"";
        x+=(int) (Math.random()*9)+"";
        return x;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDepto() {
        return depto;
    }

    public void setDepto(String depto) {
        this.depto = depto;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getYearStart() {
        return yearStart;
    }

    public void setYearStart(int yearStart) {
        this.yearStart = yearStart;
    }

    
    
    
}
