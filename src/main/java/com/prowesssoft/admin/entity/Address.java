package com.prowesssoft.admin.entity;

import lombok.*;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Setter
@Data
@Getter
@Entity
@Table(name = "address")
public class Address {

    @Id
    @Column(name = "address_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String city;
    private String coloney;
    private String pinCode;





}
