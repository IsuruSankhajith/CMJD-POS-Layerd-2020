/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.custom;

import entity.Customer;
import dao.CRUDDAO;

/**
 *
 * @author sanu
 */
public interface CustomerDAO extends CRUDDAO<Customer, String>{
    public String getCustomerLastID(String id)throws Exception;
}
