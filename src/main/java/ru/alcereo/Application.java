package ru.alcereo;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader;

import java.io.StringWriter;
import java.util.Arrays;
import java.util.Properties;

/**
 * Created by alcereo on 20.05.17.
 */
public class Application {

    private static EntityData entity;

    public static void main(String[] args) throws Exception {

        Properties props = new Properties();
        props.setProperty("resource.loader", "class");
        props.setProperty("class.resource.loader.class", ClasspathResourceLoader.class.getName());

        VelocityEngine ve = new VelocityEngine(props);

        ve.init();

        Template template = ve.getTemplate("entity.vm");

        VelocityContext context = new VelocityContext();
        context.put("entity", getEntity());

        StringWriter writer = new StringWriter();

        template.merge(context, writer);

        System.out.println(writer.toString());


    }

    public static EntityData getEntity() {
        return new EntityData("commands",
                "CommandsEntity",
                Arrays.asList(
                        new AttributeData(
                                "String",
                                "name",
                                "Name",
                                "name"
                        ),
                        new AttributeData(
                                "String",
                                "someParameter",
                                "SomeParameter",
                                "parameter"
                        ),
                        new AttributeData(
                                "int",
                                "count",
                                "Count",
                                "counter"
                        )
                ),
                new AttributeData(
                        "int",
                        "id",
                        "Id",
                        "id"
                )
        );
    }
}
