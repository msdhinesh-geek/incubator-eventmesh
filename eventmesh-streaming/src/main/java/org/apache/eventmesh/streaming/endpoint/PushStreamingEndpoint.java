package org.apache.eventmesh.streaming.endpoint;

import java.util.List;
import java.util.Map;

import org.apache.camel.Exchange;
import org.apache.camel.spi.BrowsableEndpoint;
import org.apache.eventmesh.streaming.component.StreamingComponent;

public class PushStreamingEndpoint extends DefaultStreamingEndpoint implements BrowsableEndpoint{

	public PushStreamingEndpoint(String uri, StreamingComponent streamingComponent,
			Map<String, Object> parameters) {
		super(uri,streamingComponent,parameters);
	}

	@Override
	public List<Exchange> getExchanges() {
		// TODO Auto-generated method stub
		return null;
	}


}
