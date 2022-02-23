package com.mousycoder.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author mousycoder
 * @version 1.0
 * @description: TODO
 * @date 2022/2/21 9:56 PM
 */
public class WebSiteFactory {

    private Map<String, ConcreteWebSite> map = new HashMap<>();

    public CloudWebSite getWebSiteByCategory(String category) {
        if (map.containsKey(category)) {
            return map.get(category);
        } else {
            ConcreteWebSite site = new ConcreteWebSite(category);
            map.put(category, site);
            return site;
        }
    }

    public int getWebsiteCategorySize() {
        return map.size();
    }
}
