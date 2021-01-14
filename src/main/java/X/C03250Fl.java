package X;

import android.os.Message;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0Fl  reason: invalid class name and case insensitive filesystem */
public class C03250Fl {
    public static volatile C03250Fl A0H;
    public long A00 = 0;
    public long A01 = 0;
    public boolean A02;
    public boolean A03;
    public AnonymousClass1XQ[] A04;
    public final AnonymousClass02M A05;
    public final AnonymousClass09K A06;
    public final AnonymousClass00S A07;
    public final AnonymousClass00D A08;
    public final C001000o A09;
    public final C001400w A0A;
    public final AnonymousClass09H A0B;
    public final AbstractC29211Xn A0C;
    public final AnonymousClass3PB A0D;
    public final AnonymousClass324 A0E;
    public final AnonymousClass0CZ A0F = new AnonymousClass0CZ(10, 610);
    public final AnonymousClass00T A0G;

    public C03250Fl(AnonymousClass00S r6, AnonymousClass02M r7, AnonymousClass00T r8, AnonymousClass09H r9, C001400w r10, AnonymousClass09K r11, C001000o r12, AnonymousClass00D r13, AbstractC29211Xn r14, AnonymousClass324 r15, AnonymousClass3PB r16) {
        this.A07 = r6;
        this.A05 = r7;
        this.A0G = r8;
        this.A0B = r9;
        this.A0A = r10;
        this.A06 = r11;
        this.A09 = r12;
        this.A08 = r13;
        this.A0C = r14;
        this.A0E = r15;
        this.A0D = r16;
    }

    public static C03250Fl A00() {
        if (A0H == null) {
            synchronized (C03250Fl.class) {
                if (A0H == null) {
                    AnonymousClass00S A002 = AnonymousClass00S.A00();
                    AnonymousClass02M A003 = AnonymousClass02M.A00();
                    AnonymousClass00T A004 = C002101e.A00();
                    AnonymousClass09H A012 = AnonymousClass09H.A01();
                    C001400w r8 = C001400w.A02;
                    AnonymousClass09K r9 = AnonymousClass09K.A07;
                    C001000o A005 = C001000o.A00();
                    AnonymousClass00D A006 = AnonymousClass00D.A00();
                    AbstractC29211Xn A007 = AbstractC29211Xn.A00();
                    AnonymousClass324 A008 = AnonymousClass324.A00();
                    if (AnonymousClass3PB.A00 == null) {
                        synchronized (AnonymousClass3PB.class) {
                            if (AnonymousClass3PB.A00 == null) {
                                AnonymousClass3PB.A00 = new AnonymousClass3PB();
                            }
                        }
                    }
                    A0H = new C03250Fl(A002, A003, A004, A012, r8, r9, A005, A006, A007, A008, AnonymousClass3PB.A00);
                }
            }
        }
        return A0H;
    }

    public void A01() {
        this.A09.A0L();
        A04();
    }

    public synchronized void A02() {
        this.A00 = 0;
    }

    public synchronized void A03() {
        if (this.A06.A06) {
            long j = this.A00;
            if (j == 0 || this.A07.A04() - j > 60000) {
                this.A0B.A09(Message.obtain(null, 0, 88, 0));
                this.A00 = this.A07.A04();
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("MyPreKeysManager/send-get-pre-key-digest/skip-digest-check last:");
        sb.append(this.A00);
        Log.i(sb.toString());
    }

    public synchronized void A04() {
        long A042 = this.A07.A04();
        if (this.A06.A06) {
            long j = this.A01;
            if (j == 0 || A042 - j > 180000) {
                A06(A042);
                A07(true);
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("MyPreKeysManager/sendSetPreKey/skip last:");
        sb.append(this.A01);
        Log.i(sb.toString());
    }

    public final synchronized void A05() {
        if (this.A03) {
            this.A03 = false;
            this.A0F.A02();
        }
    }

    public final synchronized void A06(long j) {
        this.A01 = j;
    }

    public final void A07(boolean z) {
        this.A0A.A00();
        C001000o r3 = this.A09;
        int A022 = r3.A08.A02();
        byte[] A0Y = r3.A0Y();
        r3.A0H.A00();
        AnonymousClass057 r1 = r3.A00.A00;
        r1.A08.A00();
        List A012 = r1.A04.A01();
        ArrayList arrayList = new ArrayList();
        Iterator it = ((AbstractCollection) A012).iterator();
        while (it.hasNext()) {
            AnonymousClass1Q6 r5 = (AnonymousClass1Q6) it.next();
            try {
                arrayList.add(AnonymousClass057.A00(r5.A00, new C29511Yz(r5.A01)));
            } catch (IOException e) {
                StringBuilder A0S = AnonymousClass008.A0S("error reading prekey ");
                A0S.append(r5.A00);
                Log.e(A0S.toString(), e);
            }
        }
        StringBuilder A0S2 = AnonymousClass008.A0S("axolotl reporting back ");
        A0S2.append(arrayList.size());
        A0S2.append(" prekeys for sending to the server");
        Log.i(A0S2.toString());
        Object[] array = arrayList.toArray(new AnonymousClass1XQ[0]);
        AnonymousClass1XQ A0G2 = r3.A0G();
        byte[] A042 = C05360Of.A04(A022);
        AnonymousClass02M r0 = this.A05;
        r0.A02.post(new RunnableEBaseShape0S0510000_I0(this, A0Y, A042, array, A0G2, z, 1));
    }
}
