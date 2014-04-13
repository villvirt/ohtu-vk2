package ohtu;

import java.util.ArrayList;

public class Submission {

    private String student_number;
    private String week;
    private String hours;
    private boolean a1;
    private boolean a2;
    private boolean a3;
    private boolean a4;
    private boolean a5;
    private boolean a6;
    private boolean a7;
    private boolean a8;
    private boolean a9;
    private boolean a10;
    private boolean a11;
    private ArrayList<String> teh;

    public String getStudent_number() {
        return student_number;
    }

    public void setStudent_number(String student_number) {
        this.student_number = student_number;
    }

    public String getWeek() {
        return week;
    }

    public void setWeek(String week) {
        this.week = week;
    }

    public String getHours() {
        return hours;
    }

    public void setHours() {
        this.hours = hours;
    }

    public void setAssignments() {

        //oliko tähän nyt joku fiksumpi konsti??
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
        this.a4 = a4;
        this.a5 = a5;
        this.a6 = a6;
        this.a7 = a7;
        this.a8 = a8;
        this.a9 = a9;
        this.a10 = a10;
        this.a11 = a11;
       
    }

    public void getTehdyt() {
        teh = new ArrayList();
        if (a1 == true) {
            teh.add("1");
        }
        if (a2 == true) {
             teh.add("2");
        }
        if (a3 == true) {
             teh.add("3");
        }
        if (a4 == true) {
             teh.add("4");
        }
        if (a5 == true) {
             teh.add("5");
        }
        if (a6 == true) {
             teh.add("6");
        }
        if (a7 == true) {
             teh.add("7");
        }
        if (a8 == true) {
             teh.add("8");
        }
        if (a9 == true) {
             teh.add("9");
        }
        if (a10 == true) {
             teh.add("10");
        }
        if (a11 == true) {
             teh.add("11");
        }
    }

    @Override
    public String toString() {
        getTehdyt();
        return "week: " + week + ", aikaa kului: " + hours + "h" + " tehdyt "+teh;
    }
}