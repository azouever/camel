
/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.google.calendar;

import org.apache.camel.spi.Configurer;
import org.apache.camel.spi.ApiMethod;
import org.apache.camel.spi.ApiParam;
import org.apache.camel.spi.ApiParams;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel endpoint configuration for {@link com.google.api.services.calendar.Calendar$Freebusy}.
 */
@ApiParams(apiName = "freebusy", description = "The freebusy collection of methods",
           apiMethods = {@ApiMethod(methodName = "query", description="Returns free/busy information for a set of calendars", signatures={"com.google.api.services.calendar.Calendar$Freebusy$Query query(com.google.api.services.calendar.model.FreeBusyRequest content)"})}, aliases = {})
@UriParams
@Configurer
public final class CalendarFreebusyEndpointConfiguration extends GoogleCalendarConfiguration {
    @UriParam
    @ApiParam(apiMethods = {@ApiMethod(methodName = "query", description="The com.google.api.services.calendar.model.FreeBusyRequest")})
    private com.google.api.services.calendar.model.FreeBusyRequest content;

    public com.google.api.services.calendar.model.FreeBusyRequest getContent() {
        return content;
    }

    public void setContent(com.google.api.services.calendar.model.FreeBusyRequest content) {
        this.content = content;
    }
}
