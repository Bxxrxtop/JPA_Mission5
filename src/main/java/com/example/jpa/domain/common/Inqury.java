package com.example.jpa.domain.common;

import jakarta.persistence.*;
import lombok.*;

import java.awt.*;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Inqury extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 15)
    private String title;

    @Column(nullable = true)
    private String content;

    @Column(nullable = true)
    private String picture;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;


}

