package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import com.google.android.search.verification.client.R;
import java.util.List;

/* renamed from: X.3aJ  reason: invalid class name and case insensitive filesystem */
public class C74183aJ extends AnonymousClass3RI {
    public final AnonymousClass01X A00;
    public final AnonymousClass0D1 A01;
    public final AnonymousClass33U A02;
    public final C71953Qy A03;

    public C74183aJ(C002701k r1, Context context, LayoutInflater layoutInflater, AnonymousClass01X r4, AnonymousClass0D1 r5, AnonymousClass33U r6, C71953Qy r7, int i) {
        super(r1, context, layoutInflater, i);
        this.A00 = r4;
        this.A01 = r5;
        this.A02 = r6;
        this.A03 = r7;
    }

    @Override // X.AnonymousClass3RI
    public void A03(View view) {
        C02270Bi r1 = this.A03.A01;
        if (r1.A01() != null && !((List) r1.A01()).isEmpty()) {
            AnonymousClass0Q7.A0D(view, R.id.empty).setVisibility(8);
            view.findViewById(R.id.empty_text).setVisibility(8);
        }
    }
}
