package X;

import android.database.Cursor;
import android.database.SQLException;
import android.util.Pair;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.util.Log;
import java.io.IOException;

/* renamed from: X.1yf  reason: invalid class name and case insensitive filesystem */
public class C43611yf extends AnonymousClass0PN {
    public final AnonymousClass09V A00;
    public final AnonymousClass09Q A01;
    public final C017409g A02;

    public C43611yf(AnonymousClass09Q r3, AnonymousClass09V r4, C017409g r5, AnonymousClass0PQ r6) {
        super("missed_calls", EditorInfoCompat.IME_FLAG_FORCE_ASCII, r6);
        this.A01 = r3;
        this.A00 = r4;
        this.A02 = r5;
    }

    @Override // X.AnonymousClass0PN
    public Pair A07(Cursor cursor) {
        AnonymousClass0ZH r3;
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow("_id");
        long j = -1;
        int i = 0;
        while (cursor.moveToNext()) {
            j = cursor.getLong(columnIndexOrThrow);
            try {
                r3 = (AnonymousClass0ZH) this.A00.A02(cursor);
            } catch (SQLException e) {
                throw e;
            } catch (Exception e2) {
                StringBuilder sb = new StringBuilder("MissedCallsLogDatabaseMigration/processBatch/failed to read message with id = ");
                sb.append(j);
                Log.e(sb.toString(), e2);
                r3 = null;
            }
            if (r3 != null) {
                this.A02.A02(r3);
                r3.A0g(null);
                try {
                    this.A01.A07(r3, false);
                } catch (IOException unused) {
                    Log.e("MissedCallsLogDatabaseMigration/processBatch/failed to update missed call message in main message store.");
                }
                i++;
            }
        }
        return Pair.create(Long.valueOf(j), Integer.valueOf(i));
    }

    @Override // X.AnonymousClass0PN
    public void A0C() {
        super.A0C();
        this.A06.A03("missed_calls_ready", 1);
    }
}
