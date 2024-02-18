/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.custom.impl;

import bo.custom.PurchaseOrderBO;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import dao.DAOFactory;
import dao.custom.CustomerDAO;
import dao.custom.ItemDAO;
import dao.custom.OrderDAO;
import dao.custom.OrderDetailsDAO;
import dao.custom.QueryDAO;
import db.DBConnection;
import dto.CustomerDTO;
import dto.ItemDTO;
import dto.OrderDTO;
import dto.OrderDetailDTO;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import entity.Customer;
import entity.Item;
import entity.Order;
import entity.OrderDetail;

/**
 *
 * @author sanu
 */
public class PurchaseOrderBOImpl implements PurchaseOrderBO {

    CustomerDAO customerDAO = (CustomerDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.CUSTOMER);
    ItemDAO itemDAO = (ItemDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.ITEM);
    OrderDAO orderDAO = (OrderDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.ORDERS);
    OrderDetailsDAO orderDetailsDAO = (OrderDetailsDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.ORDERDETAILS);
    QueryDAO queryDao = (QueryDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.QUERYDAO);

    @Override
    public ArrayList<CustomerDTO> getAllCustomers() throws SQLException, ClassNotFoundException {
        ArrayList<Customer> all = customerDAO.getAll();
        ArrayList<CustomerDTO> allCustomers = new ArrayList<>();
        for (Customer c : all) {
            CustomerDTO customerDTO = new CustomerDTO(c.getId(), c.getName(), c.getAddress(), c.getSalary());
            allCustomers.add(customerDTO);
        }
        return allCustomers;
    }

    @Override
    public ArrayList<ItemDTO> getAllItems() throws SQLException, ClassNotFoundException {
        ArrayList<Item> all = itemDAO.getAll();
        ArrayList<ItemDTO> allItems = new ArrayList<>();
        for (Item i : all) {
            ItemDTO itemDTO = new ItemDTO(i.getCode(), i.getDescription(), i.getQtyOnHand(), i.getUnitPrice());
            allItems.add(itemDTO);
        }
        return allItems;
    }

    @Override
    public CustomerDTO searchCustomer(String id) throws SQLException, ClassNotFoundException {
        Customer c = customerDAO.search(id);
        return new CustomerDTO(c.getId(), c.getName(), c.getAddress(), c.getSalary());
    }

    @Override
    public ItemDTO searchItem(String code) throws SQLException, ClassNotFoundException {
        Item i = itemDAO.search(code);
        return new ItemDTO(i.getCode(), i.getDescription(), i.getQtyOnHand(), i.getUnitPrice());
    }

    @Override
    public boolean purchaseOrder(OrderDTO dto) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getDBConnection().getConnection();
        connection.setAutoCommit(false);

        Order order = new Order(dto.getOid(), dto.getDate(), dto.getCustomerID());
        
        boolean add = orderDAO.add(order);
        if (add) {
            for (OrderDetailDTO od : dto.getOrderDetails()) {
                OrderDetail orderDetail = new OrderDetail(od.getOid(), od.getItemCode(), od.getQty(), od.getUnitPrice());
                boolean add1 = orderDetailsDAO.add(orderDetail);
                if (!add1) {
                    connection.rollback();
                    connection.setAutoCommit(true);
                    return false;

                }
            }

            connection.commit();
            connection.setAutoCommit(true);
            return true;
        }
        connection.rollback();
        connection.setAutoCommit(true);
        return false;

    }

    @Override
    public void getOrderDetailsForOID(String oid) throws ClassNotFoundException, SQLException {
        queryDao.getCustomersOrderDetails(oid);
    }
}
