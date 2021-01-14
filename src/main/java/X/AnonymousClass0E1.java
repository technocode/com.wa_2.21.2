package X;

import android.database.Cursor;
import com.whatsapp.jid.UserJid;

/* renamed from: X.0E1  reason: invalid class name */
public final class AnonymousClass0E1 {
    public static final String[] A01 = {"jid", "latitude", "longitude", "accuracy", "speed", "bearing", "location_ts"};
    public final C02900Dx A00;

    public AnonymousClass0E1(Cursor cursor, UserJid userJid) {
        C02900Dx r2 = new C02900Dx(userJid);
        this.A00 = r2;
        r2.A00 = cursor.getDouble(1);
        this.A00.A01 = cursor.getDouble(2);
        this.A00.A03 = cursor.getInt(3);
        this.A00.A02 = cursor.getFloat(4);
        this.A00.A04 = cursor.getInt(5);
        this.A00.A05 = cursor.getLong(6);
    }
}
