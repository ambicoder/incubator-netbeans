/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.netbeans.modules.j2ee.ejbcore.ui;

import java.util.prefs.Preferences;
import org.openide.util.NbPreferences;

public class EJBPreferences {

    private static final String AGREED_DELETE_EJB_GENERATED_SOURCES = "agreeDeleteEJBGeneratedSources"; // NOI18N
    private static final String AGREED_CREATE_SERVER_RESOURCES = "agreeCreateServerResources"; // NOI18N

    public boolean isAgreedDeleteEJBGeneratedSources() {
        return prefs().getBoolean(AGREED_DELETE_EJB_GENERATED_SOURCES, false);
    }
    
    public void setAgreedDeleteEJBGeneratedSources(boolean agreed) {
        prefs().putBoolean(AGREED_DELETE_EJB_GENERATED_SOURCES, agreed);
    }
    
    public boolean isAgreedCreateServerResources() {
        return prefs().getBoolean(AGREED_CREATE_SERVER_RESOURCES, true);
    }
    
    public void setAgreedCreateServerResources(boolean agreed) {
        prefs().putBoolean(AGREED_CREATE_SERVER_RESOURCES, agreed);
    }

    private Preferences prefs() {
        return NbPreferences.forModule(EJBPreferences.class);
    }

}
