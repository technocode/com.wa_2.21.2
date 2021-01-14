package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.jid.UserJid;

/* renamed from: X.08T  reason: invalid class name */
public class AnonymousClass08T extends UserJid implements Parcelable {
    public static final AnonymousClass08T A00;
    public static final Parcelable.Creator CREATOR = new AnonymousClass08a();

    @Override // com.whatsapp.jid.UserJid, com.whatsapp.jid.Jid
    public int getType() {
        return 7;
    }

    static {
        try {
            A00 = new AnonymousClass08T();
        } catch (AnonymousClass02Y e) {
            throw new IllegalStateException(e);
        }
    }

    public AnonymousClass08T() {
        super("0");
    }

    public AnonymousClass08T(Parcel parcel) {
        super(parcel);
    }

    @Override // com.whatsapp.jid.UserJid, com.whatsapp.jid.Jid
    public String getObfuscatedString() {
        return getRawString();
    }
}
