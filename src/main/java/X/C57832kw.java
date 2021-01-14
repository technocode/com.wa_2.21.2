package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jobqueue.job.ReceiptProcessingJob;

/* renamed from: X.2kw  reason: invalid class name and case insensitive filesystem */
public final class C57832kw implements AnonymousClass2V1 {
    public final int A00;
    public final long A01;
    public final DeviceJid A02;
    public final Jid A03;
    public final AnonymousClass1XX A04;
    public final boolean A05;
    public final C007303n[] A06;

    public C57832kw(C007303n[] r1, Jid jid, DeviceJid deviceJid, int i, long j, AnonymousClass1XX r7, boolean z) {
        this.A06 = r1;
        this.A03 = jid;
        this.A02 = deviceJid;
        this.A00 = i;
        this.A01 = j;
        this.A04 = r7;
        this.A05 = z;
    }

    @Override // X.AnonymousClass2V1
    public boolean ABM() {
        return this.A05;
    }

    @Override // X.AnonymousClass2V1
    public C007303n ABi(int i) {
        return this.A06[i];
    }

    @Override // X.AnonymousClass2V1
    public DeviceJid ALw(int i) {
        return this.A02;
    }

    @Override // X.AnonymousClass2V1
    public Jid AMY() {
        return this.A03;
    }

    @Override // X.AnonymousClass2V1
    public void ANR(AnonymousClass01J r10, int i) {
        C007303n[] r2 = this.A06;
        int length = r2.length - i;
        C007303n[] r3 = new C007303n[length];
        System.arraycopy(r2, i, r3, 0, length);
        r10.A00.A01(new ReceiptProcessingJob(r3, this.A03, this.A02, this.A00, this.A01));
    }

    @Override // X.AnonymousClass2V1
    public AnonymousClass1XX AQ1() {
        return this.A04;
    }

    @Override // X.AnonymousClass2V1
    public int AQC() {
        return this.A00;
    }

    @Override // X.AnonymousClass2V1
    public long AQa(int i) {
        return this.A01;
    }

    @Override // X.AnonymousClass2V1
    public int size() {
        return this.A06.length;
    }
}
