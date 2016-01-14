/*
 * Copyright (c) 2015 Pradeeban Kathiravelu and others. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.opendaylight.messaging4transport.constants;

/**
 * Constants of Messaging4Transport
 */
public final class Messaging4TransportConstants {

    private Messaging4TransportConstants() {
        throw new AssertionError("Instantiating utility class Messaging4TransportConstants.");
    }

    /**
     * Boolean to integrate whether the Broker deployment is karaf based or external. ActiveMQ broker is the default
     * external broker.
     */
    public static final boolean IS_KARAF_BASED = false;

    /**
     * Default topic event destination for AMQP
     */
    public static final String AMQP_TOPIC_EVENT_DESTINATION = "topic://event";

    /**
     * ActiveMQ Host key in the key, value mapping.
     */
    public static final String ACTIVEMQ_HOST_KEY = "ACTIVEMQ_HOST";

    /**
     * ActiveMQ Host value in the key, value mapping.
     */
    public static final String ACTIVEMQ_HOST_VALUE = "localhost";

    /**
     * ActiveMQ Port key in the key, value mapping.
     */
    public static final String ACTIVEMQ_PORT_KEY = "ACTIVEMQ_PORT";

    /**
     * ActiveMQ Port value in the key, value mapping.
     */
    public static final String ACTIVEMQ_PORT_VALUE = "5672";

    /**
     * AMQP default topic prefix.
     */
    public static final String AMQP_TOPIC_PREFIX = "topic://";

    /**
     * AMQP Connection URI Key.
     */
    public static final String CONNECTION_URI_KEY = "ACTIVEMQ_CONNECTION_URI";

    /**
     * AMQP Connection URI Value.
     */
    public static final String CONNECTION_URI_VALUE = "amqp://" + ACTIVEMQ_HOST_VALUE + ":" + ACTIVEMQ_PORT_VALUE;
}

