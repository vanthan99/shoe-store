package com.shoesstore.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
@Getter
@Setter
public class Supplier extends BaseEntity {

    @Column(length = 50)
    private String name;

    @Column(length = 10)
    private String phoneNumber;

    @Column(length = 50)
    private String address;

    private String logo;
}
