package com.bridgelabz;


import java.util.List;
import java.util.Scanner;

public class ConsoleIOServiceImpl implements PayrollService {
    static Scanner scanner = new Scanner(System.in);

    @Override
    public void read() {
        System.out.println("Enter Employee id");
        int id = scanner.nextInt();
        System.out.println("Enter Employee name");
        String name = scanner.next();
        System.out.println("Enter Employee salary");
        long salary = scanner.nextLong();
        EmployeePayrollData employeePayroll = new EmployeePayrollData(id, name, salary);
        System.out.println(employeePayroll);

    }

    @Override
    public boolean write(List<EmployeePayrollData> employeePayrollDataList) {
        employeePayrollDataList.forEach(employeePayrollData -> System.out.println(employeePayrollData));
        return true;
    }

    @Override
    public long countEntries() {
        return 0;
    }
}

