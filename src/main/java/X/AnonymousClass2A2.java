package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.2A2  reason: invalid class name */
public class AnonymousClass2A2 extends AnonymousClass02X {
    public static final AnonymousClass2A2 A00 = new AnonymousClass2A2();
    public static final Parcelable.Creator CREATOR = new C49582Rf();

    @Override // com.whatsapp.jid.Jid
    public String getServer() {
        return "broadcast";
    }

    @Override // com.whatsapp.jid.Jid
    public int getType() {
        return 6;
    }

    public AnonymousClass2A2() {
        super("location");
    }

    public AnonymousClass2A2(Parcel parcel) {
        super(parcel);
    }
}
