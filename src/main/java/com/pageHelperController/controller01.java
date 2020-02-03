package com.pageHelperController;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
public class controller01 {
/**
 *查询所有的person内容
 * */
@RequestMapping(value = "/list")
    public String jumpJsp(Map<String,Object> result){
    PageHelper.startPage(3,3);

    //得到分页中的person条目对象
    //List<Person> pageList = personPageInfo.getList();
    //将结果存入map进行传送
    //result.put("pageInfo" , pageList);
    return "person_list";
}

}
