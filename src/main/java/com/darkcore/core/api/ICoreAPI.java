package com.darkcore.core.api;

import com.darkcore.core.api.player.IPlayerDataManager;
import com.darkcore.core.api.economy.IEconomyManager;
import com.darkcore.core.api.chat.IChatManager;
import com.darkcore.core.api.chat.custom.ICustomChatManager;
import com.darkcore.core.api.world.IWorldManager;
import com.darkcore.core.api.database.IDatabaseManager;
import com.darkcore.core.api.gui.IGUIManager;
import com.darkcore.core.api.events.IEventManager;
import com.darkcore.core.api.boss.IBossManager;
import com.darkcore.core.api.kit.IKitManager;
import com.darkcore.core.api.hologram.IHologramManager;
import com.darkcore.core.api.combat.ICombatManager;
import com.darkcore.core.api.party.IPartyManager;
import com.darkcore.core.api.scoreboard.IScoreboardManager;
import com.darkcore.core.api.tablist.ITabListManager;
import com.darkcore.core.api.npc.INPCManager;
import com.darkcore.core.api.item.custom.ICustomItemManager;
import com.darkcore.core.api.attribute.IAttributeManager;
import com.darkcore.core.api.placeholder.IPlaceholderManager;
import com.darkcore.core.api.skin.ISkinManager;
import com.darkcore.core.api.pet.IPetManager;
import com.darkcore.core.api.module.ICoreModule;
import com.darkcore.core.api.inventory.IInventoryManager;
import com.darkcore.core.api.command.ICommandManager;
import com.darkcore.core.api.permission.IPermissionManager;
import com.darkcore.core.api.messaging.IMessagingManager;
import com.darkcore.core.api.effect.visual.IVisualEffectManager;
import com.darkcore.core.api.math.IMathUtility;
import com.darkcore.core.api.storage.json.IJsonStorage;

import java.util.Collection;

/**
 * Основной интерфейс DarkCore Engine API.
 * Предоставляет доступ ко всем подсистемам движка.
 */
public interface ICoreAPI {
    IPlayerDataManager getPlayerManager();
    IEconomyManager getEconomyManager();
    IChatManager getChatManager();
    ICustomChatManager getCustomChatManager();
    IWorldManager getWorldManager();
    IDatabaseManager getDatabaseManager();
    IGUIManager getGUIManager();
    IEventManager getEventManager();
    IBossManager getBossManager();
    IKitManager getKitManager();
    IHologramManager getHologramManager();
    ICombatManager getCombatManager();
    IPartyManager getPartyManager();
    IScoreboardManager getScoreboardManager();
    ITabListManager getTabListManager();
    INPCManager getNPCManager();
    ICustomItemManager getCustomItemManager();
    IAttributeManager getAttributeManager();
    IPlaceholderManager getPlaceholderManager();
    ISkinManager getSkinManager();
    IPetManager getPetManager();
    
    // Новые расширения
    IInventoryManager getInventoryManager();
    ICommandManager getCommandManager();
    IPermissionManager getPermissionManager();
    IMessagingManager getMessagingManager();
    
    // Новые утилиты для разработки
    IVisualEffectManager getVisualEffectManager();
    IMathUtility getMathUtility();
    IJsonStorage getJsonStorage();
    
    void registerModule(ICoreModule module);
    Collection<ICoreModule> getModules();
    
    String getVersion();
    long getServerStartupTime();
}
