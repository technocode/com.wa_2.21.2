package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.jobqueue.job.SyncDeviceAndResendMessageJob;
import com.whatsapp.jobqueue.job.SyncDevicesJob;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;

/* renamed from: X.0EQ  reason: invalid class name */
public class AnonymousClass0EQ {
    public static volatile AnonymousClass0EQ A05;
    public final AnonymousClass01J A00;
    public final AnonymousClass01A A01;
    public final AnonymousClass0ER A02;
    public final AnonymousClass01Q A03;
    public final C015808q A04;

    public AnonymousClass0EQ(AnonymousClass01J r1, AnonymousClass01A r2, C015808q r3, AnonymousClass01Q r4, AnonymousClass0ER r5) {
        this.A00 = r1;
        this.A01 = r2;
        this.A04 = r3;
        this.A03 = r4;
        this.A02 = r5;
    }

    public static AnonymousClass0EQ A00() {
        if (A05 == null) {
            synchronized (AnonymousClass0EQ.class) {
                if (A05 == null) {
                    A05 = new AnonymousClass0EQ(AnonymousClass01J.A00(), AnonymousClass01A.A00(), C015808q.A00(), AnonymousClass01Q.A00(), AnonymousClass0ER.A00());
                }
            }
        }
        return A05;
    }

    public void A01(C007303n r3, UserJid[] userJidArr, long j) {
        boolean add;
        if (userJidArr.length == 0) {
            StringBuilder sb = new StringBuilder("SyncDeviceAndResendMessageJob/empty recipients for ");
            sb.append(r3);
            Log.w(sb.toString());
            return;
        }
        Set set = this.A02.A02;
        synchronized (set) {
            add = set.add(r3);
        }
        if (add) {
            AnonymousClass01J r0 = this.A00;
            r0.A00.A01(new SyncDeviceAndResendMessageJob(r3, userJidArr, j));
            return;
        }
        StringBuilder sb2 = new StringBuilder("SyncDeviceAndResendMessageJob/duplicate job request for ");
        sb2.append(r3);
        Log.d(sb2.toString());
    }

    public void A02(UserJid[] userJidArr, int i) {
        String[] A0g = AnonymousClass1VY.A0g(Arrays.asList(userJidArr));
        if (A0g == null || A0g.length == 0) {
            throw new IllegalArgumentException("invalid jid list");
        }
        ArrayList arrayList = new ArrayList();
        for (UserJid userJid : userJidArr) {
            AnonymousClass0ER r1 = this.A02;
            Set set = r1.A03;
            synchronized (set) {
                if (!set.contains(userJid)) {
                    r1.A01.put(userJid, Long.valueOf(r1.A00.A05()));
                    set.add(userJid);
                    arrayList.add(userJid);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            this.A00.A00.A01(new SyncDevicesJob((UserJid[]) arrayList.toArray(new UserJid[0]), i));
            return;
        }
        Log.d("SyncDevicesJob/scheduleSyncDevicesJob/ already has the job running.");
    }
}
