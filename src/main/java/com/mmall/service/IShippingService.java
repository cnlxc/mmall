package com.mmall.service;

import com.github.pagehelper.PageInfo;
import com.mmall.common.ServerResponse;
import com.mmall.pojo.Shipping;

/**
 * Created by 82138 on 2018/9/9.
 */
public interface IShippingService {

    ServerResponse add(Integer userId, Shipping shipping);

    ServerResponse del(Integer UserId,Integer shippingId);

    ServerResponse update(Integer UserId,Shipping shipping);

    ServerResponse<Shipping> select(Integer UserId,Integer shippingId);

    ServerResponse<PageInfo> list(Integer userId, Integer pageNum, Integer pageSize);

}
