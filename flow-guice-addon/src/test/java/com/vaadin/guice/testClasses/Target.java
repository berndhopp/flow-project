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
package com.vaadin.guice.testClasses;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.server.VaadinRequest;

public class Target extends UI {
    @Inject
    private Prototype1 prototype1;

    @Inject
    private Singleton1 singleton1;

    @Inject
    private UIScoped1 uiScoped1;

    @Inject
    private UIScoped2 uiScoped2;

    @Inject
    private Provider<Prototype1> prototype1Provider;

    @Inject
    private Provider<Singleton1> singleton1Provider;

    @Inject
    private Provider<UIScoped1> uiScoped1Provider;

    @Inject
    private Provider<UIScoped2> uiScoped2Provider;

    public Prototype1 getPrototype1() {
        return prototype1;
    }

    public void setPrototype1(Prototype1 prototype1) {
        this.prototype1 = prototype1;
    }

    public Singleton1 getSingleton1() {
        return singleton1;
    }

    public void setSingleton1(Singleton1 singleton1) {
        this.singleton1 = singleton1;
    }

    public UIScoped1 getUiScoped1() {
        return uiScoped1;
    }

    public void setUiScoped1(UIScoped1 uiScoped1) {
        this.uiScoped1 = uiScoped1;
    }

    public UIScoped2 getUiScoped2() {
        return uiScoped2;
    }

    public void setUiScoped2(UIScoped2 uiScoped2) {
        this.uiScoped2 = uiScoped2;
    }

    public Provider<Prototype1> getPrototype1Provider() {
        return prototype1Provider;
    }

    public Provider<Singleton1> getSingleton1Provider() {
        return singleton1Provider;
    }

    public Provider<UIScoped1> getUiScoped1Provider() {
        return uiScoped1Provider;
    }

    public Provider<UIScoped2> getUiScoped2Provider() {
        return uiScoped2Provider;
    }

    @Override
    protected void init(VaadinRequest request) {
    }
}
