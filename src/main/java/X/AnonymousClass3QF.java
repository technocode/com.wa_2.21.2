package X;

import android.util.Pair;
import java.io.File;
import java.util.Collections;

/* renamed from: X.3QF  reason: invalid class name */
public class AnonymousClass3QF extends AnonymousClass0JW {
    public final AnonymousClass0B3 A00;
    public final AnonymousClass33B A01;
    public final C03570Gt A02;

    public AnonymousClass3QF(C03570Gt r1, AnonymousClass0B3 r2, AnonymousClass33B r3) {
        this.A02 = r1;
        this.A00 = r2;
        this.A01 = r3;
    }

    @Override // X.AnonymousClass0JW
    public void A00(Object[] objArr) {
        C29241Xq[] r4 = (C29241Xq[]) objArr;
        boolean z = true;
        if (r4.length != 1) {
            z = false;
        }
        AnonymousClass00E.A06(z);
        C29241Xq r1 = r4[0];
        if (r1 != null) {
            AnonymousClass33B r0 = this.A01;
            if (r0 != null) {
                r0.AKH(r1);
                return;
            }
            return;
        }
        throw null;
    }

    @Override // X.AnonymousClass0JW
    public Object A02(Object[] objArr) {
        C29241Xq[] r6 = (C29241Xq[]) objArr;
        if (r6 != null) {
            boolean z = false;
            boolean z2 = false;
            if (r6.length == 1) {
                z2 = true;
            }
            AnonymousClass00E.A06(z2);
            C29241Xq r3 = r6[0];
            if (r3 == null) {
                throw null;
            } else if (r3.A0C == null) {
                throw null;
            } else if (r3.A0A != null) {
                super.A00.A00(r3);
                AnonymousClass0B3 r2 = this.A00;
                File A03 = r2.A03(r3.A0A);
                if (r3.A01() || A03.exists()) {
                    z = true;
                } else {
                    if (this.A02.A06(r3, r2.A03(r3.A0A)) == null) {
                        return new Pair(r3, Boolean.FALSE);
                    }
                }
                this.A02.A0L(Collections.singleton(r3), z);
                return new Pair(r3, Boolean.TRUE);
            } else {
                throw null;
            }
        } else {
            throw null;
        }
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        Pair pair = (Pair) obj;
        AnonymousClass33B r2 = this.A01;
        if (r2 != null) {
            C29241Xq r1 = (C29241Xq) pair.first;
            if (((Boolean) pair.second).booleanValue()) {
                r2.AKZ(r1);
            } else {
                r2.AKU(r1);
            }
        }
    }
}
