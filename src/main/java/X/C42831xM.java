package X;

import android.view.View;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;

/* renamed from: X.1xM  reason: invalid class name and case insensitive filesystem */
public final class C42831xM implements AbstractC27901Sb {
    public final C11930hF A00;

    public C42831xM(AnonymousClass0HJ r8, C014308b r9, AnonymousClass01X r10, AnonymousClass31y r11, View view) {
        r8.A05((ImageView) view.findViewById(R.id.contactpicker_row_photo), R.drawable.avatar_contact);
        C11930hF r1 = new C11930hF(view, R.id.contactpicker_row_name, r9, r10, r11);
        this.A00 = r1;
        C002301g.A03(r1.A00);
    }

    @Override // X.AbstractC27901Sb
    public void ADY(AbstractC27921Sd r3) {
        this.A00.A00.setText(((C42891xS) r3).A00);
    }
}
