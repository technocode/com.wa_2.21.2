package X;

import android.os.Bundle;

/* renamed from: X.0bv  reason: invalid class name and case insensitive filesystem */
public class C08890bv extends C02270Bi implements AbstractC08900bw {
    public AbstractC005102k A00;
    public C30281b4 A01;
    public C15650oR A02;
    public final int A03;
    public final Bundle A04;
    public final C15650oR A05;

    public C08890bv(int i, Bundle bundle, C15650oR r5, C15650oR r6) {
        this.A03 = i;
        this.A04 = bundle;
        this.A05 = r5;
        this.A02 = r6;
        if (r5.A01 == null) {
            r5.A01 = this;
            r5.A00 = i;
            return;
        }
        throw new IllegalStateException("There is already a listener registered");
    }

    @Override // X.AbstractC02280Bj
    public void A06(AnonymousClass0SG r2) {
        super.A06(r2);
        this.A00 = null;
        this.A01 = null;
    }

    @Override // X.AbstractC02280Bj
    public void A07(Object obj) {
        super.A07(obj);
        C15650oR r1 = this.A02;
        if (r1 != null) {
            r1.A01();
            r1.A05 = true;
            r1.A06 = false;
            r1.A02 = false;
            r1.A03 = false;
            r1.A04 = false;
            this.A02 = null;
        }
    }

    public C15650oR A09(boolean z) {
        C15650oR r5 = this.A05;
        r5.A05();
        r5.A02 = true;
        C30281b4 r3 = this.A01;
        if (r3 != null) {
            super.A06(r3);
            this.A00 = null;
            this.A01 = null;
            if (z && r3.A00) {
                r3.A01.AHG(r3.A02);
            }
        }
        AbstractC08900bw r0 = r5.A01;
        if (r0 == null) {
            throw new IllegalStateException("No listener register");
        } else if (r0 == this) {
            r5.A01 = null;
            if ((r3 == null || r3.A00) && !z) {
                return r5;
            }
            r5.A01();
            r5.A05 = true;
            r5.A06 = false;
            r5.A02 = false;
            r5.A03 = false;
            r5.A04 = false;
            return this.A02;
        } else {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
    }

    public void A0A() {
        AbstractC005102k r1 = this.A00;
        C30281b4 r0 = this.A01;
        if (r1 != null && r0 != null) {
            super.A06(r0);
            A03(r1, r0);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append("LoaderInfo{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" #");
        sb.append(this.A03);
        sb.append(" : ");
        AnonymousClass0N2.A1S(this.A05, sb);
        sb.append("}}");
        return sb.toString();
    }
}
