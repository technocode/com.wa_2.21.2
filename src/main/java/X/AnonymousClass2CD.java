package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.2CD  reason: invalid class name */
public class AnonymousClass2CD extends GroupJid implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C49592Rg();

    @Override // com.whatsapp.jid.Jid
    public String getServer() {
        return "temp";
    }

    @Override // com.whatsapp.jid.Jid
    public int getType() {
        return 2;
    }

    public AnonymousClass2CD(Parcel parcel) {
        super(parcel);
    }

    public AnonymousClass2CD(String str) {
        super(str);
        if (!str.contains("-")) {
            throw new AnonymousClass02Y(AnonymousClass008.A0K("Invalid group id: ", str));
        }
    }

    public static AnonymousClass2CD A02(AnonymousClass01I r3, String str) {
        r3.A04();
        UserJid userJid = r3.A03;
        if (userJid != null) {
            StringBuilder sb = new StringBuilder();
            String str2 = userJid.user;
            if (str2 != null) {
                AnonymousClass008.A1Y(sb, str2, "-", str, "@");
                sb.append("temp");
                String obj = sb.toString();
                if (!TextUtils.isEmpty(obj)) {
                    try {
                        Jid jid = Jid.get(obj);
                        if (jid instanceof AnonymousClass2CD) {
                            return (AnonymousClass2CD) jid;
                        }
                        throw new AnonymousClass02Y(obj);
                    } catch (AnonymousClass02Y unused) {
                    }
                }
                return null;
            }
            throw null;
        }
        throw null;
    }
}
