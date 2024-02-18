/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bo.BOFactory;
import bo.SuperBO;
import bo.custom.CustomerBO;
import bo.custom.impl.CustomerBOImpl;
import dao.DAOFactory;
import dao.SuperDAO;
import dao.custom.CustomerDAO;
import dao.custom.impl.CustomerDAOImpl;
import dto.CustomerDTO;
import java.sql.SQLException;
import java.util.ArrayList;
import entity.Customer;

/**
 *
 * @author sanu
 */
public class CustomerFormController {

    CustomerBO bo = (CustomerBO) BOFactory.getInstance().getBO(BOFactory.BOTypes.CUSTOMER);

    public boolean addCustomer(CustomerDTO customer) throws ClassNotFoundException, SQLException {
        return bo.addCustomer(customer);
    }

    public boolean updateCustomer(CustomerDTO customer) throws ClassNotFoundException, SQLException {
        return bo.updateCustomer(customer);
    }

    public boolean removeCustomer(String customerID) throws ClassNotFoundException, SQLException {
        return bo.removeCustomer(customerID);
    }

    public CustomerDTO searchCustomer(String customerID) throws ClassNotFoundException, SQLException {
        return bo.searchCustomer(customerID);
    }

    public ArrayList<CustomerDTO> getAllCustomers() throws ClassNotFoundException, SQLException {
        return bo.getAllCustomers();
    }

}
