package com.whatsapp.gallerypicker;

import X.AbstractC000400g;
import X.ActivityC004902h;
import X.AnonymousClass00S;
import X.AnonymousClass00T;
import X.AnonymousClass00Y;
import X.AnonymousClass01X;
import X.AnonymousClass02M;
import X.AnonymousClass037;
import X.AnonymousClass03P;
import X.AnonymousClass04j;
import X.AnonymousClass0D1;
import X.AnonymousClass2MF;
import X.AnonymousClass2ND;
import X.AnonymousClass2OR;
import X.AnonymousClass2OS;
import X.AnonymousClass2OT;
import X.AnonymousClass2PF;
import X.AnonymousClass2c6;
import X.AnonymousClass2cW;
import X.C000300f;
import X.C002101e;
import X.C02590Cr;
import X.C02770Dj;
import X.C03570Gt;
import X.C03620Gz;
import X.C06170Sb;
import X.C14270lr;
import X.C48522Mp;
import X.C48692Ni;
import X.C52932bz;
import X.C52942c0;
import X.C52982cD;
import X.C53012cG;
import X.C53022cH;
import X.C53432dG;
import X.C53442dH;
import X.C53612dY;
import X.C53952e6;
import X.C54212eX;
import X.C59502nm;
import X.C59772oG;
import X.C59782oH;
import X.C59822oL;
import X.C60492pZ;
import X.GestureDetector$OnDoubleTapListenerC54222eY;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.search.verification.client.R;
import com.whatsapp.base.WaFragment;
import com.whatsapp.doodle.ColorPickerComponent;
import com.whatsapp.doodle.DoodleView;
import com.whatsapp.doodle.TitleBarComponent;
import com.whatsapp.filter.FilterUi$3;
import com.whatsapp.util.Log;

public abstract class MediaPreviewFragment extends WaFragment {
    public Uri A00;
    public AnonymousClass2MF A01;
    public AnonymousClass2OT A02;
    public C54212eX A03;
    public final AnonymousClass02M A04 = AnonymousClass02M.A00();
    public final C000300f A05 = C000300f.A00();
    public final AnonymousClass01X A06 = AnonymousClass01X.A00();
    public final C52982cD A07 = C52982cD.A00();
    public final C53022cH A08;
    public final AnonymousClass2cW A09;
    public final C59502nm A0A = C59502nm.A00();
    public final C02590Cr A0B = C02590Cr.A00();
    public final C02770Dj A0C = C02770Dj.A00();
    public final AnonymousClass0D1 A0D;
    public final C03620Gz A0E = C03620Gz.A00();
    public final C03570Gt A0F = C03570Gt.A00();
    public final C06170Sb A0G = C06170Sb.A00();
    public final AnonymousClass00T A0H = C002101e.A00();
    public final int[] A0I = new int[2];

    public MediaPreviewFragment() {
        if (AnonymousClass2cW.A00 == null) {
            synchronized (AnonymousClass2cW.class) {
                if (AnonymousClass2cW.A00 == null) {
                    if (C53012cG.A00 == null) {
                        synchronized (C53012cG.class) {
                            if (C53012cG.A00 == null) {
                                C53012cG.A00 = new C53012cG(AnonymousClass00S.A00(), C002101e.A00(), AnonymousClass00Y.A00(), AnonymousClass01X.A00(), AnonymousClass04j.A00(), C53022cH.A00(), C53442dH.A00(), C53432dG.A00(), new C48692Ni(AnonymousClass03P.A00()));
                            }
                        }
                    }
                    AnonymousClass2cW.A00 = new AnonymousClass2cW(C53012cG.A00);
                }
            }
        }
        this.A09 = AnonymousClass2cW.A00;
        this.A08 = C53022cH.A00();
        this.A0D = AnonymousClass0D1.A00();
    }

    @Override // X.AnonymousClass037, com.whatsapp.base.WaFragment
    public void A0T(boolean z) {
        try {
            super.A0T(z);
        } catch (NullPointerException e) {
            Log.w("mediaprevoewfragment/setUserVisibleHint", e);
        }
    }

