package com.mousycoder.chain;

/**
 * @author mousycoder
 * @version 1.0
 * @description: TODO
 * @date 2022/2/22 11:54 AM
 */
public abstract class RiskControlManager {

    protected String name;

    protected RiskControlManager superior;

    public RiskControlManager(String name) {
        this.name = name;
    }

    public void setSuperior(RiskControlManager superior) {
        this.superior = superior;
    }

    public abstract void handlerRequest(Request request);




}
