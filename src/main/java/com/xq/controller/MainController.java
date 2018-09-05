package com.xq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Package: com.xq.controller
 * User: 段小秋
 * Email: duanxiaoqiu@jd.com
 * Date: 2018/9/5
 * Time: 14:31
 * Description:
 */
@Controller
@RequestMapping("/main")
public class MainController {

    @RequestMapping("/index.html")
    public String index() {
        return "index";
    }

}
