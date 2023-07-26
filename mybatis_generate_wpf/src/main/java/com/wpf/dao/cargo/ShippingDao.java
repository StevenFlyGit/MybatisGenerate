package com.wpf.dao.cargo;

import com.wpf.domain.cargo.Shipping;
import com.wpf.domain.cargo.ShippingExample;
import java.util.List;

public interface ShippingDao {
    int deleteByPrimaryKey(String shippingOrderId);

    int insert(Shipping record);

    int insertSelective(Shipping record);

    List<Shipping> selectByExample(ShippingExample example);

    Shipping selectByPrimaryKey(String shippingOrderId);

    int updateByPrimaryKeySelective(Shipping record);

    int updateByPrimaryKey(Shipping record);
}