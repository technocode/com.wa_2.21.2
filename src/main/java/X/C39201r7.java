package X;

import android.view.View;
import com.whatsapp.util.Log;

/* renamed from: X.1r7  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C39201r7 implements AbstractC02370Bs {
    public final /* synthetic */ C27131Oe A00;

    public /* synthetic */ C39201r7(C27131Oe r1) {
        this.A00 = r1;
    }

    @Override // X.AbstractC02370Bs
    public final void ADV(AnonymousClass0AW r8) {
        View view;
        View view2;
        C27131Oe r6 = this.A00;
        double A002 = r8.A00();
        StringBuilder sb = new StringBuilder("voicenoterecordingui/onevent/battery change percentage: ");
        sb.append(A002);
        Log.i(sb.toString());
        int i = (A002 > 16.0d ? 1 : (A002 == 16.0d ? 0 : -1));
        View view3 = r6.A0H;
        if (i >= 0) {
            if ((view3 == null || !view3.getKeepScreenOn()) && (view2 = r6.A0H) != null && !view2.getKeepScreenOn()) {
                r6.A0H.setKeepScreenOn(true);
            }
        } else if (view3 != null && view3.getKeepScreenOn() && (view = r6.A0H) != null && view.getKeepScreenOn()) {
            r6.A0H.setKeepScreenOn(false);
        }
    }
}
