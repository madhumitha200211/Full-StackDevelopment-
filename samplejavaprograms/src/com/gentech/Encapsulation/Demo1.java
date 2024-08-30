package com.gentech.Encapsulation;

class Details {
    String Name;
    int Age;

   
    private class Info {
        private String password;
        private int phoneNo;

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public int getPhoneNo() {
            return phoneNo;
        }

        public void setPhoneNo(int phoneNo) {
            this.phoneNo = phoneNo;
        }
    }


    void display() {
        Info o = new Info();
        o.setPassword("madhu123");
        o.setPhoneNo(1234567890);

        System.out.println("Name: " + Name);
        System.out.println("Age: " + Age);
        System.out.println("Password: " + o.getPassword());
        System.out.println("Phone No: " + o.getPhoneNo());
    }
}

public class Demo1 {
    public static void main(String[] args) {
        Details d = new Details();
        d.Name = "madhu";
        d.Age = 21;
        d.display();
    }
}
