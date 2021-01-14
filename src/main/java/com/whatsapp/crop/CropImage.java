package com.whatsapp.crop;

import X.AbstractC004502c;
import X.AnonymousClass00T;
import X.AnonymousClass01X;
import X.AnonymousClass02M;
import X.AnonymousClass03P;
import X.AnonymousClass0D1;
import X.AnonymousClass2C0;
import X.AnonymousClass2K7;
import X.AnonymousClass2KA;
import X.C000300f;
import X.C002101e;
import X.C002701k;
import X.C02220Bc;
import X.C02590Cr;
import X.C03270Fn;
import X.C06180Sc;
import X.C59502nm;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;

public class CropImage extends AnonymousClass2C0 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09 = 1;
    public Bitmap.CompressFormat A0A = Bitmap.CompressFormat.JPEG;
    public Bitmap A0B;
    public Matrix A0C;
    public Matrix A0D;
    public Rect A0E;
    public Uri A0F;
    public CropImageView A0G;
    public AnonymousClass2K7 A0H;
    public String A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O = true;
    public final AnonymousClass02M A0P = AnonymousClass02M.A00();
    public final C06180Sc A0Q = C06180Sc.A00();
    public final C000300f A0R = C000300f.A00();
    public final AnonymousClass03P A0S = AnonymousClass03P.A00();
    public final C03270Fn A0T = C03270Fn.A00();
    public final C59502nm A0U = C59502nm.A00();
    public final C02590Cr A0V = C02590Cr.A00();
    public final C002701k A0W = C002701k.A00();
    public final AnonymousClass0D1 A0X = AnonymousClass0D1.A00();
    public final C02220Bc A0Y = C02220Bc.A00();
    public final AnonymousClass00T A0Z = C002101e.A00();

    public static void A00(AnonymousClass02M r2, Intent intent, AbstractC004502c r4, AnonymousClass01X r5) {
        if (intent.getBooleanExtra("error-oom", false)) {
            Log.e("profileinfo/activityres/oom-error");
            r2.A0B(r4, r5.A06(R.string.error_out_of_memory));
        } else if (intent.getBooleanExtra("no-space", false)) {
            Log.e("profileinfo/activityres/no-space");
            r2.A0B(r4, r5.A06(R.string.error_no_disc_space));
        } else if (intent.getBooleanExtra("io-error", false)) {
            Log.e("profileinfo/activityres/fail/load-image");
            r2.A0B(r4, r5.A06(R.string.error_load_image));
        } else if (intent.getBooleanExtra("not-a-image", false)) {
            Log.e("profileinfo/activityres/fail/not-a-image");
            r2.A0B(r4, r5.A06(R.string.error_file_is_not_a_image));
        }
    }

    public final void A0D(Rect rect) {
        int i = rect.left;
        int i2 = this.A09;
        rect.left = i * i2;
        rect.right *= i2;
        rect.top *= i2;
        rect.bottom *= i2;
    }

    public /* synthetic */ void lambda$onCreate$2005$CropImage(View view) {
        setResult(0);
        finish();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0239, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:?, code lost:
        r12.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x023d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00f6, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        r13.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00fa, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void lambda$onCreate$2006$CropImage(android.view.View r25) {
        /*
        // Method dump skipped, instructions count: 1069
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.crop.CropImage.lambda$onCreate$2006$CropImage(android.view.View):void");
    }

    public void lambda$onCreate$2007$CropImage(View view) {
        this.A08 = (this.A08 + 270) % 360;
        RectF rectF = new RectF(0.0f, 0.0f, 1.0f, 1.0f);
        this.A0G.getImageViewMatrix().mapRect(rectF);
        this.A0C.postRotate(-90.0f);
        CropImageView cropImageView = this.A0G;
        AnonymousClass2KA r2 = new AnonymousClass2KA(this.A0B);
        Matrix matrix = new Matrix();
        matrix.set(this.A0D);
        matrix.postConcat(this.A0C);
        r2.A01 = matrix;
        cropImageView.A04(r2, false);
        AnonymousClass2K7 r22 = this.A0H;
        Matrix imageMatrix = this.A0G.getImageMatrix();
        if (r22 != null) {
            r22.A03 = new Matrix(imageMatrix);
            r22.A04 = r22.A02();
            r22.A07.invalidate();
            RectF rectF2 = new RectF(0.0f, 0.0f, 1.0f, 1.0f);
            this.A0G.getImageViewMatrix().mapRect(rectF2);
            float min = Math.min(rectF.width() / rectF2.width(), rectF.height() / rectF2.height());
            this.A0G.A05(this.A0H);
            AnimationSet animationSet = new AnimationSet(true);
            RotateAnimation rotateAnimation = new RotateAnimation(90.0f, 0.0f, 1, 0.5f, 1, 0.5f);
            ScaleAnimation scaleAnimation = new ScaleAnimation(min, 1.0f, min, 1.0f, 1, 0.5f, 1, 0.5f);
            animationSet.addAnimation(rotateAnimation);
            animationSet.addAnimation(scaleAnimation);
            animationSet.setDuration(300);
            this.A0G.startAnimation(animationSet);
            return;
        }
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0633, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0637, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0669, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x066d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x03d5, code lost:
        if (r0 > 0) goto L_0x03d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x041e, code lost:
        if (r24.A01 == 0) goto L_0x0420;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x043e, code lost:
        if (r4 != false) goto L_0x0440;
     */
    @Override // X.AnonymousClass2C0, X.ActivityC004802g, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r25) {
        /*
        // Method dump skipped, instructions count: 1758
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.crop.CropImage.onCreate(android.os.Bundle):void");
    }

    @Override // X.ActivityC004802g, X.ActivityC004902h
    public void onDestroy() {
        Log.i("crop/ondestroy");
        super.onDestroy();
        Bitmap bitmap = this.A0B;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.A0G.A04 = true;
            this.A0B.recycle();
            this.A0B = null;
        }
        this.A0Z.ANF(new RunnableEBaseShape9S0100000_I1_4(this.A0T, 24));
    }

    @Override // X.ActivityC004802g, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("rotate", this.A08);
        Rect A012 = this.A0H.A01();
        A0D(A012);
        bundle.putParcelable("initialRect", A012);
    }
}
