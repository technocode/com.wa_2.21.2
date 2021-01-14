package com.whatsapp.jid;

import X.AnonymousClass02Y;
import X.AnonymousClass08U;
import X.C006803i;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.Arrays;

public abstract class Jid implements Parcelable, Comparable {
    public static final AnonymousClass08U JID_FACTORY = AnonymousClass08U.A00();
    public final String user;

    public int describeContents() {
        return 0;
    }

    public int getAgent() {
        return 0;
    }

    public int getDevice() {
        return 0;
    }

    public abstract String getServer();

    public abstract int getType();

    public Jid(Parcel parcel) {
        this.user = parcel.readString();
    }

    public Jid(String str) {
        this.user = str;
    }

    public static String buildRawString(String str, String str2) {
        if (str.isEmpty()) {
            return str2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('@');
        sb.append(str2);
        return sb.toString();
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return getRawString().compareTo(((Jid) obj).getRawString());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Jid)) {
            return false;
        }
        Jid jid = (Jid) obj;
        if (!C006803i.A0q(this.user, jid.user) || !getServer().equals(jid.getServer()) || getType() != jid.getType()) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0114, code lost:
        if (r3 != null) goto L_0x013c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.whatsapp.jid.Jid get(java.lang.String r14) {
        /*
        // Method dump skipped, instructions count: 404
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jid.Jid.get(java.lang.String):com.whatsapp.jid.Jid");
    }

    public static Jid getNullable(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return get(str);
        } catch (AnonymousClass02Y unused) {
            return null;
        }
    }

    public String getObfuscatedString() {
        return getRawString();
    }

    public String getRawString() {
        return buildRawString(this.user, getServer());
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.user, getServer(), Integer.valueOf(getType())});
    }

    public boolean isProtocolCompliant() {
        int type = getType();
        return (type == 2 || type == 9 || type == 11 || type == 8) ? false : true;
    }

    public final String toString() {
        return getObfuscatedString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.user);
    }
}
