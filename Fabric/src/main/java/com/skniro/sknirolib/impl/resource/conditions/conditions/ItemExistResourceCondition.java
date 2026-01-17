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

package com.skniro.sknirolib.impl.resource.conditions.conditions;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.skniro.sknirolib.api.resource.conditions.ILoadCondition;
import com.skniro.sknirolib.api.resource.conditions.ResourceConditionType;
import com.skniro.sknirolib.impl.resource.conditions.DefaultResourceConditionTypes;
import com.skniro.sknirolib.impl.resource.conditions.ResourceConditionsImpl;
import net.minecraft.registry.*;
import net.minecraft.util.Identifier;
import org.jspecify.annotations.Nullable;

import java.util.List;


public record ItemExistResourceCondition(List<Identifier> itemIds) implements ILoadCondition {
	public static final MapCodec<ItemExistResourceCondition> CODEC = RecordCodecBuilder.mapCodec(instance -> instance.group(
			Identifier.CODEC.listOf().fieldOf("values").forGetter(ItemExistResourceCondition::itemIds)
	).apply(instance, ItemExistResourceCondition::new));

	@Override
	public ResourceConditionType<?> getType() {
		return DefaultResourceConditionTypes.ITEM_EXISTS;
	}

	@Override
	public boolean test(RegistryOps.@Nullable RegistryInfoGetter registryInfo) {
		return ResourceConditionsImpl.registryContains(registryInfo, RegistryKeys.ITEM.getValue(), itemIds);
	}
}
