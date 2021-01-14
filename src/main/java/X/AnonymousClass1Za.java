package X;

import android.content.Context;
import android.view.View;
import com.google.android.search.verification.client.R;

/* renamed from: X.1Za  reason: invalid class name */
public class AnonymousClass1Za extends C13060jX {
    public final /* synthetic */ AnonymousClass23R A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1Za(AnonymousClass23R r10, Context context, AnonymousClass0TY r12, View view) {
        super(context, r12, view, false, R.attr.actionOverflowMenuStyle, 0);
        this.A00 = r10;
        if ((r12.A01.A02 & 32) != 32) {
            View view2 = r10.A08;
            this.A01 = view2 == null ? (View) ((AnonymousClass1ZO) r10).A07 : view2;
        }
        C29541Ze r1 = r10.A0G;
        this.A04 = r1;
        AnonymousClass1ZX r0 = this.A03;
        if (r0 != null) {
            r0.AO1(r1);
        }
    }

    @Override // X.C13060jX
    public void A02() {
        AnonymousClass23R r1 = this.A00;
        r1.A06 = null;
        r1.A03 = 0;
        super.A02();
    }
}
