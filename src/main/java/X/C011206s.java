package X;

import com.google.android.search.verification.client.R;

/* renamed from: X.06s  reason: invalid class name and case insensitive filesystem */
public class C011206s {
    public final C010306i A00;
    public final C011106q A01;

    public C011206s(C011106q r3) {
        this.A01 = r3;
        this.A00 = (C010306i) r3.A00.get(R.id.bloks_interpreter_callback);
    }

    public void A00(AbstractC009505y r3, C010106g r4) {
        try {
            C010306i r1 = this.A00;
            if (r1 != null) {
                r1.A01();
            }
            C008805h.A0Q(r3, r4, this.A01);
            if (r1 != null) {
                r1.A00();
            }
        } catch (Throwable th) {
            C010306i r0 = this.A00;
            if (r0 != null) {
                r0.A00();
            }
            throw th;
        }
    }
}
