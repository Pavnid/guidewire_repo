package Appointment;

import java.util.ArrayList;

public class AppointmentReminder {
    static class Appt {
        String id, patientPhone, date, time;
        Appt(String id, String patientPhone, String date, String time){
            this.id=id; this.patientPhone=patientPhone; this.date=date; this.time=time;
        }
    }

    static ArrayList<Appt> appts = new ArrayList<>();

    static void seed(){
        appts.add(new Appt("A200","9000000010","2026-03-16","09:00"));
        appts.add(new Appt("A201","9000000011","2026-03-16","11:30"));
        appts.add(new Appt("A202","9000000012","2026-03-17","10:15"));
    }

    // Very simple: prints reminders for matching date
    static void sendReminders(String todayDate){
        System.out.println("Reminders for " + todayDate + ":");
        for (Appt a : appts){
            if (a.date.equals(todayDate)){
                System.out.println("Reminder to " + a.patientPhone + " -> Appt " + a.id + " at " + a.time);
            }
        }
    }

    public static void main(String[] args) {
        seed();
        sendReminders("2026-03-16");
    }
}