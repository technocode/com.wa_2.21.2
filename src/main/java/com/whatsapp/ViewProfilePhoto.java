package com.whatsapp;

import X.AbstractC49342Qc;
import X.ActivityC004602e;
import X.ActivityC004702f;
import X.ActivityC004902h;
import X.AnonymousClass008;
import X.AnonymousClass00C;
import X.AnonymousClass01A;
import X.AnonymousClass01I;
import X.AnonymousClass01T;
import X.AnonymousClass01X;
import X.AnonymousClass02M;
import X.AnonymousClass02N;
import X.AnonymousClass02U;
import X.AnonymousClass03S;
import X.AnonymousClass088;
import X.AnonymousClass089;
import X.AnonymousClass08B;
import X.AnonymousClass08C;
import X.AnonymousClass08D;
import X.AnonymousClass0BP;
import X.AnonymousClass0ES;
import X.AnonymousClass0EY;
import X.AnonymousClass0EZ;
import X.AnonymousClass0HK;
import X.AnonymousClass0HR;
import X.AnonymousClass0Q7;
import X.AnonymousClass0S2;
import X.AnonymousClass0TX;
import X.AnonymousClass1OL;
import X.AnonymousClass1OM;
import X.AnonymousClass1ON;
import X.AnonymousClass1PK;
import X.AnonymousClass1PN;
import X.AnonymousClass1u6;
import X.AnonymousClass1u7;
import X.AnonymousClass2C0;
import X.AnonymousClass2UT;
import X.C006803i;
import X.C007003k;
import X.C014308b;
import X.C02230Bd;
import X.C04370Kc;
import X.C14270lr;
import X.C15260nl;
import X.C39191r6;
import X.C40911u5;
import X.C40921u8;
import X.C40931u9;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.transition.Transition;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.google.android.search.verification.client.R;
import com.whatsapp.crop.CropImage;
import com.whatsapp.gesture.VerticalSwipeDismissBehavior;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.mediaview.PhotoView;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class ViewProfilePhoto extends ActivityC004602e {
    public C007003k A00;
    public AbstractC49342Qc A01 = new C39191r6(this);
    public boolean A02 = false;
    public boolean A03 = false;
    public final Handler A04 = new AnonymousClass1OL(this, Looper.getMainLooper());
    public final AnonymousClass088 A05 = AnonymousClass088.A00();
    public final AnonymousClass01I A06 = AnonymousClass01I.A00();
    public final AnonymousClass0ES A07 = AnonymousClass0ES.A00();
    public final AnonymousClass0EY A08 = AnonymousClass0EY.A00();
    public final AnonymousClass1PN A09 = AnonymousClass1PN.A00();
    public final AnonymousClass08D A0A = AnonymousClass08D.A00();
    public final AnonymousClass01A A0B = AnonymousClass01A.A00();
    public final AnonymousClass0BP A0C = new C40911u5(this);
    public final AnonymousClass08B A0D = AnonymousClass08B.A00;
    public final C014308b A0E = C014308b.A00();
    public final AnonymousClass08C A0F = AnonymousClass08C.A00();
    public final AnonymousClass0HK A0G = AnonymousClass0HK.A00();
    public final AnonymousClass00C A0H = AnonymousClass00C.A00();
    public final AnonymousClass03S A0I = AnonymousClass03S.A00();
    public final AnonymousClass01T A0J = AnonymousClass01T.A00();
    public final AnonymousClass0EZ A0K = AnonymousClass0EZ.A01;
    public final C04370Kc A0L = C04370Kc.A00();

    public class SavePhoto extends ActivityC004902h {
        public final AnonymousClass088 A00 = AnonymousClass088.A00();
        public final AnonymousClass02M A01 = AnonymousClass02M.A00();
        public final AnonymousClass01X A02 = AnonymousClass01X.A00();

        @Override // X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            setTitle(this.A02.A06(R.string.save_to_gallery));
            Uri uri = (Uri) getIntent().getParcelableExtra("android.intent.extra.STREAM");
            String replaceAll = getIntent().getStringExtra("name").replaceAll("[?:\\\\/*\"<>|]", "");
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.US);
            AnonymousClass088 r5 = this.A00;
            File file = r5.A04().A0E;
            AnonymousClass089.A03(file, false);
            StringBuilder sb = new StringBuilder();
            sb.append(replaceAll);
            sb.append(" ");
            sb.append(simpleDateFormat.format(new Date()));
            sb.append(".jpg");
            File file2 = new File(file, sb.toString());
            try {
                C006803i.A0X(r5.A04, new File(uri.getPath()), file2);
                C02230Bd.A0R(this, Uri.fromFile(file2));
                this.A01.A06(R.string.photo_saved_to_gallery, 0);
            } catch (IOException e) {
                Log.e("viewprofilephoto/save/failed", e);
                this.A01.A06(R.string.photo_faled_save_to_gallery, 1);
            }
            finish();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00a3, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00a4, code lost:
        if (r2 != null) goto L_0x00a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00a9, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0T() {
        /*
        // Method dump skipped, instructions count: 173
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ViewProfilePhoto.A0T():void");
    }

    @Override // X.ActivityC004902h
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 12) {
            if (i != 13) {
                super.onActivityResult(i, i2, intent);
                return;
            }
            AnonymousClass0EY r3 = this.A08;
            if (!r3.A04().delete()) {
                StringBuilder A0S = AnonymousClass008.A0S("viewprofilephoto/failed-delete-file");
                A0S.append(r3.A04().getAbsolutePath());
                Log.w(A0S.toString());
            }
            if (i2 == -1) {
                this.A02 = true;
                this.A0D.A05((AnonymousClass02N) this.A00.A02(AnonymousClass02N.class));
                if (r3.A09(this.A00)) {
                    A0T();
                }
            } else if (i2 == 0 && intent != null) {
                CropImage.A00(r3.A02, intent, this, r3.A0C);
            }
        } else if (i2 != -1) {
        } else {
            if (intent == null || !intent.getBooleanExtra("is_reset", false)) {
                Intent A012 = this.A08.A01(this, this, intent);
                if (A012 != null) {
                    startActivityForResult(A012, 13);
                    return;
                }
                return;
            }
            this.A02 = true;
            this.A0D.A05((AnonymousClass02N) this.A00.A02(AnonymousClass02N.class));
            this.A08.A06(this.A00);
            AnonymousClass0TX.A0B(this);
        }
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        int intExtra = getIntent().getIntExtra("start_transition_status_bar_color", 0);
        int intExtra2 = getIntent().getIntExtra("return_transition_status_bar_color", intExtra);
        boolean z = AnonymousClass2UT.A00;
        if (z) {
            getWindow().addFlags(EditorInfoCompat.IME_FLAG_FORCE_ASCII);
            getWindow().requestFeature(12);
            getWindow().requestFeature(13);
            Transition r6 = new AnonymousClass1OM(this, getIntent().getFloatExtra("start_transition_alpha", 0.0f), intExtra);
            Transition r1 = new AnonymousClass1ON(this, intExtra2);
            r6.excludeTarget(16908335, true);
            r6.excludeTarget(16908336, true);
            Window window = getWindow();
            window.setEnterTransition(r6);
            window.setReturnTransition(r1);
            r6.addListener(new AnonymousClass1u6(this));
            r1.addListener(new AnonymousClass1u7(this));
            if (getIntent().getBooleanExtra("circular_transition", false)) {
                Transition r12 = new AnonymousClass1PK(true, false);
                AnonymousClass1PN r7 = this.A09;
                r12.addTarget(r7.A01(R.string.transition_photo));
                window.setSharedElementEnterTransition(r12);
                Transition r13 = new AnonymousClass1PK(false, true);
                r13.addTarget(r7.A01(R.string.transition_photo));
                window.setSharedElementReturnTransition(r13);
            } else if (getIntent().hasExtra("circular_return_name")) {
                Transition r14 = new AnonymousClass1PK(false, false);
                r14.addTarget(getIntent().getStringExtra("circular_return_name"));
                window.setSharedElementEnterTransition(r14);
                Transition r15 = new AnonymousClass1PK(false, true);
                r15.addTarget(getIntent().getStringExtra("circular_return_name"));
                window.setSharedElementReturnTransition(r15);
            }
        }
        super.onCreate(bundle);
        setContentView(R.layout.view_profile_photo);
        BidiToolbar bidiToolbar = (BidiToolbar) findViewById(R.id.toolbar);
        A0C(bidiToolbar);
        AnonymousClass0S2 A092 = A09();
        if (A092 != null) {
            A092.A0A(true);
            AnonymousClass02N A012 = AnonymousClass02N.A01(getIntent().getStringExtra("jid"));
            if (A012 != null) {
                this.A00 = this.A0B.A0A(A012);
                AnonymousClass008.A1L(AnonymousClass008.A0W("viewprofilephoto/create ", A012, " photo_full_id:"), this.A00.A01);
                this.A0D.A01(this.A0C);
                AnonymousClass01I r0 = this.A06;
                r0.A04();
                AnonymousClass0HR r62 = r0.A01;
                if (r62 == null) {
                    Log.i("viewprofilephoto/create/no-me");
                    if (((ActivityC004702f) this).A0F != null) {
                        startActivity(new Intent(this, Main.class));
                        finish();
                        return;
                    }
                    throw null;
                }
                if (this.A00.A09()) {
                    setTitle(((AnonymousClass2C0) this).A01.A06(R.string.group_photo));
                } else if (A012.equals(r62.A09)) {
                    setTitle(((AnonymousClass2C0) this).A01.A06(R.string.profile_photo));
                } else {
                    A0L(this.A0E.A08(this.A00, false));
                }
                if (A012.equals(r62.A09)) {
                    C007003k r72 = this.A00;
                    if (r72.A01 > 0 && !this.A0F.A02(r72).exists()) {
                        C007003k r73 = this.A00;
                        r73.A01 = 0;
                        this.A07.A03((AnonymousClass02N) r73.A02(AnonymousClass02N.class), this.A00.A01, 1, null);
                        this.A04.sendEmptyMessageDelayed(0, 32000);
                    }
                } else if (this.A0H.A09(new C40921u8(this))) {
                    C007003k r74 = this.A00;
                    if (r74.A01 > 0 && !this.A0F.A02(r74).exists()) {
                        this.A00.A01 = 0;
                    }
                    this.A07.A03((AnonymousClass02N) this.A00.A02(AnonymousClass02N.class), this.A00.A01, 1, null);
                    if (this.A00.A01 == 0) {
                        this.A04.sendEmptyMessageDelayed(0, 32000);
                    }
                }
                Bitmap A022 = this.A0G.A02(this.A00, getResources().getDimensionPixelSize(R.dimen.small_avatar_size), getResources().getDimension(R.dimen.small_avatar_radius), true);
                final PhotoView photoView = (PhotoView) findViewById(R.id.picture);
                photoView.A0Y = true;
                if (1 == 0) {
                    photoView.A02();
                }
                photoView.A08 = 1.0f;
                photoView.A06(A022);
                ImageView imageView = (ImageView) findViewById(R.id.picture_animation);
                imageView.setImageBitmap(A022);
                A0T();
                if (z) {
                    photoView.setVisibility(4);
                    imageView.setVisibility(0);
                    String stringExtra = getIntent().getStringExtra("circular_return_name");
                    if (stringExtra == null) {
                        stringExtra = this.A09.A01(R.string.transition_photo);
                    }
                    AnonymousClass0Q7.A0g(imageView, stringExtra);
                } else {
                    imageView.setVisibility(8);
                }
                View findViewById = findViewById(R.id.root_view);
                AnonymousClass8 r16 = new VerticalSwipeDismissBehavior(this) {
                    /* class com.whatsapp.ViewProfilePhoto.AnonymousClass8 */

                    @Override // com.whatsapp.gesture.VerticalSwipeDismissBehavior, X.AbstractC07570Yg
                    public boolean A05(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
                        if (motionEvent.getPointerCount() <= 1 && !photoView.A0A()) {
                            return super.A05(coordinatorLayout, view, motionEvent);
                        }
                        C15260nl r0 = this.A05;
                        if (r0 == null) {
                            return false;
                        }
                        r0.A02();
                        return false;
                    }
                };
                Drawable colorDrawable = new ColorDrawable(-16777216);
                findViewById.setBackgroundDrawable(colorDrawable);
                r16.A02 = 0.5f;
                r16.A0B = true;
                r16.A08 = z;
                r16.A06 = new C40931u9(this, z, colorDrawable, bidiToolbar, intExtra2);
                ((C14270lr) findViewById(R.id.content).getLayoutParams()).A00(r16);
                AnonymousClass0EZ r02 = this.A0K;
                r02.A00.add(this.A01);
                return;
            }
            throw null;
        }
        throw null;
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        C007003k r1 = this.A00;
        AnonymousClass01I r0 = this.A06;
        r0.A04();
        if (r1.equals(r0.A01) || this.A00.A09()) {
            AnonymousClass01X r4 = ((AnonymousClass2C0) this).A01;
            menu.add(0, R.id.menuitem_edit, 0, r4.A06(R.string.edit_photo)).setIcon(R.drawable.ic_action_edit).setShowAsAction(2);
            menu.add(0, 1, 0, r4.A06(R.string.share)).setIcon(R.drawable.ic_action_share).setShowAsAction(2);
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override // X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onDestroy() {
        super.onDestroy();
        this.A04.removeMessages(0);
        this.A0D.A00(this.A0C);
        AnonymousClass0EZ r0 = this.A0K;
        r0.A00.remove(this.A01);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00a9, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00ad, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00b0, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b4, code lost:
        throw r0;
     */
    @Override // X.ActivityC004702f
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onOptionsItemSelected(android.view.MenuItem r11) {
        /*
        // Method dump skipped, instructions count: 208
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ViewProfilePhoto.onOptionsItemSelected(android.view.MenuItem):boolean");
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        if (menu.size() != 0) {
            C007003k r1 = this.A00;
            AnonymousClass01I r0 = this.A06;
            r0.A04();
            boolean equals = r1.equals(r0.A01);
            if (equals || this.A00.A09()) {
                boolean z = true;
                menu.findItem(1).setVisible(this.A0F.A02(this.A00).exists());
                MenuItem findItem = menu.findItem(R.id.menuitem_edit);
                if (!equals) {
                    AnonymousClass01T r2 = this.A0J;
                    Jid A022 = this.A00.A02(AnonymousClass02U.class);
                    if (A022 == null) {
                        throw null;
                    } else if (!r2.A05((GroupJid) A022) && this.A00.A0Z) {
                        z = false;
                    }
                }
                findItem.setVisible(z);
            }
        }
        return super.onPrepareOptionsMenu(menu);
    }

    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.A03 = bundle.getBoolean("photo_change_requested_externally");
        this.A02 = bundle.getBoolean("photo_change_requested_by_phone");
    }

    @Override // X.ActivityC004802g, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("photo_change_requested_externally", this.A03);
        bundle.putBoolean("photo_change_requested_by_phone", this.A02);
    }
}
