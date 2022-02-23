package com.mousycoder.flyweight;

/**
 * @author mousycoder
 * @version 1.0
 * @description: TODO
 * @date 2022/2/21 9:53 PM
 */
public class ConcreteWebSite extends CloudWebSite {

    private String category ;

    public ConcreteWebSite(String category) {
        this.category = category;
    }

    @Override
    public void run(Company company) {
        System.out.println("网站分类："+ category + "公司:" + company.getName());
    }
}
