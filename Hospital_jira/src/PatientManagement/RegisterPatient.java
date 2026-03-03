package PatientManagement;

import java.util.ArrayList;

public class RegisterPatient {
    static class Row {
        String id, name, addr, phone, idProof; int age;
        Row(String id, String name, int age, String addr, String phone, String idProof) {
            this.id=id; this.name=name; this.age=age; this.addr=addr; this.phone=phone; this.idProof=idProof;
        }
        public String toString(){ return id+" | "+name+" | "+age+" | "+addr+" | "+phone+" | "+idProof; }
    }

    static ArrayList<Row> patients = new ArrayList<>();

    static void register(String id, String name, int age, String addr, String phone, String idProof){
        patients.add(new Row(id, name, age, addr, phone, idProof));
        System.out.println("Registered: " + patients.get(patients.size()-1));
    }

    public static void main(String[] args) {
        register("P001","Arun",28,"Chennai","9000000001","Aadhar-XXXX");
        register("P002","Maya",34,"Tambaram","9000000002","PAN-YYYY");
    }
}