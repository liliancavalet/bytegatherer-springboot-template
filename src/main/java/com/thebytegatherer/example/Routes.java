package com.thebytegatherer.example;

import org.mapstruct.factory.Mappers;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RequestMapping("/v1")
@RestController
public class Routes {

    private final KeyValueMapper mapper = Mappers.getMapper(KeyValueMapper.class);

    @PostMapping
    public @ResponseBody KeyValueResponse createKeyValue(@Valid @RequestBody KeyValueRequest keyValueRequest){
        return mapper.requestToResponse(keyValueRequest);
    }
}