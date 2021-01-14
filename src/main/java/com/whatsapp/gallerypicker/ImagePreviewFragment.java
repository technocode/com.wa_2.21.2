package com.whatsapp.gallerypicker;

import X.AnonymousClass01X;
import X.AnonymousClass03P;
import X.AnonymousClass088;
import X.AnonymousClass089;
import X.AnonymousClass2OT;
import X.AnonymousClass2PF;
import X.AnonymousClass2PM;
import X.AnonymousClass2PU;
import X.AnonymousClass2PV;
import X.AnonymousClass2PW;
import X.AnonymousClass2PX;
import X.C000300f;
import X.C002701k;
import X.C007603r;
import X.C02220Bc;
import X.C54022eE;
import X.C54032eF;
import X.C54042eG;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.redex.ViewOnClickEBaseShape6S0100000_I1_4;
import com.google.android.search.verification.client.R;
import com.whatsapp.doodle.DoodleView;
import com.whatsapp.doodle.ImagePreviewContentLayout;
import java.io.File;

public class ImagePreviewFragment extends MediaPreviewFragment {
    public ImagePreviewContentLayout A00;
    public OnZoomListenerPhotoView A01;
    public boolean A02;
    public final AnonymousClass088 A03 = AnonymousClass088.A00();
    public final C000300f A04 = C000300f.A00();
    public final AnonymousClass03P A05 = AnonymousClass03P.A00();
    public final AnonymousClass01X A06 = AnonymousClass01X.A00();
    public final C002701k A07 = C002701k.A00();
    public final C02220Bc A08 = C02220Bc.A00();

    public static File A00(AnonymousClass088 r2, Uri uri) {
        StringBuilder sb = new StringBuilder();
        sb.append(C007603r.A01(uri.toString()));
        sb.append("-crop");
        return AnonymousClass089.A01(r2.A07(), sb.toString());
    }

    @Override // X.AnonymousClass037, com.whatsapp.gallerypicker.MediaPreviewFragment
    public void A0X() {
        AnonymousClass2PX r5 = this.A00.A04;
        r5.A0J = null;
        r5.A0G = null;
        AnonymousClass2PV r1 = r5.A0M;
        if (r1 != null) {
            r1.A06 = false;
            r1.A07 = true;
        }
        r5.A0M = null;
        RunnableEBaseShape0S0220102_I1 runnableEBaseShape0S0220102_I1 = r5.A0P;
        if (runnableEBaseShape0S0220102_I1 != null) {
            runnableEBaseShape0S0220102_I1.A05 = false;
            runnableEBaseShape0S0220102_I1.A06 = true;
        }
        r5.A0P = null;
        RunnableEBaseShape0S0220102_I1 runnableEBaseShape0S0220102_I12 = r5.A0O;
        if (runnableEBaseShape0S0220102_I12 != null) {
            runnableEBaseShape0S0220102_I12.A05 = false;
            runnableEBaseShape0S0220102_I12.A06 = true;
        }
        r5.A0O = null;
        AnonymousClass2PU r3 = r5.A0L;
        if (r3 != null) {
            r3.A02 = true;
            AnonymousClass2PX r12 = r3.A04;
            r12.A06 = (float) Math.round(r12.A06);
            r12.A01(true);
            View view = r3.A03;
            view.requestLayout();
            view.invalidate();
        }
        r5.A0L = null;
        AnonymousClass2PW r13 = r5.A0N;
        if (r13 != null) {
            r13.A01 = true;
        }
        r5.A0N = null;
        r5.A0H = null;
        r5.A0H = null;
        OnZoomListenerPhotoView onZoomListenerPhotoView = this.A01;
        if (onZoomListenerPhotoView != null) {
            onZoomListenerPhotoView.A01();
        }
        super.A0X();
    }

    @Override // X.AnonymousClass037
    public View A0Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.image_preview_page, viewGroup, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0183, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0187, code lost:
        throw r0;
     */
    @Override // X.AnonymousClass037, com.whatsapp.gallerypicker.MediaPreviewFragment
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0g(int r13, int r14, android.content.Intent r15) {
        /*
        // Method dump skipped, instructions count: 451
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallerypicker.ImagePreviewFragment.A0g(int, int, android.content.Intent):void");
    }

    @Override // X.AnonymousClass037
    public void A0j(Bundle bundle) {
        bundle.putBoolean("handle-crop-image-result", this.A02);
    }

    @Override // X.AnonymousClass037, com.whatsapp.gallerypicker.MediaPreviewFragment
    public void A0l(View view, Bundle bundle) {
        super.A0l(view, bundle);
        this.A01 = (OnZoomListenerPhotoView) view.findViewById(R.id.photo);
        this.A00 = (ImagePreviewContentLayout) view.findViewById(R.id.media_content);
        DoodleView doodleView = (DoodleView) view.findViewById(R.id.doodle_view);
        doodleView.A0W = false;
        ImagePreviewContentLayout imagePreviewContentLayout = this.A00;
        imagePreviewContentLayout.A02 = doodleView;
        imagePreviewContentLayout.A03 = new C54042eG(this);
        imagePreviewContentLayout.setOnClickListener(new ViewOnClickEBaseShape6S0100000_I1_4(this, 6));
        if (bundle == null || !bundle.getBoolean("handle-crop-image-result", false)) {
            A0x(bundle);
        }
    }

    @Override // com.whatsapp.gallerypicker.MediaPreviewFragment
    public void A0q() {
        AnonymousClass2OT r1 = ((MediaPreviewFragment) this).A02;
        if (r1.A0P.getVisibility() != 0) {
            r1.A0P.setVisibility(4);
        }
        super.A0q();
    }

    @Override // com.whatsapp.gallerypicker.MediaPreviewFragment
    public void A0t(View view) {
        view.findViewById(R.id.crop).setVisibility(0);
        super.A0t(view);
    }

    public final int A0w() {
        int i;
        String queryParameter = ((MediaPreviewFragment) this).A00.getQueryParameter("rotation");
        if (queryParameter != null) {
            i = Integer.parseInt(queryParameter);
        } else {
            i = 0;
        }
        return (((AnonymousClass2PF) A0A()).A8r(((MediaPreviewFragment) this).A00) + i) % 360;
    }

    public final void A0x(Bundle bundle) {
        this.A01.setTag(((MediaPreviewFragment) this).A00);
        AnonymousClass2PF r3 = (AnonymousClass2PF) A0A();
        File A5b = r3.A5b(((MediaPreviewFragment) this).A00);
        if (A5b == null) {
            A5b = r3.A6Q(((MediaPreviewFragment) this).A00);
        }
        Uri.Builder buildUpon = Uri.fromFile(A5b).buildUpon();
        int A0w = A0w();
        if (A0w != 0) {
            buildUpon.appendQueryParameter("rotation", Integer.toString(A0w));
        }
        if (((MediaPreviewFragment) this).A00.getQueryParameter("flip-h") != null) {
            buildUpon.appendQueryParameter("flip-h", ((MediaPreviewFragment) this).A00.getQueryParameter("flip-h"));
        }
        C54022eE r2 = new C54022eE(this, buildUpon.build());
        C54032eF r1 = new C54032eF(this, bundle, r3);
        AnonymousClass2PM A7M = r3.A7M();
        if (A7M != null) {
            A7M.A02(r2, r1);
        }
    }
}
