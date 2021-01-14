package com.whatsapp;

import X.ActivityC004602e;
import X.AnonymousClass00T;
import X.AnonymousClass00Y;
import X.AnonymousClass01A;
import X.AnonymousClass022;
import X.AnonymousClass03P;
import X.AnonymousClass0CP;
import X.AnonymousClass0ET;
import X.AnonymousClass0Eg;
import X.AnonymousClass1VY;
import X.C002101e;
import X.C014308b;
import X.C02220Bc;
import X.C03400Ga;
import X.C03930Ii;
import X.C04360Kb;
import X.C49182Pi;
import X.C53492dM;
import X.C664334g;
import X.C665134q;
import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.whatsapp.videoplayback.VideoSurfaceView;
import java.util.List;

public class GifVideoPreviewActivity extends ActivityC004602e {
    public View A00;
    public View A01;
    public ImageView A02;
    public C665134q A03;
    public VideoSurfaceView A04;
    public String A05;
    public final C04360Kb A06 = C04360Kb.A00();
    public final AnonymousClass01A A07 = AnonymousClass01A.A00();
    public final C014308b A08 = C014308b.A00();
    public final AnonymousClass03P A09 = AnonymousClass03P.A00();
    public final C03930Ii A0A = C03930Ii.A00();
    public final C53492dM A0B = C53492dM.A00();
    public final AnonymousClass0ET A0C = AnonymousClass0ET.A00();
    public final AnonymousClass00Y A0D = AnonymousClass00Y.A00();
    public final C49182Pi A0E = C49182Pi.A00();
    public final AnonymousClass0Eg A0F = AnonymousClass0Eg.A00();
    public final C03400Ga A0G = C03400Ga.A00();
    public final AnonymousClass0CP A0H = AnonymousClass0CP.A00();
    public final AnonymousClass022 A0I = AnonymousClass022.A00();
    public final C02220Bc A0J = C02220Bc.A00();
    public final AnonymousClass00T A0K = C002101e.A00();

    public static Intent A04(Activity activity, List list, String str, String str2, String str3, int i, boolean z, boolean z2, int i2) {
        return new Intent(activity, GifVideoPreviewActivity.class).putExtra("preview_media_url", str).putExtra("media_url", str2).putExtra("static_preview_url", str3).putExtra("jids", AnonymousClass1VY.A0F(list)).putExtra("send", z2).putExtra("provider", i).putExtra("number_from_url", z).putExtra("origin", i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x008b, code lost:
        if (r1 == 2) goto L_0x008d;
     */
    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r30) {
        /*
        // Method dump skipped, instructions count: 599
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.GifVideoPreviewActivity.onCreate(android.os.Bundle):void");
    }

    @Override // X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onDestroy() {
        super.onDestroy();
        C665134q r2 = this.A03;
        if (r2 != null) {
            r2.A00.getViewTreeObserver().removeGlobalOnLayoutListener(r2.A01);
            r2.A03.A06();
            r2.A04.dismiss();
            this.A03 = null;
        }
        AnonymousClass0Eg r22 = this.A0F;
        C664334g r0 = r22.A00;
        if (r0 != null) {
            r0.A01.A01(false);
            r22.A00 = null;
        }
    }

    @Override // X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onStart() {
        super.onStart();
        if (!TextUtils.isEmpty(this.A05)) {
            this.A04.setVideoPath(this.A05);
            this.A04.start();
            this.A00.setVisibility(8);
            this.A01.setVisibility(8);
            this.A02.setVisibility(8);
        }
    }

    @Override // X.ActivityC004802g, X.ActivityC004902h
    public void onStop() {
        super.onStop();
        this.A04.A00();
    }
}
