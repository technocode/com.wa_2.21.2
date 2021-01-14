package com.whatsapp.gallerypicker;

import X.AnonymousClass008;
import X.AnonymousClass009;
import X.AnonymousClass00T;
import X.AnonymousClass01X;
import X.AnonymousClass02M;
import X.AnonymousClass037;
import X.AnonymousClass03P;
import X.AnonymousClass2PQ;
import X.AnonymousClass36I;
import X.AnonymousClass37M;
import X.C000300f;
import X.C002001d;
import X.C002101e;
import X.C002701k;
import X.C004302a;
import X.C007603r;
import X.C02550Cn;
import X.C04370Kc;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape6S0100000_I1_4;
import com.google.android.search.verification.client.R;
import com.whatsapp.VideoTimelineView;
import com.whatsapp.doodle.TitleBarComponent;
import java.io.File;

public class VideoPreviewFragment extends MediaPreviewFragment {
    public int A00 = 640;
    public long A01;
    public long A02 = -1;
    public long A03;
    public long A04;
    public View.OnClickListener A05 = new ViewOnClickEBaseShape6S0100000_I1_4(this, 12);
    public View.OnClickListener A06 = new ViewOnClickEBaseShape6S0100000_I1_4(this, 13);
    public View A07;
    public View A08;
    public View A09;
    public View A0A;
    public ImageView A0B;
    public ImageView A0C;
    public TextView A0D;
    public TextView A0E;
    public TextView A0F;
    public VideoTimelineView A0G;
    public TitleBarComponent A0H;
    public AnonymousClass36I A0I;
    public AnonymousClass37M A0J;
    public File A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public final View.OnAttachStateChangeListener A0P = new AnonymousClass2PQ(this);
    public final AnonymousClass009 A0Q = AnonymousClass009.A00();
    public final AnonymousClass02M A0R = AnonymousClass02M.A00();
    public final C000300f A0S = C000300f.A00();
    public final AnonymousClass03P A0T = AnonymousClass03P.A00();
    public final AnonymousClass01X A0U = AnonymousClass01X.A00();
    public final C002701k A0V = C002701k.A00();
    public final C02550Cn A0W = C02550Cn.A01();
    public final C04370Kc A0X = C04370Kc.A00();
    public final AnonymousClass00T A0Y = C002101e.A00();
    public final Runnable A0Z = new RunnableEBaseShape9S0100000_I1_4(this, 46);

    @Override // X.AnonymousClass037, com.whatsapp.gallerypicker.MediaPreviewFragment
    public void A0X() {
        super.A0X();
        this.A0G.A0H = null;
        AnonymousClass37M r0 = this.A0J;
        if (r0 != null) {
            r0.A08();
            this.A0J = null;
        }
    }

    @Override // X.AnonymousClass037
    public View A0Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.video_preview_page, viewGroup, false);
    }

    @Override // X.AnonymousClass037
    public void A0d() {
        super.A0U = true;
        A0v();
    }

    @Override // X.AnonymousClass037
    public void A0e() {
        super.A0U = true;
        int A012 = this.A0J.A01();
        AnonymousClass37M r1 = this.A0J;
        int i = A012 + 1;
        if (A012 > 0) {
            i = A012 - 1;
        }
        r1.A09(i);
        this.A0J.A09(A012);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x01f5, code lost:
        if (r18 != false) goto L_0x019d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0274, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0278, code lost:
        throw r0;
     */
    @Override // X.AnonymousClass037, com.whatsapp.gallerypicker.MediaPreviewFragment
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0l(android.view.View r24, android.os.Bundle r25) {
        /*
        // Method dump skipped, instructions count: 1012
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallerypicker.VideoPreviewFragment.A0l(android.view.View, android.os.Bundle):void");
    }

    @Override // com.whatsapp.gallerypicker.MediaPreviewFragment
    public void A0q() {
        TextView textView = ((MediaPreviewFragment) this).A02.A0P;
        if (textView.getVisibility() == 0) {
            textView.startAnimation(AnonymousClass008.A02(1.0f, 0.0f, 300));
        }
        textView.setVisibility(8);
    }

    @Override // com.whatsapp.gallerypicker.MediaPreviewFragment
    public void A0s(Rect rect) {
        super.A0s(rect);
        if (((AnonymousClass037) this).A0A != null) {
            this.A0A.setPadding(rect.left, A02().getDimensionPixelSize(R.dimen.actionbar_height) + rect.top, rect.right, A02().getDimensionPixelSize(R.dimen.actionbar_height) + rect.bottom);
            this.A09.setPadding(rect.left, rect.top, rect.right, 0);
        }
    }

    @Override // com.whatsapp.gallerypicker.MediaPreviewFragment
    public void A0t(View view) {
        view.findViewById(R.id.crop).setVisibility(8);
        super.A0t(view);
        A0r();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0099, code lost:
        if (r15.A0L != false) goto L_0x009b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long A0w() {
        /*
        // Method dump skipped, instructions count: 194
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallerypicker.VideoPreviewFragment.A0w():long");
    }

    public final void A0x() {
        if (!C007603r.A08()) {
            if (this.A0J.A0B()) {
                A0v();
            }
            this.A0J.A09((int) this.A03);
            A0p();
        }
    }

    public final void A0y() {
        if (this.A0J.A0B()) {
            A0v();
            return;
        }
        this.A0J.A04().setBackgroundDrawable(null);
        if (((long) this.A0J.A01()) > this.A04 - 2000) {
            this.A0J.A09((int) this.A03);
        }
        A0p();
    }

    public final void A0z() {
        Context A002 = A00();
        if (A002 == null) {
            throw null;
        } else if (this.A0N) {
            this.A0B.setImageResource(R.drawable.ic_unmute);
            C002001d.A2m(this.A0B, C004302a.A00(A002, R.color.white_alpha_40));
            this.A07.setOnClickListener(null);
        } else {
            ImageView imageView = this.A0B;
            boolean z = this.A0L;
            int i = R.drawable.ic_mute;
            if (z) {
                i = R.drawable.ic_unmute;
            }
            imageView.setImageResource(i);
            C002001d.A2m(this.A0B, C004302a.A00(A002, R.color.white_alpha_100));
            this.A07.setOnClickListener(this.A05);
        }
    }
}
