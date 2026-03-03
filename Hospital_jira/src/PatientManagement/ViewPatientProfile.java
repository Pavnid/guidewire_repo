package PatientManagement;

import java.util.HashMap;

public class ViewPatientProfile {
    static class Profile {
        String id, name, dob, blood, allergies, history;
        Profile(String id, String name, String dob, String blood, String allergies, String history){
            this.id=id; this.name=name; this.dob=dob; this.blood=blood; this.allergies=allergies; this.history=history;
        }
        public String toString(){
            return "ID: "+id+"\nName: "+name+"\nDOB: "+dob+"\nBlood: "+blood+
                   "\nAllergies: "+allergies+"\nHistory: "+history;
        }
    }

    static HashMap<String, Profile> map = new HashMap<>();

    static void seed(){
        map.put("P300", new Profile("P300","Nisha","1995-07-12","O+","Penicillin","Asthma"));
        map.put("P301", new Profile("P301","Ravi","1990-01-22","A-","None","None"));
    }

    static void view(String id){
        Profile p = map.get(id);
        System.out.println(p!=null ? p : ("Profile not found: " + id));
    }

    public static void main(String[] args) {
        seed();
        view("P300");
        view("P999");
    }
}