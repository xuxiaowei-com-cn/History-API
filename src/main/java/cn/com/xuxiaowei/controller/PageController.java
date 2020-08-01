package cn.com.xuxiaowei.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Page 页面
 *
 * @author xuxiaowei
 * @since 0.0.1
 */
@Controller
public class PageController {

    /**
     * Page 页面
     *
     * @param request  请求
     * @param response 响应
     * @param model    页面数据
     * @return 返回 Page 页面
     */
    @RequestMapping("page/{index}")
    public String page(HttpServletRequest request, HttpServletResponse response, Model model,
                       @PathVariable("index") String index) {

        return "page/" + index;
    }

}
