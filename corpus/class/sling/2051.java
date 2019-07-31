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
package org.apache.sling.cassandra.resource.provider.mapper;

/**
 * This interface provides extensibility to implement any Cassandra Mapper to return a given CQL query
 */
public interface CassandraMapper {

    /**
     *
     * @param columnFamilySelector - Corresponding cassandra column family name
     * @param path - Absolute path to the sling resource
     * @return - String value of the appropriate CQL based on columnFamilySelector and path
     */
    String getCQL(String columnFamilySelector, String path) throws CassandraMapperException;
}
