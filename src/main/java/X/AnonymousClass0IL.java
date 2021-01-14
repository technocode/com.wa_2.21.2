package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: X.0IL  reason: invalid class name */
public class AnonymousClass0IL {
    public AnonymousClass0IP A00;
    public AnonymousClass0RO A01;
    public final AnonymousClass009 A02;
    public final AnonymousClass0DH A03;
    public final AnonymousClass0I9 A04;
    public final AnonymousClass0IC A05;
    public final AnonymousClass0IB A06;
    public final AnonymousClass0IK A07;
    public final AnonymousClass0IO A08;
    public final AnonymousClass0IN A09 = new AnonymousClass0IM(this);
    public final AnonymousClass00S A0A;
    public final AnonymousClass01Q A0B;
    public final AnonymousClass01P A0C;
    public final AnonymousClass0I8 A0D;
    public final AnonymousClass01L A0E;
    public final AnonymousClass09H A0F;
    public final C02040Ak A0G;
    public final C01970Ad A0H;
    public final Map A0I = new HashMap();
    public final Map A0J = new HashMap();
    public final Map A0K = new HashMap();
    public final Map A0L = new HashMap();
    public final Map A0M = new HashMap();

    public AnonymousClass0IL(AnonymousClass00G r9, AnonymousClass00S r10, AnonymousClass009 r11, AnonymousClass0DH r12, AnonymousClass09H r13, AnonymousClass0IK r14, AnonymousClass03P r15, AnonymousClass01X r16, C01970Ad r17, AnonymousClass01L r18, AnonymousClass01P r19, AnonymousClass03S r20, AnonymousClass00D r21, AnonymousClass01Q r22, AnonymousClass0I8 r23, C02040Ak r24, AnonymousClass0I9 r25, AnonymousClass0IC r26, AnonymousClass0IB r27) {
        this.A0A = r10;
        this.A02 = r11;
        this.A03 = r12;
        this.A0F = r13;
        this.A07 = r14;
        this.A0H = r17;
        this.A0E = r18;
        this.A0C = r19;
        this.A0B = r22;
        this.A0D = r23;
        this.A0G = r24;
        this.A04 = r25;
        this.A05 = r26;
        this.A06 = r27;
        this.A08 = new AnonymousClass0IO(r9, r14, r15, r16, r20, r21, r27);
    }

    public static final void A00(Map map, List list, Collection collection) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C007003k r3 = (C007003k) it.next();
            AnonymousClass0QW r0 = r3.A08;
            if (r0 != null) {
                C47162Gs r1 = (C47162Gs) map.get(r0.A01);
                if (r1 == null) {
                    AnonymousClass008.A1V(AnonymousClass008.A0S("sync/phone-number/missing_response/"), r3.A08.A01);
                } else {
                    int i = r1.A03;
                    if (i == 0) {
                        AnonymousClass008.A1V(AnonymousClass008.A0S("sync/phone-number/unassigned/"), r3.A08.A01);
                    } else {
                        boolean z = true;
                        if (i != 1) {
                            z = false;
                        }
                        UserJid userJid = r1.A07;
                        if (r3.A0X != z || !C006803i.A0q(r3.A09, userJid)) {
                            r3.A0X = z;
                            r3.A09 = userJid;
                            if (collection != null) {
                                collection.add(r3);
                            }
                        }
                    }
                }
            } else {
                throw null;
            }
        }
    }

    public final AnonymousClass0QK A01(AnonymousClass0RN r5, String str) {
        C04600Kz r3 = new C04600Kz(str);
        try {
            return (AnonymousClass0QK) r5.A20(str);
        } catch (RuntimeException e) {
            this.A02.A05(e, 3);
            return AnonymousClass0QK.EXCEPTION;
        } finally {
            r3.A01();
        }
    }

    public final synchronized AnonymousClass0IP A02() {
        AnonymousClass0IP r4;
        r4 = this.A00;
        if (r4 == null) {
            r4 = new AnonymousClass0IP(this.A02, this.A0F, this.A0D.A07(), this.A09);
            this.A00 = r4;
        }
        return r4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0183, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0187, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x018a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x018e, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
        if (r4.A0K() == false) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A03(java.util.List r11, java.util.List r12, java.util.List r13) {
        /*
        // Method dump skipped, instructions count: 402
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0IL.A03(java.util.List, java.util.List, java.util.List):boolean");
    }

    public final boolean A04(Future future, String str) {
        try {
            future.get(64000, TimeUnit.MILLISECONDS);
            if (this.A01 != null) {
                return true;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("/no result");
            Log.i(sb.toString());
            return false;
        } catch (RuntimeException e) {
            this.A02.A05(e, 3);
            return false;
        } catch (ExecutionException e2) {
            if ((e2.getCause() instanceof RuntimeException) || ((e2.getCause() instanceof Error) && !(e2.getCause() instanceof AssertionError) && !(e2.getCause() instanceof OutOfMemoryError))) {
                this.A02.A05(e2, 3);
                return false;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append("/exception");
            Log.e(sb2.toString(), e2);
            return false;
        } catch (InterruptedException | TimeoutException unused) {
            return false;
        }
    }
}
