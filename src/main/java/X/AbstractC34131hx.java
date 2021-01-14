package X;

import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.1hx  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC34131hx implements AbstractC229313t {
    public Looper A00;
    public AnonymousClass12R A01;
    public Object A02;
    public final C229513v A03 = new C229513v();
    public final ArrayList A04 = new ArrayList(1);

    public final void A00(AnonymousClass12R r3, Object obj) {
        this.A01 = r3;
        this.A02 = obj;
        Iterator it = this.A04.iterator();
        while (it.hasNext()) {
            ((AbstractC229213s) it.next()).AKG(this, r3, obj);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0007, code lost:
        if (r4 == null) goto L_0x0009;
     */
    @Override // X.AbstractC229313t
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A1l(android.os.Handler r3, X.AbstractC229813y r4) {
        /*
            r2 = this;
            X.13v r1 = r2.A03
            if (r1 == 0) goto L_0x0018
            if (r3 == 0) goto L_0x0009
            r0 = 1
            if (r4 != 0) goto L_0x000a
        L_0x0009:
            r0 = 0
        L_0x000a:
            X.C002001d.A39(r0)
            java.util.concurrent.CopyOnWriteArrayList r1 = r1.A02
            X.13u r0 = new X.13u
            r0.<init>(r3, r4)
            r1.add(r0)
            return
        L_0x0018:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC34131hx.A1l(android.os.Handler, X.13y):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (r1 == r2) goto L_0x000b;
     */
    @Override // X.AbstractC229313t
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void AM8(X.AbstractC229213s r8, X.AnonymousClass15U r9) {
        /*
        // Method dump skipped, instructions count: 120
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC34131hx.AM8(X.13s, X.15U):void");
    }

    @Override // X.AbstractC229313t
    public final void AMV(AbstractC229213s r6) {
        ArrayList arrayList = this.A04;
        arrayList.remove(r6);
        if (arrayList.isEmpty()) {
            this.A00 = null;
            this.A01 = null;
            this.A02 = null;
            if (!(this instanceof AnonymousClass25W)) {
                HashMap hashMap = ((AnonymousClass25U) this).A02;
                for (C228713m r2 : hashMap.values()) {
                    AbstractC229313t r1 = r2.A01;
                    r1.AMV(r2.A00);
                    r1.AMc(r2.A02);
                }
                hashMap.clear();
            }
        }
    }

    @Override // X.AbstractC229313t
    public final void AMc(AbstractC229813y r5) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.A03.A02;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            C229413u r1 = (C229413u) it.next();
            if (r1.A01 == r5) {
                copyOnWriteArrayList.remove(r1);
            }
        }
    }
}
