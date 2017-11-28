/*
 * Copyright 2000-2017 Vaadin Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.vaadin.guice.server;

import static com.google.common.collect.Streams.stream;
import com.vaadin.flow.component.*;
import com.vaadin.flow.di.*;
import com.vaadin.flow.router.*;
import com.vaadin.flow.server.*;

import java.util.stream.*;

/**
 * The default Guice instantiator.
 *
 * @author Vaadin Ltd
 */
class GuiceInstantiator extends DefaultInstantiator {

    private final GuiceVaadinServlet servlet;

    /**
     * Creates a new guice instantiator instance.
     *
     * @param service the service to use
     */
    GuiceInstantiator(GuiceVaadinServletService service) {
        super(service);

        servlet = (GuiceVaadinServlet) service.getServlet();
    }

    @Override
    public <T> T getOrCreate(Class<T> type) {
        return servlet.getInjector().getInstance(type);
    }

    @Override
    public Stream<VaadinServiceInitListener> getServiceInitListeners() {
        Stream<VaadinServiceInitListener> guiceListeners = stream(servlet.getServiceInitListeners());

        return Stream.concat(super.getServiceInitListeners(), guiceListeners);
    }
}
