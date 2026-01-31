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

import com.mojang.serialization.Codec;
import net.minecraft.resources.RegistryOps;
import org.jspecify.annotations.Nullable;

import java.util.List;

public interface ILoadCondition {
    Codec<ILoadCondition> CODEC = ResourceConditionType.TYPE_CODEC.dispatch("type", ILoadCondition::getType, ResourceConditionType::codec);
    Codec<List<ILoadCondition>> LIST_CODEC = CODEC.listOf();
    Codec<ILoadCondition> CONDITION_CODEC = Codec.withAlternative(CODEC, LIST_CODEC, (conditions) -> LoadConditions.and((ILoadCondition[])conditions.toArray(new ILoadCondition[0])));

    ResourceConditionType<?> getType();

    boolean test(RegistryOps.@Nullable RegistryInfoLookup var1);
}
