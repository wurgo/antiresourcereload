package me.wurgo.antiresourcereload;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.loot.LootManager;
import net.minecraft.recipe.RecipeManager;
import net.minecraft.resource.ReloadableResourceManagerImpl;
import net.minecraft.server.ServerAdvancementLoader;
import net.minecraft.server.function.CommandFunctionManager;
import net.minecraft.tag.RegistryTagManager;
import net.minecraft.util.Unit;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.concurrent.CompletableFuture;

public class AntiResourceReload implements ModInitializer {
    public static CompletableFuture<Unit> managerProvider;
    private static final Logger LOGGER = LogManager.getLogger(FabricLoader.getInstance().getModContainer("antiresourcereload").get().getMetadata().getName());

    public static void log(String message) {
        LOGGER.info("[AntiResourceReload] " + message);
    }

    @Override
    public void onInitialize() {
        log("Initializing.");
    }
}
