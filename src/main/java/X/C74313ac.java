package X;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.3ac  reason: invalid class name and case insensitive filesystem */
public class C74313ac implements AnonymousClass15E {
    public AnonymousClass3SW A00;
    public boolean A01;
    public final ActivityC004702f A02;
    public final AnonymousClass02M A03 = AnonymousClass02M.A00();
    public final C04360Kb A04 = C04360Kb.A00();
    public final C014308b A05 = C014308b.A00();
    public final AbstractC000900m A06 = new C72263Se(this);
    public final C003301q A07 = C003301q.A02;
    public final AnonymousClass00C A08 = AnonymousClass00C.A00();
    public final AnonymousClass01X A09 = AnonymousClass01X.A00();
    public final AnonymousClass0AQ A0A = AnonymousClass0AQ.A00();
    public final C53532dQ A0B;
    public final C02560Co A0C = C02560Co.A01;
    public final AnonymousClass0CH A0D = AnonymousClass0CH.A00();
    public final AnonymousClass34N A0E;

    @Override // X.AnonymousClass15E
    public void A1u(AnonymousClass15U r1) {
    }

    public C74313ac(ActivityC004702f r10, AnonymousClass0ML r11, AnonymousClass3SW r12, C56832jG r13) {
        AnonymousClass34N r0;
        long j;
        this.A00 = r12;
        this.A02 = r10;
        AnonymousClass0M4 r1 = ((AnonymousClass0M3) r11).A02;
        if (r1 != null) {
            if (this.A0C.A00(r1) == null) {
                this.A04.A06(r10, r11, false);
            }
            C60602pn A002 = this.A0C.A00(r1);
            if (A002 == null || (r0 = A002.A0h) == null) {
                throw new IllegalStateException("download file is null");
            }
            this.A0E = r0;
            r0.A0C = true;
            r0.A0D = true;
            AnonymousClass1WB r2 = A002.A01;
            if (r13.A04 == null) {
                synchronized (r2) {
                    j = r2.A03;
                }
                r13.A02 = j;
            }
            r13.A04 = r2;
            this.A0B = new C53532dQ(r11, this.A0E, r12);
            if (this.A0E.A00() == 4) {
                AnonymousClass01X r3 = this.A09;
                C014308b r22 = this.A05;
                AnonymousClass00C r02 = this.A08;
                String A0t = C28051Sr.A0t(r3, r22, this.A0A, r11, this.A0E);
                boolean A082 = this.A0E.A08();
                AnonymousClass3SW r03 = this.A00;
                if (r03 != null) {
                    r03.A00(A0t, A082, 1);
                }
            }
            AnonymousClass0CH r4 = this.A0D;
            if (r4 != null) {
                StringBuilder A0S = AnonymousClass008.A0S("MediaDownloadManager/markAsUrgent message.key=");
                A0S.append(r11.A0n);
                A0S.append(", message.mediaHash=");
                AnonymousClass008.A1S(A0S, ((AnonymousClass0M3) r11).A06);
                if (((AnonymousClass0M3) r11).A02 != null) {
                    C60602pn A003 = r4.A0Q.A00(((AnonymousClass0M3) r11).A02);
                    if (A003 != null && !r4.A0S.A04(r11) && r4.A0S.A08(r11)) {
                        A003.A0q = true;
                        ArrayList arrayList = new ArrayList();
                        synchronized (r4.A0R) {
                            r4.A00.close();
                            Iterator it = ((ArrayList) r4.A04()).iterator();
                            while (it.hasNext()) {
                                AnonymousClass0M3 r14 = (AnonymousClass0M3) it.next();
                                if (r14.A02 != null && r4.A0S.A04(r14)) {
                                    arrayList.add(r14);
                                }
                            }
                        }
                        if (arrayList.size() > 0) {
                            Iterator it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                AnonymousClass0M3 r7 = (AnonymousClass0M3) it2.next();
                                C60602pn A022 = r4.A02(r7);
                                if (A022 != null && !A022.A0q && A022.A0p == 1) {
                                    synchronized (r4.A0i) {
                                        r4.A0i.put(r7, Long.valueOf(A022.A07));
                                    }
                                    r4.A08(r7, false, false);
                                }
                            }
                        }
                        StringBuilder A0S2 = AnonymousClass008.A0S("MediaDownloadManager/markAsUrgent/executing download message.key=");
                        A0S2.append(r11.A0n);
                        A0S2.append(", message.mediaHash=");
                        AnonymousClass008.A1S(A0S2, ((AnonymousClass0M3) r11).A06);
                        r4.A0g.ANF(r4.A0Q.A00(((AnonymousClass0M3) r11).A02));
                        return;
                    }
                    return;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }

    @Override // X.AnonymousClass15E
    public /* synthetic */ Map A8n() {
        return Collections.emptyMap();
    }

    @Override // X.AnonymousClass15E
    public Uri A9a() {
        return this.A0B.A9a();
    }

    @Override // X.AnonymousClass15E
    public long ALs(AnonymousClass15G r4) {
        AnonymousClass02M r2 = this.A03;
        r2.A02.post(new RunnableEBaseShape13S0100000_I1_8(this, 31));
        return this.A0B.ALs(r4);
    }

    @Override // X.AnonymousClass15E
    public void close() {
        AnonymousClass02M r2 = this.A03;
        r2.A02.post(new RunnableEBaseShape13S0100000_I1_8(this, 30));
        this.A0B.close();
    }

    @Override // X.AnonymousClass15E
    public int read(byte[] bArr, int i, int i2) {
        return this.A0B.read(bArr, i, i2);
    }
}
