package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.jobqueue.job.SendLiveLocationKeyJob;
import java.util.concurrent.Callable;

/* renamed from: X.2Rr  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class CallableC49702Rr implements Callable {
    public final /* synthetic */ Jid A00;
    public final /* synthetic */ SendLiveLocationKeyJob A01;

    public /* synthetic */ CallableC49702Rr(SendLiveLocationKeyJob sendLiveLocationKeyJob, Jid jid) {
        this.A01 = sendLiveLocationKeyJob;
        this.A00 = jid;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        SendLiveLocationKeyJob sendLiveLocationKeyJob = this.A01;
        Jid jid = this.A00;
        AnonymousClass01I r0 = sendLiveLocationKeyJob.A00;
        r0.A04();
        AnonymousClass0OE r2 = new AnonymousClass0OE(jid.getRawString(), C001801b.A0A(r0.A02));
        C001000o r1 = sendLiveLocationKeyJob.A02;
        r1.A0H.A00();
        AnonymousClass1UM r12 = new AnonymousClass1UM(new AnonymousClass1Yq(r1.A00.A00.A01).A00(C002001d.A2L(r2)).ANr(), 0);
        C04970Mo A08 = C02840Dr.A08();
        C76473eb r02 = ((C02840Dr) A08.A00).A0T;
        if (r02 == null) {
            r02 = C76473eb.A03;
        }
        C76463ea r3 = (C76463ea) r02.AQb();
        r3.A04(jid.getRawString());
        byte[] bArr = r12.A01;
        if (bArr != null) {
            AnonymousClass071 A002 = AnonymousClass071.A00(bArr, 0, bArr.length);
            r3.A02();
            C76473eb r13 = (C76473eb) r3.A00;
            r13.A00 |= 2;
            r13.A01 = A002;
            A08.A02();
            C02840Dr r14 = (C02840Dr) A08.A00;
            if (r14 != null) {
                r14.A0T = (C76473eb) r3.A01();
                r14.A00 |= 16384;
                return A08.A01();
            }
            throw null;
        }
        throw null;
    }
}
