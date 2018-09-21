/*
 * Copyright 2018 ThoughtWorks, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package cd.go.artifact.docker.registry.model;

import cd.go.artifact.docker.registry.annotation.FieldMetadata;
import cd.go.artifact.docker.registry.annotation.Validatable;
import cd.go.artifact.docker.registry.utils.Util;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ArtifactStoreConfig implements Validatable {
    @Expose
    @SerializedName("RegistryURL")
    @FieldMetadata(key = "RegistryURL", required = true)
    private String registryUrl;

    public ArtifactStoreConfig() {
    }

    public ArtifactStoreConfig(String registryUrl) {
        this.registryUrl = registryUrl;
    }

    public String getRegistryUrl() {
        return registryUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ArtifactStoreConfig)) return false;

        ArtifactStoreConfig that = (ArtifactStoreConfig) o;

        return (registryUrl != null ? registryUrl.equals(that.registryUrl) : that.registryUrl != null);
    }

    @Override
    public int hashCode() {
        return registryUrl != null ? registryUrl.hashCode() : 0;
    }

    public static ArtifactStoreConfig fromJSON(String json) {
        return Util.GSON.fromJson(json, ArtifactStoreConfig.class);
    }
}
