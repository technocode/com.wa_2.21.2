package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.jid.Jid;

/* renamed from: X.0QU  reason: invalid class name */
public class AnonymousClass0QU extends Jid implements Parcelable {
    public static final AnonymousClass0QU A00 = new AnonymousClass0QU();
    public static final Parcelable.Creator CREATOR = new C49612Ri();

    @Override // com.whatsapp.jid.Jid
    public String getServer() {
        return "s.whatsapp.net";
    }

    @Override // com.whatsapp.jid.Jid
    public int getType() {
        return 13;
    }

    public AnonymousClass0QU() {
        super("");
    }

    public AnonymousClass0QU(Parcel parcel) {
        super(parcel);
    }
}
