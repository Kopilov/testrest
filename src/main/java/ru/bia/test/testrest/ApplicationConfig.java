package ru.bia.test.testrest;

import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.jackson.internal.jackson.jaxrs.json.JacksonJsonProvider;

import java.util.Set;
import javax.ws.rs.core.Application;

@javax.ws.rs.ApplicationPath("webresources")
public class ApplicationConfig extends Application {

    /**
     *
     * @author aleksandr
     */

        @Override
        public Set<Class<?>> getClasses() {
            Set<Class<?>> resources = new java.util.HashSet<>();
            addRestResourceClasses(resources);
            return resources;
        }

        /**
         * Do not modify addRestResourceClasses() method.
         * It is automatically populated with
         * all resources defined in the project.
         * If required, comment out calling this method in getClasses().
         */
        private void addRestResourceClasses(Set<Class<?>> resources) {
            resources.add(ru.bia.test.testrest.Rest.class);
//            resources.add(org.glassfish.json.jaxrs.JsonStructureBodyReader.class);
  //          resources.add(org.glassfish.json.jaxrs.JsonStructureBodyWriter.class);
            //resources.add(JacksonJsonProvider.class);
            resources.add(JacksonFeature.class);
        }


}
