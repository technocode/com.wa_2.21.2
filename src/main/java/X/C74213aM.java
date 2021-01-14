package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import java.util.List;

/* renamed from: X.3aM  reason: invalid class name and case insensitive filesystem */
public class C74213aM extends AnonymousClass3RI {
    public View A00;
    public List A01;
    public final AnonymousClass01X A02;
    public final AnonymousClass0D1 A03;
    public final C03570Gt A04;
    public final AnonymousClass33U A05;

    public C74213aM(C002701k r1, Context context, AnonymousClass01X r3, C03570Gt r4, LayoutInflater layoutInflater, AnonymousClass0D1 r6, AnonymousClass33U r7, int i) {
        super(r1, context, layoutInflater, i);
        this.A02 = r3;
        this.A04 = r4;
        this.A03 = r6;
        this.A05 = r7;
    }

    @Override // X.AnonymousClass3RI
    public void A03(View view) {
        View findViewById = view.findViewById(R.id.empty);
        this.A00 = findViewById;
        findViewById.setVisibility(4);
        ((TextView) view.findViewById(R.id.empty_text)).setText(this.A02.A06(R.string.sticker_picker_no_favorited_stickers));
    }

    @Override // X.AbstractC63942xG, X.AnonymousClass3RI
    public void AEw(ViewGroup viewGroup, int i, View view) {
        super.AEw(viewGroup, i, view);
        this.A00 = null;
    }
}
