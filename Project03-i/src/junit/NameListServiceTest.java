package junit;

import domain.Employee;
import org.junit.Test;
import service.NameListService;
import service.TeamException;

/**
 * @Author mapKey
 * @Date 7/11/2022 10:18 AM
 * @Description 对NameListService类的测试
 * @Since version-1.0
 */
public class NameListServiceTest {
    @Test
    public void testGetAllEmployees(){
        NameListService service = new NameListService();
        Employee[] employees = service.getAllEmployees();
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }

    }

    @Test
    public void testGetEmployee(){
        NameListService service = new NameListService();
        int id = 1;
        id = 15;
        try {
            Employee employee = service.getEmployee(id);
            System.out.println(employee);
        } catch (TeamException e) {
            System.out.println(e.getMessage());
        }

    }
}
