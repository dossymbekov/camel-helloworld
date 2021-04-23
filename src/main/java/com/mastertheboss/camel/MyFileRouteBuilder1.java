package com.mastertheboss.camel;

import org.apache.camel.builder.RouteBuilder;

import java.io.FileInputStream;
import java.util.Properties;

public class MyFileRouteBuilder1 extends RouteBuilder {

    @Override
    public void configure() throws Exception {

        Properties properties = new Properties();
        properties.load(this.getClass().getClassLoader().getResourceAsStream("app.properties"));
        String source = properties.getProperty("source_folder");
        String destination = properties.getProperty("destination_folder");
        //from("file:src/data/1/in/")
          //      .to("file:src/data/1/out/");
        from("file:"+source)
                .to("file:"+destination);
    }
}
