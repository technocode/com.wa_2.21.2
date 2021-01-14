package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.jid.UserJid;

/* renamed from: X.2A1  reason: invalid class name */
public class AnonymousClass2A1 extends UserJid implements Parcelable {
    public static final AnonymousClass2A1 A00;
    public static final Parcelable.Creator CREATOR = new AnonymousClass1W1();

    @Override // com.whatsapp.jid.UserJid, com.whatsapp.jid.Jid
    public int getType() {
        return 8;
    }

    static {
        try {
            A00 = new AnonymousClass2A1();
        } catch (AnonymousClass02Y e) {
            throw new IllegalStateException(e);
        }
    }

    public AnonymousClass2A1() {
        super("Server");
    }

    public AnonymousClass2A1(Parcel parcel) {
        super(parcel);
    }

    @Override // com.whatsapp.jid.UserJid, com.whatsapp.jid.Jid
    public String getObfuscatedString() {
        return getRawString();
    }
}
