package com.ninni.spawn.registry;

import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.Music;
import net.minecraft.sounds.Musics;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.block.SoundType;

import static com.ninni.spawn.Spawn.MOD_ID;

public interface SpawnSoundEvents {


    SoundEvent FISH_FLOP = register("entity.fish.flop");
    SoundEvent FISH_SWIM = register("entity.fish.swim");
    SoundEvent FISH_HURT = register("entity.fish.hurt");
    SoundEvent FISH_DEATH = register("entity.fish.death");
    SoundEvent BIG_FISH_SWIM = register("entity.big_fish.swim");
    SoundEvent FISH_JUMP = register("entity.fish.jump");

    SoundEvent ANGLER_FISH_DEFLATE = register("entity.angler_fish.deflate");
    SoundEvent ANGLER_FISH_EFFECT_GIVE = register("entity.angler_fish.effect.give");
    SoundEvent ANGLER_FISH_EFFECT_DENY = register("entity.angler_fish.effect.deny");

    SoundEvent TUNA_EGG_HIT = register("entity.tuna_egg.hit");
    SoundEvent TUNA_EGG_BROKEN = register("entity.tuna_egg.broken");
    SoundEvent BUCKET_EMPTY_TUNA_EGG = register("item.bucket.empty_tuna_egg");
    SoundEvent BUCKET_FILL_TUNA_EGG = register("item.bucket.fill_tuna_egg");

    SoundEvent SEAHORSE_GROWL = register("entity.seahorse.growl");
    SoundEvent SEAHORSE_CLICK = register("entity.seahorse.click");
    SoundEvent SEAHORSE_HURT = register("entity.seahorse.hurt");
    SoundEvent SEAHORSE_DEATH = register("entity.seahorse.death");

    SoundEvent SNAIL_SLIDE = register("entity.snail.slide");
    SoundEvent SNAIL_HURT_HIDDEN = register("entity.snail.hurt_hidden");
    SoundEvent SNAIL_HURT = register("entity.snail.hurt");
    SoundEvent SNAIL_EAT = register("entity.snail.eat");
    SoundEvent SNAIL_DEATH = register("entity.snail.death");
    SoundEvent SNAIL_DEATH_HIDDEN = register("entity.snail.death_hidden");
    SoundEvent SNAIL_SHELL_GROW = register("entity.snail.shell_grow");
    SoundEvent SNAIL_LAY_EGGS = register("entity.snail.lay_eggs");
    SoundEvent SNAIL_EGGS_HATCH = register("block.snail_eggs.hatch");

    SoundEvent HAMSTER_AMBIENT = register("entity.hamster.idle");
    SoundEvent HAMSTER_AMBIENT_CALL = register("entity.hamster.idle_call");
    SoundEvent HAMSTER_STEP = register("entity.hamster.step");
    SoundEvent HAMSTER_HURT = register("entity.hamster.hurt");
    SoundEvent HAMSTER_EAT = register("entity.hamster.eat");
    SoundEvent HAMSTER_DEATH = register("entity.hamster.death");

    SoundEvent SUNFLOWER_SEED_PICKUP = register("block.sunflower.seed_pickup");

    SoundEvent ANT_AMBIENT = register("entity.ant.idle");
    SoundEvent ANT_HURT = register("entity.ant.hurt");
    SoundEvent ANT_EAT = register("entity.ant.eat");
    SoundEvent ANT_DEATH = register("entity.ant.death");
    SoundEvent ANT_STEP = register("entity.ant.step");
    SoundEvent ANT_COLLECT_RESOURCE = register("entity.ant.collect_resource");

    SoundEvent ANT_HATCH = register("entity.ant.hatch");

    SoundEvent ANTHILL_ENTER = register("block.anthill.enter");
    SoundEvent ANTHILL_EXIT = register("block.anthill.exit");
    SoundEvent ANTHILL_WORK = register("block.anthill.work");
    SoundEvent ANTHILL_RESOURCE = register("block.anthill.resource");

    SoundEvent ROTTEN_WOOD_CRACK = register("block.rotten_wood.crack");

    SoundEvent MUSIC_DISC_ROT = register("music_disc.rot");

    SoundEvent ROTTEN_WOOD_FENCE_GATE_OPEN = register("block.rotten_wood_fence_gate.open");
    SoundEvent ROTTEN_WOOD_FENCE_GATE_CLOSE = register("block.rotten_wood_fence_gate.close");
    SoundEvent ROTTEN_WOOD_DOOR_OPEN = register("block.rotten_wood_door.open");
    SoundEvent ROTTEN_WOOD_DOOR_CLOSE = register("block.rotten_wood_door.close");
    SoundEvent ROTTEN_WOOD_TRAPDOOR_OPEN = register("block.rotten_wood_trapdoor.open");
    SoundEvent ROTTEN_WOOD_TRAPDOOR_CLOSE = register("block.rotten_wood_trapdoor.close");

    Holder.Reference<SoundEvent> MUSIC_SEAGRASS_MEADOWS = registerForHolder("music.seagrass_meadows");
    SoundEvent MUSIC_DISC_BLINK = register("music_disc.blink");

    SoundEvent GOAT_HORN_OCTOPUS = register("item.goat_horn.octopus");

    SoundType MUCUS = register("mucus", 1, 1);
    SoundType ROTTEN_WOOD = register("rotten_wood", 1, 1);
    SoundType CRACKED_ROTTEN_WOOD = register("cracked_rotten_wood", 1, 1);
    SoundType FALLEN_LEAVES = register("fallen_leaves", 1, 1);
    SoundType SNAIL_SHELL = register("snail_shell", 1, 1);

    Music SEAGRASS_MEADOWS = Musics.createGameMusic(MUSIC_SEAGRASS_MEADOWS);

    private static SoundType register(String name, float volume, float pitch) {
        return new SoundType(volume, pitch, register("block." + name + ".break"), register("block." + name + ".step"), register("block." + name + ".place"), register("block." + name + ".hit"), register("block." + name + ".fall"));
    }

    static SoundEvent register(String name) {
        ResourceLocation id = new ResourceLocation(MOD_ID, name);
        return Registry.register(BuiltInRegistries.SOUND_EVENT, id, SoundEvent.createVariableRangeEvent(id));
    }

    private static Holder.Reference<SoundEvent> registerForHolder(String name) {
        ResourceLocation id = new ResourceLocation(MOD_ID, name);
        return Registry.registerForHolder(BuiltInRegistries.SOUND_EVENT, id, SoundEvent.createVariableRangeEvent(id));
    }

}