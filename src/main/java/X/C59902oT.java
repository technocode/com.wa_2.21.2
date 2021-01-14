package X;

import android.view.ViewGroup;
import android.widget.ImageView;
import com.whatsapp.util.ViewOnClickCListenerShape4S0200000_I1;
import java.util.List;

/* renamed from: X.2oT  reason: invalid class name and case insensitive filesystem */
public class C59902oT extends AbstractC54572f8 {
    public AbstractC49192Pj A00;
    public C10410ea A01;
    public List A02;
    public final int A03;
    public final AnonymousClass0Eg A04;
    public final AbstractC49292Px A05;
    public final AnonymousClass00T A06;

    public C59902oT(List list, AnonymousClass0Eg r2, AnonymousClass00T r3, AbstractC49292Px r4, int i) {
        this.A02 = list;
        this.A04 = r2;
        this.A05 = r4;
        this.A06 = r3;
        this.A03 = i;
    }

    @Override // X.AbstractC16300pa
    public int A05() {
        return this.A02.size();
    }

    @Override // X.AbstractC16300pa
    public AbstractC11910hD A06(ViewGroup viewGroup, int i) {
        return new TextureView$SurfaceTextureListenerC60532pe(viewGroup, this.A04, this.A03);
    }

    @Override // X.AbstractC16300pa
    public void A07(AbstractC11910hD r5, int i) {
        TextureView$SurfaceTextureListenerC60532pe r52 = (TextureView$SurfaceTextureListenerC60532pe) r5;
        super.A08(r52);
        if (!this.A02.isEmpty() && i < this.A02.size()) {
            C49232Po r1 = (C49232Po) this.A02.get(i);
            r52.A0G(r1);
            View$OnLongClickListenerC49102Pa r0 = new View$OnLongClickListenerC49102Pa(r1);
            ImageView imageView = r52.A0B;
            imageView.setOnLongClickListener(r0);
            imageView.setOnClickListener(new ViewOnClickCListenerShape4S0200000_I1(r52, this.A05, 29));
        }
    }
}
