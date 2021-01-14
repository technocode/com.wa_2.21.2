package X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0Fu  reason: invalid class name and case insensitive filesystem */
public class C03340Fu {
    public static volatile C03340Fu A0L;
    public final AnonymousClass02M A00;
    public final AnonymousClass01I A01;
    public final AnonymousClass04j A02;
    public final AnonymousClass00S A03;
    public final AnonymousClass00G A04;
    public final AnonymousClass01K A05;
    public final C018709t A06;
    public final AnonymousClass09H A07;
    public final C01980Ae A08;
    public final C02050Al A09;
    public final AnonymousClass0GP A0A;
    public final C02060Am A0B;
    public final C02010Ah A0C;
    public final C02020Ai A0D;
    public final C02040Ak A0E;
    public final C01970Ad A0F;
    public final C018809u A0G = C018809u.A00("PaymentsActionManager", "network", "COMMON");
    public final C62062uB A0H;
    public final AnonymousClass0A6 A0I;
    public final C03300Fq A0J;
    public final AnonymousClass03U A0K;

    public C03340Fu(AnonymousClass00G r4, AnonymousClass00S r5, AnonymousClass02M r6, AnonymousClass01I r7, C018709t r8, AnonymousClass09H r9, C01970Ad r10, AnonymousClass01K r11, AnonymousClass03U r12, AnonymousClass0A6 r13, C02010Ah r14, AnonymousClass04j r15, C01980Ae r16, C62062uB r17, C03300Fq r18, C02040Ak r19, C02020Ai r20, C02050Al r21, AnonymousClass0GP r22, C02060Am r23) {
        this.A04 = r4;
        this.A03 = r5;
        this.A00 = r6;
        this.A01 = r7;
        this.A06 = r8;
        this.A07 = r9;
        this.A0F = r10;
        this.A05 = r11;
        this.A0K = r12;
        this.A0I = r13;
        this.A0C = r14;
        this.A02 = r15;
        this.A08 = r16;
        this.A0H = r17;
        this.A0J = r18;
        this.A0E = r19;
        this.A0D = r20;
        this.A09 = r21;
        this.A0A = r22;
        this.A0B = r23;
    }

    public static C03340Fu A00() {
        if (A0L == null) {
            synchronized (C03340Fu.class) {
                if (A0L == null) {
                    AnonymousClass00G r5 = AnonymousClass00G.A01;
                    AnonymousClass00S A002 = AnonymousClass00S.A00();
                    AnonymousClass02M A003 = AnonymousClass02M.A00();
                    AnonymousClass01I A004 = AnonymousClass01I.A00();
                    C018709t A012 = C018709t.A01();
                    AnonymousClass09H A013 = AnonymousClass09H.A01();
                    C01970Ad A005 = C01970Ad.A00();
                    AnonymousClass01K A006 = AnonymousClass01K.A00();
                    AnonymousClass03U A007 = AnonymousClass03U.A00();
                    AnonymousClass0A6 A008 = AnonymousClass0A6.A00();
                    C02010Ah A009 = C02010Ah.A00();
                    AnonymousClass04j A0010 = AnonymousClass04j.A00();
                    C01980Ae A0011 = C01980Ae.A00();
                    if (C62062uB.A02 == null) {
                        synchronized (C02010Ah.class) {
                            if (C62062uB.A02 == null) {
                                C62062uB.A02 = new C62062uB(AnonymousClass022.A00());
                            }
                        }
                    }
                    A0L = new C03340Fu(r5, A002, A003, A004, A012, A013, A005, A006, A007, A008, A009, A0010, A0011, C62062uB.A02, C03300Fq.A00(), C02040Ak.A00(), C02020Ai.A00(), C02050Al.A04, AnonymousClass0GP.A00(), C02060Am.A00());
                }
            }
        }
        return A0L;
    }

