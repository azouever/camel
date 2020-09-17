
/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.box;

import org.apache.camel.spi.Configurer;
import org.apache.camel.spi.ApiMethod;
import org.apache.camel.spi.ApiParam;
import org.apache.camel.spi.ApiParams;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel endpoint configuration for {@link org.apache.camel.component.box.api.BoxEventLogsManager}.
 */
@ApiParams(apiName = "event-logs", description = "Provides operations to read Box enterprise (admin) event logs",
           apiMethods = {@ApiMethod(methodName = "getEnterpriseEvents", description="Create an event stream with optional starting initial position and add listener that will be notified when an event is received", signatures={"java.util.List<com.box.sdk.BoxEvent> getEnterpriseEvents(String position, java.util.Date after, java.util.Date before, com.box.sdk.BoxEvent$Type[] types)"})}, aliases = {"getEnterpriseEvents=events"})
@UriParams
@Configurer
public final class BoxEventLogsManagerEndpointConfiguration extends BoxConfiguration {
    @UriParam
    @ApiParam(apiMethods = {@ApiMethod(methodName = "getEnterpriseEvents", description="The lower bound on the timestamp of the events returned")})
    private java.util.Date after;
    @UriParam
    @ApiParam(apiMethods = {@ApiMethod(methodName = "getEnterpriseEvents", description="The upper bound on the timestamp of the events returned")})
    private java.util.Date before;
    @UriParam
    @ApiParam(apiMethods = {@ApiMethod(methodName = "getEnterpriseEvents", description="The starting position of the event stream. May be null in which case all events within bounds returned.")})
    private String position;
    @UriParam
    @ApiParam(apiMethods = {@ApiMethod(methodName = "getEnterpriseEvents", description="An optional list of event types to filter by")})
    private com.box.sdk.BoxEvent.Type[] types;

    public java.util.Date getAfter() {
        return after;
    }

    public void setAfter(java.util.Date after) {
        this.after = after;
    }

    public java.util.Date getBefore() {
        return before;
    }

    public void setBefore(java.util.Date before) {
        this.before = before;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public com.box.sdk.BoxEvent.Type[] getTypes() {
        return types;
    }

    public void setTypes(com.box.sdk.BoxEvent.Type[] types) {
        this.types = types;
    }
}
