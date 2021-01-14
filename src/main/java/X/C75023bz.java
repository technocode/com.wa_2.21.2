package X;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.search.verification.client.R;
import com.whatsapp.status.playback.StatusReplyActivity;
import com.whatsapp.status.playback.fragment.StatusPlaybackBaseFragment;
import com.whatsapp.util.Log;
import com.whatsapp.util.ViewOnClickCListenerShape4S0200000_I1;

/* renamed from: X.3bz  reason: invalid class name and case insensitive filesystem */
public class C75023bz extends AbstractC74123aA {
    public C39441rX A00;
    public final AnonymousClass019 A01;
    public final AnonymousClass0AC A02 = AnonymousClass0AC.A00;

    public C75023bz(AbstractC007503q r2, AbstractC71533Pi r3) {
        super(r2, r3);
        C002701k.A00();
        this.A01 = new C71673Pw(this);
    }

    @Override // X.AbstractC659532f, X.AbstractC71663Pv
    public void A02() {
        super.A02();
        this.A02.A00(this.A01);
    }

    @Override // X.AbstractC659532f, X.AbstractC71663Pv
    public void A09(View view) {
        super.A09(view);
        AbstractC659732h r4 = ((AbstractC71663Pv) this).A01;
        if (r4 == null) {
            r4 = new C71683Px();
            ((AbstractC71663Pv) this).A01 = r4;
        }
        ViewGroup viewGroup = r4.A08;
        int i = 0;
        if (AnonymousClass1VY.A0a(((AbstractC74123aA) this).A03.A07())) {
            i = 8;
        }
        viewGroup.setVisibility(i);
        C002301g.A03(r4.A0D);
        r4.A0D.setText(this.A0D.A06(R.string.notification_quick_reply));
        r4.A0D.setOnClickListener(new ViewOnClickCListenerShape4S0200000_I1(this, r4, 34));
        A0P(false);
        A0J();
        this.A02.A01(this.A01);
    }

    @Override // X.AbstractC71663Pv
    public void A0E() {
        super.A0E();
        C39441rX r0 = this.A00;
        if (r0 != null) {
            ((AnonymousClass0JW) r0).A00.cancel(true);
            this.A00 = null;
        }
        AbstractC007503q r2 = ((AbstractC74123aA) this).A03;
        AbstractC659732h r02 = ((AbstractC71663Pv) this).A01;
        if (r02 == null) {
            r02 = new C71683Px();
            ((AbstractC71663Pv) this).A01 = r02;
        }
        C71593Po r4 = new C71593Po(r2, (C71683Px) r02);
        AnonymousClass01K r3 = this.A0E;
        C26481Lc r1 = this.A09;
        AnonymousClass02N A07 = r2.A07();
        if (A07 != null) {
            C39441rX r22 = new C39441rX(r3, r1, r4, A07);
            this.A00 = r22;
            this.A0O.ANC(r22, new Void[0]);
            return;
        }
        throw null;
    }

    @Override // X.AbstractC71663Pv
    public void A0G() {
        super.A0G();
        BottomSheetBehavior bottomSheetBehavior = ((AbstractC71663Pv) this).A00;
        if (bottomSheetBehavior.A0B != 4) {
            bottomSheetBehavior.A0D(4);
            return;
        }
        ((AbstractC71663Pv) this).A01.A06.setVisibility(8);
        ((AbstractC71663Pv) this).A01.A06.setAlpha(0.0f);
    }

    @Override // X.AbstractC71663Pv
    public void A0K(int i) {
        super.A0K(i);
        if (i == 3) {
            A0R();
        }
    }

    public final void A0R() {
        StringBuilder sb = new StringBuilder("playbackPage/reply page=");
        sb.append(this);
        sb.append("; host=");
        StatusPlaybackBaseFragment statusPlaybackBaseFragment = this.A0I.A00;
        sb.append(statusPlaybackBaseFragment);
        Log.i(sb.toString());
        Context A0O = C002001d.A0O(A0A());
        if (!(A0O instanceof ActivityC004702f) || !((ActivityC004702f) A0O).AB1()) {
            A0F();
            Intent intent = new Intent(A0A(), StatusReplyActivity.class);
            C006803i.A05(intent, ((AbstractC74123aA) this).A03.A0n);
            A0A().startActivity(intent);
            return;
        }
        StringBuilder sb2 = new StringBuilder("playbackPage/reply reply-already-ended page=");
        sb2.append(this);
        sb2.append("; host=");
        sb2.append(statusPlaybackBaseFragment);
        Log.i(sb2.toString());
    }
}