    public void A01(int i, AnonymousClass0GT r16) {
        SharedPreferences sharedPreferences;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new AnonymousClass0OS("version", i));
        arrayList.add(new AnonymousClass0OS("action", "get-methods"));
        C62082uD r13 = new C62082uD(new C62072uC((AnonymousClass0OS[]) arrayList.toArray(new AnonymousClass0OS[0])));
        C62062uB r3 = this.A0H;
        synchronized (r3) {
            sharedPreferences = r3.A00;
            if (sharedPreferences == null) {
                sharedPreferences = r3.A01.A01("com.whatsapp_payment_sync_preferences");
                r3.A00 = sharedPreferences;
            }
        }
        String string = sharedPreferences.getString(r13.A01.A00(), null);
        if (string != null) {
            AnonymousClass008.A1D("instance-id", string, arrayList);
        }
        AnonymousClass0M5 r1 = new AnonymousClass0M5("account", (AnonymousClass0OS[]) arrayList.toArray(new AnonymousClass0OS[0]));
        AbstractC61782tj A6O = this.A0F.A03().A6O();
        if (A6O != null) {
            A6O.AQ7();
        }
        A09(false, r1, new AnonymousClass3XO(this, this.A04.A00, this.A00, this.A02, this.A0A, r16, string, r13), 0);
    }

    public void A02(AbstractC48012Ko r16, AnonymousClass0M5 r17, boolean z) {
        C02010Ah r5;
        ArrayList A052 = this.A0J.A05(r17.A0D("account"));
        if (A052 == null || A052.isEmpty()) {
            AnonymousClass1V4 A012 = this.A0F.A01();
            AnonymousClass00T r11 = A012.A03;
            r11.ANC(new C10690f2(A012, r11, A012.A01, A012.A02, r16), new Void[0]);
        } else if (C018709t.A04(A052)) {
            AnonymousClass1V4 A013 = this.A0F.A01();
            AnonymousClass00T r4 = A013.A03;
            r4.ANC(new C10670f0(r4, A013.A01, A013.A02, A052, r16), new Void[0]);
        } else if (z) {
            A01(2, null);
            return;
        } else {
            return;
        }
        if (A052 != null && A052.size() > 0) {
            Iterator it = A052.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AnonymousClass1VM r3 = (AnonymousClass1VM) it.next();
                if ((r3 instanceof C43761yu) && r3.A01 == 2) {
                    r5 = this.A0C;
                    r5.A01().edit().putBoolean("payments_card_can_receive_payment", true).apply();
                    break;
                }
            }
        }
        r5 = this.A0C;
        r5.A01().edit().putBoolean("payments_card_can_receive_payment", false).apply();
        long A053 = r5.A01.A05();
        r5.A01().edit().putLong("payments_methods_last_sync_time", A053).apply();
        r5.A02.A07(null, AnonymousClass008.A0I("updateMethodsLastSyncTimeMilli to: ", A053), null);
    }

    public void A03(AbstractC007503q r5) {
        if (!this.A0E.A02()) {
            C018809u r2 = this.A0G;
            StringBuilder A0S = AnonymousClass008.A0S("decline/cancelPaymentRequest is not enabled for country: ");
            A0S.append(this.A0D.A02());
            r2.A07(null, A0S.toString(), null);
        } else if (r5.A0n.A00 == null) {
            this.A0G.A07(null, "requestPayment found null or empty args jid", null);
        } else {
            this.A0G.A07(null, "userActionHandlePaymentRequest", null);
            this.A05.A0d(r5);
        }
    }

    public void A04(AbstractC007503q r20, UserJid userJid, C05900Qy r22) {
        if (!this.A0E.A02()) {
            C018809u r2 = this.A0G;
            StringBuilder A0S = AnonymousClass008.A0S("requestPayment is not enabled for country: ");
            A0S.append(this.A0D.A02());
            r2.A07(null, A0S.toString(), null);
            return;
        }
        AnonymousClass02N r4 = r20.A0n.A00;
        if (r4 == null || ((AnonymousClass1VY.A0Y(r4) && userJid == null) || r22 == null)) {
            C018809u r23 = this.A0G;
            StringBuilder A0S2 = AnonymousClass008.A0S("requestPayment found null or empty args jid: ");
            A0S2.append(r4);
            A0S2.append(" receiver: ");
            A0S2.append(userJid);
            r23.A07(null, A0S2.toString(), null);
            return;
        }
        C02020Ai r6 = this.A0D;
        AbstractC05890Qx r5 = r6.A02().A09;
        C05870Qv A022 = r6.A02();
        C01970Ad r0 = this.A0F;
        AbstractC07650Yy A8I = r0.A02(A022.A02).A8I(r5.A5e());
        AnonymousClass01I r1 = this.A01;
        r1.A04();
        AnonymousClass0HR r12 = r1.A01;
        if (r12 != null) {
            String A5e = r6.A01().A5e();
            AnonymousClass0A6 r13 = this.A0I;
            String str = AnonymousClass0FI.A07(r13.A01, r13.A00, userJid, true).A01;
            String str2 = r6.A02().A02;
            AnonymousClass0MH A023 = AnonymousClass0MH.A02(10, 11, userJid, (UserJid) r12.A09, A5e, r22, -1, str, str2, AnonymousClass0MH.A01(str2), A8I.A92());
            C018809u r9 = this.A0G;
            r9.A07(null, "userActionRequestPayment", null);
            long A052 = this.A03.A05();
            r20.A0E = A052;
            r20.A0b = "UNSET";
            r20.A0F = A023;
            A023.A04 = A052;
            A023.A01 = 12;
            AbstractC43791yx r7 = A023.A07;
            if (r7 == null) {
                r7 = r0.A03().AAd();
            }
            AnonymousClass0MH r62 = r20.A0F;
            r62.A0G = A023.A0G;
            r62.A0B(r7, r0.A03().A83().A8H() + r20.A0E);
            r9.A07(null, "userActionHandlePaymentRequest", null);
            this.A05.A0d(r20);
            return;
        }
        throw null;
    }

    public void A05(AnonymousClass0M5 r8, AnonymousClass0GT r9) {
        A09(true, r8, new AnonymousClass3XQ(this, this.A04.A00, this.A00, this.A02, this.A0A, r9), 30000);
    }

    public void A06(AnonymousClass0M5 r8, AnonymousClass0GT r9) {
        A09(true, r8, new AnonymousClass3XP(this, this.A04.A00, this.A00, this.A02, this.A0A, r9), 30000);
    }

    public void A07(C05490Ot r27, C05900Qy r28, AbstractC05890Qx r29, AnonymousClass1VM r30, AbstractC43791yx r31, String str, String str2, boolean z) {
        boolean A0Y;
        AnonymousClass2bX r8;
        AnonymousClass1VM r14;
        String str3;
        AnonymousClass1VM r5 = r30;
        AnonymousClass01I r0 = this.A01;
        r0.A04();
        AnonymousClass0HR r11 = r0.A01;
        if (r11 != null) {
            C61152sa r4 = new C61152sa();
            if (!this.A0E.A02()) {
                C018809u r52 = this.A0G;
                StringBuilder A0S = AnonymousClass008.A0S("sendPayment is not enabled for country: ");
                A0S.append(this.A0D.A02());
                r52.A07(null, A0S.toString(), null);
                r4.A00 = 1;
                return;
            }
            C007303n r02 = r27.A0n;
            AnonymousClass02N r10 = r02.A00;
            if (r10 == null || ((A0Y = AnonymousClass1VY.A0Y(r10)) && r27.A0G == null)) {
                C018809u r3 = this.A0G;
                StringBuilder A0S2 = AnonymousClass008.A0S("sendPayment found null or empty args jid: ");
                A0S2.append(r10);
                A0S2.append(" receiver: ");
                A0S2.append(r27.A0G);
                A0S2.append(" payment methods: ");
                r3.A07(null, A0S2.toString(), null);
                r4.A00 = 2;
            } else if (!r28.A01()) {
                this.A0G.A07(null, "sendPayment not sending payment; got invalid amount", null);
                r4.A00 = 8;
            } else {
                C02020Ai r03 = this.A0D;
                AbstractC07650Yy A8I = this.A0F.A02(r03.A02().A02).A8I(r29.A5e());
                int A5h = A8I.A5h(r29.A5e());
                BigDecimal bigDecimal = r28.A00;
                long doubleValue = (long) ((int) (bigDecimal.doubleValue() * ((double) A5h)));
                if (A5h <= 0) {
                    r8 = new AnonymousClass2bX(doubleValue, 1, r29);
                } else {
                    r8 = new AnonymousClass2bX(doubleValue, A5h, r29);
                }
                r31.A00 = r8;
                try {
                    C018809u r04 = this.A0G;
                    r04.A07(null, "sendPayment building payment to send amount", null);
                    UserJid userJid = (UserJid) r11.A09;
                    if (A0Y) {
                        r10 = r27.A0G;
                    }
                    UserJid of = UserJid.of(r10);
                    String A5e = r29.A5e();
                    String str4 = r03.A02().A02;
                    int A92 = A8I.A92();
                    int i = 1;
                    if (z) {
                        i = 100;
                    }
                    AnonymousClass0MH A022 = AnonymousClass0MH.A02(i, 401, userJid, of, A5e, r28, -1, null, str4, AnonymousClass0MH.A01(str4), A92);
                    C018709t r1 = this.A06;
                    List A0A2 = r1.A0A();
                    if (((ArrayList) A0A2).size() <= 0) {
                        StringBuilder sb = new StringBuilder("sendPayment not sending payment; got no methods: ");
                        sb.append(A0A2);
                        r04.A07(null, sb.toString(), null);
                        r4.A00 = 7;
                    } else {
                        Iterator it = ((ArrayList) r1.A0A()).iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                r14 = null;
                                break;
                            }
                            r14 = (AnonymousClass1VM) it.next();
                            if (r14.A01 == 1) {
                                break;
                            }
                        }
                        if (r14 == null || TextUtils.isEmpty(r14.A07)) {
                            if (r03.A02().A05) {
                                if (!(r30 == null && (r5 = r1.A06()) == null) && !TextUtils.isEmpty(r5.A07)) {
                                    if (C002001d.A3h(r03.A02().A06, r5.A04())) {
                                        ArrayList arrayList = new ArrayList(1);
                                        arrayList.add(new AnonymousClass2LW(r5, r28, 1));
                                        r4.A00 = 0;
                                        r4.A01 = arrayList;
                                        StringBuilder sb2 = new StringBuilder("PAY PaymentsActionManager:findSourcesForTransfer found no primary but found secondary: ");
                                        sb2.append(arrayList);
                                        sb2.append(" for amount");
                                        Log.i(sb2.toString());
                                    }
                                }
                                r04.A07(null, "sendPayment not sending payment; got invalid secondary methods and no primary methods", null);
                                r4.A00 = 9;
                            } else {
                                StringBuilder sb3 = new StringBuilder("sendPayment not sending payment; got null primary methods or empty credential id: ");
                                sb3.append(r14);
                                r04.A07(null, sb3.toString(), null);
                                r4.A00 = 4;
                            }
                        } else if (r14.A04() != r03.A02().A00) {
                            StringBuilder A0S3 = AnonymousClass008.A0S("sendPayment not sending payment; primary methods type ");
                            A0S3.append(r14.A04());
                            A0S3.append(" does not match primary account type for country: ");
                            AnonymousClass008.A1N(A0S3, r03.A02().A00, r04);
                            r4.A00 = 3;
                        } else {
                            int A042 = r14.A04();
                            if (A042 != 3) {
                                StringBuilder sb4 = new StringBuilder("sendPayment not sending payment; primary method type unsupported: ");
                                sb4.append(A042);
                                r04.A07(null, sb4.toString(), null);
                                r4.A00 = 6;
                            } else {
                                C43801yy r142 = (C43801yy) r14;
                                C05900Qy r13 = r142.A01;
                                if (r13 == null || !r13.A01()) {
                                    StringBuilder sb5 = new StringBuilder("sendPayment not sending payment; got invalid balance: ");
                                    sb5.append(r13);
                                    r04.A07(null, sb5.toString(), null);
                                    r4.A00 = 5;
                                } else {
                                    ArrayList arrayList2 = new ArrayList(2);
                                    BigDecimal bigDecimal2 = r13.A00;
                                    if (bigDecimal2.compareTo(bigDecimal) >= 0) {
                                        arrayList2.add(new AnonymousClass2LW(r142, r28, 1));
                                    } else {
                                        BigDecimal bigDecimal3 = BigDecimal.ZERO;
                                        if (bigDecimal2.compareTo(bigDecimal3) > 0) {
                                            arrayList2.add(new AnonymousClass2LW(r142, r13, 1));
                                        }
                                        BigDecimal subtract = bigDecimal.subtract(bigDecimal2);
                                        if (subtract.compareTo(bigDecimal3) > 0) {
                                            if (!(r30 == null && (r5 = r1.A06()) == null) && !TextUtils.isEmpty(r5.A07)) {
                                                if (C002001d.A3h(r03.A02().A06, r5.A04())) {
                                                    arrayList2.add(new AnonymousClass2LW(r5, new C05900Qy(subtract, bigDecimal.scale()), 1));
                                                }
                                            }
                                            StringBuilder sb6 = new StringBuilder("sendPayment not sending payment; got invalid secondary methods with insufficient balance: ");
                                            sb6.append(r13);
                                            r04.A07(null, sb6.toString(), null);
                                            r4.A00 = 9;
                                        }
                                    }
                                    if (arrayList2.size() <= 0) {
                                        r04.A07(null, "sendPayment found 0 sources", null);
                                        r4.A00 = 11;
                                    } else {
                                        r4.A00 = 0;
                                        r4.A01 = arrayList2;
                                        StringBuilder sb7 = new StringBuilder("findSourcesForTransfer returning sources: ");
                                        sb7.append(arrayList2);
                                        sb7.append(" for amount");
                                        r04.A07(null, sb7.toString(), null);
                                    }
                                }
                            }
                        }
                    }
                    A022.A0I = str;
                    A022.A0G = str2;
                    if (r4.A00 == 0) {
                        A022.A0E(r4.A01);
                        A022.A07 = r31;
                        if (A022.A0J.size() == 1) {
                            r27.A0Y(null);
                            A022.A0D = ((AnonymousClass2LW) A022.A0J.get(0)).A01.A07;
                            r04.A07(null, "userActionSendPayment", null);
                            long A052 = this.A03.A05();
                            r27.A0E = A052;
                            r27.A0F = A022;
                            A022.A04 = A052;
                            if (AnonymousClass0MH.A07(A022.A0G)) {
                                str3 = A022.A0G;
                            } else {
                                str3 = "UNSET";
                            }
                            r27.A0b = str3;
                            this.A05.A0d(r27);
                            C02050Al r2 = this.A09;
                            String str5 = r02.A01;
                            synchronized (r2) {
                                r2.A03.put(str5, A022);
                            }
                            r4.A00 = 0;
                            return;
                        }
                        r04.A07(null, "PaymentsActionManager sendPayment could not send. no correct sources found.", null);
                        r4.A00 = 7;
                    }
                } catch (Exception e) {
                    this.A0G.A08("sendPayment blew up creating transaction info: ", e);
                    r4.A00 = 10;
                }
            }
        } else {
            throw null;
        }
    }

    public void A08(String str, AnonymousClass0GT r7) {
        byte[] A0x = AnonymousClass0FI.A0x(this.A03, this.A01, false);
        if (A0x != null) {
            A05(new AnonymousClass0M5("account", new AnonymousClass0OS[]{new AnonymousClass0OS("action", "remove-credential"), new AnonymousClass0OS("credential-id", str), new AnonymousClass0OS("version", "2"), new AnonymousClass0OS("nonce", C007603r.A03(A0x))}), r7);
            return;
        }
        throw null;
    }

    public void A09(boolean z, AnonymousClass0M5 r9, AnonymousClass09O r10, long j) {
        A0A(z, "w:pay", r9, r10, j);
    }

    public void A0A(boolean z, String str, AnonymousClass0M5 r14, AnonymousClass09O r15, long j) {
        String str2;
        AnonymousClass09H r4 = this.A07;
        String A022 = r4.A02();
        AnonymousClass0OS[] r3 = new AnonymousClass0OS[4];
        r3[0] = new AnonymousClass0OS("to", AnonymousClass0QU.A00);
        if (z) {
            str2 = "set";
        } else {
            str2 = "get";
        }
        r3[1] = new AnonymousClass0OS("type", str2);
        r3[2] = new AnonymousClass0OS("id", A022);
        r3[3] = new AnonymousClass0OS("xmlns", str);
        r4.A06(204, A022, new AnonymousClass0M5("iq", r3, r14), r15, j);
    }
}
