package com.whatsapp.status.playback.fragment;

import X.AbstractC660032k;
import X.ActivityC004902h;
import X.AnonymousClass01X;
import X.AnonymousClass02M;
import X.AnonymousClass03P;
import X.AnonymousClass32Y;
import X.AnonymousClass32Z;
import X.C004302a;
import X.C06470Tj;
import X.C660132l;
import X.C71523Ph;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape0S0700000_I1;
import com.google.android.search.verification.client.R;
import com.whatsapp.status.playback.widget.AudioVolumeView;
import com.whatsapp.status.playback.widget.StatusPlaybackProgressView;
import com.whatsapp.util.Log;
import com.whatsapp.util.ViewOnClickCListenerShape14S0100000_I1_3;
import java.util.ArrayList;
import java.util.List;

public abstract class StatusPlaybackBaseFragment extends StatusPlaybackFragment {
    public AnonymousClass32Y A00;
    public AbstractC660032k A01 = new C71523Ph(this);
    public Runnable A02 = new RunnableEBaseShape12S0100000_I1_7(this, 42);
    public boolean A03;
    public final AnonymousClass02M A04 = AnonymousClass02M.A00();
    public final AnonymousClass03P A05 = AnonymousClass03P.A00();
    public final AnonymousClass01X A06 = AnonymousClass01X.A00();
    public final C660132l A07 = C660132l.A00();

    @Override // X.AnonymousClass037
    public View A0Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.status_playback_fragment, viewGroup, false);
        AnonymousClass32Y A0t = A0t();
        A0t.A03 = viewGroup;
        A0t.A07 = (FrameLayout) inflate.findViewById(R.id.root_view);
        A0t.A0C = (StatusPlaybackProgressView) inflate.findViewById(R.id.playback_progress);
        A0t.A06 = (ViewGroup) inflate.findViewById(R.id.status_container);
        A0t.A0B = (AudioVolumeView) inflate.findViewById(R.id.volume);
        A0t.A08 = (ImageView) inflate.findViewById(R.id.back);
        A0t.A0A = (TextView) inflate.findViewById(R.id.date);
        A0t.A05 = inflate.findViewById(R.id.title_bar);
        A0t.A04 = inflate.findViewById(R.id.title_protection);
        A0t.A00 = inflate.findViewById(R.id.header);
        A0t.A02 = inflate.findViewById(R.id.menu);
        A0t.A01 = inflate.findViewById(R.id.progress);
        A0t.A09 = (ImageView) inflate.findViewById(R.id.profile_picture);
        return inflate;
    }

    @Override // X.AnonymousClass037
    public void A0b(Bundle bundle) {
        this.A0U = true;
        A0u(((StatusPlaybackFragment) this).A01);
        AnonymousClass32Z r1 = (AnonymousClass32Z) A0A();
        if (r1 != null) {
            r1.AGu(A0n());
        }
    }

    @Override // X.AnonymousClass037, com.whatsapp.status.playback.fragment.StatusPlaybackFragment
    public void A0d() {
        super.A0d();
        C660132l r0 = this.A07;
        AbstractC660032k r1 = this.A01;
        List list = r0.A04;
        if (list != null) {
            list.remove(r1);
        }
    }

    @Override // X.AnonymousClass037, com.whatsapp.status.playback.fragment.StatusPlaybackFragment
    public void A0e() {
        super.A0e();
        C660132l r2 = this.A07;
        AbstractC660032k r1 = this.A01;
        List list = r2.A04;
        if (list == null) {
            list = new ArrayList();
            r2.A04 = list;
        }
        list.add(r1);
    }

    @Override // X.AnonymousClass037
    public void A0l(View view, Bundle bundle) {
        ActivityC004902h A0A = A0A();
        if (A0A != null) {
            AnonymousClass32Y A0t = A0t();
            ViewOnClickCListenerShape14S0100000_I1_3 viewOnClickCListenerShape14S0100000_I1_3 = new ViewOnClickCListenerShape14S0100000_I1_3(this, 4);
            ImageView imageView = A0t.A08;
            AnonymousClass01X r2 = this.A06;
            imageView.setImageDrawable(new C06470Tj(r2, C004302a.A03(A0A, R.drawable.ic_cam_back)));
            A0t.A08.setOnClickListener(viewOnClickCListenerShape14S0100000_I1_3);
            View view2 = A0t.A02;
            view2.setOnClickListener(new ViewOnClickEBaseShape0S0700000_I1(A0A, view2, r2, this));
            return;
        }
        throw null;
    }

    public final AnonymousClass32Y A0t() {
        AnonymousClass32Y r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass32Y r02 = new AnonymousClass32Y();
        this.A00 = r02;
        return r02;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00f0, code lost:
        if (r0 == false) goto L_0x0135;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0133, code lost:
        if (r0 == false) goto L_0x0135;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0u(android.graphics.Rect r7) {
        /*
        // Method dump skipped, instructions count: 312
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.status.playback.fragment.StatusPlaybackBaseFragment.A0u(android.graphics.Rect):void");
    }

    public void A0v(boolean z) {
        StringBuilder sb = new StringBuilder("playbackFragment/onDragChanged dragging=");
        sb.append(z);
        sb.append("; ");
        sb.append(this);
        Log.i(sb.toString());
    }
}
