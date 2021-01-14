package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.1iS  reason: invalid class name and case insensitive filesystem */
public final class C34421iS implements AnonymousClass15B, AnonymousClass15U {
    public static final Map A09;
    public static final long[] A0A = {169000, 129000, 114000, 102000, 87000};
    public static final long[] A0B = {2100000, 1300000, 950000, 700000, 400000};
    public static final long[] A0C = {6900000, 4300000, 2700000, 1600000, 450000};
    public static final long[] A0D = {5700000, 3400000, 1900000, SearchActionVerificationClientService.MS_TO_NS, 400000};
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public final AnonymousClass15Y A06;
    public final C233215h A07 = new C233215h();
    public final C234215t A08 = new C234215t();

    @Override // X.AnonymousClass15B
    public AnonymousClass15U A9T() {
        return this;
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("AD", new int[]{1, 0, 0, 0});
        hashMap.put("AE", new int[]{1, 3, 4, 4});
        hashMap.put("AF", new int[]{4, 4, 3, 2});
        hashMap.put("AG", new int[]{3, 2, 1, 2});
        hashMap.put("AI", new int[]{1, 0, 0, 2});
        hashMap.put("AL", new int[]{1, 1, 1, 1});
        hashMap.put("AM", new int[]{2, 2, 4, 3});
        hashMap.put("AO", new int[]{2, 4, 2, 0});
        hashMap.put("AR", new int[]{2, 3, 2, 3});
        hashMap.put("AS", new int[]{3, 4, 4, 1});
        hashMap.put("AT", new int[]{0, 1, 0, 0});
        hashMap.put("AU", new int[]{0, 3, 0, 0});
        hashMap.put("AW", new int[]{1, 1, 0, 4});
        hashMap.put("AX", new int[]{0, 1, 0, 0});
        hashMap.put("AZ", new int[]{3, 3, 2, 2});
        hashMap.put("BA", new int[]{1, 1, 1, 2});
        hashMap.put("BB", new int[]{0, 1, 0, 0});
        hashMap.put("BD", new int[]{2, 1, 3, 2});
        hashMap.put("BE", new int[]{0, 0, 0, 0});
        hashMap.put("BF", new int[]{4, 4, 4, 1});
        hashMap.put("BG", new int[]{0, 0, 0, 1});
        hashMap.put("BH", new int[]{2, 1, 3, 4});
        hashMap.put("BI", new int[]{4, 3, 4, 4});
        hashMap.put("BJ", new int[]{4, 3, 4, 3});
        hashMap.put("BL", new int[]{1, 0, 1, 2});
        hashMap.put("BM", new int[]{1, 0, 0, 0});
        hashMap.put("BN", new int[]{4, 3, 3, 3});
        hashMap.put("BO", new int[]{2, 2, 1, 2});
        hashMap.put("BQ", new int[]{1, 1, 2, 4});
        hashMap.put("BR", new int[]{2, 3, 2, 2});
        hashMap.put("BS", new int[]{1, 1, 0, 2});
        hashMap.put("BT", new int[]{3, 0, 2, 1});
        hashMap.put("BW", new int[]{4, 4, 2, 3});
        hashMap.put("BY", new int[]{1, 1, 1, 1});
        hashMap.put("BZ", new int[]{2, 3, 3, 1});
        hashMap.put("CA", new int[]{0, 2, 2, 3});
        hashMap.put("CD", new int[]{4, 4, 2, 1});
        hashMap.put("CF", new int[]{4, 4, 3, 3});
        hashMap.put("CG", new int[]{4, 4, 4, 4});
        hashMap.put("CH", new int[]{0, 0, 0, 0});
        hashMap.put("CI", new int[]{4, 4, 4, 4});
        hashMap.put("CK", new int[]{2, 4, 2, 0});
        hashMap.put("CL", new int[]{2, 2, 2, 3});
        hashMap.put("CM", new int[]{3, 4, 3, 1});
        hashMap.put("CN", new int[]{2, 0, 1, 2});
        hashMap.put("CO", new int[]{2, 3, 2, 1});
        hashMap.put("CR", new int[]{2, 2, 4, 4});
        hashMap.put("CU", new int[]{4, 4, 4, 1});
        hashMap.put("CV", new int[]{2, 2, 2, 4});
        hashMap.put("CW", new int[]{1, 1, 0, 0});
        hashMap.put("CX", new int[]{1, 2, 2, 2});
        hashMap.put("CY", new int[]{1, 1, 0, 0});
        hashMap.put("CZ", new int[]{0, 1, 0, 0});
        hashMap.put("DE", new int[]{0, 2, 2, 2});
        hashMap.put("DJ", new int[]{3, 4, 4, 0});
        hashMap.put("DK", new int[]{0, 0, 0, 0});
        hashMap.put("DM", new int[]{2, 0, 3, 4});
        hashMap.put("DO", new int[]{3, 3, 4, 4});
        hashMap.put("DZ", new int[]{3, 3, 4, 4});
        hashMap.put("EC", new int[]{2, 3, 3, 1});
        hashMap.put("EE", new int[]{0, 0, 0, 0});
        hashMap.put("EG", new int[]{3, 3, 1, 1});
        hashMap.put("EH", new int[]{2, 0, 2, 3});
        hashMap.put("ER", new int[]{4, 2, 2, 2});
        hashMap.put("ES", new int[]{0, 0, 1, 1});
        hashMap.put("ET", new int[]{4, 4, 4, 0});
        hashMap.put("FI", new int[]{0, 0, 1, 0});
        hashMap.put("FJ", new int[]{3, 2, 3, 3});
        hashMap.put("FK", new int[]{3, 4, 2, 1});
        hashMap.put("FM", new int[]{4, 2, 4, 0});
        hashMap.put("FO", new int[]{0, 0, 0, 1});
        hashMap.put("FR", new int[]{1, 0, 2, 1});
        hashMap.put("GA", new int[]{3, 3, 2, 1});
        hashMap.put("GB", new int[]{0, 1, 3, 2});
        hashMap.put("GD", new int[]{2, 0, 3, 0});
        hashMap.put("GE", new int[]{1, 1, 0, 3});
        hashMap.put("GF", new int[]{1, 2, 4, 4});
        hashMap.put("GG", new int[]{0, 1, 0, 0});
        hashMap.put("GH", new int[]{3, 2, 2, 2});
        hashMap.put("GI", new int[]{0, 0, 0, 1});
        hashMap.put("GL", new int[]{2, 4, 1, 4});
        hashMap.put("GM", new int[]{4, 3, 3, 0});
        hashMap.put("GN", new int[]{4, 4, 3, 4});
        hashMap.put("GP", new int[]{2, 2, 1, 3});
        hashMap.put("GQ", new int[]{4, 4, 3, 1});
        hashMap.put("GR", new int[]{1, 1, 0, 1});
        hashMap.put("GT", new int[]{3, 2, 3, 4});
        hashMap.put("GU", new int[]{1, 0, 4, 4});
        hashMap.put("GW", new int[]{4, 4, 4, 0});
        hashMap.put("GY", new int[]{3, 4, 1, 0});
        hashMap.put("HK", new int[]{0, 2, 3, 4});
        hashMap.put("HN", new int[]{3, 3, 2, 2});
        hashMap.put("HR", new int[]{1, 0, 0, 2});
        hashMap.put("HT", new int[]{3, 3, 3, 3});
        hashMap.put("HU", new int[]{0, 0, 1, 0});
        hashMap.put("ID", new int[]{2, 3, 3, 4});
        hashMap.put("IE", new int[]{0, 0, 1, 1});
        hashMap.put("IL", new int[]{0, 1, 1, 3});
        hashMap.put("IM", new int[]{0, 1, 0, 1});
        hashMap.put("IN", new int[]{2, 3, 3, 4});
        hashMap.put("IO", new int[]{4, 2, 2, 2});
        hashMap.put("IQ", new int[]{3, 3, 4, 3});
        hashMap.put("IR", new int[]{3, 2, 4, 4});
        hashMap.put("IS", new int[]{0, 0, 0, 0});
        hashMap.put("IT", new int[]{1, 0, 1, 3});
        hashMap.put("JE", new int[]{0, 0, 0, 1});
        hashMap.put("JM", new int[]{3, 3, 3, 2});
        hashMap.put("JO", new int[]{1, 1, 1, 2});
        hashMap.put("JP", new int[]{0, 1, 1, 2});
        hashMap.put("KE", new int[]{3, 3, 3, 3});
        hashMap.put("KG", new int[]{2, 2, 3, 3});
        hashMap.put("KH", new int[]{1, 0, 4, 4});
        hashMap.put("KI", new int[]{4, 4, 4, 4});
        hashMap.put("KM", new int[]{4, 4, 2, 2});
        hashMap.put("KN", new int[]{1, 0, 1, 3});
        hashMap.put("KP", new int[]{1, 2, 2, 2});
        hashMap.put("KR", new int[]{0, 4, 0, 2});
        hashMap.put("KW", new int[]{1, 2, 1, 2});
        hashMap.put("KY", new int[]{1, 1, 0, 2});
        hashMap.put("KZ", new int[]{1, 2, 2, 3});
        hashMap.put("LA", new int[]{3, 2, 2, 2});
        hashMap.put("LB", new int[]{3, 2, 0, 0});
        hashMap.put("LC", new int[]{2, 2, 1, 0});
        hashMap.put("LI", new int[]{0, 0, 1, 2});
        hashMap.put("LK", new int[]{1, 1, 2, 2});
        hashMap.put("LR", new int[]{3, 4, 3, 1});
        hashMap.put("LS", new int[]{3, 3, 2, 0});
        hashMap.put("LT", new int[]{0, 0, 0, 1});
        hashMap.put("LU", new int[]{0, 0, 1, 0});
        hashMap.put("LV", new int[]{0, 0, 0, 0});
        hashMap.put("LY", new int[]{4, 4, 4, 4});
        hashMap.put("MA", new int[]{2, 1, 2, 2});
        hashMap.put("MC", new int[]{1, 0, 1, 0});
        hashMap.put("MD", new int[]{1, 1, 0, 0});
        hashMap.put("ME", new int[]{1, 2, 2, 3});
        hashMap.put("MF", new int[]{1, 4, 3, 3});
        hashMap.put("MG", new int[]{3, 4, 1, 2});
        hashMap.put("MH", new int[]{4, 0, 2, 3});
        hashMap.put("MK", new int[]{1, 0, 0, 1});
        hashMap.put("ML", new int[]{4, 4, 4, 4});
        hashMap.put("MM", new int[]{2, 3, 1, 2});
        hashMap.put("MN", new int[]{2, 2, 2, 4});
        hashMap.put("MO", new int[]{0, 1, 4, 4});
        hashMap.put("MP", new int[]{0, 0, 4, 4});
        hashMap.put("MQ", new int[]{1, 1, 1, 3});
        hashMap.put("MR", new int[]{4, 2, 4, 2});
        hashMap.put("MS", new int[]{1, 2, 1, 2});
        hashMap.put("MT", new int[]{0, 0, 0, 0});
        hashMap.put("MU", new int[]{2, 2, 4, 4});
        hashMap.put("MV", new int[]{4, 2, 0, 1});
        hashMap.put("MW", new int[]{3, 2, 1, 1});
        hashMap.put("MX", new int[]{2, 4, 3, 1});
        hashMap.put("MY", new int[]{2, 3, 3, 3});
        hashMap.put("MZ", new int[]{3, 3, 2, 4});
        hashMap.put("NA", new int[]{4, 2, 1, 1});
        hashMap.put("NC", new int[]{2, 1, 3, 3});
        hashMap.put("NE", new int[]{4, 4, 4, 4});
        hashMap.put("NF", new int[]{0, 2, 2, 2});
        hashMap.put("NG", new int[]{3, 4, 2, 2});
        hashMap.put("NI", new int[]{3, 4, 3, 3});
        hashMap.put("NL", new int[]{0, 1, 3, 2});
        hashMap.put("NO", new int[]{0, 0, 1, 0});
        hashMap.put("NP", new int[]{2, 3, 2, 2});
        hashMap.put("NR", new int[]{4, 3, 4, 1});
        hashMap.put("NU", new int[]{4, 2, 2, 2});
        hashMap.put("NZ", new int[]{0, 0, 0, 1});
        hashMap.put("OM", new int[]{2, 2, 1, 3});
        hashMap.put("PA", new int[]{1, 3, 2, 3});
        hashMap.put("PE", new int[]{2, 2, 4, 4});
        hashMap.put("PF", new int[]{2, 2, 0, 1});
        hashMap.put("PG", new int[]{4, 4, 4, 4});
        hashMap.put("PH", new int[]{3, 0, 4, 4});
        hashMap.put("PK", new int[]{3, 3, 3, 3});
        hashMap.put("PL", new int[]{1, 0, 1, 3});
        hashMap.put("PM", new int[]{0, 2, 2, 3});
        hashMap.put("PR", new int[]{2, 3, 4, 3});
        hashMap.put("PS", new int[]{2, 3, 0, 4});
        hashMap.put("PT", new int[]{1, 1, 1, 1});
        hashMap.put("PW", new int[]{3, 2, 3, 0});
        hashMap.put("PY", new int[]{2, 1, 3, 3});
        hashMap.put("QA", new int[]{2, 3, 1, 2});
        hashMap.put("RE", new int[]{1, 1, 2, 2});
        hashMap.put("RO", new int[]{0, 1, 1, 3});
        hashMap.put("RS", new int[]{1, 1, 0, 0});
        hashMap.put("RU", new int[]{0, 1, 1, 1});
        hashMap.put("RW", new int[]{3, 4, 3, 1});
        hashMap.put("SA", new int[]{3, 2, 2, 3});
        hashMap.put("SB", new int[]{4, 4, 3, 0});
        hashMap.put("SC", new int[]{4, 2, 0, 1});
        hashMap.put("SD", new int[]{3, 4, 4, 4});
        hashMap.put("SE", new int[]{0, 0, 0, 0});
        hashMap.put("SG", new int[]{1, 2, 3, 3});
        hashMap.put("SH", new int[]{4, 2, 2, 2});
        hashMap.put("SI", new int[]{0, 1, 0, 0});
        hashMap.put("SJ", new int[]{3, 2, 0, 2});
        hashMap.put("SK", new int[]{0, 1, 0, 1});
        hashMap.put("SL", new int[]{4, 3, 2, 4});
        hashMap.put("SM", new int[]{1, 0, 1, 1});
        hashMap.put("SN", new int[]{4, 4, 4, 2});
        hashMap.put("SO", new int[]{4, 4, 4, 3});
        hashMap.put("SR", new int[]{3, 2, 2, 3});
        hashMap.put("SS", new int[]{4, 3, 4, 2});
        hashMap.put("ST", new int[]{3, 2, 2, 2});
        hashMap.put("SV", new int[]{2, 3, 2, 3});
        hashMap.put("SX", new int[]{2, 4, 2, 0});
        hashMap.put("SY", new int[]{4, 4, 2, 0});
        hashMap.put("SZ", new int[]{3, 4, 1, 1});
        hashMap.put("TC", new int[]{2, 1, 2, 1});
        hashMap.put("TD", new int[]{4, 4, 4, 3});
        hashMap.put("TG", new int[]{3, 2, 2, 0});
        hashMap.put("TH", new int[]{1, 3, 4, 4});
        hashMap.put("TJ", new int[]{4, 4, 4, 4});
        hashMap.put("TL", new int[]{4, 2, 4, 4});
        hashMap.put("TM", new int[]{4, 1, 3, 3});
        hashMap.put("TN", new int[]{2, 2, 1, 2});
        hashMap.put("TO", new int[]{2, 3, 3, 1});
        hashMap.put("TR", new int[]{1, 2, 0, 2});
        hashMap.put("TT", new int[]{2, 1, 1, 0});
        hashMap.put("TV", new int[]{4, 2, 2, 4});
        hashMap.put("TW", new int[]{0, 0, 0, 1});
        hashMap.put("TZ", new int[]{3, 3, 3, 2});
        hashMap.put("UA", new int[]{0, 2, 1, 3});
        hashMap.put("UG", new int[]{4, 3, 2, 2});
        hashMap.put("US", new int[]{0, 1, 3, 3});
        hashMap.put("UY", new int[]{2, 1, 2, 2});
        hashMap.put("UZ", new int[]{4, 3, 2, 4});
        hashMap.put("VA", new int[]{1, 2, 2, 2});
        hashMap.put("VC", new int[]{2, 0, 3, 2});
        hashMap.put("VE", new int[]{3, 4, 4, 3});
        hashMap.put("VG", new int[]{3, 1, 3, 4});
        hashMap.put("VI", new int[]{1, 0, 2, 4});
        hashMap.put("VN", new int[]{0, 2, 4, 4});
        hashMap.put("VU", new int[]{4, 1, 3, 2});
        hashMap.put("WS", new int[]{3, 2, 3, 0});
        hashMap.put("XK", new int[]{1, 2, 1, 0});
        hashMap.put("YE", new int[]{4, 4, 4, 2});
        hashMap.put("YT", new int[]{3, 1, 1, 2});
        hashMap.put("ZA", new int[]{2, 3, 1, 2});
        hashMap.put("ZM", new int[]{3, 3, 3, 1});
        hashMap.put("ZW", new int[]{3, 3, 2, 1});
        A09 = Collections.unmodifiableMap(hashMap);
    }

