package eu.whoniverse.essentials.models;

import eu.whoniverse.essentials.utils.ToJson;
import org.bukkit.Location;

public class EssPlayer extends ToJson {
    private String playerCustomName;
    private Double x;
    private Double y;
    private Double z;
    private Double money;

    public EssPlayer(String name, Location pos, Double money) {
        this.playerCustomName = name;
        this.x = pos.getX();
        this.z = pos.getZ();
        this.y = pos.getY();
        this.money = money;
    }

    public EssPlayer(Location pos) {
        this.x = pos.getX();
        this.z = pos.getZ();
        this.y = pos.getY();
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }

    public Double getZ() {
        return z;
    }

    public void setZ(Double z) {
        this.z = z;
    }

    public String getPlayerCustomName() {
        return playerCustomName;
    }

    public void setPlayerCustomName(String playerCustomName) {
        this.playerCustomName = playerCustomName;
    }


}
