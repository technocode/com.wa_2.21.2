package X;

import android.database.Cursor;
import android.util.Pair;
import androidx.core.view.inputmethod.EditorInfoCompat;

/* renamed from: X.0PM  reason: invalid class name */
public class AnonymousClass0PM extends AnonymousClass0PN {
    public static volatile AnonymousClass0PM A02;
    public final AnonymousClass009 A00;
    public final C015308l A01;

    public AnonymousClass0PM(AnonymousClass0PQ r3) {
        super("migration_jid_store", EditorInfoCompat.IME_FLAG_FORCE_ASCII, r3);
        C015308l r0 = r3.A0I;
        if (r0 != null) {
            this.A01 = r0;
            AnonymousClass009 r02 = r3.A01;
            if (r02 != null) {
                this.A00 = r02;
                return;
            }
            throw null;
        }
        throw null;
    }

    public static AnonymousClass0PM A00() {
        if (A02 == null) {
            synchronized (AnonymousClass0PM.class) {
                if (A02 == null) {
                    A02 = new AnonymousClass0PM(AnonymousClass0PQ.A00());
                }
            }
        }
        return A02;
    }

    @Override // X.AnonymousClass0PN
    public Pair A07(Cursor cursor) {
        return new Pair(0L, 0);
    }
}
