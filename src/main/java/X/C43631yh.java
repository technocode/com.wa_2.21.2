package X;

import android.database.Cursor;
import android.util.Pair;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.1yh  reason: invalid class name and case insensitive filesystem */
public class C43631yh extends AnonymousClass0PN {
    public final AnonymousClass01I A00;
    public final C006903j A01;
    public final C015208k A02;
    public final C015408m A03;

    public C43631yh(AnonymousClass01I r3, C006903j r4, C015408m r5, C015208k r6, AnonymousClass0PQ r7) {
        super("participant_user", EditorInfoCompat.IME_FLAG_FORCE_ASCII, r7);
        this.A00 = r3;
        this.A01 = r4;
        this.A03 = r5;
        this.A02 = r6;
    }

    @Override // X.AnonymousClass0PN
    public Pair A07(Cursor cursor) {
        UserJid nullable;
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow("_id");
        int columnIndexOrThrow2 = cursor.getColumnIndexOrThrow("gjid");
        int columnIndexOrThrow3 = cursor.getColumnIndexOrThrow("jid");
        int columnIndexOrThrow4 = cursor.getColumnIndexOrThrow("admin");
        int columnIndexOrThrow5 = cursor.getColumnIndexOrThrow("pending");
        int columnIndexOrThrow6 = cursor.getColumnIndexOrThrow("sent_sender_key");
        long j = -1;
        int i = 0;
        while (cursor.moveToNext()) {
            j = cursor.getLong(columnIndexOrThrow);
            i++;
            int i2 = cursor.getInt(columnIndexOrThrow4);
            boolean z = true;
            boolean z2 = false;
            if (cursor.getInt(columnIndexOrThrow5) != 0) {
                z2 = true;
            }
            if (cursor.getInt(columnIndexOrThrow6) == 0) {
                z = false;
            }
            AnonymousClass02X A04 = AnonymousClass02X.A04(cursor.getString(columnIndexOrThrow2));
            if (A04 == null) {
                StringBuilder A0S = AnonymousClass008.A0S("participant-user-db-migration/process-batch: groupJid=");
                A0S.append(cursor.getString(columnIndexOrThrow2));
                A0S.append(", rowId=");
                A0S.append(j);
                A0S.append(" SKIP Due to invalid MultipleParticipantJid.");
                Log.w(A0S.toString());
            } else if (!z2 || this.A01.A05(A04) != null) {
                String string = cursor.getString(columnIndexOrThrow3);
                if (string.isEmpty()) {
                    AnonymousClass01I r0 = this.A00;
                    r0.A04();
                    nullable = r0.A03;
                } else {
                    nullable = UserJid.getNullable(string);
                }
                if (nullable == null) {
                    StringBuilder sb = new StringBuilder("participant-user-db-migration/process-batch: participantUserJid=");
                    sb.append(string);
                    sb.append(", rowId=");
                    sb.append(j);
                    AnonymousClass008.A1V(sb, " SKIP Due to invalid UserJid.");
                } else {
                    this.A02.A0A(A04, new AnonymousClass1M5(nullable, i2, z2, z));
                }
            } else {
                StringBuilder A0S2 = AnonymousClass008.A0S("participant-user-db-migration/process-batch: groupJid=");
                A0S2.append(cursor.getString(columnIndexOrThrow2));
                A0S2.append(", rowId=");
                A0S2.append(j);
                A0S2.append(" SKIP Due to pending group which no longer exists.");
                Log.w(A0S2.toString());
            }
        }
        return Pair.create(Long.valueOf(j), Integer.valueOf(i));
    }

    @Override // X.AnonymousClass0PN
    public void A0C() {
        super.A0C();
        this.A03.A03("participant_user_ready", 2);
    }

    @Override // X.AnonymousClass0PN
    public void A0D() {
        super.A0D();
        this.A02.A07();
    }
}
