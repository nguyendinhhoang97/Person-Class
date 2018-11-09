public class Staff extends Person {
    public String school;
    public double pay;

    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    public String getSchool() {
        return school;
    }

    public double getPay() {
        return pay;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    @Override
    public String toString() {
        return "Staff [Person[name = " + super.getName()
                + " address = " + super.getAddress()
                + " school = " + getSchool()
                + " pay = " + getPay()
                + " $ ]";
    }
}
