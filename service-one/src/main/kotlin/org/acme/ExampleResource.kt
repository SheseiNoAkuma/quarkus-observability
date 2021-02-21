package org.acme

import org.eclipse.microprofile.rest.client.inject.RestClient
import org.jboss.logging.Logger
import javax.inject.Inject
import javax.ws.rs.GET
import javax.ws.rs.Path

@Path("/hello")
class ExampleResource @Inject constructor(@RestClient val serviceTwoClient: ServiceTwoClient) {

    private val log: Logger = Logger.getLogger(ExampleResource::class.java)

    @GET
    fun hello() : String {
        log.info("some info here")
        val hello = serviceTwoClient.hello()
        return """hi this is service one
            |and this is what service two said: $hello"""
    }
}
