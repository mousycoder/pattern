package com.mousycoder.flyweight;

/**
 * @author mousycoder
 * @version 1.0
 * @description: TODO
 * @date 2022/2/21 10:01 PM
 */
public class Main {
    public static void main(String[] args) {
        WebSiteFactory factory = new WebSiteFactory();
        CloudWebSite companySite1 = factory.getWebSiteByCategory("企业官网");
        companySite1.run(new Company("小D"));


        CloudWebSite companySite2 = factory.getWebSiteByCategory("企业官网");
        companySite2.run(new Company("xuyao"));


        CloudWebSite companySite3 = factory.getWebSiteByCategory("信息流");
        companySite3.run(new Company("byteDance"));

        CloudWebSite companySite4 = factory.getWebSiteByCategory("信息流");
        companySite4.run(new Company("uc news"));



        System.out.println("网站分类总数：" + factory.getWebsiteCategorySize());




    }
}
