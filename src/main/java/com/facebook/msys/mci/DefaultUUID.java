package com.facebook.msys.mci;

import java.util.UUID;

public class DefaultUUID implements UUID {
    public static final UUID mUUID = new DefaultUUID();

    @Override // com.facebook.msys.mci.UUID
    public String createString() {
        return UUID.randomUUID().toString();
    }

    public static UUID get() {
        return mUUID;
    }
}
