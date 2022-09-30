package service;
/**
 * @Author mapKey
 * @Date 7/10/2022 9:18 PM
 * @Description 功能：负责将Data中的数据封装到Employee[]数组中
 * ，同时提供相关操作Employee[]的方法
 * @Since version-1.0
 */

import com.sun.org.glassfish.external.statistics.BoundaryStatistic;
import domain.*;

import static service.Data.*;

public class NameListService {
    private Employee[] employees;

    /**
     * @Description 根据项目提供的Data类构建相应大小的employees数组
     * 再根据Data类中的数据构建不同的对象，包括Employee、Programmer、Designer和Architect对象，
     * 以及相关联的Equipment子类的对象
     * 将对象存于数组中
     * @Param
     * @Return
     */
    public NameListService() {
        employees = new Employee[EMPLOYEES.length];
        for (int i = 0; i < employees.length; i++) {
            //获取员工的类型
            int type = Integer.parseInt(EMPLOYEES[i][0]);
            //获取Employee的4个基本信息
            int id = Integer.parseInt(EMPLOYEES[i][1]);
            //int name = Integer.parseInt(EMPLOYEES[i][2]);
            String name = EMPLOYEES[i][2];
            int age = Integer.parseInt(EMPLOYEES[i][3]);
            double salary = Double.parseDouble(EMPLOYEES[i][4]);
            Equipment equipment;//只是先声明
            double bonus;
            int stock;
            switch (type) {
                case EMPLOYEE://10
                    employees[i] = new Employee(id, name, age, salary);
                    break;
                case PROGRAMMER://11
                    equipment = createEquipment(i);
                    employees[i] = new Programmer(id, name, age, salary, equipment);
                    break;
                case DESIGNER://12
                    equipment = createEquipment(i);
                    bonus = Double.parseDouble(EMPLOYEES[i][5]);
                    employees[i] = new Designer(id, name, age, salary, equipment, bonus);
                    break;
                case ARCHITECT://13
                    equipment = createEquipment(i);
                    bonus = Double.parseDouble(EMPLOYEES[i][5]);
                    stock = Integer.parseInt(EMPLOYEES[i][6]);
                    employees[i] = new Architect(id, name, age, salary, equipment, bonus, stock);
                    break;
            }

        }
    }

    /**
     * @Description 获取指定 index 位置上的员工的设备
     * @Param
     * @Return
     */
    private Equipment createEquipment(int index) {
        int key = Integer.parseInt(EQUIPMENTS[index][0]);
        String modelOrName = EQUIPMENTS[index][1];
        switch (key) {
            case PC://21
                String display = EQUIPMENTS[index][2];
                return new PC(modelOrName, display);
            //break;
            case NOTEBOOK://22
                String price = EQUIPMENTS[index][2];
                return new NoteBook(modelOrName, Double.parseDouble(price));
            //break;
            case PRINTER://23
                String type = EQUIPMENTS[index][2];

                return new Printer(modelOrName, type);
            //break;

        }
        return null;
    }

    /**
     * @Author mapKey
     * @Date 7/11/2022 10:06 AM
     * @Description 获取当前所有员工
     * @Since version-1.0
     */
    public Employee[] getAllEmployees() {
        return employees;
    }

    public Employee getEmployee(int id) throws TeamException {
        //return employees[id - 1];
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getId() == id) {
                return employees[i];
            }
        }
        throw new TeamException("找不到指定员工from TeamException");
    }
}
