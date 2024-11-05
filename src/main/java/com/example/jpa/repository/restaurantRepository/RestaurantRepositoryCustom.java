package com.example.jpa.repository.restaurantRepository;

import com.example.jpa.domain.common.Restaurant;
import org.apache.catalina.Store;

import java.util.List;

public interface RestaurantRepositoryCustom {
    List<Restaurant> dynamicQueryWithBooleanBuilder(String name, Double score);
}
