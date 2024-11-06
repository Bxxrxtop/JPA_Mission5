package com.example.jpa.repository.review;

import com.example.jpa.domain.common.Restaurant;
import com.example.jpa.domain.common.Review;
import com.example.jpa.domain.common.User;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class ReviewRepositoryImpl implements ReviewRepositoryCustom{
    private final EntityManager entityManager;
    public Review createReview(String content, Double score, User user, Restaurant restaurant) {
        Review review = Review.
                builder()
                .content(content)
                .score(score)
                .user(user)
                .restaurant(restaurant)
                .build();
        entityManager.persist(review);
        return review;
    }
}
