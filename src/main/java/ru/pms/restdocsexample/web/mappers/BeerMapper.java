package ru.pms.restdocsexample.web.mappers;


import org.mapstruct.Mapper;
import ru.pms.restdocsexample.domain.Beer;
import ru.pms.restdocsexample.web.model.BeerDto;


@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto BeerToBeerDto(Beer beer);

    Beer BeerDtoToBeer(BeerDto dto);
}