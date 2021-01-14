package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.search.verification.client.R;
import java.util.List;

/* renamed from: X.3aK  reason: invalid class name and case insensitive filesystem */
public class C74193aK extends AnonymousClass3RI {
    public View A00;
    public List A01;
    public final int A02;
    public final AnonymousClass01X A03;
    public final AnonymousClass0D1 A04;
    public final AnonymousClass33U A05;

    public C74193aK(int i, C002701k r2, Context context, LayoutInflater layoutInflater, AnonymousClass01X r5, AnonymousClass0D1 r6, AnonymousClass33U r7, int i2) {
        super(r2, context, layoutInflater, i2);
        this.A05 = r7;
        this.A04 = r6;
        this.A03 = r5;
        this.A02 = i;
    }

    @Override // X.AnonymousClass3RI
    public void A03(View view) {
        this.A00 = view.findViewById(R.id.empty);
    }

    @Override // X.AbstractC63942xG, X.AnonymousClass3RI
    public void AEw(ViewGroup viewGroup, int i, View view) {
        super.AEw(viewGroup, i, view);
        this.A00 = null;
    }
}
