package X;

import android.content.SharedPreferences;
import com.google.android.search.verification.client.R;
import com.whatsapp.qrcode.DevicePairQrScannerActivity;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.2XR  reason: invalid class name */
public class AnonymousClass2XR implements AbstractC64732yf {
    public AnonymousClass2F8 A00;
    public final AnonymousClass009 A01;
    public final AnonymousClass02M A02;
    public final AnonymousClass2F7 A03;
    public final AnonymousClass2XP A04 = new AnonymousClass2XP(this);
    public final C02420Bx A05;
    public final AnonymousClass0C3 A06;
    public final AnonymousClass00S A07;
    public final AnonymousClass00D A08;
    public final C001000o A09;
    public final C001400w A0A;
    public final C02430Bz A0B;
    public final AnonymousClass09H A0C;
    public final AnonymousClass3MA A0D;
    public final AnonymousClass00T A0E;

    public AnonymousClass2XR(AnonymousClass00S r8, AnonymousClass02M r9, AnonymousClass009 r10, AnonymousClass00T r11, AnonymousClass09H r12, C001400w r13, AnonymousClass3MA r14, C001000o r15, AnonymousClass00D r16, C02430Bz r17, C02420Bx r18, AnonymousClass0C3 r19) {
        this.A07 = r8;
        this.A02 = r9;
        this.A01 = r10;
        this.A0E = r11;
        this.A0C = r12;
        this.A0A = r13;
        this.A0D = r14;
        this.A09 = r15;
        this.A08 = r16;
        this.A0B = r17;
        this.A03 = new AnonymousClass2F7(r8, r11, r13, r15, r16, r17);
        this.A05 = r18;
        this.A06 = r19;
    }

