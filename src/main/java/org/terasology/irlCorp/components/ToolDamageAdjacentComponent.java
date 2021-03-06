/*
 * Copyright 2015 MovingBlocks
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.terasology.irlCorp.components;

import com.google.common.collect.Lists;
import org.terasology.entitySystem.Component;
import org.terasology.math.geom.Vector3i;

import java.util.List;

public class ToolDamageAdjacentComponent implements Component {
    public static Vector3i[] orderedDirections = {
            new Vector3i(0, -1, 0),
            new Vector3i(-1, 0, 0),
            new Vector3i(1, 0, 0),
            new Vector3i(0, 1, 0),
            new Vector3i(-1, -1, 0),
            new Vector3i(-1, 1, 0),
            new Vector3i(1, 1, 0),
            new Vector3i(1, -1, 0)
    };

    public List<Vector3i> directions = Lists.newArrayList();
}
