package com.onlineshop.model.entity;

import jakarta.persistence.*;
        import lombok.*;

        import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "online_wallet")
public class OnlineWalletEntity  {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "id_customer")
    @NonNull private Long taxId;

    @Column(name = "credit_card")
    private String credit_card;

}
