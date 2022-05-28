package xyz.roosterseatyou.marvelitems.items.infinitygauntlet;

import net.kyori.adventure.text.Component;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class InfinityGauntlet {
    public static final Component NAME = Component.text("Infinity Gauntlet");



    public static ItemStack init() {
        getItem();
        return null;
    }

    public static ItemStack getItem() {
        ItemStack item = new ItemStack(Material.GOLDEN_CHESTPLATE);
        ItemMeta meta = item.getItemMeta();
        List<Component> lore = new ArrayList<>();
        meta.displayName(NAME);
        lore.add(Component.text("Perfectly balanced, as all things should be."));
        item.setItemMeta(meta);
        return item;
    }
}
