/*
 * Copyright 2021 Infernal Studios
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

package org.infernalstudios.infernalexp.tileentities;

import org.infernalstudios.infernalexp.init.IETileEntityTypes;

import net.minecraft.tileentity.CampfireTileEntity;
import net.minecraft.tileentity.TileEntityType;

public class GlowCampfireTileEntity extends CampfireTileEntity {
    public GlowCampfireTileEntity() {
        super();
    }

    public TileEntityType<?> getType() {
        return IETileEntityTypes.GLOW_CAMPFIRE.get();
    }
}
