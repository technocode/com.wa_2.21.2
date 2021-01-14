package X;

import com.facebook.simplejni.NativeHolder;
import com.whatsapp.wamsys.JniBridge;

/* renamed from: X.2Uz  reason: invalid class name and case insensitive filesystem */
public class C50512Uz {
    public final C001000o A00;
    public final C50492Ux A01;
    public final AnonymousClass1XJ A02;

    public C50512Uz(AnonymousClass1XJ r1, C001000o r2, C50492Ux r3) {
        this.A02 = r1;
        this.A00 = r2;
        this.A01 = r3;
    }

    public AnonymousClass1UF A00(AnonymousClass0E6 r62, AnonymousClass02P r63, C44281zn r64, boolean z) {
        int i;
        AnonymousClass1UE r9;
        C50492Ux r1 = this.A01;
        AnonymousClass1XJ r11 = this.A02;
        if (r1 != null) {
            AnonymousClass02P r2 = r11.A08;
            if (r2 != null) {
                i = r2.A01;
            } else {
                AnonymousClass02P r22 = r11.A07;
                i = r22 != null ? r22.A01 : 0;
            }
            if (i == 1) {
                if (z) {
                    r64.A07 = 1L;
                    r9 = new C57812ku(r1.A0G, r11);
                } else {
                    throw new IllegalStateException("receipt sending has been disabled for a v1 encrypted message");
                }
            } else if (i == 2) {
                r64.A07 = 2L;
                r9 = new C57822kv(r1.A01, r1.A00, r1.A03, r1.A0B, r1.A0U, r1.A0F, r1.A0E, r1.A0K, r1.A06, r1.A05, r1.A07, r1.A09, r1.A04, r1.A0C, r1.A0R, r1.A0Q, r1.A0A, r1.A0G, r1.A02, r1.A0D, r1.A0M, r1.A0I, r1.A0J, r1.A0P, r1.A0L, r1.A08, r1.A0T, r1.A0H, r1.A0N, r1.A0O, r1.A0S, r62, r11, r64, z);
            } else {
                r9 = new C57802kt(i, z, r1.A05, r11, r64, r1.A0J);
            }
            if (r63 == null) {
                return null;
            }
            int i2 = r63.A00;
            if (i2 == 0) {
                r64.A02 = 0;
                return this.A00.A04(r62, r63.A02, r9);
            } else if (i2 == 1) {
                r64.A02 = 1;
                return this.A00.A05(r62, r63.A02, r9);
            } else if (i2 == 2) {
                r64.A02 = 2;
                String A0D = AnonymousClass1VY.A0D(AnonymousClass1VY.A09(r11.A0Y));
                AnonymousClass02N A09 = AnonymousClass1VY.A09(r11.A06);
                String A0D2 = AnonymousClass1VY.A0D(A09);
                if (AnonymousClass1VY.A0T(A09)) {
                    A0D = A0D2;
                }
                AnonymousClass0OE r6 = new AnonymousClass0OE(A0D, r62);
                C001000o r3 = this.A00;
                byte[] bArr = r63.A02;
                r3.A0H.A00();
                if (r3.A0I.A0E(188)) {
                    JniBridge jniBridge = r3.A01.A03;
                    String str = r6.A01;
                    AnonymousClass0E6 r0 = r6.A00;
                    C21030xz r02 = new C21030xz((NativeHolder) JniBridge.jvidispatchOIOOOOO(0, (long) r0.A00, str, r0.A01, r9, jniBridge.getWajContext(), bArr));
                    byte[] A002 = r02.A00();
                    JniBridge.getInstance();
                    return new AnonymousClass1UF(A002, (int) JniBridge.jvidispatchIIO(1, (long) 38, r02.A00));
                }
                try {
                    return AnonymousClass05B.A00(new AnonymousClass1Yr(r3.A00.A00.A02, C002001d.A2L(r6)).A01(bArr, new C43431yM(r9)), 0, null);
                } catch (C29401Yi e) {
                    return AnonymousClass05B.A00(null, -1007, e);
                } catch (C29381Yg e2) {
                    return AnonymousClass05B.A00(null, -1005, e2);
                } catch (C29341Yb e3) {
                    return AnonymousClass05B.A00(null, -1001, e3);
                } catch (C29411Yj e4) {
                    return AnonymousClass05B.A00(null, -1008, e4);
                }
            } else {
                StringBuilder A0S = AnonymousClass008.A0S("decryptmessagerunnable/axolotl unrecognized ciphertext type; message.key=");
                A0S.append(r11.A04());
                A0S.append(" type=");
                AnonymousClass008.A1M(A0S, i2);
                r64.A00 = Boolean.FALSE;
                r64.A04 = 8;
                return null;
            }
        } else {
            throw null;
        }
    }
}
