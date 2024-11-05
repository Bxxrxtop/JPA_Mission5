package com.example.jpa.service.restaurantService;

import com.example.jpa.domain.common.Restaurant;
import com.example.jpa.repository.restaurantRepository.RestaurantRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class RestaurantQueryServiceImpl implements RestaurantQueryService{

    private final RestaurantRepository restaurantRepository;
    @Override
    public Optional<Restaurant> findStore(Long id) {
        return restaurantRepository.findById(id);
    }

    @Override
    public List<Restaurant> findStoresByNameAndScore(String name, Double score) {
        List<Restaurant> filteredRestaurants = restaurantRepository.dynamicQueryWithBooleanBuilder(name, score);

        filteredRestaurants.forEach(restaurant -> System.out.println("Restaurant: " + restaurant));

        return filteredRestaurants;
    }
}
