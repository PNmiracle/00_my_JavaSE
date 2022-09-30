package domain;

import service.Status;

public class Programmer extends Employee {
    private int memberId;//开发团队中的ID
    private Status status = Status.FREE;
    private Equipment equipment;

    public Programmer() {
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    public Programmer(int id, String name, int age, double salary, Equipment equipment) {
        super(id, name, age, salary);

        this.equipment = equipment;
    }

    @Override
    public String toString() {
        return getDetails() + "\t程序员\t" + status + "\t\t\t\t\t" + equipment.getDescription();
    }

    public String getTeamInfo() {
        return getMemberId() + "/" + getId() + "\t\t" + getName() + "\t" + getAge() + "\t\t" + getSalary()+ "\t\t" ;
    }
    public String getInfo() {
        return getTeamInfo() + "程序员";
    }
}
