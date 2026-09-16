package com.portfolio.app.model;

import java.util.ArrayList;
import java.util.List;

public class User {

    private String userId;
    private String name;
    private String email;

    private List<Holding> holdings;

    public User(String userId, String name, String email) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.holdings = new ArrayList<>();
    }

    public void addHolding(Holding holding) {
        holdings.add(holding);
    }

    public List<Holding> getHoldings() {
        return holdings;
    }

    public void display() {
        System.out.println("User ID  : " + userId);
        System.out.println("Name     : " + name);
        System.out.println("Email    : " + email);
        System.out.println("Holdings : " + holdings.size());
    }
}