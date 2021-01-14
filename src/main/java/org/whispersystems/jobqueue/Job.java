package org.whispersystems.jobqueue;

import X.AnonymousClass008;
import X.AnonymousClass01J;
import X.AnonymousClass0ER;
import X.AnonymousClass0JK;
import X.C007303n;
import X.C49742Rw;
import X.C72153Rs;
import android.os.PowerManager;
import com.whatsapp.jobqueue.job.BulkGetPreKeyJob;
import com.whatsapp.jobqueue.job.GetHsmMessagePackJob;
import com.whatsapp.jobqueue.job.GetStatusPrivacyJob;
import com.whatsapp.jobqueue.job.GetVNameCertificateJob;
import com.whatsapp.jobqueue.job.ReceiptMultiTargetProcessingJob;
import com.whatsapp.jobqueue.job.ReceiptProcessingJob;
import com.whatsapp.jobqueue.job.RehydrateHsmJob;
import com.whatsapp.jobqueue.job.RehydrateTemplateJob;
import com.whatsapp.jobqueue.job.RotateSignedPreKeyJob;
import com.whatsapp.jobqueue.job.SendDisableLiveLocationJob;
import com.whatsapp.jobqueue.job.SendE2EMessageJob;
import com.whatsapp.jobqueue.job.SendFinalLiveLocationNotificationJob;
import com.whatsapp.jobqueue.job.SendFinalLiveLocationRetryJob;
import com.whatsapp.jobqueue.job.SendLiveLocationKeyJob;
import com.whatsapp.jobqueue.job.SendMediaErrorReceiptJob;
import com.whatsapp.jobqueue.job.SendPaymentInviteOrSetupJob;
import com.whatsapp.jobqueue.job.SendPeerMessageJob;
import com.whatsapp.jobqueue.job.SendPermanentFailureReceiptJob;
import com.whatsapp.jobqueue.job.SendPlayedReceiptJob;
import com.whatsapp.jobqueue.job.SendReadReceiptJob;
import com.whatsapp.jobqueue.job.SendRetryReceiptJob;
import com.whatsapp.jobqueue.job.SendStatusPrivacyListJob;
import com.whatsapp.jobqueue.job.SendWebForwardJob;
import com.whatsapp.jobqueue.job.SyncDeviceAndResendMessageJob;
import com.whatsapp.jobqueue.job.SyncDevicesJob;
import com.whatsapp.jobqueue.job.messagejob.AsyncMessageJob;
import com.whatsapp.jobqueue.job.messagejob.ProcessVCardMessageJob;
import com.whatsapp.util.Log;
import java.io.Serializable;
import java.util.HashSet;
import org.whispersystems.jobqueue.requirements.Requirement;

public abstract class Job implements Serializable {
    public transient int A00;
    public transient long A01;
    public transient PowerManager.WakeLock A02;
    public final JobParameters parameters;

    public abstract void A03();

    public Job(JobParameters jobParameters) {
        this.parameters = jobParameters;
    }

