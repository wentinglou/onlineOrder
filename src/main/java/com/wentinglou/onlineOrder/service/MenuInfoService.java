package com.wentinglou.onlineOrder.service;

import com.wentinglou.onlineOrder.dao.MenuInfoDao;
import com.wentinglou.onlineOrder.entity.MenuItem;
import com.wentinglou.onlineOrder.entity.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MenuInfoService {
    @Autowired
    private MenuInfoDao menuInfoDao;

    public List<Restaurant> getRestaurants() {
        return menuInfoDao.getRestaurants();
    }

    public List<MenuItem> getAllMenuItem(int restaurantId) {
        return menuInfoDao.getAllMenuItem(restaurantId);
    }

    public MenuItem getMenuItem(int menuItemId) {
        return menuInfoDao.getMenuItem(menuItemId);
    }
}
