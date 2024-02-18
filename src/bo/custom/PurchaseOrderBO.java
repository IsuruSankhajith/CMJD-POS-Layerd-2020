/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.custom;

import bo.SuperBO;
import dto.CustomerDTO;
import dto.ItemDTO;
import dto.OrderDTO;
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
public interface PurchaseOrderBO extends SuperBO{

    public ArrayList<CustomerDTO> getAllCustomers() throws SQLException, ClassNotFoundException;

    public ArrayList<ItemDTO> getAllItems() throws SQLException, ClassNotFoundException;

    public CustomerDTO searchCustomer(String id) throws SQLException, ClassNotFoundException;

    public ItemDTO searchItem(String code) throws SQLException, ClassNotFoundException;

    public boolean purchaseOrder(OrderDTO order) throws ClassNotFoundException, SQLException;
    
    public void getOrderDetailsForOID(String oid)throws ClassNotFoundException, SQLException;
}
