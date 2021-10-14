package com.cubeweek;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestBasicController {

    @RequestMapping(value="/test/basic", method=RequestMethod.GET)
    @ResponseStatus(value=HttpStatus.OK)
    public String getApiGet() {
        return "{\"type\":\"GET\"}";
    }

    @RequestMapping(value="/test/basic", method=RequestMethod.POST)
    @ResponseStatus(value=HttpStatus.OK)
    public String getApiPost() {
        return "{\"type\":\"POST\"}";
    }

    @RequestMapping(value="/test/basic", method=RequestMethod.PUT)
    @ResponseStatus(value=HttpStatus.OK)
    public String getApiPut() {
        return "{\"type\":\"PUT}";
    }

    @RequestMapping(value="/test/basic", method=RequestMethod.DELETE)
    @ResponseStatus(value=HttpStatus.OK)
    public String getApiDelete() {
        return "{\"type\":\"DELETE\"}";
    }

    @RequestMapping(value="/test/basic", method=RequestMethod.PATCH)
    @ResponseStatus(value=HttpStatus.OK)
    public String getApiPatch() {
        return "{\"type\":\"PATCH\"}";
    }
}
