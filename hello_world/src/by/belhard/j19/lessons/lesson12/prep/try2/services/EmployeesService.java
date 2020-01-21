package by.belhard.j19.lessons.lesson12.prep.try2.services;

import by.belhard.j19.lessons.lesson12.prep.try2.DBManager;
import by.belhard.j19.lessons.lesson12.prep.try2.entities.Employee;
import by.belhard.j19.lessons.lesson12.prep.try2.entities.Specialty;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeesService {

	private static final String INSERT_NEW_USER_QUERY =
			"insert into employees value (null, ?, default, ?, ?);";

	private static final String GET_ALL_EMPLOYEES =
			"select * from employees e join specialty s on e.specialtyId = s.id";

	public void addNewEmployee(String name, int salary, int specialtyId) throws SQLException {

		Connection connection = DBManager.getConnection();
		PreparedStatement statement = connection.prepareStatement(INSERT_NEW_USER_QUERY);
		statement.setString(1, name);
		statement.setInt(2, salary);
		statement.setInt(3, specialtyId);

		statement.execute();
	}

	public List<Employee> getAllEmployeesData() throws SQLException {
		Connection connection = DBManager.getConnection();
		Statement statement = connection.createStatement();

		ResultSet resultSet = statement.executeQuery(GET_ALL_EMPLOYEES);
		List<Employee> resultList = new ArrayList<>();

		while (resultSet.next()) {
			int employeId = resultSet.getInt(1);
			String name = resultSet.getString(2);
			java.util.Date start_date = resultSet.getDate(3);
			int salary = resultSet.getInt(4);

			int specialtyId = resultSet.getInt(6);
			String spetialtyTitle = resultSet.getString(7);

			Employee employee = new Employee(employeId, name, start_date, salary,
					new Specialty(specialtyId, spetialtyTitle));

			resultList.add(employee);
		}

		return resultList;
	}

	public void printAllEmployeesData() throws SQLException {
		getAllEmployeesData().forEach(System.out::println);
	}

}
