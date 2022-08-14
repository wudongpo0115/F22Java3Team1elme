package service;

import com.neusoft.po.Business;

import java.util.List;

public interface BusinessService {
//    Business全查询
    public List<Business> SelectBusinessInfo();
//   通过id查询
    public Business SelectBusinessInfoById(Integer businessid);
//    通过name查询
    public Business SelectBusinessInfoByName(String businessname);
}
