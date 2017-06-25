package com.example.mrt.breakfast.service;



import com.example.mrt.breakfast.models.Product;

import java.util.List;

/**
 * Created by Dell on 24-Jun-17.
 */
public interface SearchListener {

    void complete(List<Product> products);

    void fail(Throwable t);
}
