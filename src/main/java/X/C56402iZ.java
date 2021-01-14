package X;

import android.util.Pair;

/* renamed from: X.2iZ  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C56402iZ implements AbstractC49902Sq {
    public final /* synthetic */ C04430Ki A00;

    public /* synthetic */ C56402iZ(C04430Ki r1) {
        this.A00 = r1;
    }

    @Override // X.AbstractC49902Sq
    public final boolean A21(Object obj, AnonymousClass0M3 r6, AnonymousClass0M4 r7) {
        byte[] bArr;
        C04430Ki r0 = this.A00;
        AnonymousClass2TL r5 = (AnonymousClass2TL) obj;
        AnonymousClass1XO A02 = AnonymousClass1XO.A02(r6);
        C05440On A0B = r6.A0B();
        if (!(A0B == null || (bArr = r5.A02) == null)) {
            r0.A04.A02(A0B);
            A0B.A04(bArr, AnonymousClass0CK.A03(A02));
        }
        Pair pair = r5.A01;
        if (pair != null) {
            r7.A08 = ((Number) pair.first).intValue();
            r7.A06 = ((Number) pair.second).intValue();
        }
        Pair pair2 = r5.A00;
        if (pair2 != null) {
            r7.A02 = ((Number) pair2.first).intValue();
            r7.A03 = ((Number) pair2.second).intValue();
        }
        byte[] bArr2 = r5.A03;
        if (bArr2 == null || !(r6 instanceof AnonymousClass0ZE)) {
            return true;
        }
        ((AnonymousClass0ZE) r6).A01 = C29251Xr.A00(bArr2);
        return true;
    }
}
