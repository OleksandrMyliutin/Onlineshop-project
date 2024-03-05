package com.onlineshop.model.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;
import java.util.UUID;


@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "customer")
public class CustomerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "name")
    @NonNull private String name;

    @Column(name = "password")
    @NonNull private String password;

    @Column(name = "phone_number")
    @NonNull private String phone_number;


    @Column(name = "location")
    @NonNull private String location;

    @Column(name = "mail")
    @NonNull private String mail;

    @OneToOne(fetch = FetchType.LAZY,
            cascade = CascadeType.ALL,
            orphanRemoval = true)
    @JoinColumn(name = "id_online_wallet",
            referencedColumnName = "id")
    private OnlineWalletEntity onlineWalletEntities;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "id_order",
            referencedColumnName = "id")
    private Set<OrderEntity> orderEntity;


}