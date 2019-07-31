/*******************************************************************************
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
 ******************************************************************************/
package org.apache.sling.scripting.sightly.impl.compiler.debug;

import org.apache.sling.scripting.sightly.impl.compiler.ris.Command;
import org.apache.sling.scripting.sightly.impl.compiler.ris.CommandHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Handler which logs all commands
 */
public final class LoggingHandler implements CommandHandler {

    public static final LoggingHandler INSTANCE = new LoggingHandler();

    private final Logger LOG = LoggerFactory.getLogger(LoggingHandler.class);

    private  LoggingHandler() {
    }

    @Override
    public void onEmit(Command command) {
        LOG.info("Emitting {}", command);
    }

    @Override
    public void onError(String errorMessage) {
        LOG.info("Error: {}", errorMessage);
    }

    @Override
    public void onDone() {
        LOG.info("Finished");
    }
}