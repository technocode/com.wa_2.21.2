package X;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.ViewOnClickCListenerShape13S0100000_I1_2;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3In  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC69803In implements AbstractC63942xG {
    public Activity A00;
    public LayoutInflater A01;
    public View A02;
    public View A03;
    public View A04;
    public TextView A05;
    public AbstractC16300pa A06;
    public RecyclerView A07;
    public AnonymousClass01X A08;
    public AbstractC49292Px A09;

    public AbstractC69803In(Activity activity, LayoutInflater layoutInflater, AnonymousClass01X r3, AbstractC49292Px r4) {
        this.A00 = activity;
        this.A01 = layoutInflater;
        this.A08 = r3;
        this.A09 = r4;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v6, resolved type: X.2f0 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v8, resolved type: X.2oT */
    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC16300pa A00() {
        C59912oU r2;
        AbstractC16300pa r22 = this.A06;
        C59912oU r23 = r22;
        if (r22 == null) {
            if (this instanceof AnonymousClass3Z4) {
                AnonymousClass3Z4 r0 = (AnonymousClass3Z4) this;
                C59912oU r24 = new C59912oU(new ArrayList(), r0.A04, r0.A0A, r0.A05, r0.A03, r0.A01, r0.A08, ((AbstractC69803In) r0).A09, r0.A02, ((AbstractC69803In) r0).A08, r0.A09, r0.A00.getResources().getDimensionPixelSize(R.dimen.gif_trend_preview_size));
                C69753Ih r1 = new C69753Ih(r0);
                r24.A00 = r1;
                boolean isEmpty = r24.A02.isEmpty();
                r2 = r24;
                if (!isEmpty) {
                    r1.ALV(true);
                    r2 = r24;
                }
            } else if (!(this instanceof AnonymousClass3Z3)) {
                C59892oS r02 = (C59892oS) this;
                C59902oT r25 = new C59902oT(new ArrayList(), r02.A01, r02.A06, r02.A09, r02.A00.getResources().getDimensionPixelSize(R.dimen.gif_trend_preview_size));
                C54332ek r12 = new C54332ek(r02);
                r25.A00 = r12;
                boolean isEmpty2 = r25.A02.isEmpty();
                r2 = r25;
                if (!isEmpty2) {
                    r12.ALV(true);
                    r2 = r25;
                }
            } else {
                AnonymousClass3Z3 r03 = (AnonymousClass3Z3) this;
                C54492f0 r26 = new C54492f0(r03.A03, r03.A02, r03.A00, r03.A01, r03.A08, r03.A09, r03.A04, ((AbstractC69803In) r03).A00.getResources().getDimensionPixelSize(R.dimen.gif_trend_preview_size));
                r26.A00 = new C69743Ig(r03);
                r2 = r26;
            }
            this.A06 = r2;
            r23 = r2;
        }
        return r23;
    }

    public void A01() {
        AbstractC49192Pj r0;
        AnonymousClass2Q1 A022;
        AbstractC49192Pj r02;
        if (this instanceof AnonymousClass3Z4) {
            C59912oU r4 = (C59912oU) A00();
            C10400eZ r03 = r4.A01;
            if (r03 != null) {
                ((AnonymousClass0JW) r03).A00.cancel(true);
            }
            r4.A01 = new C10400eZ(r4.A09, r4.A0B, r4);
            if (!r4.A02.isEmpty() && (r0 = r4.A00) != null) {
                r0.ALV(true);
            }
            r4.A0D.ANC(r4.A01, new Void[0]);
        } else if (!(this instanceof AnonymousClass3Z3)) {
            C59892oS r04 = (C59892oS) this;
            C59902oT r42 = (C59902oT) r04.A00();
            C03400Ga r3 = r04.A02;
            AnonymousClass0Gb r2 = r04.A05;
            C10410ea r05 = r42.A01;
            if (r05 != null) {
                ((AnonymousClass0JW) r05).A00.cancel(true);
            }
            r42.A01 = new C10410ea(r3, r2, r42);
            if (!r42.A02.isEmpty() && (r02 = r42.A00) != null) {
                r02.ALV(true);
            }
            r42.A06.ANC(r42.A01, new Void[0]);
        } else {
            AnonymousClass3Z3 r1 = (AnonymousClass3Z3) this;
            C54492f0 r32 = (C54492f0) r1.A00();
            if (!(r1 instanceof C74843bd)) {
                A022 = ((C74833bc) r1).A00.A01();
            } else {
                C74843bd r12 = (C74843bd) r1;
                A022 = r12.A00.A02(r12.A01, true);
            }
            r32.A09(A022);
        }
    }

    @Override // X.AbstractC63942xG
    public void A1s(AbstractC16450pp r2) {
        this.A07.A0l(r2);
    }

    @Override // X.AbstractC63942xG
    public View AEg(ViewGroup viewGroup, int i) {
        int i2;
        View inflate = this.A01.inflate(R.layout.gif_picker_page, viewGroup, false);
        this.A07 = (RecyclerView) inflate.findViewById(R.id.gif_grid);
        this.A02 = inflate.findViewById(R.id.progress_container);
        this.A05 = (TextView) inflate.findViewById(R.id.no_results);
        this.A04 = inflate.findViewById(R.id.retry_panel);
        this.A03 = inflate.findViewById(R.id.retry_button);
        TextView textView = this.A05;
        AnonymousClass01X r2 = this.A08;
        if (this instanceof AnonymousClass3Z4) {
            i2 = R.string.no_favorited_gifs;
        } else if (!(this instanceof C59892oS)) {
            i2 = R.string.gif_search_no_results;
        } else {
            i2 = R.string.no_recent_gifs;
        }
        textView.setText(r2.A06(i2));
        int dimensionPixelSize = this.A00.getResources().getDimensionPixelSize(R.dimen.selected_contacts_top_offset);
        RecyclerView recyclerView = this.A07;
        recyclerView.A0i = true;
        recyclerView.A0j(new C69783Il(dimensionPixelSize));
        GridLayoutManager gridLayoutManager = new GridLayoutManager(2);
        gridLayoutManager.A01 = new C69793Im(this, gridLayoutManager);
        this.A07.setLayoutManager(gridLayoutManager);
        this.A02.setVisibility(0);
        this.A05.setVisibility(8);
        this.A03.setOnClickListener(new ViewOnClickCListenerShape13S0100000_I1_2(this, 36));
        this.A07.setAdapter(A00());
        A01();
        return inflate;
    }

    @Override // X.AbstractC63942xG
    public void AEw(ViewGroup viewGroup, int i, View view) {
        if (this instanceof AnonymousClass3Z4) {
            AnonymousClass3Z4 r2 = (AnonymousClass3Z4) this;
            ((AbstractC69803In) r2).A07 = null;
            ((AbstractC69803In) r2).A02 = null;
            ((AbstractC69803In) r2).A05 = null;
            ((AbstractC69803In) r2).A03 = null;
            ((AbstractC69803In) r2).A04 = null;
            r2.A07.A00(r2.A06);
        } else if (!(this instanceof C59892oS)) {
            this.A07 = null;
            this.A02 = null;
            this.A05 = null;
            this.A03 = null;
            this.A04 = null;
        } else {
            C59892oS r22 = (C59892oS) this;
            r22.A07 = null;
            ((AbstractC69803In) r22).A02 = null;
            ((AbstractC69803In) r22).A05 = null;
            ((AbstractC69803In) r22).A03 = null;
            ((AbstractC69803In) r22).A04 = null;
            r22.A04.A00(r22.A03);
        }
    }

    @Override // X.AbstractC63942xG
    public void AMh(AbstractC16450pp r2) {
        List list = this.A07.A0b;
        if (list != null) {
            list.remove(r2);
        }
    }
}
