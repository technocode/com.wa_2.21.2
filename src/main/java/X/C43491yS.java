package X;

import android.database.Cursor;
import android.util.Pair;
import androidx.core.view.inputmethod.EditorInfoCompat;

/* renamed from: X.1yS  reason: invalid class name and case insensitive filesystem */
public class C43491yS extends AnonymousClass0PN {
    public AnonymousClass09W A00;
    public AnonymousClass0FS A01;

    @Override // X.AnonymousClass0PN
    public void A0D() {
    }

    public C43491yS(AnonymousClass0FS r3, AnonymousClass09W r4, AnonymousClass0PQ r5) {
        super("call_log", EditorInfoCompat.IME_FLAG_FORCE_ASCII, r5);
        this.A01 = r3;
        this.A00 = r4;
    }

    @Override // X.AnonymousClass0PN
    public Pair A07(Cursor cursor) {
        throw new UnsupportedOperationException();
    }
}