    @Override // X.AnonymousClass037
    public void A0X() {
        TitleBarComponent A9O = ((AnonymousClass2PF) A0A()).A9O();
        if (A9O.A07 == this.A03) {
            A9O.A07 = null;
        }
        AnonymousClass2MF r4 = this.A01;
        DoodleView doodleView = r4.A04;
        Bitmap bitmap = doodleView.A0G;
        if (bitmap != null) {
            bitmap.recycle();
            doodleView.A0G = null;
        }
        Bitmap bitmap2 = doodleView.A0H;
        if (bitmap2 != null) {
            bitmap2.recycle();
            doodleView.A0H = null;
        }
        Bitmap bitmap3 = doodleView.A0F;
        if (bitmap3 != null) {
            bitmap3.recycle();
            doodleView.A0F = null;
        }
        Bitmap bitmap4 = doodleView.A0E;
        if (bitmap4 != null) {
            bitmap4.recycle();
            doodleView.A0E = null;
        }
        doodleView.setEnabled(false);
        C48522Mp r2 = r4.A06;
        r2.A05.quit();
        r2.A06.removeMessages(0);
        r2.A0j.clear();
        r2.A0a.A00 = null;
        if (r2.A0m) {
            r2.A0e.A00(r2.A0d);
        }
        TitleBarComponent titleBarComponent = r4.A0F;
        if (titleBarComponent != null) {
            titleBarComponent.setToolbarExtraVisibility(8);
        }
        AnonymousClass2OT r1 = this.A02;
        r1.A05 = null;
        r1.A04 = null;
        r1.A03 = null;
        View view = r1.A0N;
        if (view != null) {
            ((C14270lr) view.getLayoutParams()).A00(null);
        }
        BottomSheetBehavior bottomSheetBehavior = r1.A09;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.A0E = null;
        }
        r1.A04();
        this.A0U = true;
    }

    @Override // X.AnonymousClass037
    public void A0Y() {
        this.A01.A0D.A04(false);
        this.A0U = true;
    }

    @Override // X.AnonymousClass037
    public void A0g(int i, int i2, Intent intent) {
        Bundle extras;
        if (i == 2 && i2 == -1 && (extras = intent.getExtras()) != null) {
            String string = extras.getString("locations_string");
            if (TextUtils.isEmpty(string)) {
                string = this.A06.A06(R.string.attach_location);
            }
            double d = extras.getDouble("longitude");
            double d2 = extras.getDouble("latitude");
            C60492pZ r2 = new C60492pZ(A00(), this.A06, false, string);
            r2.A01 = d;
            r2.A00 = d2;
            AnonymousClass2MF r1 = this.A01;
            r1.A04.A0D(r2);
            r1.A00();
        }
    }

    @Override // X.AnonymousClass037
    public void A0l(View view, Bundle bundle) {
        GestureDetector$OnDoubleTapListenerC54222eY r2;
        C54212eX r10;
        Uri uri = (Uri) super.A06.getParcelable("uri");
        this.A00 = uri;
        int A6S = ((AnonymousClass2PF) A0A()).A6S(uri);
        ActivityC004902h A0A2 = A0A();
        AnonymousClass01X r14 = this.A06;
        Uri uri2 = this.A00;
        if (!(this instanceof ImagePreviewFragment)) {
            r2 = new GestureDetector$OnDoubleTapListenerC54222eY(this);
        } else {
            r2 = new C59782oH((ImagePreviewFragment) this);
        }
        this.A02 = new AnonymousClass2OT(A0A2, view, uri2, r2, this.A0A, A6S);
        if (this instanceof VideoPreviewFragment) {
            r10 = new C59822oL((VideoPreviewFragment) this);
        } else if (!(this instanceof ImagePreviewFragment)) {
            r10 = new C54212eX(this);
        } else {
            r10 = new C59772oG((ImagePreviewFragment) this);
        }
        this.A03 = r10;
        ActivityC004902h A0A3 = A0A();
        C06170Sb r13 = this.A0G;
        AnonymousClass00T r11 = this.A0H;
        C02590Cr r9 = this.A0B;
        C000300f r7 = this.A05;
        C52982cD r6 = this.A07;
        C03620Gz r5 = this.A0E;
        C03570Gt r4 = this.A0F;
        AnonymousClass2cW r3 = this.A09;
        C53022cH r22 = this.A08;
        AnonymousClass0D1 r1 = this.A0D;
        C53952e6 r0 = new C53952e6(this);
        TitleBarComponent A9O = ((AnonymousClass2PF) A0A3).A9O();
        A02().getConfiguration();
        this.A01 = new AnonymousClass2MF(A0A3, r13, r11, r9, r7, r6, r14, r5, r4, r3, r22, r1, view, r10, r0, this, A9O, r7.A0D(AbstractC000400g.A2J), r7.A0D(AbstractC000400g.A2I));
    }

    public void A0n() {
        ActivityC004902h A0A2;
        if (this instanceof VideoPreviewFragment) {
            VideoPreviewFragment videoPreviewFragment = (VideoPreviewFragment) this;
            View view = ((AnonymousClass037) videoPreviewFragment).A0A;
            if (view != null) {
                View findViewById = view.findViewById(R.id.content);
                findViewById.setVisibility(0);
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation.setDuration(300);
                findViewById.startAnimation(alphaAnimation);
                videoPreviewFragment.A0J.A04().setAlpha(1.0f);
                return;
            }
            throw null;
        } else if (this instanceof ImagePreviewFragment) {
            ImagePreviewFragment imagePreviewFragment = (ImagePreviewFragment) this;
            imagePreviewFragment.A01.setVisibility(0);
            if (imagePreviewFragment.A04.A0D(AbstractC000400g.A1V) && (A0A2 = imagePreviewFragment.A0A()) != null && A0A2.getIntent().getIntExtra("origin", 1) == 29) {
                AnonymousClass2MF r1 = ((MediaPreviewFragment) imagePreviewFragment).A01;
                if (!r1.A04.A0Y) {
                    r1.A01();
                }
            }
        } else if (this instanceof GifPreviewFragment) {
            GifPreviewFragment gifPreviewFragment = (GifPreviewFragment) this;
            gifPreviewFragment.A00.A04().setAlpha(1.0f);
            gifPreviewFragment.A00.A04().setVisibility(0);
        }
    }

    public void A0o() {
        ActivityC004902h A0A2;
        if (this instanceof ImagePreviewFragment) {
            ImagePreviewFragment imagePreviewFragment = (ImagePreviewFragment) this;
            imagePreviewFragment.A01.setVisibility(4);
            if (imagePreviewFragment.A04.A0D(AbstractC000400g.A1V) && (A0A2 = imagePreviewFragment.A0A()) != null && A0A2.getIntent().getIntExtra("origin", 1) == 29) {
                ((MediaPreviewFragment) imagePreviewFragment).A02.A07(true);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0033, code lost:
        if (r4.A0L != false) goto L_0x0035;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0p() {
        /*
        // Method dump skipped, instructions count: 121
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallerypicker.MediaPreviewFragment.A0p():void");
    }

    public void A0q() {
        if (this.A01.A04.A0Y) {
            this.A02.A08(false);
        } else {
            this.A02.A02();
        }
        AnonymousClass2OT r3 = this.A02;
        View view = r3.A0N;
        if (view != null && r3.A09 == null) {
            r3.A09 = new FilterUi$3(r3);
            BottomSheetBehavior bottomSheetBehavior = r3.A09;
            ((C14270lr) view.getLayoutParams()).A00(bottomSheetBehavior);
            C53612dY r2 = new C53612dY(r3);
            r3.A08 = r2;
            bottomSheetBehavior.A0E = r2;
            if (bottomSheetBehavior.A0B == 3) {
                r2.A01(r3.A0N, 3);
            }
            r3.A0P.getViewTreeObserver().addOnGlobalLayoutListener(new AnonymousClass2OR(r3));
        }
    }

    public void A0r() {
        if (this instanceof VideoPreviewFragment) {
            VideoPreviewFragment videoPreviewFragment = (VideoPreviewFragment) this;
            ImageView imageView = videoPreviewFragment.A0C;
            boolean z = videoPreviewFragment.A0N;
            int i = R.drawable.ic_gif_off;
            if (z) {
                i = R.drawable.ic_gif_on;
            }
            imageView.setImageResource(i);
            if (videoPreviewFragment.A04 - videoPreviewFragment.A03 > 7000 || videoPreviewFragment.A0M) {
                if (videoPreviewFragment.A0C.getVisibility() == 0) {
                    TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, (float) videoPreviewFragment.A0C.getMeasuredWidth(), 0.0f, 0.0f);
                    translateAnimation.setDuration(100);
                    videoPreviewFragment.A0C.startAnimation(translateAnimation);
                }
                videoPreviewFragment.A0C.setOnClickListener(null);
                videoPreviewFragment.A0C.setVisibility(8);
                return;
            }
            if (videoPreviewFragment.A0C.getVisibility() == 8) {
                videoPreviewFragment.A0C.measure(0, 0);
                TranslateAnimation translateAnimation2 = new TranslateAnimation((float) videoPreviewFragment.A0C.getMeasuredWidth(), 0.0f, 0.0f, 0.0f);
                translateAnimation2.setDuration(100);
                videoPreviewFragment.A0C.startAnimation(translateAnimation2);
            }
            videoPreviewFragment.A0C.setOnClickListener(videoPreviewFragment.A06);
            videoPreviewFragment.A0C.setVisibility(0);
        }
    }

    public void A0s(Rect rect) {
        View view = super.A0A;
        if (view != null) {
            View findViewById = view.findViewById(R.id.doodle_decoration);
            if (findViewById != null) {
                findViewById.setPadding(rect.left, rect.top, rect.right, rect.bottom);
            }
            AnonymousClass2OT r4 = this.A02;
            if (!rect.equals(r4.A06)) {
                r4.A06 = new Rect(0, rect.top, 0, rect.bottom);
            }
        }
    }

    public void A0t(View view) {
        AnonymousClass2MF r5 = this.A01;
        boolean z = false;
        if (A02().getConfiguration().orientation == 2) {
            z = true;
        }
        r5.A09 = z;
        TitleBarComponent titleBarComponent = r5.A0F;
        C54212eX r3 = r5.A07;
        DoodleView doodleView = r5.A04;
        ColorPickerComponent colorPickerComponent = r5.A0D;
        C52932bz r0 = new C52932bz(r5);
        titleBarComponent.A07 = r3;
        titleBarComponent.A03 = doodleView;
        titleBarComponent.A02 = r0;
        titleBarComponent.A01 = colorPickerComponent;
        titleBarComponent.A04();
        titleBarComponent.A03.A0N = new AnonymousClass2c6(titleBarComponent, colorPickerComponent);
        RunnableEBaseShape2S0100000_I0_2 runnableEBaseShape2S0100000_I0_2 = new RunnableEBaseShape2S0100000_I0_2(r5, 49);
        r5.A04.A0N = new C52942c0(r5, runnableEBaseShape2S0100000_I0_2);
        r5.A03();
        r5.A04();
    }

    public boolean A0u() {
        AnonymousClass2MF r1 = this.A01;
        if (r1.A02.getVisibility() == 0) {
            C48522Mp r5 = r1.A06;
            if (r5.A0R.getVisibility() != 0 || !r5.A0m) {
                ValueAnimator valueAnimator = r5.A04;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    r1.A00();
                } else {
                    long currentPlayTime = r5.A04.getCurrentPlayTime();
                    r5.A04.cancel();
                    AnonymousClass2ND r0 = r5.A09;
                    if (r0 != null) {
                        r0.A01 = true;
                        r0.A00();
                    }
                    r5.A0A(false, currentPlayTime);
                }
            } else {
                r5.A0R.setText("");
                AnonymousClass2ND r02 = r5.A09;
                if (r02 != null) {
                    r02.A01 = true;
                    r02.A00();
                }
                r5.A0A(false, 200);
            }
        } else if (this.A02.A0B()) {
            return true;
        } else {
            return false;
        }
        return true;
    }

    public boolean A0v() {
        if (this instanceof VideoPreviewFragment) {
            VideoPreviewFragment videoPreviewFragment = (VideoPreviewFragment) this;
            boolean A0B2 = videoPreviewFragment.A0J.A0B();
            videoPreviewFragment.A0J.A05();
            videoPreviewFragment.A02 = (long) videoPreviewFragment.A0J.A01();
            DoodleView doodleView = ((MediaPreviewFragment) videoPreviewFragment).A01.A04;
            doodleView.A0V = false;
            doodleView.invalidate();
            videoPreviewFragment.A0J.A04().setKeepScreenOn(false);
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(200);
            videoPreviewFragment.A08.startAnimation(alphaAnimation);
            videoPreviewFragment.A08.setVisibility(0);
            return A0B2;
        } else if (this instanceof ImagePreviewFragment) {
            return false;
        } else {
            GifPreviewFragment gifPreviewFragment = (GifPreviewFragment) this;
            boolean A0B3 = gifPreviewFragment.A00.A0B();
            gifPreviewFragment.A00.A05();
            DoodleView doodleView2 = ((MediaPreviewFragment) gifPreviewFragment).A01.A04;
            doodleView2.A0V = false;
            doodleView2.invalidate();
            gifPreviewFragment.A00.A04().setKeepScreenOn(false);
            return A0B3;
        }
    }

    @Override // X.AnonymousClass037
    public void onConfigurationChanged(Configuration configuration) {
        boolean z = true;
        this.A0U = true;
        AnonymousClass2OT r2 = this.A02;
        if (r2.A09 != null) {
            r2.A0P.getViewTreeObserver().addOnGlobalLayoutListener(new AnonymousClass2OS(r2));
        }
        Context A002 = A00();
        if (A002 != null) {
            int rotation = ((WindowManager) A002.getSystemService("window")).getDefaultDisplay().getRotation();
            AnonymousClass2MF r22 = this.A01;
            if (configuration.orientation != 2 || rotation == 0 || rotation == 180) {
                z = false;
            }
            if (r22.A09 != z) {
                r22.A09 = z;
                r22.A03();
            }
        }
    }
}
