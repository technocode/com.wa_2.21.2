package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.jid.Jid;

/* renamed from: X.21m  reason: invalid class name and case insensitive filesystem */
public class C447921m extends Jid implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C49572Re();

    @Override // com.whatsapp.jid.Jid
    public String getServer() {
        return "call";
    }

    @Override // com.whatsapp.jid.Jid
    public int getType() {
        return 10;
    }

    public C447921m(Parcel parcel) {
        super(parcel);
    }

    public C447921m(String str) {
        super(str);
        int length = str.length();
        if (length >= 18 && length <= 32) {
            int i = 0;
            while (i < length) {
                char charAt = str.charAt(i);
                i = ((charAt >= '0' && charAt <= '9') || (charAt >= 'a' && charAt <= 'f') || (charAt >= 'A' && charAt <= 'F')) ? i + 1 : i;
            }
            return;
        }
        throw new AnonymousClass02Y(str);
    }
}
