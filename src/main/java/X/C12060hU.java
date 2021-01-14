package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0hU  reason: invalid class name and case insensitive filesystem */
public class C12060hU extends AnonymousClass02X {
    public static final C12060hU A00 = new C12060hU();
    public static final Parcelable.Creator CREATOR = new C12070hV();

    @Override // com.whatsapp.jid.Jid
    public String getServer() {
        return "broadcast";
    }

    @Override // com.whatsapp.jid.Jid
    public int getType() {
        return 5;
    }

    public C12060hU() {
        super("status");
    }

    public C12060hU(Parcel parcel) {
        super(parcel);
    }
}
