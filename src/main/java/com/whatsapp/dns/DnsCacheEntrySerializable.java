package com.whatsapp.dns;

import java.io.Serializable;
import java.net.InetAddress;
import java.util.Locale;

public final class DnsCacheEntrySerializable implements Serializable {
    public static final long serialVersionUID = 1;
    public final Long expirationTime;
    public final boolean forceOverride;
    public final InetAddress inetAddress;
    public final Short portNumber;
    public final int resolverType;
    public final boolean secureSocket;

    public DnsCacheEntrySerializable(Long l, InetAddress inetAddress2, int i) {
        this.expirationTime = l;
        this.inetAddress = inetAddress2;
        this.portNumber = null;
        this.secureSocket = false;
        this.forceOverride = false;
        this.resolverType = i;
    }

    public DnsCacheEntrySerializable(Long l, InetAddress inetAddress2, Short sh, boolean z, boolean z2) {
        this.expirationTime = l;
        this.inetAddress = inetAddress2;
        this.portNumber = sh;
        this.secureSocket = z;
        this.forceOverride = z2;
        this.resolverType = 4;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof DnsCacheEntrySerializable)) {
            return false;
        }
        DnsCacheEntrySerializable dnsCacheEntrySerializable = (DnsCacheEntrySerializable) obj;
        Long l = this.expirationTime;
        Long l2 = dnsCacheEntrySerializable.expirationTime;
        if (l != l2 && (l == null || !l.equals(l2))) {
            return false;
        }
        InetAddress inetAddress2 = this.inetAddress;
        InetAddress inetAddress3 = dnsCacheEntrySerializable.inetAddress;
        if (inetAddress2 != inetAddress3 && (inetAddress2 == null || !inetAddress2.equals(inetAddress3))) {
            return false;
        }
        Short sh = this.portNumber;
        Short sh2 = dnsCacheEntrySerializable.portNumber;
        if (sh == sh2 || (sh != null && sh.equals(sh2))) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int i2;
        Long l = this.expirationTime;
        int i3 = 0;
        if (l != null) {
            i = l.hashCode();
        } else {
            i = 0;
        }
        int i4 = (i + 41) * 41;
        InetAddress inetAddress2 = this.inetAddress;
        if (inetAddress2 != null) {
            i2 = inetAddress2.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 41;
        Short sh = this.portNumber;
        if (sh != null) {
            i3 = sh.hashCode();
        }
        return i5 + i3;
    }

    public String toString() {
        return String.format(Locale.US, "%s:%d EXPIRE: %tc", this.inetAddress, this.portNumber, this.expirationTime);
    }
}
