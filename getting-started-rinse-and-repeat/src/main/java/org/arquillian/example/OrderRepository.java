package org.arquillian.example;

import javax.ejb.Local;
import java.util.List;

/**
 * Created by Yekaterina Savelyeva
 * on 18.10.2018
 */

@Local
public interface OrderRepository {

        void addOrder(List<String> order);
        List<List<String>> getOrders();
        int getOrderCount();

}
