package com.mmall.dao;

import com.mmall.pojo.Cart;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CartMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Cart record);

    int insertSelective(Cart record);

    Cart selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Cart record);

    int updateByPrimaryKey(Cart record);

    Cart selectCartByUserIdProductId(@Param("userId")Integer userId,@Param("productId") Integer productId);

    List<Cart> selectByUserId(Integer userId);

    Integer selectCheckedByUserId(Integer userId);

    void deleteByUserIdProductId(@Param("userId")Integer userId,@Param("productIdList") List<String> productIdList);

    void selectOrUnselectAllProduct(@Param("userId")Integer userId,@Param("productId")Integer productId,@Param("checked")Integer checked);

    List<Cart> selectCheckedCartByUserId(Integer userId);
}