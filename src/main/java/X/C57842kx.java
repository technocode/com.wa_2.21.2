package X;

import android.util.Pair;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jobqueue.job.ReceiptMultiTargetProcessingJob;
import java.util.List;

/* renamed from: X.2kx  reason: invalid class name and case insensitive filesystem */
public final class C57842kx implements AnonymousClass2V1 {
    public final int A00;
    public final Jid A01;
    public final C007303n A02;
    public final AnonymousClass1XX A03;
    public final List A04;
    public final boolean A05;

    public C57842kx(C007303n r1, Jid jid, int i, List list, AnonymousClass1XX r5, boolean z) {
        this.A02 = r1;
        this.A01 = jid;
        this.A00 = i;
        this.A04 = list;
        this.A03 = r5;
        this.A05 = z;
    }

    @Override // X.AnonymousClass2V1
    public boolean ABM() {
        return this.A05;
    }

    @Override // X.AnonymousClass2V1
    public C007303n ABi(int i) {
        return this.A02;
    }

    @Override // X.AnonymousClass2V1
    public DeviceJid ALw(int i) {
        return (DeviceJid) ((Pair) this.A04.get(i)).first;
    }

    @Override // X.AnonymousClass2V1
    public Jid AMY() {
        return this.A01;
    }

    @Override // X.AnonymousClass2V1
    public void ANR(AnonymousClass01J r6, int i) {
        List list = this.A04;
        r6.A00.A01(new ReceiptMultiTargetProcessingJob(this.A02, this.A01, this.A00, list.subList(i, list.size())));
    }

    @Override // X.AnonymousClass2V1
    public AnonymousClass1XX AQ1() {
        return this.A03;
    }

    @Override // X.AnonymousClass2V1
    public int AQC() {
        return this.A00;
    }

    @Override // X.AnonymousClass2V1
    public long AQa(int i) {
        return ((Number) ((Pair) this.A04.get(i)).second).longValue();
    }

    @Override // X.AnonymousClass2V1
    public int size() {
        return this.A04.size();
    }
}
