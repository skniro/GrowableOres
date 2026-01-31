/*
 * Copyright (c) 2016, 2017, 2018, 2019 FabricMC
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

/*
 * Modification by skniro,
 */

package com.skniro.sknirolib.api.resource.conditions;

import com.skniro.sknirolib.impl.resource.conditions.conditions.*;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import net.minecraft.core.Registry;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.TagKey;
import net.minecraft.world.flag.FeatureFlag;

public final class LoadConditions {
    private static final Map<Identifier, ResourceConditionType<?>> REGISTERED_CONDITIONS = new ConcurrentHashMap();
    public static final String CONDITIONS_KEY = "sknirolib:load_conditions";
    public static final String OVERLAYS_KEY = "sknirolib:overlays";

    private LoadConditions() {
    }

    public static void register(ResourceConditionType<?> condition) {
        Objects.requireNonNull(condition, "Condition may not be null.");
        if (REGISTERED_CONDITIONS.put(condition.id(), condition) != null) {
            throw new IllegalArgumentException("Duplicate resource condition registered with id " + String.valueOf(condition.id()));
        }
    }

    public static ResourceConditionType<?> getConditionType(Identifier id) {
        return (ResourceConditionType)REGISTERED_CONDITIONS.get(id);
    }

    public static ILoadCondition alwaysTrue() {
        return new TrueResourceCondition();
    }

    public static ILoadCondition not(ILoadCondition condition) {
        return new NotResourceCondition(condition);
    }

    public static ILoadCondition and(ILoadCondition... conditions) {
        return new AndResourceCondition(List.of(conditions));
    }

    public static ILoadCondition or(ILoadCondition... conditions) {
        return new OrResourceCondition(List.of(conditions));
    }

    public static ILoadCondition allModsLoaded(String... modIds) {
        return new AllModsLoadedResourceCondition(List.of(modIds));
    }

    public static ILoadCondition anyModsLoaded(String... modIds) {
        return new AnyModsLoadedResourceCondition(List.of(modIds));
    }

    @SafeVarargs
    public static <T> ILoadCondition tagsPopulated(TagKey<T>... tags) {
        return new TagsPopulatedResourceCondition(tags);
    }

    @SafeVarargs
    public static <T> ILoadCondition tagsPopulated(ResourceKey<? extends Registry<T>> registry, TagKey<T>... tags) {
        return new TagsPopulatedResourceCondition(registry.identifier(), tags);
    }

    public static ILoadCondition featuresEnabled(Identifier... features) {
        return new FeaturesEnabledResourceCondition(features);
    }

    public static ILoadCondition featuresEnabled(FeatureFlag... features) {
        return new FeaturesEnabledResourceCondition(features);
    }

    @SafeVarargs
    public static <T> ILoadCondition registryContains(ResourceKey<T>... entries) {
        return new RegistryContainsResourceCondition(entries);
    }

    public static <T> ILoadCondition registryContains(ResourceKey<? extends Registry<T>> registry, Identifier... entries) {
        return new RegistryContainsResourceCondition(registry.identifier(), entries);
    }
}
