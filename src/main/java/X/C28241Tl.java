package X;

import android.database.Cursor;
import com.whatsapp.jid.Jid;

/* renamed from: X.1Tl  reason: invalid class name and case insensitive filesystem */
public final class C28241Tl {
    public final long A00;
    public final Jid A01;
    public final String A02;
    public final String A03;

    public C28241Tl(Cursor cursor) {
        this.A01 = Jid.getNullable(cursor.getString(0));
        this.A03 = cursor.getString(1);
        this.A02 = cursor.getString(2);
        this.A00 = cursor.getLong(3);
    }

    public C28241Tl(Jid jid, String str, String str2) {
        long currentTimeMillis = System.currentTimeMillis();
        this.A02 = str2;
        this.A01 = jid;
        this.A03 = str;
        this.A00 = currentTimeMillis;
    }
}
