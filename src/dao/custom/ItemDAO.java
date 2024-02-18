/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.custom;

import entity.Item;
import dao.CRUDDAO;

/**
 *
 * @author sanu
 */
public interface ItemDAO extends CRUDDAO<Item, String>{
    public String getItemLastID()throws Exception;
}
