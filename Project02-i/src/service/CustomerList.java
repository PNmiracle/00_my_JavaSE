package service;

import bean.Customer;

/**
 * @Author mapKey
 * @Date 7/4/2022 5:46 PM
 * @Description Customer对象的管理模块，内部用数组管理一组Customer对象，
 * 并提供相应的添加、修改、删除和遍历方法，供CustomerView调用
 * @Since version-1.0
 */

public class CustomerList {
    private Customer[] customers;//：用来保存客户对象的数组
    private int total = 0;//       ：记录已保存客户对象的数量

    public CustomerList() {
    }

    /**
     * @Description 用途：构造器，用来初始化customers数组
     * @Param 参数：totalCustomer：指定customers数组的最大空间
     */
    public CustomerList(int totalCustomer) {
        customers = new Customer[totalCustomer];
    }

    /**
     * 用途：将参数customer添加到数组中最后一个客户对象记录之后
     * 参数：customer指定要添加的客户对象
     * 返回：添加成功返回true；false表示数组已满，无法添加
     *
     * @param customer
     * @return
     */
    public boolean addCustomer(Customer customer) {
        if (total > customers.length) {
            return false;
        }
        //} else {
        //    customers[total++] = customer;
        //    return true;
        //}
        customers[total++] = customer;
        return true;
    }

    /**
     * 用途：用参数customer替换数组中由index指定的对象
     * 参数：customer指定替换的新客户对象
     * index指定所替换对象在数组中的位置，从0开始
     * 返回：替换成功返回true；false表示索引无效，无法替换
     *
     * @param index
     * @param cust
     * @return
     */
    public boolean replaceCustomer(int index, Customer cust) {
        if (index < 0 || index >= total) {
            return false;
        }
        customers[index] = cust;
        return true;
    }

    /**
     * 用途：从数组中删除参数index指定索引位置的客户对象记录
     * 参数： index指定所删除对象在数组中的索引位置，从0开始
     * 返回：删除成功返回true；false表示索引无效，无法删除
     *
     * @param index
     * @return
     */
    public boolean deleteCustomer(int index) {
        //if (index <0 || index >= total || customers[index] == null){
        //    return false;
        //}
        //
        //customers[total] = null;
        //return true;
        if (index < 0 || index >= total) {
            return false;
        }
        for (int i = index; i <= total - 2; i++) {
            customers[i] = customers[i + 1];//把后一个的值付给前一个
        }
        customers[--total] = null;
        return true;

    }
/**
 * @Description 用途：返回数组中记录的所有客户对象
 * 返回： Customer[] 数组中包含了当前所有客户对象，该数组长度与对象个数相同。
 * @Param
 * @Return
 */
    public  Customer[] getAllCustomers(){
        Customer[] custs = new Customer[total];
        for (int i = 0; i < total; i++) {//total为数组长度,遍历即可
            custs[i] = customers[i];//赋值的只是地址值,与原数组数据共享.
        }
        return custs;
    }
/**
 * @Description 用途：返回参数index指定索引位置的客户对象记录
 * 参数： index指定所要获取的客户在数组中的索引位置，从0开始
 * 返回：封装了客户信息的Customer对象
 * @Param index
 * @Return 如果没找到,返回null
 */
    public Customer getCustomer(int index){
        if (index < 0 || index >= total) {
            return null;
        }
        return customers[index];
    }
/**
 * @Description 获取存储的客户数量
 * @Param
 * @Return total
 */

    public int getTotal(){
        return total;
    }

}
