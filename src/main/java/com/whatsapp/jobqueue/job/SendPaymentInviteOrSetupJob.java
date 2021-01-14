package com.whatsapp.jobqueue.job;

import X.AnonymousClass008;
import X.AnonymousClass09H;
import X.AnonymousClass0EA;
import X.AnonymousClass0I1;
import X.AnonymousClass1XX;
import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import org.whispersystems.jobqueue.Job;

public class SendPaymentInviteOrSetupJob extends Job implements AnonymousClass0EA {
    public static final long serialVersionUID = 1;
    public transient AnonymousClass09H A00;
    public final boolean invite;
    public final String jidRawStr;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SendPaymentInviteOrSetupJob(com.whatsapp.jid.UserJid r5, boolean r6) {
        /*
            r4 = this;
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
            r2 = 1
            com.whatsapp.jobqueue.requirement.ChatConnectionRequirement r0 = new com.whatsapp.jobqueue.requirement.ChatConnectionRequirement
            r0.<init>()
            r3.add(r0)
            java.lang.String r1 = "SendPaymentInviteOrSetupJob"
            org.whispersystems.jobqueue.JobParameters r0 = new org.whispersystems.jobqueue.JobParameters
            r0.<init>(r3, r2, r1)
            r4.<init>(r0)
            java.lang.String r0 = r5.getRawString()
            r4.jidRawStr = r0
            r4.invite = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.SendPaymentInviteOrSetupJob.<init>(com.whatsapp.jid.UserJid, boolean):void");
    }

    @Override // org.whispersystems.jobqueue.Job
    public void A03() {
        String str;
        ArrayList arrayList;
        StringBuilder A0S = AnonymousClass008.A0S("PAY: starting SendPaymentInviteOrSetupJob job");
        A0S.append(A05());
        Log.i(A0S.toString());
        String A03 = this.A00.A03();
        HashMap hashMap = new HashMap();
        UserJid nullable = UserJid.getNullable(this.jidRawStr);
        if (this.invite) {
            str = "upi-intent-to-send";
        } else {
            str = "upi-user-set-up";
        }
        if (hashMap.isEmpty()) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(hashMap.values());
        }
        AnonymousClass1XX r2 = new AnonymousClass1XX(nullable, "notification", A03, str, null, null, null, null, 0, arrayList);
        Message obtain = Message.obtain(null, 0, 170, 0);
        Bundle data = obtain.getData();
        data.putString("id", A03);
        data.putParcelable("jid", UserJid.getNullable(this.jidRawStr));
        data.putBoolean("invite", this.invite);
        ((AnonymousClass0I1) this.A00.A04(r2, obtain)).get();
        StringBuilder sb = new StringBuilder("PAY: done SendPaymentInviteOrSetupJob job");
        sb.append(A05());
        Log.i(sb.toString());
    }

    public final String A05() {
        StringBuilder A0S = AnonymousClass008.A0S("; jid=");
        A0S.append(this.jidRawStr);
        A0S.append("; invite: ");
        A0S.append(this.invite);
        A0S.append("; persistentId=");
        A0S.append(this.A01);
        return A0S.toString();
    }

    @Override // X.AnonymousClass0EA
    public void AO7(Context context) {
        this.A00 = AnonymousClass09H.A01();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        if (TextUtils.isEmpty(this.jidRawStr)) {
            throw new InvalidObjectException("jid must not be empty");
        }
    }
}
