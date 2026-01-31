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
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;

import net.minecraft.util.Identifier;
import net.minecraft.util.Nullables;
import java.util.Objects;

public interface ResourceConditionType<T extends ILoadCondition> {
    Codec<ResourceConditionType<?>> TYPE_CODEC = Identifier.CODEC.comapFlatMap((id) ->
            Nullables.mapOrElseGet(LoadConditions.getConditionType(id), DataResult::success, () -> DataResult.error(() -> "Unknown resource condition key: " + String.valueOf(id))),
            ResourceConditionType::id);

    Identifier id();

    MapCodec<T> codec();

    static <T extends ILoadCondition> ResourceConditionType<T> create(final Identifier id, final MapCodec<T> codec) {
        Objects.requireNonNull(id, "id cannot be null");
        Objects.requireNonNull(codec, "codec cannot be null");
        return new ResourceConditionType<T>() {
            public Identifier id() {
                return id;
            }

            public MapCodec<T> codec() {
                return codec;
            }
        };
    }
}