    public final void A00(AnonymousClass2FF r19, long j, boolean z) {
        SharedPreferences sharedPreferences = this.A08.A00;
        int i = sharedPreferences.getInt("adv_raw_id", -1);
        int i2 = sharedPreferences.getInt("adv_current_key_index", -1);
        AnonymousClass2F7 r4 = this.A03;
        if (r4 != null) {
            AbstractC04160Jh A0B2 = C75113cO.A04.AQb();
            A0B2.A02();
            C75113cO r1 = (C75113cO) A0B2.A00;
            r1.A00 |= 1;
            r1.A02 = i;
            A0B2.A02();
            C75113cO r12 = (C75113cO) A0B2.A00;
            r12.A00 |= 4;
            r12.A01 = i2;
            A0B2.A02();
            C75113cO r13 = (C75113cO) A0B2.A00;
            r13.A00 |= 2;
            r13.A03 = j;
            C75113cO r7 = (C75113cO) A0B2.A01();
            try {
                AnonymousClass0QZ r0 = r19.A00;
                if (r0 != null) {
                    byte[] bArr = r0.A00.A01;
                    C001400w r14 = r4.A03;
                    AnonymousClass2F2 r02 = new AnonymousClass2F2(r4);
                    ThreadPoolExecutor threadPoolExecutor = r14.A00;
                    AnonymousClass1UJ r03 = (AnonymousClass1UJ) threadPoolExecutor.submit(r02).get();
                    if (r03 != null) {
                        AnonymousClass1UD r10 = r03.A00;
                        C05770Qa r5 = r03.A01.A00;
                        byte[] A082 = C05360Of.A08(AnonymousClass020.A04, r7.A09(), bArr);
                        AbstractC04160Jh A0B3 = C75153cS.A05.AQb();
                        AnonymousClass071 A083 = r7.A08();
                        A0B3.A02();
                        C75153cS r15 = (C75153cS) A0B3.A00;
                        r15.A00 |= 1;
                        r15.A03 = A083;
                        byte[] bArr2 = r5.A01;
                        AnonymousClass071 A002 = AnonymousClass071.A00(bArr2, 0, bArr2.length);
                        A0B3.A02();
                        C75153cS r16 = (C75153cS) A0B3.A00;
                        r16.A00 |= 2;
                        r16.A01 = A002;
                        byte[] A1t = C001801b.A1t(r10, A082);
                        AnonymousClass071 A003 = AnonymousClass071.A00(A1t, 0, A1t.length);
                        A0B3.A02();
                        C75153cS r17 = (C75153cS) A0B3.A00;
                        r17.A00 |= 4;
                        r17.A02 = A003;
                        C75153cS r9 = (C75153cS) A0B3.A01();
                        byte[] bArr3 = r19.A04;
                        byte[] A092 = r9.A09();
                        try {
                            Mac instance = Mac.getInstance("HmacSHA256");
                            instance.init(new SecretKeySpec(bArr3, "HmacSHA256"));
                            byte[] doFinal = instance.doFinal(A092);
                            AbstractC04160Jh A0B4 = C75173cU.A03.AQb();
                            AnonymousClass071 A084 = r9.A08();
                            A0B4.A02();
                            C75173cU r18 = (C75173cU) A0B4.A00;
                            r18.A00 |= 1;
                            r18.A01 = A084;
                            AnonymousClass071 A004 = AnonymousClass071.A00(doFinal, 0, doFinal.length);
                            A0B4.A02();
                            C75173cU r110 = (C75173cU) A0B4.A00;
                            r110.A00 |= 2;
                            r110.A02 = A004;
                            C75173cU r142 = (C75173cU) A0B4.A01();
                            C02430Bz r111 = r4.A04;
                            if (r111 != null) {
                                HashSet hashSet = new HashSet();
                                hashSet.add(0);
                                Iterator it = new ArrayList(r111.A0D.A01().A00.values()).iterator();
                                while (it.hasNext()) {
                                    hashSet.add(Integer.valueOf(((AnonymousClass1VI) it.next()).A03));
                                }
                                hashSet.add(Integer.valueOf(r7.A01));
                                AbstractC04160Jh A0B5 = C75133cQ.A06.AQb();
                                int i3 = r7.A02;
                                A0B5.A02();
                                C75133cQ r112 = (C75133cQ) A0B5.A00;
                                r112.A00 |= 1;
                                r112.A02 = i3;
                                int i4 = r7.A01;
                                A0B5.A02();
                                C75133cQ r113 = (C75133cQ) A0B5.A00;
                                r113.A00 |= 4;
                                r113.A01 = i4;
                                long j2 = r7.A03;
                                A0B5.A02();
                                C75133cQ r72 = (C75133cQ) A0B5.A00;
                                r72.A00 |= 2;
                                r72.A04 = j2;
                                A0B5.A02();
                                C75133cQ r2 = (C75133cQ) A0B5.A00;
                                AbstractC11330g6 r114 = r2.A05;
                                if (!((AbstractC05040Mx) r114).A00) {
                                    r2.A05 = AnonymousClass078.A03(r114);
                                }
                                AnonymousClass079.A07(hashSet, r2.A05);
                                C75133cQ r132 = (C75133cQ) A0B5.A01();
                                AnonymousClass1UJ r04 = (AnonymousClass1UJ) threadPoolExecutor.submit(new AnonymousClass2F2(r4)).get();
                                if (r04 != null) {
                                    AnonymousClass1UD r42 = r04.A00;
                                    byte[] A085 = C05360Of.A08(AnonymousClass020.A06, r132.A09());
                                    AbstractC04160Jh A0B6 = C75193cW.A03.AQb();
                                    byte[] A1t2 = C001801b.A1t(r42, A085);
                                    AnonymousClass071 A005 = AnonymousClass071.A00(A1t2, 0, A1t2.length);
                                    A0B6.A02();
                                    C75193cW r115 = (C75193cW) A0B6.A00;
                                    r115.A00 |= 2;
                                    r115.A01 = A005;
                                    AnonymousClass071 A086 = r132.A08();
                                    A0B6.A02();
                                    C75193cW r116 = (C75193cW) A0B6.A00;
                                    r116.A00 |= 1;
                                    r116.A02 = A086;
                                    this.A02.A02.post(new RunnableEBaseShape1S0510000_I1(this, r19, r132, r142, (C75193cW) A0B6.A01(), z, 1));
                                    return;
                                }
                                throw null;
                            }
                            throw null;
                        } catch (Exception e) {
                            throw new RuntimeException("Failed to calculate hmac-sha256", e);
                        }
                    } else {
                        throw null;
                    }
                } else {
                    throw null;
                }
            } catch (Exception e2) {
                Log.e("CompanionDeviceQrHandler/handleQrCode", e2);
                if ((e2 instanceof ExecutionException) || (e2 instanceof InterruptedException)) {
                    this.A02.A02.post(new RunnableEBaseShape8S0100000_I1_3(this, 29));
                    return;
                }
                throw new RuntimeException("Failed to generate adv protobufs", e2);
            }
        } else {
            throw null;
        }
    }

