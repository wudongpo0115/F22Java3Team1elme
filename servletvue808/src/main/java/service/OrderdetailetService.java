package service;

import com.neusoft.po.OrderDetailet;

import java.util.List;

public interface OrderdetailetService {

    public List<OrderDetailet> selectOrderDetailetAll();
    public boolean DelectByPk(Integer odid);
    public boolean delectOrderlist(Integer odid);
    public OrderDetailet selectall(Integer odId);
    public OrderDetailet SelectBy(Integer foodid);
    public boolean Insert(OrderDetailet orderDetailet);


}
