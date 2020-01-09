package com.sopra.LocAway.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sopra.LocAway.model.CustomPrice;

public interface ICustomPriceRepository extends JpaRepository<CustomPrice, Long> {

}
