package com.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BeeCostProduct {

    private String product_base_id;
    private Integer historical_sold;
    private String name;
    private Double price;
    private Double price_before_discount;
    private Integer rating_avg;
    private Integer rating_count;
    private String url_thumbnail;

    public BeeCostProduct() {
    }

    public String getProduct_base_id() {
        return product_base_id;
    }

    public void setProduct_base_id(String product_base_id) {
        this.product_base_id = product_base_id;
    }

    public Integer getHistorical_sold() {
        return historical_sold;
    }

    public void setHistorical_sold(Integer historical_sold) {
        this.historical_sold = historical_sold;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getPrice_before_discount() {
        return price_before_discount;
    }

    public void setPrice_before_discount(Double price_before_discount) {
        this.price_before_discount = price_before_discount;
    }

    public Integer getRating_avg() {
        return rating_avg;
    }

    public void setRating_avg(Integer rating_avg) {
        this.rating_avg = rating_avg;
    }

    public Integer getRating_count() {
        return rating_count;
    }

    public void setRating_count(Integer rating_count) {
        this.rating_count = rating_count;
    }

    public String getUrl_thumbnail() {
        return url_thumbnail;
    }

    public void setUrl_thumbnail(String url_thumbnail) {
        this.url_thumbnail = url_thumbnail;
    }

    @Override
    public String toString() {
        return "BeeCostProduct{" +
                "product_base_id='" + product_base_id + '\'' +
                ", historical_sold=" + historical_sold +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", price_before_discount=" + price_before_discount +
                ", rating_avg=" + rating_avg +
                ", rating_count=" + rating_count +
                ", url_thumbnail='" + url_thumbnail + '\'' +
                '}';
    }
}
