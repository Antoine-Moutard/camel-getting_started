package fr.pantheonsorbonne.ufr27.miage.camel;

import org.apache.camel.builder.RouteBuilder;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CamelTutorial extends RouteBuilder {

    @Override
    public void configure() throws Exception {
          from("file:data/inbox").to("sjms2:M1.fileexchange");
        from("sjms2:M1.fileexchange").to("file:data/outbox");
    }
}