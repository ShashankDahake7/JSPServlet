package com.codingninjas;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.io.File;
import java.io.InputStream;

@Path("/notifications")
public class NotificationsResource {

    @GET
    @Path("/ping")
    public Response ping() {
        return Response.ok().entity("Service online").build();
    }

    @GET
    @Path("/get/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getNotification(@PathParam("id") int id) {
        return Response.ok()
                .entity(new Notification(id, "Jack", "Test notification"))
                .build();
    }

    @POST
    @Path("/post/")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response postNotification(Notification notification) {
        return Response.status(Response.Status.CREATED).entity(notification).build();
    }

    @GET
    @Path("/download")
    @Produces(MediaType.TEXT_PLAIN)
    public Response downloadFile() {
        File file = new File("example.txt");
        return Response.ok(file).build();
    }

    @POST
    @Path("/upload")
    @Consumes(MediaType.MULTIPART_FORM_DATA)
    public Response uploadFile(@FormParam("file") InputStream fileInputStream) {
        return Response.ok("File uploaded successfully").build();
    }
}
