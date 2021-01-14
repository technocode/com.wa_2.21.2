package X;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.redex.ViewOnClickEBaseShape5S0100000_I1_3;
import com.whatsapp.emoji.EmojiContainerView;

/* renamed from: X.2dI  reason: invalid class name and case insensitive filesystem */
public class C53452dI extends AbstractC16300pa implements AnonymousClass2Q8 {
    public AnonymousClass2Q9 A00;
    public final int A01;
    public final LayoutInflater A02;
    public final AnonymousClass01X A03;
    public final C02590Cr A04;
    public final AbstractC48682Nh A05;
    public final AnonymousClass022 A06;

    public C53452dI(Activity activity, C02590Cr r3, AnonymousClass01X r4, AbstractC48682Nh r5, AnonymousClass022 r6, int i) {
        this.A02 = activity.getLayoutInflater();
        this.A04 = r3;
        this.A03 = r4;
        this.A06 = r6;
        this.A05 = r5;
        this.A01 = i;
    }

    @Override // X.AbstractC16300pa
    public void A03(AbstractC11910hD r6) {
        C53462dJ r62 = (C53462dJ) r6;
        if (r62.A01 == null) {
            r62.A03.setOnClickListener(null);
            return;
        }
        View view = r62.A0H;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = layoutParams.height;
        view.setLayoutParams(layoutParams);
        EmojiContainerView emojiContainerView = r62.A03;
        emojiContainerView.setOnClickListener(new ViewOnClickEBaseShape5S0100000_I1_3(r62, 47));
        int[] iArr = r62.A01.A00;
        boolean A21 = C28051Sr.A21(iArr);
        emojiContainerView.A02 = A21;
        if (A21) {
            r62.A01 = new C03960Il(C26621Lq.A02(r62.A06, (int[]) iArr.clone()));
            emojiContainerView.setOnLongClickListener(new View$OnLongClickListenerC48652Nd(r62));
        } else {
            emojiContainerView.setOnLongClickListener(null);
        }
        r62.A02.setContentDescription(r62.A01.toString());
        r62.A0C();
    }

    @Override // X.AbstractC16300pa
    public synchronized int A05() {
        AnonymousClass2Q9 r0 = this.A00;
        if (r0 == null) {
            return 0;
        }
        return r0.A01.size();
    }

    @Override // X.AbstractC16300pa
    public AbstractC11910hD A06(ViewGroup viewGroup, int i) {
        return new C53462dJ(this.A04, this.A06, viewGroup, this.A02, this.A05, this.A01);
    }

    @Override // X.AbstractC16300pa
    public void A07(AbstractC11910hD r2, int i) {
        C03960Il r0;
        C53462dJ r22 = (C53462dJ) r2;
        synchronized (this) {
            if (i < this.A00.A01.size()) {
                r0 = (C03960Il) this.A00.A01.get(i);
            } else {
                r0 = null;
            }
            r22.A01 = r0;
            r22.A00 = i;
        }
    }
}
