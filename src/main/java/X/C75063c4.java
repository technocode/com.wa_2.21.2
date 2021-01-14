package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import com.google.android.search.verification.client.R;

/* renamed from: X.3c4  reason: invalid class name and case insensitive filesystem */
public class C75063c4 extends C74223aN {
    public View A00;
    public View A01;
    public boolean A02;

    public C75063c4(C002701k r1, Context context, LayoutInflater layoutInflater, AnonymousClass01X r4, C03570Gt r5, AnonymousClass0D1 r6, AnonymousClass33U r7, int i, AnonymousClass33N r9) {
        super(r1, context, layoutInflater, r4, r5, r6, r7, i, r9);
    }

    @Override // X.C74223aN, X.AnonymousClass3RI
    public void A03(View view) {
        super.A03(view);
        this.A00 = view.findViewById(R.id.empty);
        this.A01 = view.findViewById(R.id.more_info_button);
        View view2 = ((C74223aN) this).A01;
        if (view2 != null) {
            view2.setVisibility(8);
        }
    }
}
