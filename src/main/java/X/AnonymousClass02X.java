package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.whatsapp.jid.Jid;

/* renamed from: X.02X  reason: invalid class name */
public abstract class AnonymousClass02X extends AnonymousClass02N implements Parcelable {
    public AnonymousClass02X(Parcel parcel) {
        super(parcel);
    }

    public AnonymousClass02X(String str) {
        super(str);
    }

    public static AnonymousClass02X A04(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            Jid jid = Jid.get(str);
            if (jid instanceof AnonymousClass02X) {
                return (AnonymousClass02X) jid;
            }
            throw new AnonymousClass02Y(str);
        } catch (AnonymousClass02Y unused) {
            return null;
        }
    }
}
