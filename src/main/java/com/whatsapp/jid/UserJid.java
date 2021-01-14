package com.whatsapp.jid;

import X.AnonymousClass008;
import X.AnonymousClass02N;
import X.AnonymousClass02Y;
import X.AnonymousClass08U;
import X.AnonymousClass08V;
import X.AnonymousClass08Z;
import X.C003701u;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

public class UserJid extends AnonymousClass02N implements Parcelable {
    public static final Parcelable.Creator CREATOR = new AnonymousClass08Z();
    public static final AnonymousClass08U JID_FACTORY = AnonymousClass08U.A00();
    public static final UserJid WHATSAPP_SURVEY;

    @Override // com.whatsapp.jid.Jid
    public int describeContents() {
        return 0;
    }

    @Override // com.whatsapp.jid.Jid
    public String getServer() {
        return "s.whatsapp.net";
    }

    @Override // com.whatsapp.jid.Jid
    public int getType() {
        return 0;
    }

    static {
        try {
            WHATSAPP_SURVEY = getFromIdentifier("16505361212");
        } catch (AnonymousClass02Y e) {
            throw new IllegalStateException(e);
        }
    }

    public UserJid(Parcel parcel) {
        super(parcel);
    }

    public UserJid(String str) {
        super(str);
        int type;
        if (!isValidRegularUser(str) && (type = getType()) != 11 && type != 7 && type != 8) {
            throw new AnonymousClass02Y(AnonymousClass008.A0K("Invalid user: ", str));
        }
    }

    public static UserJid get(String str) {
        Jid jid = Jid.get(str);
        if (jid instanceof UserJid) {
            return (UserJid) jid;
        }
        throw new AnonymousClass02Y(str);
    }

    public static UserJid getFromIdentifier(String str) {
        AnonymousClass08U r0 = JID_FACTORY;
        String buildRawString = Jid.buildRawString(str, "s.whatsapp.net");
        AnonymousClass08V r2 = r0.A00;
        Jid jid = (Jid) r2.A03(buildRawString);
        if (jid instanceof UserJid) {
            return (UserJid) jid;
        }
        UserJid A01 = AnonymousClass08U.A01(str, "s.whatsapp.net");
        r2.A07(buildRawString, A01);
        return A01;
    }

    public static UserJid getNullable(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return get(str);
        } catch (AnonymousClass02Y unused) {
            return null;
        }
    }

    @Override // com.whatsapp.jid.Jid
    public String getObfuscatedString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C003701u.A06(this.user, 4));
        sb.append('@');
        sb.append(getServer());
        return sb.toString();
    }

    public DeviceJid getPrimaryDevice() {
        try {
            return DeviceJid.getFromUserJidAndDeviceId(this, 0);
        } catch (AnonymousClass02Y e) {
            throw new IllegalStateException(e);
        }
    }

    public static boolean isValidRegularUser(String str) {
        char charAt;
        int length = str.length();
        if (length < 5 || length > 20 || str.startsWith("10") || (charAt = str.charAt(0)) < '1' || charAt > '9') {
            return false;
        }
        for (int i = 1; i < length; i++) {
            char charAt2 = str.charAt(i);
            if (charAt2 < '0' || charAt2 > '9') {
                return false;
            }
        }
        return true;
    }

    public static UserJid of(Jid jid) {
        if (jid instanceof UserJid) {
            return (UserJid) jid;
        }
        return null;
    }

    @Override // com.whatsapp.jid.Jid
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.user);
    }
}
