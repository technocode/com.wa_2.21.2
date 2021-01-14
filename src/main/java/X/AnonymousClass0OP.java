package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.whatsapp.jid.Jid;

/* renamed from: X.0OP  reason: invalid class name */
public class AnonymousClass0OP extends AnonymousClass02W implements Parcelable {
    public static final Parcelable.Creator CREATOR = new AnonymousClass2Rc();

    @Override // com.whatsapp.jid.Jid
    public String getServer() {
        return "broadcast";
    }

    @Override // com.whatsapp.jid.Jid
    public int getType() {
        return 3;
    }

    public AnonymousClass0OP(Parcel parcel) {
        super(parcel);
    }

    public AnonymousClass0OP(String str) {
        super(str);
        char charAt;
        int length = str.length();
        if (length >= 1 && length <= 20 && (charAt = str.charAt(0)) >= '1' && charAt <= '9') {
            int i = 1;
            while (i < length) {
                char charAt2 = str.charAt(i);
                i = (charAt2 >= '0' && charAt2 <= '9') ? i + 1 : i;
            }
            return;
        }
        throw new AnonymousClass02Y(str);
    }

    public static AnonymousClass0OP A02(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            Jid jid = Jid.get(str);
            if (jid instanceof AnonymousClass0OP) {
                return (AnonymousClass0OP) jid;
            }
            throw new AnonymousClass02Y(str);
        } catch (AnonymousClass02Y unused) {
            return null;
        }
    }

    @Override // com.whatsapp.jid.Jid
    public String getObfuscatedString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C003701u.A06(this.user, 4));
        sb.append('@');
        sb.append("broadcast");
        return sb.toString();
    }
}
