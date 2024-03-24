package com.thebytegatherer.example;

import org.mapstruct.Mapper;

@Mapper
public interface KeyValueMapper {

    KeyValueResponse requestToResponse(KeyValueRequest keyValueRequest);
}