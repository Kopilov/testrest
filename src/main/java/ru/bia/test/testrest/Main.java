package ru.bia.test.testrest;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.WebResourceRoot;
import org.apache.catalina.core.StandardContext;
import org.apache.catalina.startup.Tomcat;
import org.apache.catalina.webresources.DirResourceSet;
import org.apache.catalina.webresources.StandardRoot;

import javax.servlet.ServletException;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    private static Tomcat tomcat;
    public static void main(String[] args) {
        try {
            if (tomcat != null) {
                return;
            }
            tomcat = new Tomcat();
            String webappDirLocation = "webapp/";

            //The port that we should run on can be set into an environment variable
            //Look for that variable and default to 8080 if it isn't there.
            String webPort = System.getenv("MY_HTTP_PORT");
            if(webPort == null || webPort.isEmpty()) {
                webPort = "8080";
            }

            tomcat.setPort(Integer.valueOf(webPort));

            File webappDir = new File("./" + webappDirLocation);
            webappDir.mkdirs();
            StandardContext ctx = (StandardContext) tomcat.addWebapp("/", webappDir.getAbsolutePath());
            System.out.println("configuring app with basedir: " + webappDir.getAbsolutePath());

            // Declare an alternative location for your "WEB-INF/classes" dir
            // Servlet 3.0 annotation will work
            File additionWebInfClasses = new File(".");
            WebResourceRoot resources = new StandardRoot(ctx);
            resources.addPreResources(new DirResourceSet(resources, "/WEB-INF/classes",
                    additionWebInfClasses.getAbsolutePath(), "/"));
            ctx.setResources(resources);

            tomcat.start();
            tomcat.getServer().await();
        } catch (ServletException | LifecycleException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
