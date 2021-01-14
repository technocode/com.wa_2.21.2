package com.whatsapp;

import X.AbstractC26561Lk;
import X.ActivityC004602e;
import X.ActivityC004702f;
import X.AnonymousClass00D;
import X.AnonymousClass00T;
import X.AnonymousClass01I;
import X.AnonymousClass022;
import X.AnonymousClass03B;
import X.AnonymousClass03P;
import X.AnonymousClass08B;
import X.AnonymousClass0BP;
import X.AnonymousClass0EY;
import X.AnonymousClass0Eg;
import X.AnonymousClass0FE;
import X.AnonymousClass0HJ;
import X.AnonymousClass0HK;
import X.AnonymousClass2NU;
import X.AnonymousClass30E;
import X.C002001d;
import X.C002101e;
import X.C007003k;
import X.C03160Fa;
import X.C03930Ii;
import X.C06170Sb;
import X.C40411tE;
import X.C40431tG;
import X.C40441tH;
import X.C48672Ng;
import X.C53492dM;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;
import com.whatsapp.crop.CropImage;
import com.whatsapp.util.Log;

public class ProfilePhotoReminder extends ActivityC004602e {
    public static long A0Q = -1;
    public static boolean A0R;
    public Bitmap A00;
    public Handler A01;
    public View A02;
    public ImageView A03;
    public WaEditText A04;
    public C007003k A05;
    public C48672Ng A06;
    public Runnable A07;
    public final AbstractC26561Lk A08 = new C40431tG(this);
    public final AnonymousClass01I A09 = AnonymousClass01I.A00();
    public final AnonymousClass0EY A0A = AnonymousClass0EY.A00();
    public final AnonymousClass03B A0B = AnonymousClass03B.A00();
    public final AnonymousClass0HJ A0C = AnonymousClass0HJ.A02();
    public final AnonymousClass0BP A0D = new C40441tH(this);
    public final AnonymousClass08B A0E = AnonymousClass08B.A00;
    public final AnonymousClass0HK A0F = AnonymousClass0HK.A00();
    public final AnonymousClass03P A0G = AnonymousClass03P.A00();
    public final C03930Ii A0H = C03930Ii.A00();
    public final C53492dM A0I = C53492dM.A00();
    public final AnonymousClass0Eg A0J = AnonymousClass0Eg.A00();
    public final C03160Fa A0K = C03160Fa.A00();
    public final AnonymousClass0FE A0L = AnonymousClass0FE.A00();
    public final AnonymousClass022 A0M = AnonymousClass022.A00();
    public final AnonymousClass30E A0N = AnonymousClass30E.A00();
    public final C06170Sb A0O = C06170Sb.A00();
    public final AnonymousClass00T A0P = C002101e.A00();

    public static synchronized void A04(AnonymousClass00D r5, AnonymousClass03B r6) {
        synchronized (ProfilePhotoReminder.class) {
            A0R = true;
            if (r6.A04()) {
                Log.w("profilephotoreminder/savelastremindertimestamp/clock is wrong, not saving last profile photo reminder time");
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                A0Q = currentTimeMillis;
                r5.A00.edit().putLong("wa_last_reminder_timestamp", currentTimeMillis).apply();
            }
        }
    }

    public final void A0T() {
        Bitmap A022;
        this.A02.setVisibility(8);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.registration_profile_photo_size);
        float dimension = getResources().getDimension(R.dimen.registration_profile_photo_radius);
        AnonymousClass01I r0 = this.A09;
        r0.A04();
        if (C40411tE.A00(r0.A03)) {
            this.A03.setEnabled(false);
            this.A02.setVisibility(0);
            A022 = this.A00;
            if (A022 == null) {
                A022 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ALPHA_8);
                this.A00 = A022;
            }
        } else {
            this.A03.setEnabled(true);
            this.A02.setVisibility(4);
            A022 = this.A0F.A02(this.A05, dimensionPixelSize, dimension, false);
            if (A022 == null) {
                C007003k r1 = this.A05;
                if (r1.A02 == 0 && r1.A01 == 0) {
                    this.A02.setVisibility(0);
                    Handler handler = this.A01;
                    if (handler == null) {
                        handler = new Handler(Looper.getMainLooper());
                        this.A01 = handler;
                        this.A07 = new RunnableEBaseShape1S0100000_I0_1(this, 32);
                    }
                    handler.removeCallbacks(this.A07);
                    this.A01.postDelayed(this.A07, 30000);
                } else {
                    this.A02.setVisibility(4);
                }
                if (this.A0C != null) {
                    A022 = AnonymousClass0HJ.A01(this, R.drawable.avatar_contact, dimensionPixelSize, dimension);
                } else {
                    throw null;
                }
            }
        }
        this.A03.setImageBitmap(A022);
    }

    public /* synthetic */ void lambda$onCreate$1282$ProfilePhotoReminder(View view) {
        this.A0A.A05(this, this.A05, 12);
    }

    public /* synthetic */ void lambda$onCreate$1284$ProfilePhotoReminder(View view) {
        String trim = this.A04.getText().toString().trim();
        if (C002001d.A3f(trim, AnonymousClass2NU.A01)) {
            Log.w("registername/checkmarks in pushname");
            APm(PushnameEmojiBlacklistDialogFragment.A00(trim));
        } else if (trim.length() == 0) {
            Log.w("registername/no-pushname");
            ((ActivityC004702f) this).A0F.A06(R.string.register_failure_noname, 0);
        } else if (!trim.equals(this.A09.A02())) {
            this.A0P.ANF(new RunnableEBaseShape0S1100000_I0(this, trim, 0));
            return;
        }
        finish();
    }

    @Override // X.ActivityC004902h
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 12) {
            if (i != 13) {
                super.onActivityResult(i, i2, intent);
                return;
            }
            AnonymousClass0EY r2 = this.A0A;
            r2.A04().delete();
            if (i2 == -1) {
                if (r2.A09(this.A05)) {
                    this.A02.setVisibility(0);
                }
            } else if (i2 == 0 && intent != null) {
                CropImage.A00(r2.A02, intent, this, r2.A0C);
            }
        } else if (i2 != -1) {
        } else {
            if (intent == null || !intent.getBooleanExtra("is_reset", false)) {
                Intent A012 = this.A0A.A01(this, this, intent);
                if (A012 != null) {
                    startActivityForResult(A012, 13);
                    return;
                }
                return;
            }
            this.A02.setVisibility(0);
            this.A0A.A06(this.A05);
        }
    }

    @Override // X.ActivityC004702f, X.AnonymousClass02i
    public void onBackPressed() {
        if (!this.A06.A02()) {
            super.onBackPressed();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0116, code lost:
        if (X.AnonymousClass0SE.A01 == false) goto L_0x0118;
     */
    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r30) {
        /*
        // Method dump skipped, instructions count: 440
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ProfilePhotoReminder.onCreate(android.os.Bundle):void");
    }

    @Override // X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onDestroy() {
        super.onDestroy();
        this.A0E.A00(this.A0D);
        Handler handler = this.A01;
        if (handler != null) {
            handler.removeCallbacks(this.A07);
        }
    }
}
