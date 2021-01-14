package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.02Z  reason: invalid class name */
public class AnonymousClass02Z extends UserJid {
    public static final AnonymousClass02Z A00;
    public static final Parcelable.Creator CREATOR = new AnonymousClass0QN();

    @Override // com.whatsapp.jid.UserJid, com.whatsapp.jid.Jid
    public String getServer() {
        return "status_me";
    }

    @Override // com.whatsapp.jid.UserJid, com.whatsapp.jid.Jid
    public int getType() {
        return 11;
    }

    static {
        try {
            A00 = new AnonymousClass02Z();
        } catch (AnonymousClass02Y e) {
            throw new IllegalStateException(e);
        }
    }

    public AnonymousClass02Z() {
        super("");
    }

    public AnonymousClass02Z(Parcel parcel) {
        super(parcel);
    }

    public static boolean A02(Jid jid) {
        return jid == A00;
    }

    @Override // com.whatsapp.jid.UserJid, com.whatsapp.jid.Jid
    public String getObfuscatedString() {
        return getRawString();
    }

    @Override // com.whatsapp.jid.UserJid
    public DeviceJid getPrimaryDevice() {
        throw new UnsupportedOperationException("getPrimaryDevice() must not be called for MeJid");
    }
}
