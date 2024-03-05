package com.onlineshop.model.entity;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "suppliers")
public class SupplierEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "name_company")
    @NonNull private String name_company;

    @Column(name = "phone_number")
    @NonNull private String phone_number;

    @Column(name = "email")
    @NonNull private String email;

    @Column(name = "password")
    @NonNull private String password;

    @Column(name = "phone")
    @NonNull private String phone;

    @OneToOne(fetch = FetchType.LAZY,
            cascade = CascadeType.ALL,
            orphanRemoval = true)
    @JoinColumn(name = "onlinewallet_id",
            referencedColumnName = "id")
    @NonNull private OnlineWalletEntity onlineWallet;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(
            name = "product_supplier",
            joinColumns = @JoinColumn(name = "supplier_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "product_id", referencedColumnName = "id"))
    @NonNull private Set<ProductEntity> products;
}
