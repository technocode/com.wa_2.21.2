package X;

import android.util.Base64;

/* renamed from: X.0Oz  reason: invalid class name and case insensitive filesystem */
public class C05540Oz implements AnonymousClass0P0 {
    public static volatile C05540Oz A01;
    public final AnonymousClass0BV A00;

    @Override // X.AnonymousClass0P0
    public boolean A3a(long j) {
        return true;
    }

    @Override // X.AnonymousClass0P0
    public boolean ANM(C20970xt r2) {
        return true;
    }

    public C05540Oz(AnonymousClass0BV r1) {
        this.A00 = r1;
    }

    @Override // X.AnonymousClass0P0
    public C20970xt ABq(String str, int i) {
        AnonymousClass1XO r0;
        byte b;
        switch (i) {
            case 0:
                r0 = AnonymousClass1XO.A0A;
                break;
            case 1:
                r0 = AnonymousClass1XO.A0D;
                break;
            case 2:
                r0 = AnonymousClass1XO.A05;
                break;
            case 3:
                r0 = AnonymousClass1XO.A07;
                break;
            case 4:
                r0 = AnonymousClass1XO.A0N;
                break;
            case 5:
                r0 = AnonymousClass1XO.A04;
                break;
            case 6:
                r0 = AnonymousClass1XO.A0I;
                break;
            case 7:
            default:
                r0 = null;
                break;
            case 8:
                r0 = AnonymousClass1XO.A0E;
                break;
            case 9:
                r0 = AnonymousClass1XO.A0F;
                break;
        }
        AnonymousClass0BV r2 = this.A00;
        if (r0 != null) {
            b = r0.A00;
        } else {
            b = 0;
        }
        C47952Ki A09 = r2.A09(str, b, false);
        if (A09 == null) {
            return null;
        }
        byte[] decode = Base64.decode(str, 0);
        byte[] decode2 = Base64.decode(A09.A03, 0);
        int A002 = AnonymousClass1YV.A00(AnonymousClass1XO.A01(A09.A00, 0));
        AnonymousClass0M4 r22 = A09.A02;
        return new C20970xt(decode, decode2, A002, r22.A0U, r22.A0B / 1000, r22.A0G, A09.A04);
    }
}
