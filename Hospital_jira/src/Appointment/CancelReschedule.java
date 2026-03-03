package Appointment;

import java.util.ArrayList;

public class CancelReschedule {
    static class Appt {
        String id, patientId, doctor, date, time;
        Appt(String id, String patientId, String doctor, String date, String time){
            this.id=id; this.patientId=patientId; this.doctor=doctor; this.date=date; this.time=time;
        }
        public String toString(){ return id+" | P:"+patientId+" | Dr:"+doctor+" | "+date+" "+time; }
    }

    static ArrayList<Appt> appts = new ArrayList<>();

    static void seed(){
        appts.add(new Appt("A010","P100","Dr.Lee","2026-03-11","11:00"));
        appts.add(new Appt("A011","P101","Dr.Lee","2026-03-11","11:30"));
    }

    static void cancel(String id){
        for (int i=0;i<appts.size();i++){
            if (appts.get(i).id.equals(id)){
                System.out.println("Cancelled: " + appts.get(i));
                appts.remove(i);
                return;
            }
        }
        System.out.println("Appointment not found: " + id);
    }

    static void reschedule(String id, String newDate, String newTime){
        for (Appt a: appts){
            if (a.id.equals(id)){
                a.date=newDate; a.time=newTime;
                System.out.println("Rescheduled: " + a);
                return;
            }
        }
        System.out.println("Appointment not found: " + id);
    }

    public static void main(String[] args) {
        seed();
        reschedule("A010","2026-03-12","12:00");
        cancel("A011");
        cancel("A099"); // not found
    }
}