
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
 * Camel endpoint configuration for {@link com.google.api.services.calendar.Calendar$Events}.
 */
@ApiParams(apiName = "events", description = "The events collection of methods",
           apiMethods = {@ApiMethod(methodName = "calendarImport", description="Imports an event", signatures={"com.google.api.services.calendar.Calendar$Events$CalendarImport calendarImport(String calendarId, com.google.api.services.calendar.model.Event content)"}), @ApiMethod(methodName = "delete", description="Deletes an event", signatures={"com.google.api.services.calendar.Calendar$Events$Delete delete(String calendarId, String eventId)"}), @ApiMethod(methodName = "get", description="Returns an event", signatures={"com.google.api.services.calendar.Calendar$Events$Get get(String calendarId, String eventId)"}), @ApiMethod(methodName = "insert", description="Creates an event", signatures={"com.google.api.services.calendar.Calendar$Events$Insert insert(String calendarId, com.google.api.services.calendar.model.Event content)"}), @ApiMethod(methodName = "instances", description="Returns instances of the specified recurring event", signatures={"com.google.api.services.calendar.Calendar$Events$Instances instances(String calendarId, String eventId)"}), @ApiMethod(methodName = "list", description="Returns events on the specified calendar", signatures={"com.google.api.services.calendar.Calendar$Events$List list(String calendarId)"}), @ApiMethod(methodName = "move", description="Moves an event to another calendar, i", signatures={"com.google.api.services.calendar.Calendar$Events$Move move(String calendarId, String eventId, String destination)"}), @ApiMethod(methodName = "patch", description="Updates an event", signatures={"com.google.api.services.calendar.Calendar$Events$Patch patch(String calendarId, String eventId, com.google.api.services.calendar.model.Event content)"}), @ApiMethod(methodName = "quickAdd", description="Creates an event based on a simple text string", signatures={"com.google.api.services.calendar.Calendar$Events$QuickAdd quickAdd(String calendarId, String text)"}), @ApiMethod(methodName = "update", description="Updates an event", signatures={"com.google.api.services.calendar.Calendar$Events$Update update(String calendarId, String eventId, com.google.api.services.calendar.model.Event content)"}), @ApiMethod(methodName = "watch", description="Watch for changes to Events resources", signatures={"com.google.api.services.calendar.Calendar$Events$Watch watch(String calendarId, com.google.api.services.calendar.model.Channel content)"})}, aliases = {})
@UriParams
@Configurer
public final class CalendarEventsEndpointConfiguration extends GoogleCalendarConfiguration {
    @UriParam
    @ApiParam(apiMethods = {@ApiMethod(methodName = "calendarImport", description="Calendar identifier. To retrieve calendar IDs call the calendarList.list method. If you want to access the primary calendar of the currently logged in user, use the primary keyword."), @ApiMethod(methodName = "delete", description="Calendar identifier. To retrieve calendar IDs call the calendarList.list method. If you want to access the primary calendar of the currently logged in user, use the primary keyword."), @ApiMethod(methodName = "get", description="Calendar identifier. To retrieve calendar IDs call the calendarList.list method. If you want to access the primary calendar of the currently logged in user, use the primary keyword."), @ApiMethod(methodName = "insert", description="Calendar identifier. To retrieve calendar IDs call the calendarList.list method. If you want to access the primary calendar of the currently logged in user, use the primary keyword."), @ApiMethod(methodName = "instances", description="Calendar identifier. To retrieve calendar IDs call the calendarList.list method. If you want to access the primary calendar of the currently logged in user, use the primary keyword."), @ApiMethod(methodName = "list", description="Calendar identifier. To retrieve calendar IDs call the calendarList.list method. If you want to access the primary calendar of the currently logged in user, use the primary keyword."), @ApiMethod(methodName = "move", description="Calendar identifier of the source calendar where the event currently is on"), @ApiMethod(methodName = "patch", description="Calendar identifier. To retrieve calendar IDs call the calendarList.list method. If you want to access the primary calendar of the currently logged in user, use the primary keyword."), @ApiMethod(methodName = "quickAdd", description="Calendar identifier. To retrieve calendar IDs call the calendarList.list method. If you want to access the primary calendar of the currently logged in user, use the primary keyword."), @ApiMethod(methodName = "update", description="Calendar identifier. To retrieve calendar IDs call the calendarList.list method. If you want to access the primary calendar of the currently logged in user, use the primary keyword."), @ApiMethod(methodName = "watch", description="Calendar identifier. To retrieve calendar IDs call the calendarList.list method. If you want to access the primary calendar of the currently logged in user, use the primary keyword.")})
    private String calendarId;
    @UriParam
    @ApiParam(apiMethods = {@ApiMethod(methodName = "calendarImport", description="The com.google.api.services.calendar.model.Event"), @ApiMethod(methodName = "insert", description="The com.google.api.services.calendar.model.Event"), @ApiMethod(methodName = "patch", description="The com.google.api.services.calendar.model.Event"), @ApiMethod(methodName = "update", description="The com.google.api.services.calendar.model.Event")})
    private com.google.api.services.calendar.model.Event content;
    @UriParam
    @ApiParam(apiMethods = {@ApiMethod(methodName = "watch", description="The com.google.api.services.calendar.model.Channel")})
    private com.google.api.services.calendar.model.Channel contentChannel;
    @UriParam
    @ApiParam(apiMethods = {@ApiMethod(methodName = "move", description="Calendar identifier of the target calendar where the event is to be moved to")})
    private String destination;
    @UriParam
    @ApiParam(apiMethods = {@ApiMethod(methodName = "delete", description="Event identifier"), @ApiMethod(methodName = "get", description="Event identifier"), @ApiMethod(methodName = "instances", description="Recurring event identifier"), @ApiMethod(methodName = "move", description="Event identifier"), @ApiMethod(methodName = "patch", description="Event identifier"), @ApiMethod(methodName = "update", description="Event identifier")})
    private String eventId;
    @UriParam
    @ApiParam(apiMethods = {@ApiMethod(methodName = "quickAdd", description="The text describing the event to be created")})
    private String text;

    public String getCalendarId() {
        return calendarId;
    }

    public void setCalendarId(String calendarId) {
        this.calendarId = calendarId;
    }

    public com.google.api.services.calendar.model.Event getContent() {
        return content;
    }

    public void setContent(com.google.api.services.calendar.model.Event content) {
        this.content = content;
    }

    public com.google.api.services.calendar.model.Channel getContentChannel() {
        return contentChannel;
    }

    public void setContentChannel(com.google.api.services.calendar.model.Channel contentChannel) {
        this.contentChannel = contentChannel;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
