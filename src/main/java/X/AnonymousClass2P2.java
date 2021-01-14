package X;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.2P2  reason: invalid class name */
public class AnonymousClass2P2 {
    public int A00;
    public long A01 = SystemClock.uptimeMillis();
    public final int A02;
    public final C10460ef A03;
    public final List A04 = new ArrayList();

    public AnonymousClass2P2(C10460ef r3, int i) {
        this.A03 = r3;
        this.A02 = i;
    }

    public void A00(AnonymousClass2P3 r10) {
        if (this.A00 < this.A02) {
            C10460ef r2 = this.A03;
            List singletonList = Collections.singletonList(r10);
            if (r2 != null) {
                ((AnonymousClass0JW) r2).A00.A00(singletonList);
            } else {
                throw null;
            }
        } else {
            List list = this.A04;
            list.add(r10);
            if (this.A01 + 1000 < SystemClock.uptimeMillis()) {
                ArrayList arrayList = new ArrayList(list);
                list.clear();
                C10460ef r0 = this.A03;
                if (r0 != null) {
                    ((AnonymousClass0JW) r0).A00.A00(arrayList);
                    this.A01 = SystemClock.uptimeMillis();
                } else {
                    throw null;
                }
            }
        }
        this.A00++;
    }
}
