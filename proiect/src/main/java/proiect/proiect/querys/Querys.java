package proiect.proiect.querys;

public class Querys {
    public final static String GET_EMPLOYEES_SQL = "select * from employee";
    public final static String ADD_EMPLOYEE ="INSERT INTO employee(id, cnp, firstName, lastName, phoneNumber," +
            "position, datefrom, salary) values (null,?,?,?,?,?,?,?)";
    public final static String DELETE_EMPLOYEE ="DELETE FROM employee where id = ?";
    public final static String GET_EMPLOYEE_BY_ID = "select * from employee where id = ?";

    public final static String GET_PRODUCTS_SQL = "select * from product";
    public final static String ADD_PRODUCT ="INSERT INTO product(id, name, provider, price, expirationDate," +
            "barcode) values (null,?,?,?,?,?,?,?)";
    public final static String DELETE_PRODUCT ="DELETE FROM product where id = ?";
    public final static String GET_PRODUCT_BY_ID = "select * from product where id = ?";

    public final static String GET_CATEGORIES_SQL = "select * from category";
    public final static String ADD_CATEGORY ="INSERT INTO category(id, name) values (null,?)";
    public final static String DELETE_CATEGORY ="DELETE FROM category where id = ?";
    public final static String GET_CATEGORY_BY_ID = "select * from category where id = ?";

    public final static String GET_PROVIDERS_SQL = "select * from provider";
    public final static String ADD_PROVIDER ="INSERT INTO provider(id, name, address, phoneNumber) values (null,?,?,?)";
    public final static String DELETE_PROVIDER ="DELETE FROM provider where id = ?";
    public final static String GET_PROVIDER_BY_ID = "select * from provider where id = ?";

    public final static String GET_SALES_SQL = "select * from sales";
    public final static String ADD_SALES ="INSERT INTO sales(id, number, date, product) values (null,?,?,?)";
    public final static String DELETE_SALES ="DELETE FROM sales where id = ?";
    public final static String GET_SALES_BY_ID = "select * from sales where id = ?";

}
