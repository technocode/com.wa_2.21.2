package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.jid.Jid;

/* renamed from: X.21n  reason: invalid class name and case insensitive filesystem */
public class C448021n extends Jid implements Parcelable {
    public static final C448021n A00 = new C448021n();
    public static final Parcelable.Creator CREATOR = new C49602Rh();

    @Override // com.whatsapp.jid.Jid
    public String getServer() {
        return "g.us";
    }

    @Override // com.whatsapp.jid.Jid
    public int getType() {
        return 16;
    }

    public C448021n() {
        super("");
    }

    public C448021n(Parcel parcel) {
        super(parcel);
    }
}
