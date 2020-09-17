
/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.braintree;

import org.apache.camel.spi.Configurer;
import org.apache.camel.spi.ApiMethod;
import org.apache.camel.spi.ApiParam;
import org.apache.camel.spi.ApiParams;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel endpoint configuration for {@link com.braintreegateway.DiscountGateway}.
 */
@ApiParams(apiName = "discount", description = "",
           apiMethods = {@ApiMethod(methodName = "all", signatures={"java.util.List<com.braintreegateway.Discount> all()"})}, aliases = {})
@UriParams
@Configurer
public final class DiscountGatewayEndpointConfiguration extends BraintreeConfiguration {
}
