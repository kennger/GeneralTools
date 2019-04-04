package com.cx.controller;

import com.cx.service.NativeSMSDomain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserCreditFlowController {


    @Autowired
    private NativeSMSDomain nativeSMSDomain;

    @RequestMapping(value = "/getAllUserId",method = RequestMethod.GET)
    public ModelAndView toIndex() {

        int start = 0;//开始记录索引位置
        int pageSize = 100;//页大小(每页显示条数即一次查询多少条数据)
        ModelAndView mav = new ModelAndView();
        List<String> list = nativeSMSDomain.getAllOfSMSUserId(start);
//        List<List<String>> lists = new ArrayList<>();
//        while (list!=null&&list.size()!=0){
//                start = start + pageSize;//计算下次查询开始位置
//                lists.add(list);
//        }

        mav.addObject("bean", list);
        mav.setViewName("userCreditFlow");
        return mav;
    }
}
