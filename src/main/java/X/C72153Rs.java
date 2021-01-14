package X;

import android.content.Context;
import android.os.Message;
import com.whatsapp.util.Log;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.whispersystems.jobqueue.Job;

/* renamed from: X.3Rs  reason: invalid class name and case insensitive filesystem */
public class C72153Rs extends Job implements AnonymousClass0EA {
    public transient AnonymousClass0AR A00;
    public transient C04530Ks A01;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C72153Rs() {
        /*
            r4 = this;
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
            r2 = 0
            r1 = 1
            com.whatsapp.jobqueue.requirement.ChatConnectionRequirement r0 = new com.whatsapp.jobqueue.requirement.ChatConnectionRequirement
            r0.<init>()
            r3.add(r0)
            org.whispersystems.jobqueue.JobParameters r0 = new org.whispersystems.jobqueue.JobParameters
            r0.<init>(r3, r1, r2)
            r4.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72153Rs.<init>():void");
    }

    @Override // org.whispersystems.jobqueue.Job
    public void A03() {
        Log.i("Fetch2FAEmailStatusJob/onRun: asking for 2FA status");
        AnonymousClass0AR r1 = this.A00;
        Future future = null;
        if (r1.A04.A06 && r1.A04.A02) {
            Log.i("sendmethods/send-get-two-factor-auth");
            AnonymousClass09H r2 = r1.A08;
            String A02 = r2.A02();
            try {
                Message obtain = Message.obtain(null, 0, 114, 0);
                obtain.obj = A02;
                future = r2.A05(A02, obtain, false);
            } catch (AnonymousClass1WI unused) {
            }
            if (future != null) {
                try {
                    future.get(32000, TimeUnit.MILLISECONDS);
                    if (this.A01.A00.getInt("two_factor_auth_email_set", 0) == 0) {
                        Log.w("Fetch2FAEmailStatusJob/onRun: email status fetching failed");
                        throw new Exception("Failing Fetch2FAEmailStatusJob, fetching status failed");
                    }
                    return;
                } catch (Exception unused2) {
                    Log.i("Fetch2FAEmailStatusJob/onRun: timeout waiting for response");
                    throw new Exception("Failing Fetch2FAEmailStatusJob, timeout for response");
                }
            }
        }
        Log.i("Fetch2FAEmailStatusJob/onRun: application not ready to send IQ");
        throw new Exception("Failing Fetch2FAEmailStatusJob, application is not ready to send IQ");
    }

    @Override // X.AnonymousClass0EA
    public void AO7(Context context) {
        this.A00 = AnonymousClass0AR.A00();
        this.A01 = C04530Ks.A00();
    }
}
