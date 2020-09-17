
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
 * Camel endpoint configuration for {@link com.twilio.rest.api.v2010.account.Queue}.
 */
@ApiParams(apiName = "queue", description = "",
           apiMethods = {@ApiMethod(methodName = "creator", description="Create a QueueCreator to execute create", signatures={"com.twilio.rest.api.v2010.account.QueueCreator creator(String friendlyName)", "com.twilio.rest.api.v2010.account.QueueCreator creator(String pathAccountSid, String friendlyName)"}), @ApiMethod(methodName = "deleter", description="Create a QueueDeleter to execute delete", signatures={"com.twilio.rest.api.v2010.account.QueueDeleter deleter(String pathSid)", "com.twilio.rest.api.v2010.account.QueueDeleter deleter(String pathAccountSid, String pathSid)"}), @ApiMethod(methodName = "fetcher", description="Create a QueueFetcher to execute fetch", signatures={"com.twilio.rest.api.v2010.account.QueueFetcher fetcher(String pathSid)", "com.twilio.rest.api.v2010.account.QueueFetcher fetcher(String pathAccountSid, String pathSid)"}), @ApiMethod(methodName = "reader", description="Create a QueueReader to execute read", signatures={"com.twilio.rest.api.v2010.account.QueueReader reader()", "com.twilio.rest.api.v2010.account.QueueReader reader(String pathAccountSid)"}), @ApiMethod(methodName = "updater", description="Create a QueueUpdater to execute update", signatures={"com.twilio.rest.api.v2010.account.QueueUpdater updater(String pathSid)", "com.twilio.rest.api.v2010.account.QueueUpdater updater(String pathAccountSid, String pathSid)"}), }, aliases = {"^creator$=create", "^deleter$=delete", "^fetcher$=fetch", "^reader$=read", "^updater$=update"})
@UriParams
@Configurer
public final class QueueEndpointConfiguration extends TwilioConfiguration {
    @UriParam
    @ApiParam(apiMethods = {@ApiMethod(methodName = "creator", description="A string to describe this resource")})
    private String friendlyName;
    @UriParam
    @ApiParam(apiMethods = {@ApiMethod(methodName = "creator", description="The SID of the Account that will create the resource"), @ApiMethod(methodName = "deleter", description="The SID of the Account that created the resource(s) to delete"), @ApiMethod(methodName = "fetcher", description="The SID of the Account that created the resource(s) to fetch"), @ApiMethod(methodName = "reader", description="The SID of the Account that created the resource(s) to fetch"), @ApiMethod(methodName = "updater", description="The SID of the Account that created the resource(s) to update")})
    private String pathAccountSid;
    @UriParam
    @ApiParam(apiMethods = {@ApiMethod(methodName = "deleter", description="The unique string that identifies this resource"), @ApiMethod(methodName = "fetcher", description="The unique string that identifies this resource"), @ApiMethod(methodName = "updater", description="The unique string that identifies this resource")})
    private String pathSid;

    public String getFriendlyName() {
        return friendlyName;
    }

    public void setFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
    }

    public String getPathAccountSid() {
        return pathAccountSid;
    }

    public void setPathAccountSid(String pathAccountSid) {
        this.pathAccountSid = pathAccountSid;
    }

    public String getPathSid() {
        return pathSid;
    }

    public void setPathSid(String pathSid) {
        this.pathSid = pathSid;
    }
}
