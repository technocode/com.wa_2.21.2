package X;

import android.view.View;

/* renamed from: X.2Wd  reason: invalid class name and case insensitive filesystem */
public class View$OnClickListenerC50812Wd extends AbstractC11910hD implements View.OnClickListener, View.OnLongClickListener {
    public final C60522pc A00;
    public final /* synthetic */ C50822We A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public View$OnClickListenerC50812Wd(C50822We r2, C60522pc r3) {
        super(r3);
        this.A01 = r2;
        this.A00 = r3;
        r3.setOnClickListener(this);
        this.A00.setOnLongClickListener(this);
    }

    public void onClick(View view) {
        C50822We r1 = this.A01;
        if (r1.A00 != null) {
            AnonymousClass0YW r3 = r1.A03;
            if (!r3.A0N.ABT() && !r3.A0o.hasMessages(0)) {
                if (r3.A1O.isEmpty()) {
                    C60522pc r12 = this.A00;
                    r3.A0G(r12.A04, r12, false);
                    return;
                }
                AnonymousClass0YW.A00(r3, this.A00.A04);
            }
        }
    }

    public boolean onLongClick(View view) {
        C50822We r1 = this.A01;
        if (r1.A00 == null) {
            return true;
        }
        AnonymousClass0YW r2 = r1.A03;
        if (r2.A0N.ABT() || r2.A0o.hasMessages(0)) {
            return true;
        }
        AnonymousClass0YW.A00(r2, this.A00.A04);
        return true;
    }
}
