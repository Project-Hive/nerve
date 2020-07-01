package rip.bolt.nerve.api;

import java.io.IOException;

import javax.ws.rs.client.ClientRequestContext;
import javax.ws.rs.client.ClientRequestFilter;

import rip.bolt.nerve.config.AppData;

public class AuthorisationHeaderFilter implements ClientRequestFilter {

    @Override
    public void filter(ClientRequestContext requestContext) throws IOException {
        if (AppData.API.getKey() != null)
            requestContext.getHeaders().add("Authorization", "Bearer " + AppData.API.getKey());
    }

}
