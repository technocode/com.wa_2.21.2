package X;

import android.os.Message;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jobqueue.job.SendReadReceiptJob;
import com.whatsapp.util.Log;
import java.io.IOException;

/* renamed from: X.09G  reason: invalid class name */
public class AnonymousClass09G {
    public static volatile AnonymousClass09G A06;
    public final AnonymousClass09T A00;
    public final AnonymousClass01J A01;
    public final AnonymousClass09Q A02;
    public final AnonymousClass09U A03;
    public final AnonymousClass09H A04;
    public final C28991Wn A05;

    public AnonymousClass09G(AnonymousClass01J r1, AnonymousClass09H r2, AnonymousClass09Q r3, AnonymousClass09T r4, C28991Wn r5, AnonymousClass09U r6) {
        this.A01 = r1;
        this.A04 = r2;
        this.A02 = r3;
        this.A00 = r4;
        this.A05 = r5;
        this.A03 = r6;
    }

    public static AnonymousClass09G A00() {
        if (A06 == null) {
            synchronized (AnonymousClass09G.class) {
                if (A06 == null) {
                    A06 = new AnonymousClass09G(AnonymousClass01J.A00(), AnonymousClass09H.A01(), AnonymousClass09Q.A00(), AnonymousClass09T.A00(), C28991Wn.A00(), AnonymousClass09U.A00());
                }
            }
        }
        return A06;
    }

    public final void A01(long j, Message message) {
        AbstractC28981Wm A012 = this.A05.A01(0, j);
        if (A012 != null) {
            A012.A01(6);
        }
        this.A04.A09(message);
    }

    public void A02(AbstractC007503q r10) {
        byte b = r10.A0m;
        if (b == 31) {
            A03(r10, null);
        } else if (!AnonymousClass1VY.A0a(r10.A07()) && !r10.A0i) {
            if (r10.A08 == 13) {
                AnonymousClass09T r3 = this.A00;
                if (r3 == null) {
                    throw null;
                } else if (r3.A01(r10.A0n.A00) && r10.A0E >= 1415214000000L && b != 15 && !r10.A0v) {
                    if (r10.A0w) {
                        if (!r3.A03(r10)) {
                            A01(r10.A0s, Message.obtain(null, 0, 9, 0, r10));
                        }
                        r10.A0w = false;
                    }
                    A04(r10, true);
                    return;
                }
            }
            A01(r10.A0s, Message.obtain(null, 0, 9, 0, r10));
        }
    }

    public void A03(AbstractC007503q r11, String str) {
        long j = r11.A0s;
        C007303n r0 = r11.A0n;
        AnonymousClass02N r1 = r0.A00;
        if (r1 != null) {
            AnonymousClass02N A07 = r11.A07();
            String str2 = r0.A01;
            AnonymousClass02N r4 = r1;
            if (AnonymousClass1VY.A0T(A07)) {
                r4 = A07;
                A07 = r1;
            }
            A01(j, Message.obtain(null, 0, 129, 0, new AnonymousClass1WQ(str2, r4, A07, str, null, j)));
            return;
        }
        throw null;
    }

    public void A04(AbstractC007503q r14, boolean z) {
        byte b;
        DeviceJid deviceJid;
        if (!(r14.A08 == 16 || (b = r14.A0m) == 15 || b == 19 || b == 21 || AnonymousClass0ZG.A0K(r14))) {
            AnonymousClass02N A07 = r14.A07();
            AnonymousClass01J r1 = this.A01;
            C007303n r4 = r14.A0n;
            AnonymousClass02N r5 = r4.A00;
            if (r5 != null) {
                if (z) {
                    deviceJid = r14.A0u;
                } else {
                    deviceJid = null;
                }
                r1.A00.A01(new SendReadReceiptJob(r5, A07, deviceJid, new String[]{r4.A01}, r14.A0E, r14.A0s));
            } else {
                throw null;
            }
        }
        AnonymousClass02N r42 = r14.A0n.A00;
        if (!AnonymousClass1VY.A0b(r42) && this.A00.A03(r14)) {
            if (r14.A08 == 17) {
                r14.A0T(16);
                try {
                    this.A02.A07(r14, false);
                } catch (IOException e) {
                    Log.e("Failed to update msg status back to 16", e);
                }
            } else {
                AnonymousClass09U r2 = this.A03;
                if (r42 != null) {
                    r2.A01(r42, r14.A0p);
                    return;
                }
                throw null;
            }
        }
    }

    public void A05(AnonymousClass1XJ r7) {
        if (!r7.A0T) {
            AbstractC007503q r0 = r7.A0A;
            if (r0 == null) {
                A01(r7.A04, Message.obtain(null, 0, 9, 0, r7.A03((byte) 0)));
            } else {
                A02(r0);
            }
        }
    }

    public void A06(AnonymousClass1XJ r12, String str, String str2) {
        if (r12 != null) {
            long j = r12.A04;
            AnonymousClass02N A09 = AnonymousClass1VY.A09(r12.A0Y);
            AnonymousClass02N A092 = AnonymousClass1VY.A09(r12.A06);
            String str3 = r12.A0c;
            AnonymousClass02N r5 = A09;
            if (AnonymousClass1VY.A0T(A092)) {
                r5 = A092;
                A092 = A09;
            }
            A01(j, Message.obtain(null, 0, 129, 0, new AnonymousClass1WQ(str3, r5, A092, str, str2, j)));
        }
    }

    public void A07(AnonymousClass1XX r8) {
        A08(r8.A07, 0, r8.A01, r8.A00(), r8.A08);
    }

    public void A08(String str, long j, Jid jid, Jid jid2, String str2) {
        if (str != null) {
            A01(j, Message.obtain(null, 0, 28, 0, new AnonymousClass1WQ(str, jid, jid2, str2, null, j)));
        }
    }

    public void A09(String str, Jid jid, String str2) {
        A08(str, 0, jid, null, str2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:90:0x029f, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x02a3, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0A(java.util.Collection r19) {
        /*
        // Method dump skipped, instructions count: 698
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass09G.A0A(java.util.Collection):void");
    }
}
