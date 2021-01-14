package X;

import com.whatsapp.data.ProfilePhotoChange;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;

/* renamed from: X.22o  reason: invalid class name and case insensitive filesystem */
public class C450222o implements AnonymousClass09O {
    public boolean A00;
    public final C40411tE A01;
    public final AnonymousClass02N A02;
    public final AnonymousClass09H A03;
    public final AnonymousClass1Xa A04;

    @Override // X.AnonymousClass09O
    public void AEv(String str) {
    }

    public C450222o(AnonymousClass02N r1, AnonymousClass1Xa r2, AnonymousClass09H r3, C40411tE r4) {
        this.A02 = r1;
        this.A04 = r2;
        this.A03 = r3;
        this.A01 = r4;
    }

    @Override // X.AnonymousClass09O
    public void AFd(String str, AnonymousClass0M5 r7) {
        C40411tE r4 = this.A01;
        int A0E = C002001d.A0E(r7);
        if (r4 != null) {
            StringBuilder A0T = AnonymousClass008.A0T("profilephotohandler/request failed : ", A0E, " | ");
            AnonymousClass02N r2 = r4.A0K;
            A0T.append(r2);
            Log.i(A0T.toString());
            r4.A01(3);
            r4.A04 = true;
            r4.A01.cancel();
            C40411tE.A0O.remove(r4.A02.toString());
            if (!r4.A05) {
                C007003k A0A = r4.A0B.A0A(r2);
                if (A0E != 401 || !A0A.A09() || r4.A0H.A04((GroupJid) A0A.A02(GroupJid.class))) {
                    AnonymousClass02M r22 = r4.A08;
                    r22.A02.post(new RunnableEBaseShape1S0101000_I1(r4, A0E, 5));
                } else {
                    AnonymousClass02M r23 = r4.A08;
                    r23.A02.post(new RunnableEBaseShape1S0101000_I1(r4, A0E, 4));
                }
            }
            AnonymousClass1Xa r0 = r4.A0L;
            if (r0 != null) {
                r4.A0N.A0E(r0.A01, A0E);
                return;
            }
            return;
        }
        throw null;
    }

    @Override // X.AnonymousClass09O
    public void AKk(String str, AnonymousClass0M5 r15) {
        String str2;
        AnonymousClass0EV r1;
        C007303n r0;
        String num;
        boolean z = false;
        ProfilePhotoChange profilePhotoChange = null;
        if (!this.A00) {
            AnonymousClass0M5 A0C = r15.A0C(0);
            AnonymousClass0M5.A01(A0C, "picture");
            str2 = A0C.A0G("id", null);
        } else {
            str2 = null;
        }
        C40411tE r3 = this.A01;
        if (r3 != null) {
            StringBuilder A0Z = AnonymousClass008.A0Z("profilephotohandler/request success : ", str2, " | ");
            AnonymousClass02N r8 = r3.A0K;
            A0Z.append(r8);
            Log.i(A0Z.toString());
            r3.A04 = true;
            r3.A01.cancel();
            C40411tE.A0O.remove(r3.A02.toString());
            r3.A01(1);
            C007003k A0A = r3.A0B.A0A(r8);
            int i = -1;
            if (str2 != null) {
                try {
                    i = Integer.parseInt(str2);
                } catch (NumberFormatException unused) {
                }
            }
            r3.A0E.A01(A0A, i, i);
            if (!r3.A05) {
                if (A0A.A09()) {
                    File A032 = r3.A0D.A03(A0A);
                    if (A032.exists()) {
                        profilePhotoChange = new ProfilePhotoChange();
                        try {
                            profilePhotoChange.oldPhoto = C002001d.A3k(A032);
                        } catch (IOException e) {
                            Log.w("profilephotohandler/", e);
                        }
                        profilePhotoChange.newPhoto = r3.A07;
                        profilePhotoChange.newPhotoId = i;
                    }
                    AnonymousClass01R r12 = r3.A0M;
                    long A05 = r3.A0F.A05();
                    AnonymousClass01I r02 = r3.A09;
                    r02.A04();
                    UserJid userJid = r02.A03;
                    if (userJid != null) {
                        if (0 == 0) {
                            AnonymousClass0A6 r03 = r12.A04;
                            r0 = AnonymousClass0FI.A07(r03.A01, r03.A00, r8, true);
                        } else {
                            r0 = new C007303n(r8, true, null);
                        }
                        C12120ha r7 = (C12120ha) AnonymousClass01R.A00(r0, A05, 6);
                        if (i == -1) {
                            num = null;
                        } else {
                            num = Integer.toString(i);
                        }
                        r7.A0d(num);
                        r7.A0Y(userJid);
                        r7.A00 = profilePhotoChange;
                        AbstractC007503q A022 = r3.A0I.A02(r8);
                        if (!(A022 instanceof C05390Oi)) {
                            r3.A0G.A0J(r7);
                        } else {
                            C05390Oi r6 = (C05390Oi) A022;
                            boolean z2 = false;
                            if (r6.A00 == 11) {
                                z2 = true;
                            }
                            AnonymousClass02N r13 = r7.A0G;
                            if (r13 != null && r6.A0u() && r13.equals(r6.A07())) {
                                z = true;
                            }
                            if (!z2 || !z) {
                                r3.A0G.A0J(r7);
                            }
                        }
                    } else {
                        throw null;
                    }
                }
                byte[] bArr = r3.A06;
                if (bArr == null && r3.A07 == null) {
                    r1 = r3.A0E;
                    r1.A05.A04(A0A);
                } else {
                    r1 = r3.A0E;
                    r1.A02(A0A, bArr, r3.A07);
                }
                r1.A05.A05(A0A);
                r3.A08.A02.post(new RunnableEBaseShape6S0100000_I1_1(r3, 21));
            }
            AnonymousClass1Xa r04 = r3.A0L;
            if (r04 != null) {
                r3.A0N.A0E(r04.A01, 200);
                return;
            }
            return;
        }
        throw null;
    }
}
