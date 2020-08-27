package ru.pms.restdocsexample.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import ru.pms.restdocsexample.domain.Beer;

import java.util.UUID;

public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {
}
