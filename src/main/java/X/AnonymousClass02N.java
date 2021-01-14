package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.whatsapp.jid.Jid;

/* renamed from: X.02N  reason: invalid class name */
public abstract class AnonymousClass02N extends Jid implements Parcelable {
    public AnonymousClass02N(Parcel parcel) {
        super(parcel);
    }

    public AnonymousClass02N(String str) {
        super(str);
    }

    public static AnonymousClass02N A00(String str) {
        Jid jid = Jid.get(str);
        if (jid instanceof AnonymousClass02N) {
            return (AnonymousClass02N) jid;
        }
        throw new AnonymousClass02Y(str);
    }

    public static AnonymousClass02N A01(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return A00(str);
        } catch (AnonymousClass02Y unused) {
            return null;
        }
    }
}
