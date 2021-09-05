package org.apache.eventmesh.streaming.component;
import java.util.Map;

import org.apache.camel.Endpoint;
import org.apache.camel.support.DefaultComponent;
import org.apache.camel.util.ObjectHelper;
import org.apache.camel.util.StringHelper;
import org.apache.eventmesh.streaming.configuration.StreamingConfiguration;
import org.apache.eventmesh.streaming.endpoint.DefaultStreamingEndpoint;
import org.apache.eventmesh.streaming.endpoint.PushStreamingEndpoint;

public class StreamingComponent extends DefaultComponent{

	@Override
	protected Endpoint createEndpoint(String uri, String remaining, Map<String, Object> parameters) throws Exception {
		
		boolean pubsubDomain = false;
		if(ObjectHelper.isNotEmpty(remaining)) {
			if(remaining.startsWith(StreamingConfiguration.BROADCAST)) {
				pubsubDomain = true;
				remaining = StringHelper.removeStartingCharacters(remaining.substring(StreamingConfiguration.BROADCAST.length()), '/');
			}
		}
		
		DefaultStreamingEndpoint endpoint;
		if(pubsubDomain) {
			endpoint = new PushStreamingEndpoint(uri,this,parameters);
		}else {
			endpoint = new DefaultStreamingEndpoint(uri,this,parameters);
		}
		setProperties(endpoint, parameters);
		return endpoint;
	}

}
