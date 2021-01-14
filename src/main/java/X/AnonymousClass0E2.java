package X;

import android.database.Cursor;
import com.whatsapp.jid.UserJid;

/* renamed from: X.0E2  reason: invalid class name */
public final class AnonymousClass0E2 {
    public static final String[] A04 = {"remote_jid", "from_me", "remote_resource", "expires", "message_id"};
    public final long A00;
    public final AnonymousClass02N A01;
    public final UserJid A02;
    public final C007303n A03;

    public AnonymousClass0E2(AnonymousClass02N r1, UserJid userJid, long j, C007303n r5) {
        this.A01 = r1;
        this.A02 = userJid;
        this.A00 = j;
        this.A03 = r5;
    }

    public AnonymousClass0E2(AnonymousClass02N r5, UserJid userJid, Cursor cursor) {
        this.A01 = r5;
        this.A02 = userJid;
        this.A00 = cursor.getLong(3);
        this.A03 = new C007303n(this.A01, cursor.getInt(1) != 1 ? false : true, cursor.getString(4));
    }
}
