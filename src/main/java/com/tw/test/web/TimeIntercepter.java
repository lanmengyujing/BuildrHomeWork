//package com.tw.test.web;
//
//
//import org.springframework.web.servlet.HandlerInterceptor;
//import org.springframework.web.servlet.ModelAndView;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.util.Date;
//
//
//public class TimeIntercepter implements HandlerInterceptor {
//
//    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object o, Exception e) throws Exception {
//        System.out.println("afterCompletion");
//        System.out.print(new Date().toString());
//    }
//
//    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) throws Exception {
//        System.out.println("pre-handle");
//        System.out.println(new Date().toString());
//        return true;
//    }
//
//    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object o, ModelAndView modelAndView) throws Exception {
//        Date date = new Date();
//        request.setAttribute("time", date.toString());
//
//        System.out.println("Post-handle");
//        System.out.println(new Date().toString());
//    }
//
//
//
//}
