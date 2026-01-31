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

package com.skniro.growableores.mixin.resource.conditions;

import com.llamalad7.mixinextras.sugar.Local;
import com.skniro.sknirolib.impl.resource.conditions.OverlayConditionsMetadata;
import net.minecraft.server.packs.PackResources;
import net.minecraft.server.packs.repository.Pack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Mixin({Pack.class})
public class PackMixin {
	@ModifyVariable(
			method = {"readPackMetadata(Lnet/minecraft/server/packs/PackLocationInfo;Lnet/minecraft/server/packs/repository/Pack$ResourcesSupplier;Lnet/minecraft/server/packs/metadata/pack/PackFormat;Lnet/minecraft/server/packs/PackType;)Lnet/minecraft/server/packs/repository/Pack$Metadata;"},
			at = @At("STORE")
	)
	private static List<String> applyOverlayConditions(List<String> overlays, @Local PackResources resourcePack) throws IOException {
		List<String> appliedOverlays = new ArrayList(overlays);
		OverlayConditionsMetadata overlayMetadata = (OverlayConditionsMetadata)resourcePack.getMetadataSection(OverlayConditionsMetadata.SERIALIZER);
		if (overlayMetadata != null) {
			appliedOverlays.addAll(overlayMetadata.appliedOverlays());
		}

		return List.copyOf(appliedOverlays);
	}
}
