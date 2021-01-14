package com.facebook.common.util;

public enum TriState {
    YES,
    NO,
    UNSET;

    public boolean asBoolean() {
        int ordinal = ordinal();
        if (ordinal == 0) {
            return true;
        }
        if (ordinal == 1) {
            return false;
        }
        if (ordinal != 2) {
            StringBuilder sb = new StringBuilder("Unrecognized TriState value: ");
            sb.append(this);
            throw new IllegalStateException(sb.toString());
        }
        throw new IllegalStateException("No boolean equivalent for UNSET");
    }

    public boolean asBoolean(boolean z) {
        int ordinal = ordinal();
        if (ordinal == 0) {
            return true;
        }
        if (ordinal == 1) {
            return false;
        }
        if (ordinal == 2) {
            return z;
        }
        StringBuilder sb = new StringBuilder("Unrecognized TriState value: ");
        sb.append(this);
        throw new IllegalStateException(sb.toString());
    }

    public Boolean asBooleanObject() {
        int ordinal = ordinal();
        if (ordinal == 0) {
            return Boolean.TRUE;
        }
        if (ordinal == 1) {
            return Boolean.FALSE;
        }
        if (ordinal == 2) {
            return null;
        }
        StringBuilder sb = new StringBuilder("Unrecognized TriState value: ");
        sb.append(this);
        throw new IllegalStateException(sb.toString());
    }

    public static TriState fromDbValue(int i) {
        if (i == 1) {
            return YES;
        }
        if (i != 2) {
            return UNSET;
        }
        return NO;
    }

    public int getDbValue() {
        int ordinal = ordinal();
        if (ordinal != 0) {
            return ordinal != 1 ? 3 : 2;
        }
        return 1;
    }

    public boolean isSet() {
        return this != UNSET;
    }

    public static TriState valueOf(Boolean bool) {
        return bool != null ? valueOf(bool.booleanValue()) : UNSET;
    }

    public static TriState valueOf(boolean z) {
        return z ? YES : NO;
    }
}
