package X;

import android.util.SparseBooleanArray;
import androidx.core.view.inputmethod.EditorInfoCompat;
import java.util.List;
import java.util.Map;

/* renamed from: X.0oq  reason: invalid class name and case insensitive filesystem */
public final class C15870oq {
    public static final AbstractC15840on A05 = new C30381bG();
    public final SparseBooleanArray A00 = new SparseBooleanArray();
    public final C15860op A01;
    public final List A02;
    public final List A03;
    public final Map A04 = new AnonymousClass05V();

    public C15870oq(List list, List list2) {
        this.A02 = list;
        this.A03 = list2;
        int size = this.A02.size();
        int i = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        C15860op r3 = null;
        for (int i2 = 0; i2 < size; i2++) {
            C15860op r1 = (C15860op) this.A02.get(i2);
            int i3 = r1.A06;
            if (i3 > i) {
                r3 = r1;
                i = i3;
            }
        }
        this.A01 = r3;
    }
}
