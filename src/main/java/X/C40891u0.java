package X;

import android.view.ViewGroup;
import com.whatsapp.StickyHeadersRecyclerView;

/* renamed from: X.1u0  reason: invalid class name and case insensitive filesystem */
public class C40891u0 extends AbstractC16300pa {
    public AbstractC16300pa A00;

    public C40891u0(AbstractC16300pa r3) {
        this.A00 = r3;
        A04(r3.A00);
        r3.A01.registerObserver(new C40881tz(this));
    }

    @Override // X.AbstractC16300pa
    public int A05() {
        return ((AnonymousClass1O2) this.A00).A6d() + this.A00.A05();
    }

    @Override // X.AbstractC16300pa
    public AbstractC11910hD A06(ViewGroup viewGroup, int i) {
        if (i == -1000) {
            return ((AnonymousClass1O2) this.A00).AEj(viewGroup);
        }
        return this.A00.A06(viewGroup, i);
    }

    @Override // X.AbstractC16300pa
    public void A07(AbstractC11910hD r6, int i) {
        long A08 = A08(i);
        if (StickyHeadersRecyclerView.A09(A08)) {
            ((AnonymousClass1O2) this.A00).ADX(r6, (int) (A08 >> 32));
        } else {
            this.A00.A07(r6, (int) (A08 & 4294967295L));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0029, code lost:
        r2 = r2 << 32;
        r0 = (long) ((r9 - r5) + r6);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long A08(int r9) {
        /*
            r8 = this;
            X.0pa r7 = r8.A00
            X.1O2 r7 = (X.AnonymousClass1O2) r7
            int r3 = r7.A6d()
            r2 = 0
            r6 = 0
            r5 = 0
        L_0x000b:
            r4 = 32
            if (r2 >= r3) goto L_0x001a
            if (r5 != r9) goto L_0x001e
            long r2 = (long) r2
            long r2 = r2 << r4
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
        L_0x0018:
            long r2 = r2 | r0
            return r2
        L_0x001a:
            int r0 = r3 + -1
            long r2 = (long) r0
            goto L_0x0029
        L_0x001e:
            int r5 = r5 + 1
            int r1 = r7.A5V(r2)
            int r0 = r5 + r1
            if (r0 <= r9) goto L_0x002e
            long r2 = (long) r2
        L_0x0029:
            long r2 = r2 << r4
            int r9 = r9 - r5
            int r9 = r9 + r6
            long r0 = (long) r9
            goto L_0x0018
        L_0x002e:
            int r6 = r6 + r1
            int r2 = r2 + 1
            r5 = r0
            goto L_0x000b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40891u0.A08(int):long");
    }
}