    public C34421iS(long j, AnonymousClass15Y r4) {
        this.A06 = r4;
        this.A01 = j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0005, code lost:
        if (r4 == null) goto L_0x0007;
     */
    @Override // X.AnonymousClass15B
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1m(android.os.Handler r3, X.AnonymousClass15A r4) {
        /*
            r2 = this;
            X.15h r1 = r2.A07
            if (r3 == 0) goto L_0x0007
            r0 = 1
            if (r4 != 0) goto L_0x0008
        L_0x0007:
            r0 = 0
        L_0x0008:
            X.C002001d.A39(r0)
            r1.A00(r4)
            java.util.concurrent.CopyOnWriteArrayList r1 = r1.A00
            X.15g r0 = new X.15g
            r0.<init>(r3, r4)
            r1.add(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C34421iS.A1m(android.os.Handler, X.15A):void");
    }

    @Override // X.AnonymousClass15U
    public synchronized void ADd(AnonymousClass15E r5, AnonymousClass15G r6, boolean z, int i) {
        if (z) {
            this.A02 += (long) i;
        }
    }

    @Override // X.AnonymousClass15U
    public synchronized void ALD(AnonymousClass15E r18, AnonymousClass15G r19, boolean z) {
        C234115s r10;
        float f;
        if (z) {
            boolean z2 = false;
            if (this.A00 > 0) {
                z2 = true;
            }
            C002001d.A3A(z2);
            long A3z = this.A06.A3z();
            int i = (int) (A3z - this.A03);
            long j = (long) i;
            this.A05 += j;
            long j2 = this.A04;
            long j3 = this.A02;
            this.A04 = j2 + j3;
            if (i > 0) {
                float f2 = (float) ((j3 * 8000) / j);
                C234215t r7 = this.A08;
                int sqrt = (int) Math.sqrt((double) j3);
                if (r7.A00 != 1) {
                    Collections.sort(r7.A05, C234215t.A07);
                    r7.A00 = 1;
                }
                int i2 = r7.A02;
                if (i2 > 0) {
                    C234115s[] r0 = r7.A06;
                    i2--;
                    r7.A02 = i2;
                    r10 = r0[i2];
                } else {
                    r10 = new C234115s(null);
                }
                int i3 = r7.A01;
                r7.A01 = i3 + 1;
                r10.A01 = i3;
                r10.A02 = sqrt;
                r10.A00 = f2;
                ArrayList arrayList = r7.A05;
                arrayList.add(r10);
                int i4 = r7.A03 + sqrt;
                r7.A03 = i4;
                while (true) {
                    int i5 = r7.A04;
                    if (i4 <= i5) {
                        break;
                    }
                    int i6 = i4 - i5;
                    C234115s r4 = (C234115s) arrayList.get(0);
                    int i7 = r4.A02;
                    if (i7 <= i6) {
                        i4 -= i7;
                        r7.A03 = i4;
                        arrayList.remove(0);
                        if (i2 < 5) {
                            C234115s[] r02 = r7.A06;
                            i2++;
                            r7.A02 = i2;
                            r02[i2] = r4;
                        }
                    } else {
                        r4.A02 = i7 - i6;
                        i4 -= i6;
                        r7.A03 = i4;
                    }
                }
                if (this.A05 >= 2000 || this.A04 >= 524288) {
                    int i8 = 0;
                    if (r7.A00 != 0) {
                        Collections.sort(arrayList, C234215t.A08);
                        r7.A00 = 0;
                    }
                    float f3 = 0.5f * ((float) r7.A03);
                    int i9 = 0;
                    while (true) {
                        if (i8 < arrayList.size()) {
                            C234115s r1 = (C234115s) arrayList.get(i8);
                            i9 += r1.A02;
                            if (((float) i9) >= f3) {
                                f = r1.A00;
                                break;
                            }
                            i8++;
                        } else {
                            f = arrayList.isEmpty() ? Float.NaN : ((C234115s) arrayList.get(arrayList.size() - 1)).A00;
                        }
                    }
                    this.A01 = (long) f;
                }
            }
            long j4 = this.A02;
            long j5 = this.A01;
            C233215h r03 = this.A07;
            C34401iQ r11 = new C34401iQ(i, j4, j5);
            Iterator it = r03.A00.iterator();
            while (it.hasNext()) {
                C233115g r5 = (C233115g) it.next();
                r5.A01.post(new RunnableEBaseShape5S0200000_I1_0(r5, r11, 30));
            }
            int i10 = this.A00 - 1;
            this.A00 = i10;
            if (i10 > 0) {
                this.A03 = A3z;
            }
            this.A02 = 0;
        }
    }

    @Override // X.AnonymousClass15U
    public synchronized void ALE(AnonymousClass15E r4, AnonymousClass15G r5, boolean z) {
        if (z) {
            int i = this.A00;
            if (i == 0) {
                this.A03 = this.A06.A3z();
            }
            this.A00 = i + 1;
        }
    }

    @Override // X.AnonymousClass15B
    public void AMd(AnonymousClass15A r2) {
        this.A07.A00(r2);
    }
}
