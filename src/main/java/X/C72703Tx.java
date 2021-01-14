package X;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.whatsapp.voipcalling.PeerAvatarLayout;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3Tx  reason: invalid class name and case insensitive filesystem */
public class C72703Tx extends AbstractC16300pa {
    public final List A00 = new ArrayList();
    public final /* synthetic */ PeerAvatarLayout A01;

    public C72703Tx(PeerAvatarLayout peerAvatarLayout) {
        this.A01 = peerAvatarLayout;
    }

    @Override // X.AbstractC16300pa
    public int A05() {
        return this.A00.size();
    }

    @Override // X.AbstractC16300pa
    public AbstractC11910hD A06(ViewGroup viewGroup, int i) {
        return new C72693Tw(new C673738h(this.A01.getContext()));
    }

    @Override // X.AbstractC16300pa
    public void A07(AbstractC11910hD r10, int i) {
        int max;
        C673738h r7 = ((C72693Tw) r10).A00;
        r7.clearAnimation();
        int A002 = r7.A00(A05());
        ViewGroup.LayoutParams layoutParams = r7.A03.getLayoutParams();
        layoutParams.height = A002;
        layoutParams.width = A002;
        r7.A03.setLayoutParams(layoutParams);
        r7.A03.A02 = (float) ((A002 + 1) >> 1);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        PeerAvatarLayout peerAvatarLayout = this.A01;
        View view = (View) peerAvatarLayout.getParent();
        if (i != 0) {
            int A05 = A05();
            int width = view.getWidth();
            if (A05 <= 1) {
                max = 0;
            } else {
                int A003 = (r7.A00 << 1) + r7.A00(A05);
                max = Math.max(A003 - ((width - A003) / (A05 - 1)), (int) (((double) A003) * 0.4d));
            }
            int i2 = -max;
            if (peerAvatarLayout.A06.A02().A06) {
                layoutParams2.rightMargin = i2;
            } else {
                layoutParams2.leftMargin = i2;
            }
        }
        r7.setLayoutParams(layoutParams2);
        if (Build.VERSION.SDK_INT >= 21) {
            r7.setElevation((float) (peerAvatarLayout.A00 - (peerAvatarLayout.A01 * i)));
            r7.setElevation((float) (peerAvatarLayout.A00 - (peerAvatarLayout.A01 * i)));
        }
        peerAvatarLayout.A02.A04((C007003k) this.A00.get(i), r7.A03, true, peerAvatarLayout.A04);
    }
}
