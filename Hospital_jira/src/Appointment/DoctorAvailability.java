package Appointment;

import java.util.ArrayList;
import java.util.HashMap;

public class DoctorAvailability {
    static HashMap<String, ArrayList<String>> avail = new HashMap<>();

    static void addSlot(String doc, String slot){
        avail.putIfAbsent(doc, new ArrayList<>());
        ArrayList<String> slots = avail.get(doc);
        if (!slots.contains(slot)){
            slots.add(slot);
            System.out.println("Added: " + doc + " -> " + slot);
        } else {
            System.out.println("Slot exists for " + doc + ": " + slot);
        }
    }

    static void removeSlot(String doc, String slot){
        ArrayList<String> slots = avail.get(doc);
        if (slots!=null && slots.remove(slot)){
            System.out.println("Removed: " + doc + " -> " + slot);
        } else {
            System.out.println("Slot not found for " + doc);
        }
    }

    static void show(String doc){
        System.out.println("Slots for " + doc + ": " + avail.getOrDefault(doc, new ArrayList<>()));
    }

    public static void main(String[] args) {
        addSlot("Dr.Asha","2026-03-15 10:00");
        addSlot("Dr.Asha","2026-03-15 10:30");
        addSlot("Dr.Vikram","2026-03-15 11:00");
        show("Dr.Asha");
        removeSlot("Dr.Asha","2026-03-15 10:00");
        show("Dr.Asha");
    }
}