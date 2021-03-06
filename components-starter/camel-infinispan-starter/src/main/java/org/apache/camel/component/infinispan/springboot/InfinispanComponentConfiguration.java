/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.component.infinispan.springboot;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.component.infinispan.InfinispanComponent;
import org.apache.camel.component.infinispan.InfinispanOperation;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.DeprecatedConfigurationProperty;

/**
 * Read and write from/to Infinispan distributed key/value store and data grid.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.springboot.maven.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.component.infinispan")
public class InfinispanComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the infinispan component. This is
     * enabled by default.
     */
    private Boolean enabled;
    /**
     * Component configuration. The option is a
     * org.apache.camel.component.infinispan.InfinispanConfiguration type.
     */
    private String configuration;
    /**
     * Specifies the host of the cache on Infinispan instance
     */
    private String hosts;
    /**
     * Specifies the query builder. The option is a
     * org.apache.camel.component.infinispan.InfinispanQueryBuilder type.
     */
    private String queryBuilder;
    /**
     * Allows for bridging the consumer to the Camel routing Error Handler,
     * which mean any exceptions occurred while the consumer is trying to pickup
     * incoming messages, or the likes, will now be processed as a message and
     * handled by the routing Error Handler. By default the consumer will use
     * the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that
     * will be logged at WARN or ERROR level and ignored.
     */
    private Boolean bridgeErrorHandler = false;
    /**
     * If true, the listener will be installed for the entire cluster
     */
    private Boolean clusteredListener = false;
    /**
     * The operation to perform.
     */
    @Deprecated
    private String command = "PUT";
    /**
     * Returns the custom listener in use, if provided. The option is a
     * org.apache.camel.component.infinispan.InfinispanCustomListener type.
     */
    private String customListener;
    /**
     * Specifies the set of event types to register by the consumer. Multiple
     * event can be separated by comma. The possible event types are:
     * CACHE_ENTRY_ACTIVATED, CACHE_ENTRY_PASSIVATED, CACHE_ENTRY_VISITED,
     * CACHE_ENTRY_LOADED, CACHE_ENTRY_EVICTED, CACHE_ENTRY_CREATED,
     * CACHE_ENTRY_REMOVED, CACHE_ENTRY_MODIFIED, TRANSACTION_COMPLETED,
     * TRANSACTION_REGISTERED, CACHE_ENTRY_INVALIDATED, DATA_REHASHED,
     * TOPOLOGY_CHANGED, PARTITION_STATUS_CHANGED
     */
    private String eventTypes;
    /**
     * If true, the consumer will receive notifications synchronously
     */
    private Boolean sync = true;
    /**
     * Whether the producer should be started lazy (on the first message). By
     * starting lazy you can use this to allow CamelContext and routes to
     * startup in situations where a producer may otherwise fail during starting
     * and cause the route to fail being started. By deferring this startup to
     * be lazy then the startup failure can be handled during routing messages
     * via Camel's routing error handlers. Beware that when the first message is
     * processed then creating and starting the producer may take a little time
     * and prolong the total processing time of the processing.
     */
    private Boolean lazyStartProducer = false;
    /**
     * The operation to perform.
     */
    private InfinispanOperation operation = InfinispanOperation.PUT;
    /**
     * Whether the component should use basic property binding (Camel 2.x) or
     * the newer property binding with additional capabilities
     */
    @Deprecated
    private Boolean basicPropertyBinding = false;
    /**
     * Specifies the cache Container to connect. The option is a
     * org.infinispan.commons.api.BasicCacheContainer type.
     */
    private String cacheContainer;
    /**
     * The CacheContainer configuration. Uses if the cacheContainer is not
     * defined. Must be the following types:
     * org.infinispan.client.hotrod.configuration.Configuration - for remote
     * cache interaction configuration;
     * org.infinispan.configuration.cache.Configuration - for embedded cache
     * interaction configuration;. The option is a java.lang.Object type.
     */
    private String cacheContainerConfiguration;
    /**
     * Implementation specific properties for the CacheManager
     */
    private Map<String, String> configurationProperties;
    /**
     * An implementation specific URI for the CacheManager
     */
    private String configurationUri;
    /**
     * A comma separated list of Flag to be applied by default on each cache
     * invocation, not applicable to remote caches.
     */
    private String flags;
    /**
     * Set a specific remappingFunction to use in a compute operation. The
     * option is a java.util.function.BiFunction type.
     */
    private String remappingFunction;
    /**
     * Store the operation result in a header instead of the message body. By
     * default, resultHeader == null and the query result is stored in the
     * message body, any existing content in the message body is discarded. If
     * resultHeader is set, the value is used as the name of the header to store
     * the query result and the original message body is preserved. This value
     * can be overridden by an in message header named:
     * CamelInfinispanOperationResultHeader. The option is a java.lang.Object
     * type.
     */
    private String resultHeader;

    public String getConfiguration() {
        return configuration;
    }

    public void setConfiguration(String configuration) {
        this.configuration = configuration;
    }

    public String getHosts() {
        return hosts;
    }

    public void setHosts(String hosts) {
        this.hosts = hosts;
    }

    public String getQueryBuilder() {
        return queryBuilder;
    }

    public void setQueryBuilder(String queryBuilder) {
        this.queryBuilder = queryBuilder;
    }

    public Boolean getBridgeErrorHandler() {
        return bridgeErrorHandler;
    }

    public void setBridgeErrorHandler(Boolean bridgeErrorHandler) {
        this.bridgeErrorHandler = bridgeErrorHandler;
    }

    public Boolean getClusteredListener() {
        return clusteredListener;
    }

    public void setClusteredListener(Boolean clusteredListener) {
        this.clusteredListener = clusteredListener;
    }

    @Deprecated
    @DeprecatedConfigurationProperty
    public String getCommand() {
        return command;
    }

    @Deprecated
    public void setCommand(String command) {
        this.command = command;
    }

    public String getCustomListener() {
        return customListener;
    }

    public void setCustomListener(String customListener) {
        this.customListener = customListener;
    }

    public String getEventTypes() {
        return eventTypes;
    }

    public void setEventTypes(String eventTypes) {
        this.eventTypes = eventTypes;
    }

    public Boolean getSync() {
        return sync;
    }

    public void setSync(Boolean sync) {
        this.sync = sync;
    }

    public Boolean getLazyStartProducer() {
        return lazyStartProducer;
    }

    public void setLazyStartProducer(Boolean lazyStartProducer) {
        this.lazyStartProducer = lazyStartProducer;
    }

    public InfinispanOperation getOperation() {
        return operation;
    }

    public void setOperation(InfinispanOperation operation) {
        this.operation = operation;
    }

    @Deprecated
    @DeprecatedConfigurationProperty
    public Boolean getBasicPropertyBinding() {
        return basicPropertyBinding;
    }

    @Deprecated
    public void setBasicPropertyBinding(Boolean basicPropertyBinding) {
        this.basicPropertyBinding = basicPropertyBinding;
    }

    public String getCacheContainer() {
        return cacheContainer;
    }

    public void setCacheContainer(String cacheContainer) {
        this.cacheContainer = cacheContainer;
    }

    public String getCacheContainerConfiguration() {
        return cacheContainerConfiguration;
    }

    public void setCacheContainerConfiguration(
            String cacheContainerConfiguration) {
        this.cacheContainerConfiguration = cacheContainerConfiguration;
    }

    public Map<String, String> getConfigurationProperties() {
        return configurationProperties;
    }

    public void setConfigurationProperties(
            Map<String, String> configurationProperties) {
        this.configurationProperties = configurationProperties;
    }

    public String getConfigurationUri() {
        return configurationUri;
    }

    public void setConfigurationUri(String configurationUri) {
        this.configurationUri = configurationUri;
    }

    public String getFlags() {
        return flags;
    }

    public void setFlags(String flags) {
        this.flags = flags;
    }

    public String getRemappingFunction() {
        return remappingFunction;
    }

    public void setRemappingFunction(String remappingFunction) {
        this.remappingFunction = remappingFunction;
    }

    public String getResultHeader() {
        return resultHeader;
    }

    public void setResultHeader(String resultHeader) {
        this.resultHeader = resultHeader;
    }
}