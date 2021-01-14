package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.282  reason: invalid class name */
public class AnonymousClass282 extends AnonymousClass02N {
    public static final AnonymousClass282 A00 = new AnonymousClass282();
    public static final Parcelable.Creator CREATOR = new C49562Rd();

    @Override // com.whatsapp.jid.Jid
    public String getServer() {
        return "s.whatsapp.net";
    }

    @Override // com.whatsapp.jid.Jid
    public int getType() {
        return 9;
    }

    public AnonymousClass282() {
        super("gdpr");
    }

    public AnonymousClass282(Parcel parcel) {
        super(parcel);
    }
}
