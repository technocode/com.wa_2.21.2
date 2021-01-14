package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.02U  reason: invalid class name */
public class AnonymousClass02U extends GroupJid implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C08550bK();

    @Override // com.whatsapp.jid.Jid
    public String getServer() {
        return "g.us";
    }

    @Override // com.whatsapp.jid.Jid
    public int getType() {
        return 1;
    }

    public AnonymousClass02U(Parcel parcel) {
        super(parcel);
    }

    public AnonymousClass02U(String str) {
        super(str);
        String substring;
        int length;
        char charAt;
        char charAt2;
        int indexOf = str.indexOf(45);
        if (indexOf == -1) {
            int length2 = str.length();
            if (length2 >= 1 && length2 <= 20 && (charAt2 = str.charAt(0)) >= '1' && charAt2 <= '9') {
                int i = 1;
                while (i < length2) {
                    char charAt3 = str.charAt(i);
                    i = (charAt3 >= '0' && charAt3 <= '9') ? i + 1 : i;
                }
                return;
            }
        } else if (indexOf != 0 && indexOf != str.length() && UserJid.isValidRegularUser(str.substring(0, indexOf)) && (length = (substring = str.substring(indexOf + 1)).length()) == 10 && (charAt = substring.charAt(0)) >= '1' && charAt <= '9') {
            int i2 = 1;
            do {
                char charAt4 = substring.charAt(i2);
                if (charAt4 >= '0' && charAt4 <= '9') {
                    i2++;
                }
            } while (i2 < length);
            return;
        }
        throw new AnonymousClass02Y(str);
    }

    public static AnonymousClass02U A02(Jid jid) {
        if (jid instanceof AnonymousClass02U) {
            return (AnonymousClass02U) jid;
        }
        return null;
    }

    public static AnonymousClass02U A03(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            Jid jid = Jid.get(str);
            if (jid instanceof AnonymousClass02U) {
                return (AnonymousClass02U) jid;
            }
            throw new AnonymousClass02Y(str);
        } catch (AnonymousClass02Y unused) {
            return null;
        }
    }

    @Override // com.whatsapp.jid.Jid
    public String getObfuscatedString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C003701u.A06(this.user, 15));
        sb.append('@');
        sb.append("g.us");
        return sb.toString();
    }
}
