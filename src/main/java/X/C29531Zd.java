package X;

import android.content.Context;
import android.view.View;
import com.google.android.search.verification.client.R;

/* renamed from: X.1Zd  reason: invalid class name and case insensitive filesystem */
public class C29531Zd extends C13060jX {
    public final /* synthetic */ AnonymousClass23R A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C29531Zd(AnonymousClass23R r10, Context context, AnonymousClass0T8 r12, View view) {
        super(context, r12, view, true, R.attr.actionOverflowMenuStyle, 0);
        this.A00 = r10;
        super.A00 = 8388613;
        C29541Ze r1 = r10.A0G;
        this.A04 = r1;
        AnonymousClass1ZX r0 = this.A03;
        if (r0 != null) {
            r0.AO1(r1);
        }
    }

    @Override // X.C13060jX
    public void A02() {
        AnonymousClass23R r2 = this.A00;
        AnonymousClass0T8 r1 = ((AnonymousClass1ZO) r2).A05;
        if (r1 != null) {
            r1.A0F(true);
        }
        r2.A09 = null;
        super.A02();
    }
}
