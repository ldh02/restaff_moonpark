package com.restaff.moonpark.services;

import javax.jws.WebService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Date;

/**
 * Created by DHLE on 6/26/2016.
 */
@Path("/")
@WebService(name = "moonParkService")
public interface MoonParkService {

    @GET
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    @Path("/getMoonParkPrice")
    public Response getPrice(
            @QueryParam("checkInDate") Date checkInDate,
            @QueryParam("checkOutDate") Date checkOutDate,
            @QueryParam("moonParkCode") String moonParkCode);
}
