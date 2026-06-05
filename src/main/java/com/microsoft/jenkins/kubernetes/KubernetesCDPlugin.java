/*
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.jenkins.kubernetes;

import hudson.Plugin;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class KubernetesCDPlugin extends Plugin {
    private static final Logger LOGGER = Logger.getLogger(KubernetesCDPlugin.class.getName());

    public static void sendEvent(String item, String action, String... properties) {
        Map<String, String> props = new HashMap<>();
        for (int i = 1; i < properties.length; ++i) {
            props.put(properties[i - 1], properties[i]);
        }
        sendEvent(item, action, props);
    }

    public static void sendEvent(String item, String action, Map<String, String> properties) {
        // Telemetry removed: previously used AppInsightsClientFactory
        // Log the event at FINE level for debugging purposes
        if (LOGGER.isLoggable(java.util.logging.Level.FINE)) {
            LOGGER.fine("Event: " + item + "/" + action + " " + properties);
        }
    }
}
