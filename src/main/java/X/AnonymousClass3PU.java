package X;

import android.widget.Toast;
import com.google.android.search.verification.client.R;

/* renamed from: X.3PU  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3PU implements AnonymousClass37J {
    public final /* synthetic */ C71493Pe A00;

    public /* synthetic */ AnonymousClass3PU(C71493Pe r1) {
        this.A00 = r1;
    }

    @Override // X.AnonymousClass37J
    public final void AFe(String str, boolean z) {
        C71493Pe r4 = this.A00;
        AbstractC71663Pv r3 = ((AnonymousClass32V) r4).A05.A00;
        if (r3.A05) {
            if (str == null) {
                ((AnonymousClass32V) r4).A01.A06(R.string.error_load_video, 0);
            } else {
                Toast A01 = ((AnonymousClass32V) r4).A01.A01(str, 0);
                A01.setGravity(17, 0, 0);
                A01.show();
            }
        }
        if (!z) {
            r4.A0E();
            r4.A0G();
            r4.A0A();
            AnonymousClass3PV r1 = new AnonymousClass3PV(r4.A0G);
            r4.A02 = r1;
            if (r3.A05) {
                r1.A07();
            }
        }
    }
}
