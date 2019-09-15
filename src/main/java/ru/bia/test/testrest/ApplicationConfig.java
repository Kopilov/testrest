package ru.bia.test.testrest;

import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;


public class ApplicationConfig extends ResourceConfig {

    public ApplicationConfig() {
        super(ru.bia.test.testrest.Rest.class,
                ru.bia.test.testrest.JsonbResource.class,
                ru.bia.test.testrest.JsonbResourceInt.class,
                JacksonFeature.class,
                MyParamConverterProvider.class);
    }


}

