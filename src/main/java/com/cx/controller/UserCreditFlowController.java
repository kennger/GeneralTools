package com.cx.controller;

import com.cx.service.NativeSMSDomain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserCreditFlowController {


    @Autowired
    private NativeSMSDomain nativeSMSDomain;

    @RequestMapping("/getAllUserId")
    public ModelAndView toIndex() {

        ModelAndView mav = new ModelAndView();
        List<String> list = nativeSMSDomain.getAllOfSMSUserId();
        mav.addObject("bean", list);
        mav.setViewName("userCreditFlow");
        return mav;
    }
}
