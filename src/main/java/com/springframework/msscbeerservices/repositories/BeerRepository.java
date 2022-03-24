package com.springframework.msscbeerservices.repositories;

import com.springframework.msscbeerservices.Domain.Beer;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {
}
