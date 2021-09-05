package org.apache.eventmesh.streaming.endpoint;

import java.util.Map;

import org.apache.camel.AsyncEndpoint;
import org.apache.camel.Category;
import org.apache.camel.Consumer;
import org.apache.camel.MultipleConsumersSupport;
import org.apache.camel.Processor;
import org.apache.camel.Producer;
import org.apache.camel.Service;
import org.apache.camel.spi.UriEndpoint;
import org.apache.camel.support.DefaultEndpoint;
import org.apache.eventmesh.streaming.component.StreamingComponent;

@UriEndpoint(firstVersion = "1.0.0",title="EventMesh Stream",scheme="eventmesh",syntax="eventmesh:destinationType:destinationName",category= {Category.MESSAGING,Category.STREAMS})
public class DefaultStreamingEndpoint extends DefaultEndpoint implements AsyncEndpoint, MultipleConsumersSupport, Service {

	public DefaultStreamingEndpoint(String uri, StreamingComponent streamingComponent, Map<String, Object> parameters) {
		super(uri,streamingComponent);
		setProperties(this, parameters);
	}

	@Override
	public Producer createProducer() throws Exception {
		return null;
	}

	@Override
	public Consumer createConsumer(Processor processor) throws Exception {
		return null;
	}

	@Override
	public boolean isMultipleConsumersSupported() {
		return true;
	}

}
