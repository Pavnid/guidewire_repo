package PatientManagement;

import java.util.ArrayList;

public class UpdatePatientInfo {
    static class Row {
        String id, name, phone, addr, history, insurance;
        Row(String id, String name, String phone, String addr, String history, String insurance){
            this.id=id; this.name=name; this.phone=phone; this.addr=addr; this.history=history; this.insurance=insurance;
        }
        public String toString(){ return id+" | "+name+" | "+phone+" | "+addr+" | hist="+history+" | ins="+insurance; }
    }

    static ArrayList<Row> data = new ArrayList<>();

    static void seed(){
        data.add(new Row("P100","Kumar","9000000003","OMR, Chennai","Diabetes","HDFC-INS"));
        data.add(new Row("P101","Latha","9000000004","Velachery","None","SBI-INS"));
    }

    static void update(String id, String newPhone, String newAddr, String newHistory, String newInsurance){
        for (Row r : data){
            if (r.id.equals(id)){
                if (newPhone!=null) r.phone=newPhone;
                if (newAddr!=null) r.addr=newAddr;
                if (newHistory!=null) r.history=newHistory;
                if (newInsurance!=null) r.insurance=newInsurance;
                System.out.println("Updated: " + r);
                return;
            }
        }
        System.out.println("Patient not found: " + id);
    }

    public static void main(String[] args) {
        seed();
        update("P100","9888888888","Adyar","Diabetes, BP","ICICI-INS");
        update("P999","9777777777",null,null,null); // not found
    }
}