    public void A00() {
        String str;
        if (this instanceof C72153Rs) {
            Log.w("Fetch2FAEmailStatusJob/canceled");
        } else if (this instanceof AsyncMessageJob) {
            AsyncMessageJob asyncMessageJob = (AsyncMessageJob) this;
            StringBuilder A0S = AnonymousClass008.A0S("asyncMessageJob/canceled async message job");
            StringBuilder A0S2 = AnonymousClass008.A0S("; rowId=");
            A0S2.append(asyncMessageJob.rowId);
            A0S2.append("; job=");
            if (!(asyncMessageJob instanceof ProcessVCardMessageJob)) {
                str = "asyncTokenize";
            } else {
                str = "processVCard";
            }
            A0S2.append(str);
            A0S.append(A0S2.toString());
            Log.w(A0S.toString());
        } else if (this instanceof SyncDevicesJob) {
            SyncDevicesJob syncDevicesJob = (SyncDevicesJob) this;
            StringBuilder A0S3 = AnonymousClass008.A0S("SyncDevicesJob/onCanceled/cancel sync devices job param=");
            A0S3.append(syncDevicesJob.A05());
            Log.w(A0S3.toString());
            syncDevicesJob.A01.A01(syncDevicesJob.jids);
        } else if (this instanceof SyncDeviceAndResendMessageJob) {
            SyncDeviceAndResendMessageJob syncDeviceAndResendMessageJob = (SyncDeviceAndResendMessageJob) this;
            StringBuilder A0S4 = AnonymousClass008.A0S("SyncDeviceAndResendMessageJob/onCanceled/param=");
            A0S4.append(syncDeviceAndResendMessageJob.A05());
            Log.w(A0S4.toString());
            AnonymousClass0ER r0 = syncDeviceAndResendMessageJob.A01;
            C007303n r2 = syncDeviceAndResendMessageJob.A07;
            synchronized (r0.A02) {
                r0.A02.remove(r2);
            }
        } else if (this instanceof SendWebForwardJob) {
        } else {
            if (this instanceof SendWebForwardJob.AckWebForwardJob) {
                SendWebForwardJob.AckWebForwardJob ackWebForwardJob = (SendWebForwardJob.AckWebForwardJob) this;
                String str2 = ackWebForwardJob.A04;
                if (str2 != null) {
                    AnonymousClass0JK A012 = ackWebForwardJob.A01.A01();
                    if (A012 == null) {
                        throw null;
                    } else if (!str2.equals(A012.A03)) {
                        StringBuilder A0S5 = AnonymousClass008.A0S("job/ackWebFwd/cancel/drop id=");
                        A0S5.append(ackWebForwardJob.A03);
                        A0S5.append("; oldRef=");
                        A0S5.append(str2);
                        A0S5.append("; currRef=");
                        AnonymousClass008.A1S(A0S5, ackWebForwardJob.A01.A01().A03);
                        return;
                    }
                }
                StringBuilder A0S6 = AnonymousClass008.A0S("job/ackWebFwd/cancel/retry id=");
                String str3 = ackWebForwardJob.A03;
                A0S6.append(str3);
                A0S6.append("; ref=");
                AnonymousClass008.A1S(A0S6, str2);
                AnonymousClass01J r22 = ackWebForwardJob.A00;
                r22.A00.A01(new SendWebForwardJob(str3, str2, ackWebForwardJob.A02));
            } else if (this instanceof SendStatusPrivacyListJob) {
                StringBuilder A0S7 = AnonymousClass008.A0S("canceled send status privacy job");
                A0S7.append(((SendStatusPrivacyListJob) this).A05());
                Log.w(A0S7.toString());
            } else if (this instanceof SendRetryReceiptJob) {
                StringBuilder A0S8 = AnonymousClass008.A0S("canceled sent read receipts job");
                A0S8.append(((SendRetryReceiptJob) this).A05());
                Log.w(A0S8.toString());
            } else if (this instanceof SendReadReceiptJob) {
                StringBuilder A0S9 = AnonymousClass008.A0S("canceled sent read receipts job");
                A0S9.append(((SendReadReceiptJob) this).A05());
                Log.w(A0S9.toString());
            } else if (this instanceof SendPlayedReceiptJob) {
                AnonymousClass008.A1V(AnonymousClass008.A0S("SendPlayedReceiptJob/canceled send played receipts job; id="), ((SendPlayedReceiptJob) this).messageId);
            } else if (this instanceof SendPermanentFailureReceiptJob) {
                StringBuilder A0S10 = AnonymousClass008.A0S("canceled send permananent-failure receipt job");
                A0S10.append(((SendPermanentFailureReceiptJob) this).A05());
                Log.w(A0S10.toString());
            } else if (this instanceof SendPeerMessageJob) {
                StringBuilder A0S11 = AnonymousClass008.A0S("SendPeerMessageJob/onCanceled/cancel send job");
                A0S11.append(((SendPeerMessageJob) this).A05());
                Log.w(A0S11.toString());
            } else if (this instanceof SendPaymentInviteOrSetupJob) {
                StringBuilder A0S12 = AnonymousClass008.A0S("canceled SendPaymentInviteOrSetupJob job");
                A0S12.append(((SendPaymentInviteOrSetupJob) this).A05());
                Log.w(A0S12.toString());
            } else if (this instanceof SendMediaErrorReceiptJob) {
                AnonymousClass008.A1V(AnonymousClass008.A0S("SendMediaErrorReceiptJob/canceled send played receipts job id="), ((SendMediaErrorReceiptJob) this).messageId);
            } else if (this instanceof SendLiveLocationKeyJob) {
                StringBuilder A0S13 = AnonymousClass008.A0S("canceled send live location key job");
                A0S13.append(((SendLiveLocationKeyJob) this).A05());
                Log.w(A0S13.toString());
            } else if (this instanceof SendFinalLiveLocationRetryJob) {
                StringBuilder A0S14 = AnonymousClass008.A0S("canceled send final live location retry job");
                A0S14.append(((SendFinalLiveLocationRetryJob) this).A05());
                Log.w(A0S14.toString());
            } else if (this instanceof SendFinalLiveLocationNotificationJob) {
                StringBuilder A0S15 = AnonymousClass008.A0S("canceled send final live location job");
                A0S15.append(((SendFinalLiveLocationNotificationJob) this).A05());
                Log.w(A0S15.toString());
            } else if (this instanceof SendE2EMessageJob) {
                SendE2EMessageJob sendE2EMessageJob = (SendE2EMessageJob) this;
                StringBuilder A0S16 = AnonymousClass008.A0S("sende2emessagejob/e2e send job canceled");
                A0S16.append(sendE2EMessageJob.A0B());
                Log.w(A0S16.toString());
                SendE2EMessageJob.A0N.remove(new C49742Rw(sendE2EMessageJob.jid, sendE2EMessageJob.id, sendE2EMessageJob.editVersion, sendE2EMessageJob.participant));
            } else if (this instanceof SendDisableLiveLocationJob) {
                StringBuilder A0S17 = AnonymousClass008.A0S("canceled disable live location job");
                A0S17.append(((SendDisableLiveLocationJob) this).A05());
                Log.w(A0S17.toString());
            } else if (this instanceof RotateSignedPreKeyJob) {
                StringBuilder A0S18 = AnonymousClass008.A0S("canceled rotate signed pre key job");
                A0S18.append(((RotateSignedPreKeyJob) this).A05());
                Log.w(A0S18.toString());
            } else if (this instanceof RehydrateTemplateJob) {
                StringBuilder A0S19 = AnonymousClass008.A0S("RehydrateTemplateJob/onCanceled/error canceled rehydrate hsm job, loggableParam=");
                A0S19.append(((RehydrateTemplateJob) this).A05());
                Log.w(A0S19.toString());
            } else if (this instanceof RehydrateHsmJob) {
                StringBuilder A0S20 = AnonymousClass008.A0S("RehydrateHsmJob/onCanceled/w: canceled rehydrate hsm job");
                A0S20.append(((RehydrateHsmJob) this).A05());
                Log.w(A0S20.toString());
            } else if (this instanceof ReceiptProcessingJob) {
                StringBuilder A0S21 = AnonymousClass008.A0S("ReceiptProcessingJob/onCanceled/cancel job param=");
                A0S21.append(((ReceiptProcessingJob) this).A05());
                Log.w(A0S21.toString());
            } else if (this instanceof ReceiptMultiTargetProcessingJob) {
                StringBuilder A0S22 = AnonymousClass008.A0S("ReceiptMultiTargetProcessingJob/onCanceled/cancel job param=");
                A0S22.append(((ReceiptMultiTargetProcessingJob) this).A05());
                Log.w(A0S22.toString());
            } else if (this instanceof GetVNameCertificateJob) {
                GetVNameCertificateJob getVNameCertificateJob = (GetVNameCertificateJob) this;
                StringBuilder A0S23 = AnonymousClass008.A0S("canceled get vname certificate job");
                A0S23.append(getVNameCertificateJob.A05());
                Log.w(A0S23.toString());
                GetVNameCertificateJob.A02.remove(getVNameCertificateJob.jid);
            } else if (this instanceof GetStatusPrivacyJob) {
                StringBuilder A0S24 = AnonymousClass008.A0S("canceled get status privacy job");
                A0S24.append(((GetStatusPrivacyJob) this).A05());
                Log.w(A0S24.toString());
            } else if (!(this instanceof GetHsmMessagePackJob)) {
                StringBuilder A0S25 = AnonymousClass008.A0S("canceled bulk get pre key job");
                A0S25.append(((BulkGetPreKeyJob) this).A05());
                Log.w(A0S25.toString());
            } else {
                GetHsmMessagePackJob getHsmMessagePackJob = (GetHsmMessagePackJob) this;
                StringBuilder A0S26 = AnonymousClass008.A0S("canceled get hsm message pack job");
                A0S26.append(getHsmMessagePackJob.A05());
                Log.w(A0S26.toString());
                HashSet hashSet = GetHsmMessagePackJob.A02;
                synchronized (hashSet) {
                    hashSet.remove(getHsmMessagePackJob);
                }
            }
        }
    }

    public void A01(long j) {
        if (!(this instanceof SendStatusPrivacyListJob)) {
            this.A01 = j;
            return;
        }
        SendStatusPrivacyListJob sendStatusPrivacyListJob = (SendStatusPrivacyListJob) this;
        ((Job) sendStatusPrivacyListJob).A01 = j;
        SendStatusPrivacyListJob.A02 = j;
        StringBuilder A0S = AnonymousClass008.A0S("set persistent id for send status privacy job");
        A0S.append(sendStatusPrivacyListJob.A05());
        Log.i(A0S.toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:194:0x0421  */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x03d4 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02() {
        /*
        // Method dump skipped, instructions count: 1199
        */
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.jobqueue.Job.A02():void");
    }

    public boolean A04() {
        for (Requirement requirement : this.parameters.requirements) {
            if (!requirement.ABQ()) {
                return false;
            }
        }
        return true;
    }
}
