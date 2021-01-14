package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.ViewOnClickEBaseShape6S0100000_I1_4;
import com.google.android.search.verification.client.R;

/* renamed from: X.2ez  reason: invalid class name and case insensitive filesystem */
public class C54482ez implements AbstractC63962xI {
    public int A00;
    public LayoutInflater A01;
    public View A02 = this.A06.findViewById(R.id.gif_recents_icon);
    public View A03 = this.A06.findViewById(R.id.gif_recent_marker);
    public View A04;
    public View A05;
    public ViewGroup A06;
    public LinearLayoutManager A07;
    public RecyclerView A08;
    public C54462ex A09;
    public AbstractC63952xH A0A;

    public C54482ez(LayoutInflater layoutInflater, View view, AbstractC69803In[] r6) {
        this.A01 = layoutInflater;
        this.A08 = (RecyclerView) view.findViewById(R.id.gif_category_recycler);
        this.A06 = (ViewGroup) view.findViewById(R.id.gif_picker_header);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1);
        this.A07 = linearLayoutManager;
        linearLayoutManager.A1A(0);
        this.A08.setLayoutManager(this.A07);
        C54462ex r1 = new C54462ex(this, r6);
        this.A09 = r1;
        this.A08.setAdapter(r1);
        this.A02.setOnClickListener(new ViewOnClickEBaseShape6S0100000_I1_4(this, 14));
        this.A04 = this.A06.findViewById(R.id.gif_favorites_icon);
        this.A05 = this.A06.findViewById(R.id.gif_favorites_marker);
        this.A04.setOnClickListener(new ViewOnClickEBaseShape6S0100000_I1_4(this, 15));
    }

    public static final void A00(boolean z, View view) {
        int i;
        if (z) {
            i = C004302a.A00(view.getContext(), R.color.picker_underline_color);
        } else {
            i = 0;
        }
        view.setBackgroundColor(i);
    }

    @Override // X.AbstractC63962xI
    public View A9i() {
        return this.A06;
    }

    @Override // X.AbstractC63962xI
    public void AIH(int i) {
        this.A00 = i;
        this.A07.A0M(i);
        boolean z = false;
        boolean z2 = true;
        if (i != 0) {
            z2 = false;
            if (i == 1) {
                z = true;
            }
        }
        this.A02.setSelected(z2);
        A00(z2, this.A03);
        this.A04.setSelected(z);
        A00(z, this.A05);
        C54462ex r0 = this.A09;
        if (r0 != null) {
            ((AbstractC16300pa) r0).A01.A00();
        }
    }

    @Override // X.AbstractC63962xI
    public void AO6(AbstractC63952xH r2) {
        this.A0A = r2;
        AIH(r2.A00());
    }
}
