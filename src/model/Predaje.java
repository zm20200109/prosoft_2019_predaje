/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Acer
 */
public class Predaje {
    int id;
    Profesor pro;
    Predmet pre;

    public Predaje() {
    }

    public Predaje(int id, Profesor pro, Predmet pre) {
        this.id = id;
        this.pro = pro;
        this.pre = pre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Profesor getPro() {
        return pro;
    }

    public void setPro(Profesor pro) {
        this.pro = pro;
    }

    public Predmet getPre() {
        return pre;
    }

    public void setPre(Predmet pre) {
        this.pre = pre;
    }

    @Override
    public String toString() {
        return "Predaje{" + "id=" + id + ", pro=" + pro + ", pre=" + pre + '}';
    }




}
