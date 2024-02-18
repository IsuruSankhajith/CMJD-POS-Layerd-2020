/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.custom.impl;

import bo.custom.ItemBO;
import dao.DAOFactory;
import dao.custom.ItemDAO;
import dto.ItemDTO;
import java.sql.SQLException;
import java.util.ArrayList;
import entity.Item;

/**
 *
 * @author sanu
 */
public class ItemBOImpl implements ItemBO {

    ItemDAO itemDAO = (ItemDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.ITEM);

    @Override
    public boolean addItem(ItemDTO dto) throws ClassNotFoundException, SQLException {
        return itemDAO.add(new Item(dto.getItemCode(), dto.getItemName(), dto.getQty(), dto.getUnitPrice()));
    }

    @Override
    public boolean updateItem(ItemDTO dto) throws ClassNotFoundException, SQLException {
        return itemDAO.update(new Item(dto.getItemCode(), dto.getItemName(), dto.getQty(), dto.getUnitPrice()));
    }

    @Override
    public boolean removeItem(String itemCode) throws ClassNotFoundException, SQLException {
        return itemDAO.delete(itemCode);
    }

    @Override
    public ItemDTO searchItem(String itemCode) throws ClassNotFoundException, SQLException {
        Item ent = itemDAO.search(itemCode);
        return new ItemDTO(ent.getCode(), ent.getDescription(), ent.getQtyOnHand(), ent.getUnitPrice());
    }

    @Override
    public ArrayList<ItemDTO> getAllItems() throws ClassNotFoundException, SQLException {
        ArrayList<ItemDTO> allItems = new ArrayList<>();
        ArrayList<Item> all = itemDAO.getAll();
        for (Item i : all) {
            allItems.add(new ItemDTO(i.getCode(), i.getDescription(), i.getQtyOnHand(), i.getUnitPrice()));
        }
        return allItems;
    }
}
