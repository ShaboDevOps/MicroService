package com.kayaTech.Service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kayaTech.Model.ExchangeValue;

public interface ExchangeValueRepo extends JpaRepository<ExchangeValue, Long> {

	ExchangeValue findByFromAndTo(String from, String to);
}