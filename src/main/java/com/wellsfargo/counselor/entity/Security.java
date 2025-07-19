package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Security {

    @Id
    @GeneratedValue()
    private long securityId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private LocalDate purchaseDate;

     @Column(nullable = false)
    private Double purchasePrice;

     @Column(nullable = false)
    private int quantity;

     @ManyToOne()
    @JoinColumn(name = "portfolio_Id", nullable = false)
    private Portfolio portfolio;

     protected Security(){}

    public Security(String name,String category, LocalDate purchaseDate, Double purchasePrice, int quantity, Portfolio portfolio){

         this.name=name;
         this.purchaseDate=purchaseDate;
         this.portfolio=portfolio;
         this.category=category;
         this.purchasePrice=purchasePrice;
         this.quantity=quantity;

    }

    public long getSecurityId() {
        return securityId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(Double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public LocalDate getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(LocalDate purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }
}
