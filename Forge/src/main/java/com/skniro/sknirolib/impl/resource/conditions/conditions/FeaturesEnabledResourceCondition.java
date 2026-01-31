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

package com.skniro.sknirolib.impl.resource.conditions.conditions;

import java.util.Collection;
import java.util.List;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.RegistryOps;
import net.minecraft.world.flag.FeatureFlag;
import net.minecraft.world.flag.FeatureFlags;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.skniro.sknirolib.api.resource.conditions.ILoadCondition;
import com.skniro.sknirolib.api.resource.conditions.ResourceConditionType;
import com.skniro.sknirolib.impl.resource.conditions.DefaultResourceConditionTypes;
import com.skniro.sknirolib.impl.resource.conditions.ResourceConditionsImpl;
import org.jspecify.annotations.Nullable;

public record FeaturesEnabledResourceCondition(Collection<Identifier> features) implements ILoadCondition {
	public static final MapCodec<FeaturesEnabledResourceCondition> CODEC = RecordCodecBuilder.mapCodec(instance -> instance.group(
			Identifier.CODEC.listOf().fieldOf("features").forGetter(condition -> List.copyOf(condition.features))
	).apply(instance, FeaturesEnabledResourceCondition::new));

	public FeaturesEnabledResourceCondition(Identifier... features) {
		this(List.of(features));
	}

	public FeaturesEnabledResourceCondition(FeatureFlag... flags) {
		this(FeatureFlags.REGISTRY.toNames(FeatureFlags.REGISTRY.subset(flags)));
	}

	@Override
	public ResourceConditionType<?> getType() {
		return DefaultResourceConditionTypes.FEATURES_ENABLED;
	}

	@Override
	public boolean test(RegistryOps.@Nullable RegistryInfoLookup var1) {
		return ResourceConditionsImpl.featuresEnabled(this.features());
	}
}
