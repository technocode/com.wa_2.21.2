package X;

import com.whatsapp.Me;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;

/* renamed from: X.0Wf  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC07180Wf {
    public final C02270Bi A00 = new C02270Bi();
    public final AnonymousClass02M A01;
    public final AnonymousClass01I A02;
    public final AnonymousClass01J A03;
    public final AnonymousClass01A A04;
    public final AnonymousClass0HN A05;
    public final AnonymousClass00C A06;
    public final AnonymousClass01X A07;
    public final AnonymousClass0BD A08;
    public final C06310Ss A09;
    public final AnonymousClass0DG A0A;
    public final AnonymousClass0GW A0B;
    public final AnonymousClass0EP A0C;
    public final C016608y A0D;
    public final AnonymousClass01T A0E;
    public final C02290Bk A0F;
    public final AnonymousClass0I6 A0G;
    public final AnonymousClass094 A0H;
    public final AnonymousClass09E A0I;
    public final AnonymousClass0IX A0J;
    public final AnonymousClass0PB A0K;
    public final AnonymousClass0EO A0L;
    public final C03160Fa A0M;
    public final AnonymousClass0FZ A0N;
    public final AnonymousClass0AR A0O;
    public final AnonymousClass0HM A0P;
    public final AnonymousClass0BB A0Q;
    public final AnonymousClass02J A0R;
    public final AnonymousClass321 A0S;
    public final AnonymousClass0BZ A0T;
    public final AnonymousClass00T A0U;

    public AbstractC07180Wf(AnonymousClass02M r2, AnonymousClass01I r3, AnonymousClass00T r4, AnonymousClass0DG r5, AnonymousClass0AR r6, AnonymousClass09E r7, AnonymousClass01J r8, AnonymousClass01A r9, AnonymousClass0EP r10, C03160Fa r11, AnonymousClass01X r12, AnonymousClass0BD r13, AnonymousClass0IX r14, AnonymousClass0EO r15, AnonymousClass0BZ r16, AnonymousClass02J r17, AnonymousClass0BB r18, AnonymousClass00C r19, AnonymousClass0HN r20, C02290Bk r21, AnonymousClass0FZ r22, AnonymousClass0HM r23, C016608y r24, C06310Ss r25, AnonymousClass321 r26, AnonymousClass0GW r27, AnonymousClass01T r28, AnonymousClass0I6 r29, AnonymousClass094 r30, AnonymousClass0PB r31) {
        this.A01 = r2;
        this.A02 = r3;
        this.A0U = r4;
        this.A0A = r5;
        this.A0O = r6;
        this.A0I = r7;
        this.A03 = r8;
        this.A04 = r9;
        this.A0C = r10;
        this.A0M = r11;
        this.A07 = r12;
        this.A08 = r13;
        this.A0J = r14;
        this.A0L = r15;
        this.A0T = r16;
        this.A0R = r17;
        this.A0Q = r18;
        this.A06 = r19;
        this.A05 = r20;
        this.A0F = r21;
        this.A0N = r22;
        this.A0P = r23;
        this.A0D = r24;
        this.A09 = r25;
        this.A0S = r26;
        this.A0E = r28;
        this.A0B = r27;
        this.A0G = r29;
        this.A0H = r30;
        this.A0K = r31;
    }

    public void A00() {
        AnonymousClass0HM r3 = this.A0P;
        Me A042 = r3.A04();
        if (A042.jabber_id == null) {
            this.A00.A08(0);
            return;
        }
        AnonymousClass01I r0 = this.A02;
        r0.A04();
        r0.A05(A042);
        C03160Fa r1 = this.A0M;
        r1.A1V = false;
        Log.i("preparemsgstorebasehelper/preparemsgstore/set-connection/passive");
        r3.A09();
        r1.A01();
        if (!(this instanceof AnonymousClass3ZI)) {
            AbstractC07170We r4 = (AbstractC07170We) this;
            if (r4.A00) {
                RunnableEBaseShape1S0100000_I0_1 runnableEBaseShape1S0100000_I0_1 = new RunnableEBaseShape1S0100000_I0_1(r4, 40);
                RunnableEBaseShape1S0100000_I0_1 runnableEBaseShape1S0100000_I0_12 = new RunnableEBaseShape1S0100000_I0_1(r4, 39);
                AnonymousClass0BD r11 = r4.A08;
                if (r11 != null) {
                    RunnableEBaseShape0S0300000_I0_0 runnableEBaseShape0S0300000_I0_0 = new RunnableEBaseShape0S0300000_I0_0(r11, runnableEBaseShape1S0100000_I0_12, runnableEBaseShape1S0100000_I0_1, 23);
                    File file = r4.A0F.A0W;
                    ArrayList arrayList = new ArrayList();
                    arrayList.toString();
                    String[] A043 = C02290Bk.A04(AnonymousClass1Y3.A01(), AnonymousClass1Y3.A00());
                    int length = A043.length;
                    for (int i = 0; i < length; i++) {
                        ArrayList A072 = AnonymousClass0HY.A07(file, A043[i]);
                        A072.toString();
                        arrayList.addAll(A072);
                    }
                    int A012 = r11.A01(arrayList, runnableEBaseShape0S0300000_I0_0);
                    AnonymousClass008.A0t("verifymsgstore/preparemsgstore/backup-keys-count ", A012);
                    if (A012 != 0) {
                        Log.d("verifymsgstore/preparemsgstore/have-keys/continue");
                        r4.A02.sendEmptyMessageDelayed(1, 32000);
                        return;
                    }
                } else {
                    throw null;
                }
            }
            Log.d("verifymsgstore/preparemsgstore/no-keys-to-request/continue");
            r4.A0U.ANC(new AnonymousClass27U(r4, r4.A05, r4.A00), new Object[0]);
            return;
        }
        AnonymousClass3ZI r42 = (AnonymousClass3ZI) this;
        Log.i("PrepareDirectTransferMsgStoreHelper/createAndRunPrepareMessageStoreTask");
        AnonymousClass3ZK r2 = new AnonymousClass3ZK(r42);
        r42.A00 = r2;
        r42.A0U.ANC(r2, new Object[0]);
    }
}
