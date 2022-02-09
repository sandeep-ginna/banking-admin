package com.prowesssoft.admin.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Setter
@Data
@Entity
@Table(name = "bank_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    private String email;
    private Integer phoneNumber;
    private String userId;
    private String password;

    @ManyToOne
    @JoinColumn(name = "address_id")
    private Address address;


    @OneToMany(mappedBy = "user",fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Account> accounts;

}

