package github.AlpsBTE_Navigator.core.navigator;

import github.AlpsBTE_Navigator.AlpsBTE_Navigator;
import org.bukkit.Material;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.inventory.ItemStack;
import java.util.List;

public abstract class NavigatorItem {

    public NavigatorItem() {
        if(AlpsBTE_Navigator.getPlugin().checkServer(getIP(), getPort())) serverIsOnline = true;
    }

    protected boolean serverIsOnline;

    protected FileConfiguration config = AlpsBTE_Navigator.getPlugin().getConfig();

    public abstract Material getMaterial();

    public abstract String getTitle();

    public abstract List<String> getDescription();

    public abstract List<String> getFeatures();

    public abstract String getIP();

    public abstract int getPort();

    public abstract String getVersion();

    public abstract boolean isModded();

    public abstract ItemStack createItem();
}
