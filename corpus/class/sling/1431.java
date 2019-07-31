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
package org.apache.sling.cassandra.resource.provider;

import org.apache.sling.api.resource.LoginException;
import org.apache.sling.api.resource.PersistenceException;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import javax.servlet.http.HttpServletRequest;
import java.util.Iterator;
import java.util.Map;

public class CassandraResourceResolver implements ResourceResolver {

    public Resource resolve(HttpServletRequest httpServletRequest, String s) {
        //To change body of implemented methods use File | Settings | File Templates.
        return null;
    }

    public Resource resolve(String s) {
        //To change body of implemented methods use File | Settings | File Templates.
        return null;
    }

    public Resource resolve(HttpServletRequest httpServletRequest) {
        //To change body of implemented methods use File | Settings | File Templates.
        return null;
    }

    public String map(String s) {
        //To change body of implemented methods use File | Settings | File Templates.
        return null;
    }

    public String map(HttpServletRequest httpServletRequest, String s) {
        //To change body of implemented methods use File | Settings | File Templates.
        return null;
    }

    public Resource getResource(String s) {
        //To change body of implemented methods use File | Settings | File Templates.
        return null;
    }

    public Resource getResource(Resource resource, String s) {
        //To change body of implemented methods use File | Settings | File Templates.
        return null;
    }

    public String[] getSearchPath() {
        //To change body of implemented methods use File | Settings | File Templates.
        return new String[0];
    }

    public Iterator<Resource> listChildren(Resource resource) {
        //To change body of implemented methods use File | Settings | File Templates.
        return null;
    }

    public Iterable<Resource> getChildren(Resource resource) {
        //To change body of implemented methods use File | Settings | File Templates.
        return null;
    }

    public Iterator<Resource> findResources(String s, String s1) {
        //To change body of implemented methods use File | Settings | File Templates.
        return null;
    }

    public Iterator<Map<String, Object>> queryResources(String s, String s1) {
        //To change body of implemented methods use File | Settings | File Templates.
        return null;
    }

    public ResourceResolver clone(Map<String, Object> stringObjectMap) throws LoginException {
        //To change body of implemented methods use File | Settings | File Templates.
        return null;
    }

    public boolean isLive() {
        //To change body of implemented methods use File | Settings | File Templates.
        return false;
    }

    public void close() {
    //To change body of implemented methods use File | Settings | File Templates.
    }

    public String getUserID() {
        //To change body of implemented methods use File | Settings | File Templates.
        return null;
    }

    public Iterator<String> getAttributeNames() {
        //To change body of implemented methods use File | Settings | File Templates.
        return null;
    }

    public Object getAttribute(String s) {
        //To change body of implemented methods use File | Settings | File Templates.
        return null;
    }

    public void delete(Resource resource) throws PersistenceException {
    //To change body of implemented methods use File | Settings | File Templates.
    }

    public Resource create(Resource resource, String s, Map<String, Object> stringObjectMap) throws PersistenceException {
        //To change body of implemented methods use File | Settings | File Templates.
        return null;
    }

    public void revert() {
    //To change body of implemented methods use File | Settings | File Templates.
    }

    public void commit() throws PersistenceException {
    //To change body of implemented methods use File | Settings | File Templates.
    }

    public boolean hasChanges() {
        //To change body of implemented methods use File | Settings | File Templates.
        return false;
    }

    public String getParentResourceType(Resource resource) {
        //To change body of implemented methods use File | Settings | File Templates.
        return null;
    }

    public String getParentResourceType(String s) {
        //To change body of implemented methods use File | Settings | File Templates.
        return null;
    }

    public boolean isResourceType(Resource resource, String s) {
        //To change body of implemented methods use File | Settings | File Templates.
        return false;
    }

    public void refresh() {
    //To change body of implemented methods use File | Settings | File Templates.
    }

    public <AdapterType> AdapterType adaptTo(Class<AdapterType> adapterTypeClass) {
        //To change body of implemented methods use File | Settings | File Templates.
        return null;
    }
}
