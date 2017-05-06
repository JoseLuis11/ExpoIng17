package com.example.emiliano.traskilada.networking.serialization;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

import java.lang.reflect.Type;

/**
 * @author J. Pichardo
 */

public class EnumSerializer implements JsonSerializer<Enum> {
    @Override
    public JsonElement serialize(Enum anEnum, Type typeOfSrc, JsonSerializationContext context) {
        return new JsonPrimitive(anEnum.ordinal() + 1);
    }
}
