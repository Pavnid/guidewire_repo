package PatientManagement;

import java.util.ArrayList;

public class SearchPatient {
    static class Row {
        String id, name, phone;
        Row(String id, String name, String phone){ 
        	this.id=id; 
        	this.name=name; 
        	this.phone=phone; }
        
        public String toString()
        { 
        	return id+" | "+name+" | "+phone; }
    }

    static ArrayList<Row> data = new ArrayList<>();

    static void seed(){
        data.add(new Row("P200","Arun","9000000005"));
        data.add(new Row("P201","Maya","9000000006"));
        data.add(new Row("P202","Arun","9000000007"));
    }

    static void byId(String id){
        for (Row r: data) if (r.id.equals(id)) System.out.println("Found (ID): " + r);
    }
    static void byName(String name){
        for (Row r: data) if (r.name.equalsIgnoreCase(name)) System.out.println("Found (Name): " + r);
    }
    static void byPhone(String phone){
        for (Row r: data) if (r.phone.equals(phone)) System.out.println("Found (Phone): " + r);
    }

    public static void main(String[] args) {
        seed();
        byId("P201");
        byName("Arun");
        byPhone("9000000007");
    }
}