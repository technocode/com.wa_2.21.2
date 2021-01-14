package com.whatsapp.status.playback.fragment;

import X.AbstractC659532f;
import X.AbstractC71663Pv;
import X.C659832i;
import android.content.res.Configuration;
import android.graphics.Rect;
import com.whatsapp.base.WaFragment;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.AbstractMap;

public abstract class StatusPlaybackFragment extends WaFragment {
    public boolean A00;
    public final Rect A01 = new Rect();

    @Override // X.AnonymousClass037
    public void A0c() {
        this.A0U = true;
        StringBuilder sb = new StringBuilder("playbackFragment/onDestroy ");
        sb.append(this);
        Log.i(sb.toString());
    }

    @Override // X.AnonymousClass037
    public void A0d() {
        this.A0U = true;
        StringBuilder sb = new StringBuilder("playbackFragment/onPause ");
        sb.append(this);
        Log.i(sb.toString());
    }

    @Override // X.AnonymousClass037
    public void A0e() {
        this.A0U = true;
        StringBuilder sb = new StringBuilder("playbackFragment/onResume ");
        sb.append(this);
        Log.i(sb.toString());
    }

    public String A0n() {
        UserJid userJid = ((StatusPlaybackContactFragment) this).A03;
        if (userJid != null) {
            return userJid.getRawString();
        }
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0026, code lost:
        if (r4.A07 != false) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0o() {
        /*
            r5 = this;
            r4 = r5
            com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment r4 = (com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment) r4
            X.08V r0 = r4.A09
            java.util.Map r0 = r0.A05()
            java.util.AbstractMap r0 = (java.util.AbstractMap) r0
            java.util.Collection r0 = r0.values()
            java.util.Iterator r3 = r0.iterator()
        L_0x0013:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0039
            java.lang.Object r2 = r3.next()
            X.32f r2 = (X.AbstractC659532f) r2
            boolean r0 = r4.A03
            if (r0 != 0) goto L_0x0028
            boolean r1 = r4.A07
            r0 = 0
            if (r1 == 0) goto L_0x0029
        L_0x0028:
            r0 = 1
        L_0x0029:
            r2.A02 = r0
            X.3Pv r2 = (X.AbstractC71663Pv) r2
            boolean r0 = r2.A02
            if (r0 == 0) goto L_0x0035
            r2.A0F()
            goto L_0x0013
        L_0x0035:
            r2.A0G()
            goto L_0x0013
        L_0x0039:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.status.playback.fragment.StatusPlaybackFragment.A0o():void");
    }

    public void A0p() {
        this.A00 = true;
        StringBuilder sb = new StringBuilder("playbackFragment/onViewActive ");
        sb.append(this);
        Log.i(sb.toString());
    }

    public void A0q() {
        this.A00 = false;
        StringBuilder sb = new StringBuilder("playbackFragment/onViewInactive ");
        sb.append(this);
        Log.i(sb.toString());
    }

    public void A0r(int i) {
        StatusPlaybackContactFragment statusPlaybackContactFragment = (StatusPlaybackContactFragment) this;
        if (statusPlaybackContactFragment.A06 == null) {
            statusPlaybackContactFragment.A01 = i;
            return;
        }
        C659832i r0 = statusPlaybackContactFragment.A0T;
        AbstractC659532f A0w = statusPlaybackContactFragment.A0w();
        if (r0 == null) {
            throw null;
        } else if (A0w != null && !A0w.A05) {
            AbstractC71663Pv r1 = (AbstractC71663Pv) A0w;
            ((AbstractC659532f) r1).A05 = true;
            r1.A0M(i, r1.A06);
        }
    }

    public void A0s(Rect rect) {
        if (!(this instanceof StatusPlaybackBaseFragment)) {
            this.A01.set(rect);
            return;
        }
        StatusPlaybackBaseFragment statusPlaybackBaseFragment = (StatusPlaybackBaseFragment) this;
        Rect rect2 = ((StatusPlaybackFragment) statusPlaybackBaseFragment).A01;
        rect2.set(rect);
        statusPlaybackBaseFragment.A0u(rect);
        for (AbstractC659532f r0 : ((AbstractMap) ((StatusPlaybackContactFragment) statusPlaybackBaseFragment).A09.A05()).values()) {
            r0.A08(rect2);
        }
    }

    @Override // X.AnonymousClass037
    public void onConfigurationChanged(Configuration configuration) {
        this.A0U = true;
        StringBuilder sb = new StringBuilder("playbackFragment/onConfigurationChanged ");
        sb.append(this);
        Log.i(sb.toString());
    }
}
