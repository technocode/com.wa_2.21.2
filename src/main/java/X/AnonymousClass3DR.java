package X;

import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3DR  reason: invalid class name */
public class AnonymousClass3DR implements AnonymousClass2LO {
    public final AnonymousClass02M A00;
    public final AnonymousClass00S A01;
    public final C68433De A02;
    public final C01980Ae A03;
    public final C02060Am A04;
    public final C01970Ad A05;
    public final C62942vb A06;

    @Override // X.AnonymousClass2LO
    public byte[] AGg(AnonymousClass1VM r2) {
        return null;
    }

    public AnonymousClass3DR(AnonymousClass00S r1, AnonymousClass02M r2, C01970Ad r3, C01980Ae r4, C62942vb r5, C68433De r6, C02060Am r7) {
        this.A01 = r1;
        this.A00 = r2;
        this.A05 = r3;
        this.A03 = r4;
        this.A06 = r5;
        this.A02 = r6;
        this.A04 = r7;
    }

    @Override // X.AnonymousClass2LO
    public void A1v(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass1VM r2 = (AnonymousClass1VM) it.next();
            int A042 = r2.A04();
            if (!(A042 == 1 || A042 == 4)) {
                if (A042 == 5) {
                    C02060Am r1 = this.A04;
                    r1.A05(r1.A01("add_business"));
                } else if (!(A042 == 6 || A042 == 7)) {
                    StringBuilder sb = new StringBuilder("PAY: Not supported method type for Brazil: ");
                    sb.append(r2);
                    Log.w(sb.toString());
                }
            }
            C01980Ae r12 = this.A03;
            r12.A05(r12.A01("add_card"));
        }
        this.A00.A0E(new RunnableEBaseShape11S0100000_I1_6(this.A02, 15));
    }

    @Override // X.AnonymousClass2LO
    public AnonymousClass1VM A2B(AnonymousClass1VM r7) {
        AbstractC43781yw r5;
        AbstractC43781yw r4;
        int A042 = r7.A04();
        if (!(A042 == 1 || A042 == 4)) {
            if (A042 == 5) {
                C74733bP r2 = (C74733bP) r7.A06;
                if (r2 != null) {
                    C01970Ad r0 = this.A05;
                    r0.A04();
                    AnonymousClass1VM A08 = r0.A06.A08(r7.A07);
                    if (!(A08 == null || (r4 = A08.A06) == null)) {
                        C74733bP r42 = (C74733bP) r4;
                        if (TextUtils.isEmpty(r2.A06)) {
                            r2.A06 = r42.A06;
                        }
                        if (TextUtils.isEmpty(r2.A08)) {
                            r2.A08 = r42.A08;
                        }
                        if (TextUtils.isEmpty(((AbstractC59432ne) r2).A02)) {
                            ((AbstractC59432ne) r2).A02 = ((AbstractC59432ne) r42).A02;
                        }
                        if (TextUtils.isEmpty(r2.A02)) {
                            r2.A02 = r42.A02;
                        }
                        if (TextUtils.isEmpty(r2.A05)) {
                            r2.A05 = r42.A05;
                        }
                        String str = r2.A05;
                        if ("VERIFIED".equals(str) && !"VERIFIED".equals(r42.A05)) {
                            r2.A04 = "MERCHANT_VERIFIED";
                            return r7;
                        } else if ("NEEDS_MORE_INFO".equals(str) && "VERIFYING".equals(r42.A05)) {
                            r2.A04 = "MERCHANT_VERIFICATION_FAILURE";
                            return r7;
                        } else if ("DISABLED".equals(str) && !"DISABLED".equals(r42.A05)) {
                            r2.A04 = "MERCHANT_DISABLED";
                            return r7;
                        }
                    }
                } else {
                    Log.w("PAY:BrazilPaymentStorageObserver/beforeMethodAdded: methodData is null");
                    return r7;
                }
            } else if (!(A042 == 6 || A042 == 7)) {
                StringBuilder A0S = AnonymousClass008.A0S("PAY: method type not expected: ");
                A0S.append(A042);
                Log.w(A0S.toString());
            }
            return r7;
        }
        C74723bO r22 = (C74723bO) r7.A06;
        if (r22 != null) {
            String str2 = r22.A09;
            if (!TextUtils.isEmpty(str2) && r7.A0B != null) {
                r7.A0B = C28051Sr.A26(str2);
            }
            C01970Ad r02 = this.A05;
            r02.A04();
            AnonymousClass1VM A082 = r02.A06.A08(r7.A07);
            if (!(A082 == null || (r5 = A082.A06) == null)) {
                C74723bO r52 = (C74723bO) r5;
                AnonymousClass00S r43 = this.A01;
                if (!r22.A0X) {
                    r22.A0T = r52.A0T;
                    ((AbstractC460627w) r22).A02 = ((AbstractC460627w) r52).A02;
                }
                if (TextUtils.isEmpty(r22.A06)) {
                    r22.A06 = r52.A06;
                }
                if (TextUtils.isEmpty(r22.A03)) {
                    r22.A03 = r52.A03;
                }
                if (TextUtils.isEmpty(r22.A0C) || r22.A0C.equals(r52.A0C)) {
                    r22.A0C = r52.A0C;
                    if (TextUtils.isEmpty(r22.A0E)) {
                        r22.A0E = r52.A0E;
                    }
                    if (TextUtils.isEmpty(r22.A0D)) {
                        r22.A0D = r52.A0D;
                    }
                } else {
                    r22.A0E = null;
                    r22.A0D = null;
                }
                if (!TextUtils.isEmpty(r22.A0J) && !r22.A0J.equals(r52.A0J)) {
                    ((AbstractC460627w) r22).A07 = Long.valueOf(r43.A05());
                }
                if (!r52.A0X && r22.A0X) {
                    r22.A05 = "PAYMENT_METHOD_VERIFIED";
                }
                if (TextUtils.isEmpty(r22.A0E)) {
                    this.A06.A01(r7, null);
                    return r7;
                }
            }
        }
        return r7;
    }
}
