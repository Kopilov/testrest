package ru.bia.test.testrest;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.ws.rs.ext.ParamConverter;
import java.io.IOException;

public class MyParamConverter implements ParamConverter<Ints> {

    @Override
    public Ints fromString(String s){

        try {
            Ints ints = new Ints();
            ints.iii = new ObjectMapper().readerFor(Integer[].class).readValue(s);
            return ints;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public String toString(Ints mo){
        try {
            return new ObjectMapper().writerFor(Integer[].class).writeValueAsString(mo.iii);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
    }

}