package ru.bia.test.testrest;

import javax.ws.rs.ext.ParamConverter;
import javax.ws.rs.ext.ParamConverterProvider;
import javax.ws.rs.ext.Provider;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

@Provider
public class MyParamConverterProvider implements ParamConverterProvider {

    @Override

    public <T> ParamConverter<T> getConverter(Class<T> rawType, Type genericType, Annotation[] annotations) {

        if(rawType.equals(Ints.class)){

            return (ParamConverter<T>) new MyParamConverter();

        }

        return null;

    }

}