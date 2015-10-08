/*
 * Copyright (c) 2014 Cisco Systems, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.opendaylight.controller.cluster.datastore.config;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

public class ResourceConfigurationReader implements ConfigurationReader {
    @Override
    public Config read() {
        return ConfigFactory.load();
    }
}