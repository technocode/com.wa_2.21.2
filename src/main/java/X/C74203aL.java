package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape8S0100000_I1_6;
import com.google.android.search.verification.client.R;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.3aL  reason: invalid class name and case insensitive filesystem */
public class C74203aL extends AnonymousClass3RI {
    public View A00;
    public TextView A01;
    public TextView A02;
    public AnonymousClass3QG A03;
    public List A04;
    public boolean A05;
    public final AnonymousClass01X A06;
    public final C04230Jo A07;
    public final AnonymousClass0D1 A08;
    public final AnonymousClass33U A09;
    public final AnonymousClass3R6 A0A;

    public C74203aL(C002701k r1, Context context, LayoutInflater layoutInflater, C04230Jo r4, AnonymousClass01X r5, AnonymousClass3R6 r6, AnonymousClass0D1 r7, AnonymousClass33U r8, int i) {
        super(r1, context, layoutInflater, i);
        this.A07 = r4;
        this.A06 = r5;
        this.A0A = r6;
        this.A08 = r7;
        this.A09 = r8;
    }

    @Override // X.AnonymousClass3RI
    public void A03(View view) {
        View findViewById = view.findViewById(R.id.empty);
        this.A00 = findViewById;
        findViewById.setVisibility(4);
        TextView textView = (TextView) view.findViewById(R.id.get_stickers_button);
        this.A01 = textView;
        textView.setOnClickListener(new ViewOnClickEBaseShape8S0100000_I1_6(this, 45));
        this.A02 = (TextView) view.findViewById(R.id.empty_text);
        C002301g.A03(this.A01);
    }

    @Override // X.AbstractC63942xG, X.AnonymousClass3RI
    public void AEw(ViewGroup viewGroup, int i, View view) {
        super.AEw(viewGroup, i, view);
        AnonymousClass3QG r8 = this.A03;
        List<C29241Xq> list = null;
        if (r8 != null) {
            r8.A03 = null;
            if (0 != 0) {
                for (C29241Xq r5 : list) {
                    HashMap hashMap = r8.A0A;
                    if (hashMap.get(r5.A0A) == null) {
                        long j = r8.A01;
                        r8.A01 = 1 + j;
                        hashMap.put(r5.A0A, Long.valueOf(j));
                    }
                }
            }
        }
        this.A00 = null;
    }
}
