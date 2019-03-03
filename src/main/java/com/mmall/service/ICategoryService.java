package com.mmall.service;

import com.mmall.common.ServerResponse;
import com.mmall.pojo.Category;

import java.util.List;

/**
 * Created by 82138 on 2018/8/15.
 */
public interface ICategoryService {

    ServerResponse addCategory(String categoryName,Integer parentId);

    ServerResponse updateCategoryName(Integer categoryId,String categoryName);

    ServerResponse<List<Category>> getChildrenParallelCategoryId(int categoryId);

    ServerResponse<List<Integer>> getDeepCategoryId(int categoryId);
}
