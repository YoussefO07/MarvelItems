package xyz.roosterseatyou.marvelitems.items.infinitygauntlet;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.TextColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class InfinityGauntlet {
    public static final Component NAME = Component.text("Infinity Gauntlet");
    public static ItemStack INF_GAUNTLET;

    public static ItemStack init() {
        getItem();
        return null;
    }

    public static void getItem() {
        ItemStack item = new ItemStack(Material.GOLDEN_CHESTPLATE);
        ItemMeta meta = item.getItemMeta();
        List<Component> lore = new ArrayList<>();
        meta.displayName(NAME);
        lore.add(Component.text("Perfectly balanced, as all things should be."));
        lore.add(Component.text(UUID.randomUUID().toString()).color(TextColor.color(46, 44, 44)));
        lore.add(Component.text("SERVER_ID: INF_GAUNTLET").color(TextColor.color(46, 44, 44)));
        meta.lore(lore);
        item.setItemMeta(meta);
        INF_GAUNTLET = item;
    }

    public static ItemStack genItem() {
        ItemStack it = INF_GAUNTLET.clone();
        ItemMeta meta = it.getItemMeta();
        List<Component> lore = meta.lore();
        lore.set(1, Component.text(UUID.randomUUID().toString()).color(TextColor.color(46, 44, 44)));
        meta.lore(lore);
        it.setItemMeta(meta);
        return it;
    }
}
