package service;

import com.neusoft.po.Food;

import java.util.List;

public interface FoodService {
    public List<Food> SelectFoodInfoWithBusiness(Integer businessid);
    public Food SelectFoodById(Integer foodid);
    public List<Food> SelectFoodInfo();
    public Food SelectFoodByName(String foodName);
}
