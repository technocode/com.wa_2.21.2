package com.whatsapp.jobqueue.requirement;

import X.AnonymousClass008;
import X.AnonymousClass01N;
import X.AnonymousClass02N;
import X.AnonymousClass02Y;
import X.AnonymousClass0EA;
import X.AnonymousClass0I8;
import X.AnonymousClass1VY;
import X.C001000o;
import android.content.Context;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.whispersystems.jobqueue.requirements.Requirement;

public class AxolotlMultiDeviceSessionRequirement implements AnonymousClass0EA, Requirement {
    public transient int A00 = 100;
    public transient C001000o A01;
    public transient AnonymousClass01N A02;
    public transient AnonymousClass0I8 A03;
    public transient AnonymousClass02N A04;
    public transient Object A05 = new Object();
    public transient Collection A06;
    public transient List A07;
    public transient boolean A08;
    public volatile transient int A09;
    public final String messageKeyId;
    public final String remoteRawJid;
    public final HashSet targetDeviceRawJids;

    public AxolotlMultiDeviceSessionRequirement(String str, AnonymousClass02N r3, Set set) {
        this.messageKeyId = str;
        this.A04 = r3;
        this.remoteRawJid = r3.getRawString();
        HashSet hashSet = new HashSet();
        AnonymousClass1VY.A0P(set, hashSet);
        this.targetDeviceRawJids = hashSet;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0014, code lost:
        if (r1 != false) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List A00() {
        /*
        // Method dump skipped, instructions count: 162
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.requirement.AxolotlMultiDeviceSessionRequirement.A00():java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x009e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x009f, code lost:
        if (r9 != null) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a4, code lost:
        throw r0;
     */
    @Override // org.whispersystems.jobqueue.requirements.Requirement
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean ABQ() {
        /*
        // Method dump skipped, instructions count: 166
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.requirement.AxolotlMultiDeviceSessionRequirement.ABQ():boolean");
    }

    @Override // X.AnonymousClass0EA
    public void AO7(Context context) {
        this.A01 = C001000o.A00();
        this.A02 = AnonymousClass01N.A00();
        AnonymousClass0I8 A012 = AnonymousClass0I8.A01();
        this.A03 = A012;
        A012.A00.put(this, new Object());
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        try {
            this.A04 = AnonymousClass02N.A00(this.remoteRawJid);
            this.A00 = 100;
            this.A05 = new Object();
        } catch (AnonymousClass02Y unused) {
            StringBuilder A0S = AnonymousClass008.A0S("invalid jid=");
            A0S.append(this.remoteRawJid);
            throw new InvalidObjectException(A0S.toString());
        }
    }
}
