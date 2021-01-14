package X;

import android.view.ViewGroup;
import android.widget.ImageView;
import com.whatsapp.util.ViewOnClickCListenerShape4S0200000_I1;
import java.util.List;

/* renamed from: X.2oU  reason: invalid class name and case insensitive filesystem */
public class C59912oU extends AbstractC54572f8 {
    public AbstractC49192Pj A00;
    public C10400eZ A01;
    public List A02;
    public final int A03;
    public final C000300f A04;
    public final AnonymousClass03P A05;
    public final AnonymousClass01X A06;
    public final AnonymousClass00Y A07;
    public final AnonymousClass0Eg A08;
    public final C03400Ga A09;
    public final AbstractC49292Px A0A;
    public final C03460Gi A0B;
    public final AnonymousClass022 A0C;
    public final AnonymousClass00T A0D;

    public C59912oU(List list, AnonymousClass0Eg r2, AnonymousClass00T r3, C03400Ga r4, AnonymousClass00Y r5, C000300f r6, C03460Gi r7, AbstractC49292Px r8, AnonymousClass03P r9, AnonymousClass01X r10, AnonymousClass022 r11, int i) {
        this.A02 = list;
        this.A0A = r8;
        this.A08 = r2;
        this.A0D = r3;
        this.A03 = i;
        this.A09 = r4;
        this.A07 = r5;
        this.A04 = r6;
        this.A0B = r7;
        this.A05 = r9;
        this.A06 = r10;
        this.A0C = r11;
    }

    @Override // X.AbstractC16300pa
    public int A05() {
        return this.A02.size();
    }

    @Override // X.AbstractC16300pa
    public AbstractC11910hD A06(ViewGroup viewGroup, int i) {
        if (i != 1) {
            return new TextureView$SurfaceTextureListenerC60532pe(viewGroup, this.A08, this.A03);
        }
        return new C60542pf(this.A08, this.A07, this.A04, this.A05, this.A06, this.A0C, viewGroup, this.A0A, this.A03);
    }

    @Override // X.AbstractC16300pa
    public void A07(AbstractC11910hD r6, int i) {
        AbstractC59872oQ r62 = (AbstractC59872oQ) r6;
        super.A08(r62);
        boolean z = this.A02.get(i) instanceof C54602fC;
        if (!z) {
            TextureView$SurfaceTextureListenerC60532pe r4 = (TextureView$SurfaceTextureListenerC60532pe) r62;
            r4.A0E(true);
            if (!this.A02.isEmpty() && i < this.A02.size()) {
                C49232Po r1 = (C49232Po) ((AnonymousClass2Q3) this.A02.get(i)).A5u();
                r4.A0G(r1);
                View$OnLongClickListenerC49152Pf r0 = new View$OnLongClickListenerC49152Pf(r1);
                ImageView imageView = r4.A0B;
                imageView.setOnLongClickListener(r0);
                imageView.setOnClickListener(new ViewOnClickCListenerShape4S0200000_I1(r4, this.A0A, 29));
                return;
            }
        } else if (!z) {
            return;
        }
        C60542pf r63 = (C60542pf) r62;
        if (!this.A02.isEmpty() && i < this.A02.size()) {
            r63.A01 = (C49262Ps) ((AnonymousClass2Q3) this.A02.get(i)).A5u();
            r63.A00 = 2;
        }
    }
}
