package X;

import android.view.Surface;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.1hU  reason: invalid class name and case insensitive filesystem */
public class C33851hU implements AnonymousClass16A, AbstractC225612g, AnonymousClass12G, AbstractC229813y, AnonymousClass168, AbstractC225212c, AnonymousClass131, AbstractC228213h, AnonymousClass15A {
    public AnonymousClass12H A00;
    public final AnonymousClass12Q A01 = new AnonymousClass12Q();
    public final AnonymousClass12U A02 = new AnonymousClass12U();
    public final AnonymousClass15Y A03;
    public final CopyOnWriteArraySet A04 = new CopyOnWriteArraySet();

    @Override // X.AnonymousClass168
    public final void AJI() {
    }

    public C33851hU(AnonymousClass12H r2, AnonymousClass15Y r3) {
        this.A00 = r2;
        this.A03 = r3;
    }

    public final void A00() {
        AnonymousClass12T r0;
        AnonymousClass12U r2 = this.A02;
        ArrayList arrayList = r2.A05;
        if (arrayList.isEmpty() || r2.A00.A0D() || r2.A03) {
            r0 = null;
        } else {
            r0 = (AnonymousClass12T) arrayList.get(0);
        }
        A04(r0);
    }

    public final void A01() {
        Iterator it = new ArrayList(this.A02.A05).iterator();
        while (it.hasNext()) {
            AnonymousClass12T r0 = (AnonymousClass12T) it.next();
            AHX(r0.A00, r0.A02);
        }
    }

