package ru.bia.test.testrest;

import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;


/**
 * Jersey resources list loaded on Grizzly startup
 */
public class ApplicationConfig extends ResourceConfig {

    public ApplicationConfig() {
        super(
                Rest.class,
                JsonbResource.class,
                JsonbResourceInt.class,
                JacksonFeature.class,
                MyParamConverterProvider.class
        );
    }


}

