package com.philipap.forex.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.philipap.forex.entity.ExchangeValue;

public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long> {
	ExchangeValue findByFromAndTo(String from, String to);
}
