package eu.whoniverse.essentials.utils;

import com.google.gson.Gson;

public class ToJson {
    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
