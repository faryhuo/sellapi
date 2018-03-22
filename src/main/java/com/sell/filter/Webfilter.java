package com.sell.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

/**
 * 使用注解标注过滤器
 * @WebFilter将一个实现了javax.servlet.Filter接口的类定义为过滤器
 * 属性filterName声明过滤器的名称,可选
 * 属性urlPatterns指定要过滤 的URL模式,也可使用属性value来声明.(指定要过滤的URL模式是必选属性)
 *
 * @author   单红宇(365384722)
 * @myblog  http://blog.csdn.net/catoop/
 * @create    2016年1月6日
 */
public class Webfilter implements Filter {

    @Override
    public void destroy() {
        System.out.println("过滤器销毁");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response,
                         FilterChain chain) throws IOException, ServletException {
        //((HttpServletResponse)response).setHeader("Access-Control-Allow-Origin", "*");
        System.out.println("执行过滤操作");
        if(response instanceof HttpServletResponse) {
            HttpServletResponse alteredResponse = ((HttpServletResponse)response);
            alteredResponse.addHeader("Access-Control-Allow-Origin", "*");
            alteredResponse.addHeader("Access-Control-Allow-Methods", "POST,GET");
            alteredResponse.addHeader("Access-Control-Allow-Headers", "X-PINGOTHER, Origin, X-Requested-With, Content-Type, Accept");
            alteredResponse.addHeader("Access-Control-Max-Age", "1728000");
        }
        if(request.getParameter("userid")==null){
            chain.doFilter(request, response);
        }else{
            chain.doFilter(request, response);
        }
    }

    @Override
    public void init(FilterConfig config) throws ServletException {
        System.out.println("过滤器初始化");
    }

}
