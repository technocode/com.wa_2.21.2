package com.whatsapp.gallerypicker;

import X.ActivityC004902h;
import X.AnonymousClass008;
import X.AnonymousClass009;
import X.AnonymousClass00E;
import X.AnonymousClass00T;
import X.AnonymousClass01X;
import X.AnonymousClass03P;
import X.AnonymousClass0TX;
import X.AnonymousClass2MF;
import X.AnonymousClass2Mt;
import X.AnonymousClass2PF;
import X.AnonymousClass36I;
import X.AnonymousClass37M;
import X.AnonymousClass3SE;
import X.C000300f;
import X.C002101e;
import X.C002701k;
import X.C006803i;
import X.C04900Mh;
import X.C72443Sw;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.doodle.DoodleView;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import org.json.JSONException;

public class GifPreviewFragment extends MediaPreviewFragment {
    public AnonymousClass37M A00;
    public final AnonymousClass009 A01 = AnonymousClass009.A00();
    public final C000300f A02 = C000300f.A00();
    public final AnonymousClass03P A03 = AnonymousClass03P.A00();
    public final AnonymousClass01X A04 = AnonymousClass01X.A00();
    public final C002701k A05 = C002701k.A00();
    public final AnonymousClass00T A06 = C002101e.A00();

    @Override // X.AnonymousClass037, com.whatsapp.gallerypicker.MediaPreviewFragment
    public void A0X() {
        super.A0X();
        AnonymousClass37M r0 = this.A00;
        if (r0 != null) {
            r0.A08();
            this.A00 = null;
        }
    }

    @Override // X.AnonymousClass037
    public View A0Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.gif_preview_page, viewGroup, false);
    }

    @Override // X.AnonymousClass037, com.whatsapp.gallerypicker.MediaPreviewFragment
    public void A0l(View view, Bundle bundle) {
        boolean z;
        AnonymousClass37M r6;
        int i;
        int i2;
        super.A0l(view, bundle);
        boolean z2 = false;
        if (this.A00 == null) {
            z2 = true;
        }
        AnonymousClass00E.A07(z2);
        AnonymousClass2PF r1 = (AnonymousClass2PF) A0A();
        File A6Q = r1.A6Q(((MediaPreviewFragment) this).A00);
        if (A6Q != null) {
            if (bundle == null) {
                String A66 = r1.A66(((MediaPreviewFragment) this).A00);
                String A69 = r1.A69(((MediaPreviewFragment) this).A00);
                if (A66 == null) {
                    AnonymousClass36I A9g = r1.A9g(((MediaPreviewFragment) this).A00);
                    if (A9g == null) {
                        try {
                            A9g = new AnonymousClass36I(this.A02, A6Q);
                        } catch (AnonymousClass3SE e) {
                            Log.e("gifpreview/bad video", e);
                        }
                    }
                    AnonymousClass009 r62 = this.A01;
                    if (A9g.A03(r62)) {
                        i = A9g.A01;
                    } else {
                        i = A9g.A03;
                    }
                    float f = (float) i;
                    if (A9g.A03(r62)) {
                        i2 = A9g.A03;
                    } else {
                        i2 = A9g.A01;
                    }
                    RectF rectF = new RectF(0.0f, 0.0f, f, (float) i2);
                    DoodleView doodleView = ((MediaPreviewFragment) this).A01.A04;
                    doodleView.setBitmapRect(rectF);
                    doodleView.setCropRect(rectF);
                } else {
                    AnonymousClass2Mt r13 = new AnonymousClass2Mt();
                    try {
                        r13.A08(A66, A01(), ((MediaPreviewFragment) this).A0B, this.A02, this.A05, this.A04, ((MediaPreviewFragment) this).A0D);
                    } catch (JSONException e2) {
                        Log.e("videopreview/error-loading-doodle", e2);
                    }
                    AnonymousClass2MF r63 = ((MediaPreviewFragment) this).A01;
                    r63.A04.setDoodle(r13);
                    r63.A04.setEditState(A69);
                    r63.A02();
                }
            }
            try {
                C04900Mh.A03(A6Q);
                z = true;
            } catch (IOException unused) {
                z = false;
            }
            if (z) {
                try {
                    r6 = new C72443Sw(A0B(), A6Q);
                } catch (IOException e3) {
                    Log.e("gifpreview/onViewCreated videoPlayer initialization", e3);
                    ((MediaPreviewFragment) this).A04.A06(R.string.error_load_gif, 0);
                    ActivityC004902h A0A = A0A();
                    if (A0A != null) {
                        A0A.finish();
                        return;
                    }
                    throw null;
                }
            } else {
                r6 = AnonymousClass37M.A00(((MediaPreviewFragment) this).A04, this.A06, this.A03, this.A04, A01(), A6Q, true, r1.A2T(((MediaPreviewFragment) this).A00), C006803i.A0f());
            }
            this.A00 = r6;
            r6.A0A(true);
            ((ViewGroup) view.findViewById(R.id.video_player)).addView(this.A00.A04(), new FrameLayout.LayoutParams(-1, -1, 17));
            if (((MediaPreviewFragment) this).A00.equals(r1.A4k())) {
                this.A00.A04().setAlpha(0.0f);
                ActivityC004902h A0A2 = A0A();
                if (A0A2 != null) {
                    AnonymousClass0TX.A0E(A0A2);
                    return;
                }
                throw null;
            }
            return;
        }
        throw null;
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
    public void A0t(View view) {
        view.findViewById(R.id.crop).setVisibility(8);
        super.A0t(view);
    }
}
