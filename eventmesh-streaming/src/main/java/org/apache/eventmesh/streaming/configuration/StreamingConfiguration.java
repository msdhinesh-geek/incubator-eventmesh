package org.apache.eventmesh.streaming.configuration;

import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.apache.eventmesh.common.config.ConfigurationWrapper;

@UriParams
public class StreamingConfiguration {

	    public static final String BROADCAST = "broadcast:";
	    
	    private static final Logger LOGGER = LoggerFactory.getLogger(StreamingConfiguration.class);
	    
	    private ConfigurationWrapper configurationWrapper;
	    
	    @UriParam(description = "Message queue broker plugin")
	    private String ConnectorPluginType;
	    
	    @UriParam(description = "proucer group name", label = "producer")
	    private String producerGroup;
	    
	    @UriParam(description = "", label = "producer,consumer")
	    private String instanceName;
	    
	    @UriParam(description = "mesh idc", label = "producer,consumer")
	    private String meshIdc;
	    
	    @UriParam(description = "Broadcast is enabled", label = "producer,consumer",defaultValue="true")
	    private Boolean isBroadcast;
	    
	    @UriParam(description = "consumer group name", label = "consumer")
	    private String consumerGroup;
	    
	    
}
