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
package org.jbpm.process.codegen;

import org.kie.kogito.MapInput;
import org.kie.kogito.MapInputId;
import org.kie.kogito.MapOutput;

import java.util.Map;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import org.kie.kogito.MappableToModel;
import org.kie.kogito.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.eclipse.microprofile.openapi.annotations.media.Schema;

public class XXXModel implements Model, MapInput, MapInputId, MapOutput,
                                 MappableToModel<$modelClass$> {

    // This class is only ever used as an ephemeral REST request-body carrier (POST/PATCH),
    // so it always tracks modifications - unlike the Model/Output class, it never plays a
    // "plain, untracked" role, so this can safely be eager/non-null from construction.
    @JsonIgnore
    @Schema(hidden = true)
    private transient final Set<String> __modifiedFields = new HashSet<>();

    @JsonIgnore
    @Schema(hidden = true)
    @Override
    public Set<String> getModifiedFields() {
        return __modifiedFields;
    }

    // Package-private: invoked from generated setters as each field is deserialized,
    // so an omitted field and an explicit null can be told apart downstream.
    void markModified(String field) {
        __modifiedFields.add(field);
    }

}
