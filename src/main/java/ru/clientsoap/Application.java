package ru.clientsoap;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.clientsoap.client.SoapClient;
import ru.clientsoap.config.SoapConfig;
import ru.clientsoap.wsdl.GetTimeResponse;

public class Application {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SoapConfig.class);

        SoapClient soapClient = ctx.getBean(SoapClient.class);
        GetTimeResponse response = soapClient.getDateTimeRemote(1);
        System.out.println(response.getDatetime());
    }

}

