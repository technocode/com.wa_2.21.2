package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.jobqueue.job.SendE2EMessageJob;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.Callable;

/* renamed from: X.2Rm  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class CallableC49652Rm implements Callable {
    public final /* synthetic */ SendE2EMessageJob A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ Set A02;

    public /* synthetic */ CallableC49652Rm(SendE2EMessageJob sendE2EMessageJob, Set set, String str) {
        this.A00 = sendE2EMessageJob;
        this.A02 = set;
        this.A01 = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        SendE2EMessageJob sendE2EMessageJob = this.A00;
        Set<UserJid> set = this.A02;
        String str = this.A01;
        AnonymousClass01I r0 = sendE2EMessageJob.A01;
        r0.A04();
        DeviceJid deviceJid = r0.A02;
        if (deviceJid != null) {
            byte[] bArr = sendE2EMessageJob.A05.A0C(new AnonymousClass0OE(sendE2EMessageJob.jid, C001801b.A0A(deviceJid))).A01;
            if (bArr != null) {
                C76473eb r02 = ((C02840Dr) C02840Dr.A08().A00).A0U;
                if (r02 == null) {
                    r02 = C76473eb.A03;
                }
                C76463ea r5 = (C76463ea) r02.AQb();
                r5.A04(sendE2EMessageJob.jid);
                AnonymousClass071 A002 = AnonymousClass071.A00(bArr, 0, bArr.length);
                r5.A02();
                C76473eb r1 = (C76473eb) r5.A00;
                r1.A00 |= 2;
                r1.A01 = A002;
                HashMap hashMap = new HashMap();
                for (UserJid userJid : set) {
                    C04970Mo A08 = C02840Dr.A08();
                    A08.A02();
                    C02840Dr r12 = (C02840Dr) A08.A00;
                    if (r12 != null) {
                        r12.A0U = (C76473eb) r5.A01();
                        r12.A00 |= 2;
                        AnonymousClass0ZG.A0C(A08, sendE2EMessageJob.A0B.A03(userJid));
                        C02840Dr r13 = (C02840Dr) A08.A01();
                        if (str != null) {
                            r13 = SendE2EMessageJob.A00(r13, null, str);
                        }
                        hashMap.put(userJid, r13);
                    } else {
                        throw null;
                    }
                }
                return hashMap;
            }
            throw null;
        }
        throw null;
    }
}
