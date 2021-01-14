package X;

import android.os.Message;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.jobqueue.job.SendRetryReceiptJob;
import com.whatsapp.util.Log;

/* renamed from: X.2V6  reason: invalid class name */
public final class AnonymousClass2V6 {
    public final int A00;
    public final C03250Fl A01;
    public final AnonymousClass01J A02;
    public final AnonymousClass09A A03;
    public final AnonymousClass0X6 A04;
    public final AnonymousClass0AR A05;
    public final AnonymousClass1XJ A06;
    public final AnonymousClass1XQ A07;
    public final AnonymousClass1XQ A08;
    public final boolean A09;
    public final byte[] A0A;

    public AnonymousClass2V6(AnonymousClass0AR r2, AnonymousClass01J r3, C03250Fl r4, C001000o r5, AnonymousClass09A r6, AnonymousClass0X6 r7, AnonymousClass1XJ r8, byte[] bArr, AnonymousClass1XQ r10, AnonymousClass1XQ r11, boolean z) {
        this.A05 = r2;
        this.A02 = r3;
        this.A01 = r4;
        this.A03 = r6;
        this.A04 = r7;
        this.A06 = r8;
        this.A00 = r5.A08.A02();
        this.A0A = bArr;
        this.A08 = r10;
        this.A07 = r11;
        this.A09 = z;
    }

    public void A00() {
        StringBuilder A0S = AnonymousClass008.A0S("need to send retry receipt; message.key=");
        AnonymousClass1XJ r2 = this.A06;
        A0S.append(r2.A04());
        A0S.append(" participant = ");
        A0S.append(r2.A06);
        Log.i(A0S.toString());
        r2.A0T = true;
        int i = this.A00;
        byte[] A042 = C05360Of.A04(i);
        if (r2.A01() > 1) {
            this.A01.A03();
        }
        if (r2.A00() == 0 && r2.A00 == 0) {
            StringBuilder A0S2 = AnonymousClass008.A0S("recording local placeholder for retry receipt; message.key=");
            A0S2.append(r2.A04());
            Log.i(A0S2.toString());
            this.A03.A01(new RunnableEBaseShape11S0100000_I1_6(this, 7), 50);
        }
        StringBuilder A0S3 = AnonymousClass008.A0S("axolotl sending retry receipt; message.key=");
        A0S3.append(r2.A04());
        A0S3.append("; localRegistrationId=");
        AnonymousClass008.A1L(A0S3, i);
        if (!this.A09) {
            AnonymousClass0AR r5 = this.A05;
            Jid jid = r2.A0Y;
            String str = r2.A0c;
            Jid jid2 = r2.A06;
            UserJid userJid = r2.A0Z;
            long j = r2.A0X;
            int A012 = 1 + r2.A01();
            int A002 = r2.A00();
            byte[] bArr = this.A0A;
            AnonymousClass1XQ r4 = this.A08;
            AnonymousClass1XQ r3 = this.A07;
            long j2 = r2.A04;
            if (r5.A04.A06) {
                r5.A08.A09(Message.obtain(null, 0, 11, 0, new C28921Wg(jid, str, jid2, userJid, j, A012, A042, A002, bArr, (byte) 5, r4, r3, j2)));
                return;
            }
            return;
        }
        AnonymousClass01J r0 = this.A02;
        r0.A00.A01(new SendRetryReceiptJob(r2, i));
    }
}
