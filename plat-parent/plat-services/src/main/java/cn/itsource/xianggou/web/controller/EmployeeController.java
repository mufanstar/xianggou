package cn.itsource.xianggou.web.controller;

import cn.itsource.xianggou.domain.Employee;
import cn.itsource.xianggou.util.AjaxResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public AjaxResult login(@RequestBody Employee employee){
        if("admin".equals(employee.getUsername()) && "123".equals(employee.getPassword())){
           return AjaxResult.getInstance().setSuccess(true).setMessage("登录成功！");
        }
        return AjaxResult.getInstance().setSuccess(false).setMessage("用户名或密码错误！");
    }

}
