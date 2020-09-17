
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
 * Camel endpoint configuration for {@link com.twilio.rest.api.v2010.account.sip.domain.IpAccessControlListMapping}.
 */
@ApiParams(apiName = "sip-domain-ip-access-control-list-mapping", description = "",
           apiMethods = {@ApiMethod(methodName = "creator", description="Create a IpAccessControlListMappingCreator to execute create", signatures={"com.twilio.rest.api.v2010.account.sip.domain.IpAccessControlListMappingCreator creator(String pathDomainSid, String ipAccessControlListSid)", "com.twilio.rest.api.v2010.account.sip.domain.IpAccessControlListMappingCreator creator(String pathAccountSid, String pathDomainSid, String ipAccessControlListSid)"}), @ApiMethod(methodName = "deleter", description="Create a IpAccessControlListMappingDeleter to execute delete", signatures={"com.twilio.rest.api.v2010.account.sip.domain.IpAccessControlListMappingDeleter deleter(String pathDomainSid, String pathSid)", "com.twilio.rest.api.v2010.account.sip.domain.IpAccessControlListMappingDeleter deleter(String pathAccountSid, String pathDomainSid, String pathSid)"}), @ApiMethod(methodName = "fetcher", description="Create a IpAccessControlListMappingFetcher to execute fetch", signatures={"com.twilio.rest.api.v2010.account.sip.domain.IpAccessControlListMappingFetcher fetcher(String pathDomainSid, String pathSid)", "com.twilio.rest.api.v2010.account.sip.domain.IpAccessControlListMappingFetcher fetcher(String pathAccountSid, String pathDomainSid, String pathSid)"}), @ApiMethod(methodName = "reader", description="Create a IpAccessControlListMappingReader to execute read", signatures={"com.twilio.rest.api.v2010.account.sip.domain.IpAccessControlListMappingReader reader(String pathDomainSid)", "com.twilio.rest.api.v2010.account.sip.domain.IpAccessControlListMappingReader reader(String pathAccountSid, String pathDomainSid)"}), }, aliases = {"^creator$=create", "^deleter$=delete", "^fetcher$=fetch", "^reader$=read", "^updater$=update"})
@UriParams
@Configurer
public final class SipDomainIpAccessControlListMappingEndpointConfiguration extends TwilioConfiguration {
    @UriParam
    @ApiParam(apiMethods = {@ApiMethod(methodName = "creator", description="The unique id of the IP access control list to map to the SIP domain")})
    private String ipAccessControlListSid;
    @UriParam
    @ApiParam(apiMethods = {@ApiMethod(methodName = "creator", description="The unique id of the Account that is responsible for this resource"), @ApiMethod(methodName = "deleter", description="The unique id of the Account that is responsible for this resource"), @ApiMethod(methodName = "fetcher", description="The unique id of the Account that is responsible for this resource"), @ApiMethod(methodName = "reader", description="The unique id of the Account that is responsible for this resource")})
    private String pathAccountSid;
    @UriParam
    @ApiParam(apiMethods = {@ApiMethod(methodName = "creator", description="A string that uniquely identifies the SIP Domain"), @ApiMethod(methodName = "creator", description="A string that uniquely identifies the SIP Domain"), @ApiMethod(methodName = "deleter", description="A string that uniquely identifies the SIP Domain"), @ApiMethod(methodName = "deleter", description="A string that uniquely identifies the SIP Domain"), @ApiMethod(methodName = "fetcher", description="A string that uniquely identifies the SIP Domain"), @ApiMethod(methodName = "fetcher", description="A string that uniquely identifies the SIP Domain"), @ApiMethod(methodName = "reader", description="A string that uniquely identifies the SIP Domain"), @ApiMethod(methodName = "reader", description="A string that uniquely identifies the SIP Domain")})
    private String pathDomainSid;
    @UriParam
    @ApiParam(apiMethods = {@ApiMethod(methodName = "deleter", description="A 34 character string that uniquely identifies the resource to delete."), @ApiMethod(methodName = "fetcher", description="A 34 character string that uniquely identifies the resource to fetch.")})
    private String pathSid;

    public String getIpAccessControlListSid() {
        return ipAccessControlListSid;
    }

    public void setIpAccessControlListSid(String ipAccessControlListSid) {
        this.ipAccessControlListSid = ipAccessControlListSid;
    }

    public String getPathAccountSid() {
        return pathAccountSid;
    }

    public void setPathAccountSid(String pathAccountSid) {
        this.pathAccountSid = pathAccountSid;
    }

    public String getPathDomainSid() {
        return pathDomainSid;
    }

    public void setPathDomainSid(String pathDomainSid) {
        this.pathDomainSid = pathDomainSid;
    }

    public String getPathSid() {
        return pathSid;
    }

    public void setPathSid(String pathSid) {
        this.pathSid = pathSid;
    }
}
