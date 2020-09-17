
/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.twilio;

import org.apache.camel.spi.Configurer;
import org.apache.camel.spi.ApiMethod;
import org.apache.camel.spi.ApiParam;
import org.apache.camel.spi.ApiParams;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel endpoint configuration for {@link com.twilio.rest.api.v2010.account.conference.Participant}.
 */
@ApiParams(apiName = "conference-participant", description = "",
           apiMethods = {@ApiMethod(methodName = "creator", description="Create a ParticipantCreator to execute create", signatures={"com.twilio.rest.api.v2010.account.conference.ParticipantCreator creator(String pathConferenceSid, com.twilio.type.PhoneNumber from, com.twilio.type.PhoneNumber to)", "com.twilio.rest.api.v2010.account.conference.ParticipantCreator creator(String pathAccountSid, String pathConferenceSid, com.twilio.type.PhoneNumber from, com.twilio.type.PhoneNumber to)"}), @ApiMethod(methodName = "deleter", description="Create a ParticipantDeleter to execute delete", signatures={"com.twilio.rest.api.v2010.account.conference.ParticipantDeleter deleter(String pathConferenceSid, String pathCallSid)", "com.twilio.rest.api.v2010.account.conference.ParticipantDeleter deleter(String pathAccountSid, String pathConferenceSid, String pathCallSid)"}), @ApiMethod(methodName = "fetcher", description="Create a ParticipantFetcher to execute fetch", signatures={"com.twilio.rest.api.v2010.account.conference.ParticipantFetcher fetcher(String pathConferenceSid, String pathCallSid)", "com.twilio.rest.api.v2010.account.conference.ParticipantFetcher fetcher(String pathAccountSid, String pathConferenceSid, String pathCallSid)"}), @ApiMethod(methodName = "reader", description="Create a ParticipantReader to execute read", signatures={"com.twilio.rest.api.v2010.account.conference.ParticipantReader reader(String pathConferenceSid)", "com.twilio.rest.api.v2010.account.conference.ParticipantReader reader(String pathAccountSid, String pathConferenceSid)"}), @ApiMethod(methodName = "updater", description="Create a ParticipantUpdater to execute update", signatures={"com.twilio.rest.api.v2010.account.conference.ParticipantUpdater updater(String pathConferenceSid, String pathCallSid)", "com.twilio.rest.api.v2010.account.conference.ParticipantUpdater updater(String pathAccountSid, String pathConferenceSid, String pathCallSid)"}), }, aliases = {"^creator$=create", "^deleter$=delete", "^fetcher$=fetch", "^reader$=read", "^updater$=update"})
@UriParams
@Configurer
public final class ConferenceParticipantEndpointConfiguration extends TwilioConfiguration {
    @UriParam
    @ApiParam(apiMethods = {@ApiMethod(methodName = "creator", description="The phone number, Client identifier, or username portion of SIP address that made this call.")})
    private com.twilio.type.PhoneNumber from;
    @UriParam
    @ApiParam(apiMethods = {@ApiMethod(methodName = "creator", description="The SID of the Account that will create the resource"), @ApiMethod(methodName = "deleter", description="The SID of the Account that created the resources to delete"), @ApiMethod(methodName = "fetcher", description="The SID of the Account that created the resource to fetch"), @ApiMethod(methodName = "reader", description="The SID of the Account that created the resources to read"), @ApiMethod(methodName = "updater", description="The SID of the Account that created the resources to update")})
    private String pathAccountSid;
    @UriParam
    @ApiParam(apiMethods = {@ApiMethod(methodName = "deleter", description="The Call SID or URL encoded label of the participant to delete"), @ApiMethod(methodName = "fetcher", description="The Call SID or URL encoded label of the participant to fetch"), @ApiMethod(methodName = "updater", description="The Call SID or URL encoded label of the participant to update")})
    private String pathCallSid;
    @UriParam
    @ApiParam(apiMethods = {@ApiMethod(methodName = "creator", description="The SID of the participant's conference"), @ApiMethod(methodName = "creator", description="The SID of the participant's conference"), @ApiMethod(methodName = "deleter", description="The SID of the conference with the participants to delete"), @ApiMethod(methodName = "deleter", description="The SID of the participant's conference"), @ApiMethod(methodName = "fetcher", description="The SID of the conference with the participant to fetch"), @ApiMethod(methodName = "fetcher", description="The SID of the participant's conference"), @ApiMethod(methodName = "reader", description="The SID of the conference with the participants to read"), @ApiMethod(methodName = "reader", description="The SID of the participant's conference"), @ApiMethod(methodName = "updater", description="The SID of the conference with the participant to update"), @ApiMethod(methodName = "updater", description="The SID of the participant's conference")})
    private String pathConferenceSid;
    @UriParam
    @ApiParam(apiMethods = {@ApiMethod(methodName = "creator", description="The phone number, SIP address or Client identifier that received this call.")})
    private com.twilio.type.PhoneNumber to;

    public com.twilio.type.PhoneNumber getFrom() {
        return from;
    }

    public void setFrom(com.twilio.type.PhoneNumber from) {
        this.from = from;
    }

    public String getPathAccountSid() {
        return pathAccountSid;
    }

    public void setPathAccountSid(String pathAccountSid) {
        this.pathAccountSid = pathAccountSid;
    }

    public String getPathCallSid() {
        return pathCallSid;
    }

    public void setPathCallSid(String pathCallSid) {
        this.pathCallSid = pathCallSid;
    }

    public String getPathConferenceSid() {
        return pathConferenceSid;
    }

    public void setPathConferenceSid(String pathConferenceSid) {
        this.pathConferenceSid = pathConferenceSid;
    }

    public com.twilio.type.PhoneNumber getTo() {
        return to;
    }

    public void setTo(com.twilio.type.PhoneNumber to) {
        this.to = to;
    }
}