    public final void A02(int i, C229113r r4) {
        AnonymousClass12H r0 = this.A00;
        if (r0 == null) {
            throw null;
        } else if (r4 != null) {
            AnonymousClass12T r02 = (AnonymousClass12T) this.A02.A06.get(r4);
            if (r02 != null) {
                A04(r02);
            } else {
                A03(AnonymousClass12R.A00, i, r4);
            }
        } else {
            AnonymousClass12R A5q = r0.A5q();
            if (i >= A5q.A01()) {
                A5q = AnonymousClass12R.A00;
            }
            A03(A5q, i, null);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001b, code lost:
        if (r5 != r3.A00.A5r()) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(X.AnonymousClass12R r4, int r5, X.C229113r r6) {
        /*
            r3 = this;
            boolean r2 = r4.A0D()
            if (r2 == 0) goto L_0x0007
            r6 = 0
        L_0x0007:
            X.15Y r0 = r3.A03
            r0.A3z()
            X.12H r0 = r3.A00
            X.12R r0 = r0.A5q()
            if (r4 != r0) goto L_0x001d
            X.12H r0 = r3.A00
            int r0 = r0.A5r()
            r1 = 1
            if (r5 == r0) goto L_0x001e
        L_0x001d:
            r1 = 0
        L_0x001e:
            if (r6 == 0) goto L_0x0051
            boolean r0 = r6.A00()
            if (r0 == 0) goto L_0x0051
            if (r1 == 0) goto L_0x0041
            X.12H r0 = r3.A00
            int r1 = r0.A5j()
            int r0 = r6.A00
            if (r1 != r0) goto L_0x0041
            X.12H r0 = r3.A00
            int r1 = r0.A5k()
            int r0 = r6.A01
            if (r1 != r0) goto L_0x0041
            X.12H r0 = r3.A00
            r0.A5n()
        L_0x0041:
            X.12H r0 = r3.A00
            r0.A5n()
            X.12H r0 = r3.A00
            r0.A9P()
            X.12V r0 = new X.12V
            r0.<init>()
            return
        L_0x0051:
            if (r1 == 0) goto L_0x0059
            X.12H r0 = r3.A00
            r0.A5T()
            goto L_0x0041
        L_0x0059:
            if (r2 != 0) goto L_0x0041
            X.12Q r0 = r3.A01
            r4.A0A(r5, r0)
            goto L_0x0041
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33851hU.A03(X.12R, int, X.13r):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003d, code lost:
        if (r10 == null) goto L_0x003f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04(X.AnonymousClass12T r10) {
        /*
            r9 = this;
            X.12H r0 = r9.A00
            if (r0 == 0) goto L_0x005b
            if (r10 != 0) goto L_0x0051
            int r5 = r0.A5r()
            X.12U r8 = r9.A02
            r4 = 0
            r10 = r4
            r7 = 0
        L_0x000f:
            java.util.ArrayList r1 = r8.A05
            int r0 = r1.size()
            if (r7 >= r0) goto L_0x003d
            java.lang.Object r6 = r1.get(r7)
            X.12T r6 = (X.AnonymousClass12T) r6
            X.12R r1 = r8.A00
            X.13r r0 = r6.A02
            java.lang.Object r0 = r0.A04
            int r3 = r1.A04(r0)
            r0 = -1
            if (r3 == r0) goto L_0x003a
            X.12R r2 = r8.A00
            X.12P r1 = r8.A04
            r0 = 0
            X.12P r0 = r2.A08(r3, r1, r0)
            int r0 = r0.A00
            if (r0 != r5) goto L_0x003a
            if (r10 != 0) goto L_0x003f
            r10 = r6
        L_0x003a:
            int r7 = r7 + 1
            goto L_0x000f
        L_0x003d:
            if (r10 != 0) goto L_0x0051
        L_0x003f:
            X.12H r0 = r9.A00
            X.12R r1 = r0.A5q()
            int r0 = r1.A01()
            if (r5 < r0) goto L_0x004d
            X.12R r1 = X.AnonymousClass12R.A00
        L_0x004d:
            r9.A03(r1, r5, r4)
            return
        L_0x0051:
            X.12R r2 = r10.A01
            int r1 = r10.A00
            X.13r r0 = r10.A02
            r9.A03(r2, r1, r0)
            return
        L_0x005b:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33851hU.A04(X.12T):void");
    }

    @Override // X.AbstractC225612g
    public final void AD1(String str, long j, long j2) {
        A04(this.A02.A02);
        Iterator it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw null;
        }
    }

    @Override // X.AbstractC225612g
    public final void AD2(C227412z r3) {
        A04(this.A02.A01);
        Iterator it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw null;
        }
    }

    @Override // X.AbstractC225612g
    public final void AD3(C227412z r3) {
        A00();
        Iterator it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw null;
        }
    }

    @Override // X.AbstractC225612g
    public final void AD4(AnonymousClass126 r3) {
        A04(this.A02.A02);
        Iterator it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw null;
        }
    }

    @Override // X.AbstractC225212c, X.AbstractC225612g
    public final void AD6(int i) {
        A04(this.A02.A02);
        Iterator it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw null;
        }
    }

    @Override // X.AbstractC225612g
    public final void AD7(int i, long j, long j2) {
        A04(this.A02.A02);
        Iterator it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw null;
        }
    }

    @Override // X.AbstractC229813y
    public final void AFK(int i, C229113r r4, C229713x r5) {
        A02(i, r4);
        Iterator it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw null;
        }
    }

    @Override // X.AnonymousClass16A
    public final void AFM(int i, long j) {
        A04(this.A02.A01);
        Iterator it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw null;
        }
    }

    @Override // X.AbstractC229813y
    public final void AH2(int i, C229113r r4, C229613w r5, C229713x r6) {
        A02(i, r4);
        Iterator it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw null;
        }
    }

    @Override // X.AbstractC229813y
    public final void AH3(int i, C229113r r4, C229613w r5, C229713x r6) {
        A02(i, r4);
        Iterator it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw null;
        }
    }

    @Override // X.AbstractC229813y
    public final void AH6(int i, C229113r r4, C229613w r5, C229713x r6, IOException iOException, boolean z) {
        A02(i, r4);
        Iterator it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw null;
        }
    }

    @Override // X.AbstractC229813y
    public final void AHC(int i, C229113r r4, C229613w r5, C229713x r6) {
        A02(i, r4);
        Iterator it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw null;
        }
    }

    @Override // X.AnonymousClass12G
    public final void AHH(boolean z) {
        A00();
        Iterator it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw null;
        }
    }

    @Override // X.AbstractC229813y
    public final void AHW(int i, C229113r r7) {
        AnonymousClass12R r0;
        AnonymousClass12U r4 = this.A02;
        if (r4.A00.A04(r7.A04) != -1) {
            r0 = r4.A00;
        } else {
            r0 = AnonymousClass12R.A00;
        }
        AnonymousClass12T r2 = new AnonymousClass12T(r7, r0, i);
        ArrayList arrayList = r4.A05;
        arrayList.add(r2);
        r4.A06.put(r7, r2);
        if (arrayList.size() == 1 && !r4.A00.A0D()) {
            r4.A01();
        }
        A02(i, r7);
        Iterator it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw null;
        }
    }

    @Override // X.AbstractC229813y
    public final void AHX(int i, C229113r r6) {
        AnonymousClass12T r0;
        A02(i, r6);
        AnonymousClass12U r3 = this.A02;
        Object remove = r3.A06.remove(r6);
        if (remove != null) {
            ArrayList arrayList = r3.A05;
            arrayList.remove(remove);
            AnonymousClass12T r02 = r3.A02;
            if (r02 != null && r6.equals(r02.A02)) {
                if (arrayList.isEmpty()) {
                    r0 = null;
                } else {
                    r0 = (AnonymousClass12T) arrayList.get(0);
                }
                r3.A02 = r0;
            }
            Iterator it = this.A04.iterator();
            if (it.hasNext()) {
                it.next();
                throw null;
            }
        }
    }

    @Override // X.AnonymousClass12G
    public final void AIV(AnonymousClass12F r3) {
        A00();
        Iterator it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw null;
        }
    }

    @Override // X.AnonymousClass12G
    public final void AIX(AnonymousClass11w r3) {
        AnonymousClass12T r0;
        if (r3.type == 0) {
            ArrayList arrayList = this.A02.A05;
            if (arrayList.isEmpty()) {
                r0 = null;
            } else {
                r0 = (AnonymousClass12T) arrayList.get(arrayList.size() - 1);
            }
            A04(r0);
        } else {
            A00();
        }
        Iterator it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw null;
        }
    }

    @Override // X.AnonymousClass12G
    public final void AIY(boolean z, int i) {
        A00();
        Iterator it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw null;
        }
    }

    @Override // X.AnonymousClass12G
    public final void AIZ(int i) {
        this.A02.A01();
        A00();
        Iterator it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw null;
        }
    }

    @Override // X.AbstractC229813y
    public final void AJ2(int i, C229113r r4) {
        AnonymousClass12U r1 = this.A02;
        r1.A02 = (AnonymousClass12T) r1.A06.get(r4);
        A02(i, r4);
        Iterator it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw null;
        }
    }

    @Override // X.AnonymousClass16A
    public final void AJJ(Surface surface) {
        A04(this.A02.A02);
        Iterator it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw null;
        }
    }

    @Override // X.AnonymousClass12G
    public final void AJu() {
        AnonymousClass12U r1 = this.A02;
        if (r1.A03) {
            r1.A03 = false;
            r1.A01();
            A00();
            Iterator it = this.A04.iterator();
            if (it.hasNext()) {
                it.next();
                throw null;
            }
        }
    }

    @Override // X.AnonymousClass168
    public void AKo(int i, int i2) {
        A04(this.A02.A02);
        Iterator it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw null;
        }
    }

    @Override // X.AnonymousClass12G
    public final void AKz(AnonymousClass12R r6, Object obj, int i) {
        AnonymousClass12U r4 = this.A02;
        int i2 = 0;
        while (true) {
            ArrayList arrayList = r4.A05;
            if (i2 >= arrayList.size()) {
                break;
            }
            AnonymousClass12T A002 = r4.A00((AnonymousClass12T) arrayList.get(i2), r6);
            arrayList.set(i2, A002);
            r4.A06.put(A002.A02, A002);
            i2++;
        }
        AnonymousClass12T r0 = r4.A02;
        if (r0 != null) {
            r4.A02 = r4.A00(r0, r6);
        }
        r4.A00 = r6;
        r4.A01();
        A00();
        Iterator it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw null;
        }
    }

    @Override // X.AnonymousClass12G
    public final void ALC(AnonymousClass14A r3, C232214w r4) {
        A00();
        Iterator it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw null;
        }
    }

    @Override // X.AnonymousClass16A
    public final void ALf(String str, long j, long j2) {
        A04(this.A02.A02);
        Iterator it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw null;
        }
    }

    @Override // X.AnonymousClass16A
    public final void ALg(C227412z r3) {
        A04(this.A02.A01);
        Iterator it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw null;
        }
    }

    @Override // X.AnonymousClass16A
    public final void ALh(C227412z r3) {
        A00();
        Iterator it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw null;
        }
    }

    @Override // X.AnonymousClass16A
    public final void ALi(AnonymousClass126 r3) {
        A04(this.A02.A02);
        Iterator it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw null;
        }
    }

    @Override // X.AnonymousClass168, X.AnonymousClass16A
    public final void ALj(int i, int i2, int i3, float f) {
        A04(this.A02.A02);
        Iterator it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw null;
        }
    }

    @Override // X.AbstractC225212c
    public void ALm(float f) {
        A04(this.A02.A02);
        Iterator it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw null;
        }
    }
}
