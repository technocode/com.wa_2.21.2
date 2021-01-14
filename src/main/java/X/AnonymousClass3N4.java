package X;

import com.whatsapp.util.Log;

/* renamed from: X.3N4  reason: invalid class name */
public class AnonymousClass3N4 implements AbstractC655430e {
    public final AnonymousClass0P8 A00;

    @Override // X.AbstractC655430e
    public int A7U() {
        return 15;
    }

    public AnonymousClass3N4(AnonymousClass0P8 r1) {
        this.A00 = r1;
    }

    @Override // X.AbstractC655430e
    public void A2z() {
        AnonymousClass0P8 r4 = this.A00;
        if (r4 != null) {
            Log.d("SchExpWorkers/consistency_check;");
            AnonymousClass0P4 r3 = r4.A01;
            if (r3.A01() == 7) {
                C17670rx A01 = r4.A01();
                if (A01 == null) {
                    Log.d("SchExpWorkers/consistency_check; not scheduled, rescheduling...");
                    r4.A02();
                    return;
                }
                if (!A01.A04.contains(Long.toString(r3.A02()))) {
                    Log.d("SchExpWorkers/consistency_check; inconsistent period, rescheduling...");
                    Log.d("SchExpWorkers/cancel;");
                    r4.A00.A01("com.whatsapp.schedulers.work.PERIODIC");
                    r4.A02();
                    return;
                }
                return;
            }
            return;
        }
        throw null;
    }

    @Override // X.AbstractC655430e
    public boolean ABV() {
        C17670rx A01 = this.A00.A01();
        if (A01 == null) {
            return false;
        }
        return !A01.A03.A00();
    }

    @Override // X.AbstractC655430e
    public void ANP() {
        this.A00.A02();
    }

    @Override // X.AbstractC655430e
    public void cancel() {
        AnonymousClass0P8 r1 = this.A00;
        Log.d("SchExpWorkers/cancel;");
        r1.A00.A01("com.whatsapp.schedulers.work.PERIODIC");
    }
}
