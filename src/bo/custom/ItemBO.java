/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.custom;

import bo.SuperBO;
import dto.ItemDTO;
import java.sql.SQLException;
import java.util.ArrayList;
import entity.Item;

/**
 *
 * @author sanu
 */
public interface ItemBO extends SuperBO{

    public boolean addItem(ItemDTO item) throws ClassNotFoundException, SQLException;

    public boolean updateItem(ItemDTO item) throws ClassNotFoundException, SQLException;

    public boolean removeItem(String itemCode) throws ClassNotFoundException, SQLException;

    public ItemDTO searchItem(String itemCode) throws ClassNotFoundException, SQLException;

    public ArrayList<ItemDTO> getAllItems() throws ClassNotFoundException, SQLException;
}
