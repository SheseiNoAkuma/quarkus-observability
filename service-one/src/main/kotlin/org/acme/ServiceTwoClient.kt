package org.acme

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient
import javax.ws.rs.GET
import javax.ws.rs.Path

@RegisterRestClient(configKey = "serviceTwo-api")
interface ServiceTwoClient {

    @GET
    @Path("/hello")
    fun hello(): String
}
