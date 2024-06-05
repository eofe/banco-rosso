package com.bancorosso;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/banco-rosso")
public class BancoRossoResource {

    @GET
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response status(){
        return Response.ok("The Banco rosso app is app and running!")
                .type(MediaType.APPLICATION_JSON_TYPE)
                .status(Response.Status.OK)
                .build();
    }
}
