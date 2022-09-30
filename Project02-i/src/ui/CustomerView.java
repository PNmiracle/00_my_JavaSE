package ui;

import bean.Customer;
import service.CustomerList;
import util.CMUtility;

/**
 * @Author mapKey
 * @Date 7/4/2022 5:48 PM
 * @Description 实体对象，用来封装客户信息
 * @Since version-1.0
 */


public class CustomerView {

    private CustomerList customerList = new CustomerList(10);

    public CustomerView() {
        Customer customer = new Customer("张三", '男', 23, "1375465464564", "sdssd@qq.com");
        customerList.addCustomer(customer);
    }

    /**
     * @Description main方法
     * @Param
     * @Return
     */
    public static void main(String[] args) {
        CustomerView view = new CustomerView();
        view.enterMainMenu();

    }

    /**
     * @Description 用途：显示主菜单，响应用户输入，
     * 根据用户操作分别调用其他相应的成员方法（如addNewCustomer），
     * 以完成客户信息处理。
     * @Param
     * @Return
     */
    public void enterMainMenu() {
        boolean isFlag = true;
        while (isFlag) {

            System.out.println("\n-----------------客户信息管理软件-----------------\n");
            System.out.println("                   1 添 加 客 户");
            System.out.println("                   2 修 改 客 户");
            System.out.println("                   3 删 除 客 户");
            System.out.println("                   4 客 户 列 表");
            System.out.println("                   5 退       出\n");
            System.out.print("                   请选择(1-5)：");
            char menu = CMUtility.readMenuSelection();
            switch (menu) {
                case '1':
                    addNewCustomer();
                    break;
                case '2':
                    modifyCustomer();
                    break;
                case '3':
                    deleteCustomer();
                    break;
                case '4':
                    listAllCustomers();
                    break;
                case '5':
                    //System.out.println("退出");
                    System.out.println("确认是否退出(Y/N):");
                    char isExit = CMUtility.readConfirmSelection();
                    if (isExit == 'Y') {
                        isFlag = false;
                    }
            }
        }
    }

    private void addNewCustomer() {
        //System.out.println("添加客户");
        System.out.println("---------------------添加客户---------------------");
        System.out.print("姓名: ");
        String name = CMUtility.readString(10);
        System.out.print("性别: ");
        char gender = CMUtility.readChar();
        System.out.print("年龄: ");
        int age = CMUtility.readInt();
        System.out.print("电话: ");
        String tel = CMUtility.readString(20);
        System.out.print("Email: ");
        String email = CMUtility.readString(20);

        //将上述对象封装到对象中
        Customer customer = new Customer(name, gender, age, tel, email);
        boolean isAdd = customerList.addCustomer(customer);
        if (isAdd) {
            System.out.println("---------------------添加完成---------------------");
        } else {
            System.out.println("----------------记录已满,无法添加-----------------");
        }

    }

    private void modifyCustomer() {
        System.out.println("---------------------修改客户---------------------");
        Customer cust;
        int number;
        for (; ; ) {
            System.out.print("请选择待修改客户编号(-1退出)：");
            number = CMUtility.readInt();

            if (number == -1) return;
            cust = customerList.getCustomer(number - 1);
            if (cust == null) {
                System.out.println("Not find the customer!");
            } else {
                break;
            }
        }

        System.out.print("Name(" + cust.getName() + "):");
        String name = CMUtility.readString(10, cust.getName());
        System.out.print("Gender(" + cust.getGender() + "):");
        char gender = CMUtility.readChar(cust.getGender());
        System.out.print("Age(" + cust.getAge() + "):");
        int age = CMUtility.readInt(cust.getAge());
        System.out.print("Tel(" + cust.getPhone() + "):");
        String phone = CMUtility.readString(20, cust.getPhone());
        System.out.print("Email(" + cust.getEmail() + "):");
        String email = CMUtility.readString(20, cust.getEmail());
        Customer newCust = new Customer(name, gender, age, phone, email);
        boolean b = customerList.replaceCustomer(number - 1, newCust);
        if (b) {
            System.out.println("-------------修改完成---------------");
        } //else {
            //System.out.println("-------------修改失败---------------");
        //}

    }

    private void deleteCustomer() {
        //System.out.println("deleted");
        System.out.println("---------------------删除客户---------------------");
        int number;
        for (;;) {
            System.out.print("请选择待删除客户编号(-1退出)：");
            number = CMUtility.readInt();
            if (number == -1) {
                return;
            }
            Customer cust = customerList.getCustomer(number - 1);
            if (cust == null) {
                System.out.println("Not find the customer!");
            } else {
                break;
            }
        }
    //    找到了指定客户
        System.out.print("确认是否删除(Y/N)：");
        char isDelete = CMUtility.readConfirmSelection();
        if (isDelete == 'Y') {
            boolean deleteSuccess = customerList.deleteCustomer(number - 1);
            if (deleteSuccess) {
                System.out.println("----------删除成功-------");
            } else {
                System.out.println("---------失败---------");
            }

        } //else {
        //    return;
        //}


    }

    private void listAllCustomers() {
        //System.out.println("listAll!");
        System.out.println("---------------------------客户列表---------------------------");
        int total = customerList.getTotal();
        if (total == 0) {
            System.out.println("No Customer Record!");
        } else {
            System.out.println("编号\t姓名\t性别\t年龄\t\t电话\t\t\t邮箱");
            Customer[] custs = customerList.getAllCustomers();
            Customer c;
            for (int i = 0; i < custs.length; i++) {
                c = custs[i];
                System.out.println((i + 1) + "\t\t" + custs[i].getName() + "\t" +
                        custs[i].getGender() + "\t\t" + custs[i].getAge() + "\t\t" +
                        custs[i].getPhone() + "\t\t" + c.getEmail());
            }
        }


        System.out.println("-------------------------客户列表完成-------------------------");

    }


}
