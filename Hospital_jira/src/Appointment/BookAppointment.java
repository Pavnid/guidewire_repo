package Appointment;

import java.util.ArrayList;

public class BookAppointment {
    static class Appt {
        String id, patientId, doctor, date, time;
        Appt(String id, String patientId, String doctor, String date, String time){
            this.id=id; this.patientId=patientId; this.doctor=doctor; this.date=date; this.time=time;
        }
        public String toString(){ return id+" | P:"+patientId+" | Dr:"+doctor+" | "+date+" "+time; }
    }

    static ArrayList<Appt> appts = new ArrayList<>();

    static void book(String id, String pId, String doc, String date, String time){
        for (Appt a: appts){
            if (a.doctor.equals(doc) && a.date.equals(date) && a.time.equals(time)){
                System.out.println("Slot not available for "+doc+" at "+date+" "+time);
                return;
            }
        }
        Appt a = new Appt(id, pId, doc, date, time);
        appts.add(a);
        System.out.println("Booked: " + a);
    }

    public static void main(String[] args) {
        book("A001","P001","Dr.Sharma","2026-03-10","10:00");
        book("A002","P002","Dr.Sharma","2026-03-10","10:00");
    }
}