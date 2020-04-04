package io.yadnyesh.yadrestdocsexample.repository;
import io.yadnyesh.yadrestdocsexample.model.Beer;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

/**
 * Created by jt on 2019-05-17.
 */
public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {
}

