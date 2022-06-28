package com.wellington.beerapi.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.wellington.beerapi.dto.BeerDTO;
import com.wellington.beerapi.entity.Beer;

@Mapper
public interface BeerMapper {

    BeerMapper INSTANCE = Mappers.getMapper(BeerMapper.class);

    Beer toModel(BeerDTO beerDTO);

    BeerDTO toDTO(Beer beer);
}
