/*
 * Copyright 2017 MovingBlocks
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
package org.terasology;
import org.terasology.entitySystem.systems.RegisterSystem;
import org.terasology.entitySystem.systems.BaseComponentSystem;
import java.util.logging.Logger;
import org.slf4j.LoggerFactory;
import org.terasology.logic.players.event.OnPlayerSpawnedEvent;
import org.terasology.entitySystem.entity.EntityRef;
import org.terasology.entitySystem.event.ReceiveEvent;

@RegisterSystem
public class GreetInSpanish extends BaseComponentSystem {

    private static final Logger logger = (Logger)LoggerFactory.getLogger(GreetInSpanish.class);

    @ReceiveEvent
    public void onPlayerSpawn(OnPlayerSpawnedEvent event, EntityRef player) {
        logger.info("Hola, nuevo jugador.");
    }
}