package com.neusoft;

import com.neusoft.po.Business;
import com.neusoft.po.Food;
import org.junit.Test;
import service.Impl.BusinessServiceImpl;
import service.Impl.FoodServiceImpl;

import java.util.List;

public class TestBusiness {
    private Business business=null;
    private Food food=null;
    @Test
    public void SelectBusinessInfo(){
        BusinessServiceImpl service = new BusinessServiceImpl();
        List<Business> businesses = service.SelectBusinessInfo();
        System.out.println(businesses);
    }
    @Test
    public void SelectBusinessInfoByName(){
        BusinessServiceImpl service = new BusinessServiceImpl();
        Business business1 = service.SelectBusinessInfoByName("zs");
        System.out.println(business1);
    }
    @Test
    public  void SelectFoodInfo(){
        FoodServiceImpl foodService = new FoodServiceImpl();
        List<Food> foods = foodService.SelectFoodInfo();
        System.out.println(foods);
    }
    @Test
    public void SelectFoodWithBusiness(){
        FoodServiceImpl foodService = new FoodServiceImpl();
        List<Food> foods = foodService.SelectFoodInfoWithBusiness(100001);
        System.out.println(foods);
    }
    @Test
    public void SelectFoodById(){
        FoodServiceImpl foodService = new FoodServiceImpl();
        Food food1 = foodService.SelectFoodById(1);
        System.out.println(food1);
    }
    @Test
    public void SelectFoodByName(){
        FoodServiceImpl foodService = new FoodServiceImpl();
        Food food1 = foodService.SelectFoodByName("sa");
        System.out.println(food1);
    }
}
