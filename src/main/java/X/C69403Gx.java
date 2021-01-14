package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.search.verification.client.R;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/* renamed from: X.3Gx  reason: invalid class name and case insensitive filesystem */
public class C69403Gx extends AbstractC16300pa implements AnonymousClass1O2 {
    public Context A00;
    public List A01 = new ArrayList();
    public List A02 = new ArrayList();

    public C69403Gx(Context context) {
        this.A00 = context;
    }

    @Override // X.AbstractC16300pa
    public int A05() {
        return this.A02.size();
    }

    @Override // X.AbstractC16300pa
    public AbstractC11910hD A06(ViewGroup viewGroup, int i) {
        return new AnonymousClass3YW(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.payout_history_row_item, viewGroup, false));
    }

    @Override // X.AbstractC16300pa
    public void A07(AbstractC11910hD r3, int i) {
        AnonymousClass3YW r32 = (AnonymousClass3YW) r3;
        r32.A0C((AbstractC63232w5) this.A02.get(i), i);
        if (!((C69553Hm) this.A02.get(i)).A02) {
            r32.A00.setVisibility(8);
        }
    }

    @Override // X.AnonymousClass1O2
    public int A5V(int i) {
        return ((C63222w4) this.A01.get(i)).count;
    }

    @Override // X.AnonymousClass1O2
    public int A6d() {
        return this.A01.size();
    }

    @Override // X.AnonymousClass1O2
    public long A6e(int i) {
        return -((Calendar) this.A01.get(i)).getTimeInMillis();
    }

    @Override // X.AnonymousClass1O2
    public void ADX(AbstractC11910hD r3, int i) {
        ((C69393Gw) r3).A00.setText(this.A01.get(i).toString());
    }

    @Override // X.AnonymousClass1O2
    public AbstractC11910hD AEj(ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(this.A00).inflate(R.layout.transaction_history_section_row, viewGroup, false);
        inflate.setClickable(false);
        inflate.setBackgroundColor(C004302a.A00(this.A00, R.color.primary_surface));
        return new C69393Gw(inflate);
    }

    @Override // X.AnonymousClass1O2
    public boolean AKa(AbstractC11910hD r2, int i, MotionEvent motionEvent) {
        return false;
    }
}