    public final void A01(AnonymousClass2FF r18, C75133cQ r19, C75173cU r20, C75193cW r21, boolean z) {
        long j;
        AnonymousClass2XS r9 = new AnonymousClass2XS(this.A07, this.A02, this.A01, this.A0C, this.A04);
        AnonymousClass09H r10 = r9.A07;
        String A022 = r10.A02();
        r9.A00 = r18;
        r9.A01 = r19;
        r9.A02 = z;
        String str = r18.A02;
        byte[] bArr = r18.A03;
        if (r19 != null) {
            j = r19.A04;
        } else {
            j = -1;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new AnonymousClass0M5("ref", (AnonymousClass0OS[]) null, str));
        AnonymousClass008.A1I("pub-key", bArr, arrayList);
        if (!(r20 == null || r21 == null)) {
            arrayList.add(new AnonymousClass0M5("device-identity", null, null, r20.A09()));
            arrayList.add(new AnonymousClass0M5("key-index-list", new AnonymousClass0OS[]{new AnonymousClass0OS("ts", j)}, null, r21.A09()));
        }
        AnonymousClass0M5 r7 = new AnonymousClass0M5("pair-device", new AnonymousClass0OS[0], (AnonymousClass0M5[]) arrayList.toArray(new AnonymousClass0M5[0]), null);
        AnonymousClass008.A1H("app/sendPairDeviceRequest success: ", r10.A0B(219, A022, new AnonymousClass0M5("iq", new AnonymousClass0OS[]{new AnonymousClass0OS("to", AnonymousClass0QU.A00), new AnonymousClass0OS("id", A022, null, (byte) 0), new AnonymousClass0OS("xmlns", "md", null, (byte) 0), new AnonymousClass0OS("type", "set", null, (byte) 0)}, r7), r9, 0));
    }

    @Override // X.AbstractC64732yf
    public AnonymousClass2F8 A63() {
        return this.A00;
    }

    @Override // X.AbstractC64732yf
    public void AAA(String str) {
        AnonymousClass2FF A002 = AnonymousClass2FF.A00(str);
        if (A002 == null) {
            this.A0D.A01();
        } else if (A002.A01 != null) {
            this.A0D.A00();
            A01(A002, null, null, null, false);
        } else if (A002.A00 == null || A002.A04 == null) {
            this.A0D.A01();
        } else {
            AnonymousClass2F7 r7 = this.A03;
            long j = r7.A01.A00.getLong("adv_timestamp_sec", -1);
            long A003 = r7.A00();
            long A022 = r7.A00.A02() / 1000;
            long j2 = j + 1;
            if (j2 <= A003 + 86400) {
                if (Math.abs(A022 - A003) <= 86400) {
                    A003 = A022;
                }
                long max = Math.max(A003, j2);
                if (max != -1) {
                    this.A0D.A00();
                    this.A0E.ANF(new RunnableEBaseShape0S1200100_I1(this, str, max, A002, 1));
                    return;
                }
            }
            DevicePairQrScannerActivity devicePairQrScannerActivity = this.A0D.A00;
            devicePairQrScannerActivity.A03.A0C(devicePairQrScannerActivity.A09.A06(R.string.companion_device_time_incorrect_error), 1);
        }
    }
}
