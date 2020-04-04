package io.yadnyesh.yadrestdocsexample.mappers;

import io.yadnyesh.yadrestdocsexample.model.Beer;
import io.yadnyesh.yadrestdocsexample.model.BeerDto;
import org.mapstruct.Mapper;


@Mapper(uses = {DateMapper.class})
public interface BeerMapper {
	
	BeerDto BeerToBeerDto(Beer beer);
	
	Beer BeerDtoToBeer(BeerDto dto);
}

