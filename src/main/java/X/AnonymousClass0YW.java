package X;

import android.content.ContentResolver;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Vibrator;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.search.verification.client.R;
import com.whatsapp.CircularProgressBar;
import com.whatsapp.HomeActivity;
import com.whatsapp.camera.CameraMediaPickerFragment;
import com.whatsapp.gallerypicker.MediaPreviewActivity;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.0YW  reason: invalid class name */
public abstract class AnonymousClass0YW {
    public int A00;
    public long A01;
    public long A02;
    public View A03;
    public View A04;
    public View A05;
    public View A06;
    public View A07;
    public View A08;
    public View A09;
    public View A0A;
    public View A0B;
    public View A0C;
    public ImageView A0D;
    public ImageView A0E;
    public TextView A0F;
    public TextView A0G;
    public TextView A0H;
    public RecyclerView A0I;
    public BottomSheetBehavior A0J;
    public CircularProgressBar A0K;
    public ActivityC004702f A0L;
    public AnonymousClass2E3 A0M;
    public AnonymousClass2E6 A0N;
    public CameraMediaPickerFragment A0O;
    public C50822We A0P;
    public AnonymousClass2ED A0Q;
    public AnonymousClass2ES A0R;
    public AnonymousClass2ET A0S;
    public C08340aw A0T = new C08340aw();
    public AnonymousClass2PM A0U;
    public AnonymousClass02N A0V;
    public AnonymousClass02U A0W;
    public C07550Yd A0X;
    public AnonymousClass0JW A0Y;
    public File A0Z;
    public File A0a;
    public String A0b;
    public List A0c;
    public boolean A0d;
    public boolean A0e;
    public boolean A0f;
    public boolean A0g;
    public boolean A0h = true;
    public boolean A0i;
    public boolean A0j;
    public boolean A0k = true;
    public boolean A0l;
    public boolean A0m = true;
    public final Handler A0n = new HandlerC08350ax(this, Looper.getMainLooper());
    public final Handler A0o = new HandlerC08360ay(this, Looper.getMainLooper());
    public final AnonymousClass009 A0p;
    public final AnonymousClass0EW A0q;
    public final AnonymousClass088 A0r;
    public final AnonymousClass02M A0s;
    public final C06180Sc A0t;
    public final AnonymousClass01I A0u;
    public final C000300f A0v;
    public final AnonymousClass08D A0w;
    public final AnonymousClass0XR A0x;
    public final AnonymousClass01A A0y;
    public final AnonymousClass0AI A0z;
    public final AnonymousClass0XN A10;
    public final AnonymousClass04j A11;
    public final AnonymousClass03P A12;
    public final AnonymousClass00G A13;
    public final AnonymousClass03S A14;
    public final AnonymousClass00D A15;
    public final AnonymousClass01X A16;
    public final AnonymousClass01Q A17;
    public final AnonymousClass01P A18;
    public final C002701k A19;
    public final AnonymousClass00Y A1A;
    public final AnonymousClass09H A1B;
    public final AnonymousClass0IA A1C;
    public final C02040Ak A1D;
    public final C01970Ad A1E;
    public final AnonymousClass0XO A1F;
    public final AnonymousClass022 A1G;
    public final C007703s A1H;
    public final AnonymousClass00T A1I;
    public final AnonymousClass0LH A1J = new C08370az(this);
    public final AnonymousClass0JO A1K;
    public final AnonymousClass0Fh A1L;
    public final Runnable A1M = new RunnableEBaseShape2S0100000_I0_2(this, 12);
    public final List A1N = new ArrayList();
    public final Set A1O = new LinkedHashSet();

    public AnonymousClass0YW(AnonymousClass00G r3, AnonymousClass08D r4, C002701k r5, AnonymousClass02M r6, AnonymousClass009 r7, AnonymousClass01I r8, AnonymousClass00T r9, AnonymousClass088 r10, AnonymousClass00Y r11, C000300f r12, C06180Sc r13, AnonymousClass0JO r14, AnonymousClass09H r15, AnonymousClass0Fh r16, AnonymousClass01A r17, AnonymousClass03P r18, AnonymousClass01X r19, AnonymousClass0EW r20, C01970Ad r21, AnonymousClass0XN r22, AnonymousClass0XO r23, AnonymousClass04j r24, AnonymousClass01P r25, AnonymousClass03S r26, AnonymousClass00D r27, AnonymousClass01Q r28, C007703s r29, C02040Ak r30, AnonymousClass0IA r31, AnonymousClass0XR r32, AnonymousClass022 r33, AnonymousClass0AI r34) {
        this.A13 = r3;
        this.A0w = r4;
        this.A19 = r5;
        this.A0s = r6;
        this.A0p = r7;
        this.A0u = r8;
        this.A1I = r9;
        this.A0r = r10;
        this.A1A = r11;
        this.A0v = r12;
        this.A0t = r13;
        this.A1K = r14;
        this.A1B = r15;
        this.A1L = r16;
        this.A0y = r17;
        this.A12 = r18;
        this.A16 = r19;
        this.A0q = r20;
        this.A1E = r21;
        this.A10 = r22;
        this.A1F = r23;
        this.A11 = r24;
        this.A18 = r25;
        this.A14 = r26;
        this.A15 = r27;
        this.A17 = r28;
        this.A1H = r29;
        this.A1D = r30;
        this.A1C = r31;
        this.A0x = r32;
        this.A1G = r33;
        this.A0z = r34;
    }

    public static void A00(AnonymousClass0YW r4, AbstractC48882Od r5) {
        if (r5 != null) {
            Uri A4W = r5.A4W();
            Set set = r4.A1O;
            if (set.contains(A4W)) {
                set.remove(A4W);
                r4.A0T.A00.remove(A4W);
            } else if (set.size() < 30) {
                set.add(A4W);
                r4.A0T.A03(new AnonymousClass2PG(A4W));
            } else {
                r4.A0s.A0C(C28051Sr.A0s(r4.A16, 30), 0);
            }
            if (!set.isEmpty()) {
                r4.A07();
            }
            r4.A0M(!set.isEmpty());
            ((AbstractC16300pa) r4.A0P).A01.A00();
        }
    }

    public void A01() {
        if (!(this instanceof AnonymousClass2WS)) {
            AnonymousClass0Yk r0 = (AnonymousClass0Yk) this;
            r0.A0U();
            HomeActivity homeActivity = r0.A00;
            homeActivity.getWindow().clearFlags(1024);
            homeActivity.getWindow().addFlags(2048);
            return;
        }
        ((AnonymousClass2WS) this).A00.finish();
    }

    public void A02() {
        boolean z = false;
        if (this.A0L != null) {
            z = true;
        }
        if (z) {
            AnonymousClass0JW r0 = this.A0Y;
            if (r0 != null) {
                r0.A00.cancel(true);
                this.A0Y = null;
            }
            AnonymousClass2PM r02 = this.A0U;
            if (r02 != null) {
                r02.A00();
                this.A0U = null;
            }
            this.A0n.removeMessages(0);
            this.A0o.removeMessages(0);
            this.A1K.A00(this.A1J);
            C50822We r1 = this.A0P;
            AbstractC48892Oe r03 = r1.A00;
            if (r03 != null) {
                r03.close();
                r1.A00 = null;
            }
        }
    }

    public void A03() {
        boolean z = false;
        if (this.A0L != null) {
            z = true;
        }
        if (z) {
            if (this.A0N.ABT()) {
                boolean z2 = false;
                if (System.currentTimeMillis() - this.A02 > 1000) {
                    z2 = true;
                }
                A0O(z2);
            }
            if (this.A07.getVisibility() == 0) {
                this.A07.setVisibility(8);
                this.A0E.setEnabled(false);
            }
            this.A0N.pause();
            AnonymousClass2ED r0 = this.A0Q;
            if (r0 != null) {
                r0.disable();
            }
        }
    }

    public void A04() {
        boolean z = false;
        if (this.A0L != null) {
            z = true;
        }
        if (z && this.A0e) {
            this.A0N.AN6();
            if (this.A07.getVisibility() == 8) {
                this.A07.setVisibility(0);
            }
            AnonymousClass2ED r0 = this.A0Q;
            if (r0 != null) {
                r0.enable();
            }
        }
    }

    public void A05() {
        AnonymousClass0JW r0 = this.A0Y;
        if (r0 != null) {
            r0.A00.cancel(true);
        }
        C10980fW r2 = new C10980fW(this.A13, this, this.A0p, this.A0v, this.A1F, this.A14, this.A1H);
        this.A0Y = r2;
        this.A1I.ANC(r2, new Void[0]);
    }

    public void A06() {
        boolean z = false;
        if (this.A0L != null) {
            z = true;
        }
        if (z) {
            if (Build.MANUFACTURER.equals("OnePlus")) {
                String str = Build.MODEL;
                if ((str.equals("ONEPLUS A3000") || str.equals("ONEPLUS A3003") || str.equals("ONEPLUS A3010")) && this.A1L.A04()) {
                    this.A0s.A06(R.string.error_camera_disabled_during_video_call, 1);
                    A01();
                    return;
                }
            }
            this.A0e = true;
            AnonymousClass0XR r2 = this.A0x;
            if (r2 != null) {
                r2.A02 = SystemClock.elapsedRealtime();
                this.A0N.AN6();
                this.A07.removeCallbacks(this.A1M);
                this.A05.setVisibility(0);
                if (this.A07.getVisibility() == 0) {
                    this.A06.setVisibility(8);
                } else {
                    this.A07.setVisibility(0);
                }
                A0N(true);
                return;
            }
            throw null;
        }
        throw new IllegalStateException("need to call onCreate first");
    }

    public final void A07() {
        ActivityC004702f r9 = this.A0L;
        if (r9 != null) {
            AnonymousClass03P r8 = this.A12;
            AnonymousClass01X r7 = this.A16;
            Set set = this.A1O;
            C002001d.A2R(r9, r8, r7.A0A(R.plurals.n_items_selected, (long) set.size(), Integer.valueOf(set.size())));
        }
    }

    public final void A08() {
        int i;
        int i2;
        Log.i("cameraui/startvideocapture");
        if (this.A1O.size() >= 30) {
            this.A0s.A0C(C28051Sr.A0s(this.A16, 30), 0);
        } else if (this.A1L.A04()) {
            this.A0s.A06(R.string.error_camera_disabled_during_video_call, 1);
            A01();
        } else {
            this.A0a = AnonymousClass35M.A00(this.A0L, this.A0r, this.A1G, AnonymousClass1XO.A0N, ".mp4");
            int rotation = this.A0L.getWindowManager().getDefaultDisplay().getRotation();
            int i3 = this.A0L.getResources().getConfiguration().orientation;
            if (i3 != 1) {
                if (i3 == 2) {
                    if (rotation == 0 || rotation == 1) {
                        this.A0L.setRequestedOrientation(0);
                    } else {
                        this.A0L.setRequestedOrientation(8);
                    }
                }
            } else if (rotation == 0 || rotation == 1) {
                this.A0L.setRequestedOrientation(1);
            } else {
                this.A0L.setRequestedOrientation(9);
            }
            if (this.A0Q == null || Settings.System.getInt(this.A0L.getContentResolver(), "accelerometer_rotation", 0) != 0 || (i2 = this.A0Q.A00) == -1) {
                i = 0;
            } else {
                i = ((i2 - ((4 - rotation) % 4)) * 90) % 360;
                if (i < 0) {
                    i += 360;
                }
            }
            if (this.A0N.ACD()) {
                A0B(-855638017);
            }
            this.A07.setKeepScreenOn(true);
            AnonymousClass0XR r5 = this.A0x;
            if (r5 != null) {
                r5.A05 = SystemClock.elapsedRealtime();
                AnonymousClass2E6 r52 = this.A0N;
                File file = this.A0a;
                if (r52.AB5()) {
                    i = 360 - i;
                }
                r52.AQ8(file, i);
                this.A0n.sendEmptyMessage(0);
                this.A0K.setProgress(0);
                this.A0A.setVisibility(0);
                this.A0F.setVisibility(8);
                this.A0m = false;
                ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.0f, 1.0f, 0.0f, 1, 0.5f, 1, 0.5f);
                scaleAnimation.setDuration(200);
                this.A0C.startAnimation(scaleAnimation);
                this.A0C.setVisibility(8);
                ScaleAnimation scaleAnimation2 = new ScaleAnimation(1.0f, 0.0f, 1.0f, 0.0f, 1, 0.5f, 1, 0.5f);
                scaleAnimation2.setDuration(200);
                this.A0D.startAnimation(scaleAnimation2);
                this.A0D.setVisibility(8);
                A0N(false);
                this.A02 = System.currentTimeMillis();
                return;
            }
            throw null;
        }
    }

    public final void A09() {
        Log.i("cameraui/takepicture");
        Set set = this.A1O;
        boolean z = false;
        if (set.size() >= 30) {
            this.A0s.A0C(C28051Sr.A0s(this.A16, 30), 0);
            return;
        }
        AnonymousClass0XR r3 = this.A0x;
        if (r3 != null) {
            r3.A00 = SystemClock.elapsedRealtime();
            this.A0E.setEnabled(false);
            this.A0C.setEnabled(false);
            this.A0D.setEnabled(false);
            if (set.isEmpty()) {
                if (this.A03.getVisibility() == 0) {
                    this.A03.startAnimation(AnonymousClass008.A02(1.0f, 0.0f, 150));
                    this.A03.setVisibility(8);
                }
                this.A0k = false;
                ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.0f, 1.0f, 0.0f, 1, 0.5f, 1, 0.5f);
                scaleAnimation.setDuration(150);
                this.A0C.startAnimation(scaleAnimation);
                this.A0C.setVisibility(8);
                ScaleAnimation scaleAnimation2 = new ScaleAnimation(1.0f, 0.0f, 1.0f, 0.0f, 1, 0.5f, 1, 0.5f);
                scaleAnimation2.setDuration(150);
                this.A0D.startAnimation(scaleAnimation2);
                this.A0D.setVisibility(8);
            }
            if (this.A0N.ACD()) {
                A0B(-3886);
                this.A07.postDelayed(new RunnableEBaseShape2S0100000_I0_2(this, 11), 300);
                return;
            }
            if (set.size() > 0) {
                z = true;
            }
            this.A0N.AQS(new AnonymousClass2WW(this), z);
            return;
        }
        throw null;
    }

    public final void A0A() {
        if (this.A0N.getFlashModes().size() <= 1) {
            this.A0D.setVisibility(8);
            return;
        }
        this.A0D.setVisibility(0);
        A0H(this.A0N.getFlashMode());
    }

    public final void A0B(int i) {
        View findViewById = this.A0L.findViewById(R.id.fake_flash);
        boolean z = true;
        boolean z2 = false;
        if (findViewById.getVisibility() == 0) {
            z2 = true;
        }
        if (i == 0) {
            z = false;
        }
        if (z2 != z) {
            WindowManager.LayoutParams attributes = this.A0L.getWindow().getAttributes();
            if (i != 0) {
                findViewById.setVisibility(0);
                findViewById.setBackgroundColor(i);
                attributes.screenBrightness = 1.0f;
            } else {
                findViewById.setVisibility(4);
                attributes.screenBrightness = -1.0f;
            }
            this.A0L.getWindow().setAttributes(attributes);
        }
    }

    public void A0C(long j) {
        boolean z = false;
        if (this.A0L != null) {
            z = true;
        }
        if (z) {
            C07550Yd r1 = this.A0X;
            AnonymousClass3ME r0 = ((AbstractC07560Ye) r1).A00;
            if (r0 != null) {
                r0.A00();
                ((AbstractC07560Ye) r1).A00 = null;
            }
            this.A0N.A2j();
            boolean z2 = false;
            this.A0e = false;
            this.A0J.A0D(4);
            View view = this.A07;
            Runnable runnable = this.A1M;
            view.removeCallbacks(runnable);
            if (this.A07.getVisibility() != 4) {
                if (j == 0) {
                    this.A07.setVisibility(4);
                } else {
                    this.A07.postDelayed(runnable, j);
                }
            }
            this.A06.setVisibility(0);
            this.A0N.pause();
            Set set = this.A1O;
            if (!set.isEmpty() || !this.A1N.isEmpty()) {
                z2 = true;
            }
            this.A0T = new C08340aw();
            set.clear();
            List<AbstractC53972e9> list = this.A1N;
            if (!list.isEmpty()) {
                for (AbstractC53972e9 r02 : list) {
                    File A6P = r02.A6P();
                    if (!A6P.delete()) {
                        StringBuilder sb = new StringBuilder("cameraui/cannot-delete-file ");
                        sb.append(A6P);
                        Log.w(sb.toString());
                    }
                }
                list.clear();
            }
            if (z2) {
                ((AbstractC16300pa) this.A0P).A01.A00();
            }
        }
    }

    public void A0D(Bundle bundle) {
        Object r1;
        Set set = this.A1O;
        set.clear();
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("multi_selected");
        if (parcelableArrayList != null) {
            set.addAll(parcelableArrayList);
        }
        this.A0T.A01(bundle);
        List list = this.A1N;
        list.clear();
        ArrayList<C49092Oz> parcelableArrayList2 = bundle.getParcelableArrayList("captured_media");
        if (parcelableArrayList2 != null && !parcelableArrayList2.isEmpty()) {
            ContentResolver contentResolver = this.A13.A00.getContentResolver();
            ArrayList arrayList = new ArrayList(parcelableArrayList2.size());
            for (C49092Oz r0 : parcelableArrayList2) {
                byte b = r0.A00;
                if (b == 1) {
                    r1 = new C59692o8(contentResolver, r0.A02, r0.A03, r0.A01);
                } else if (b == 3) {
                    r1 = new C59702o9(r0.A02);
                } else {
                    StringBuilder A0S2 = AnonymousClass008.A0S("Unsupported media type: ");
                    A0S2.append((int) b);
                    throw new AssertionError(A0S2.toString());
                }
                arrayList.add(r1);
            }
            list.addAll(arrayList);
        }
        this.A0f = !list.isEmpty();
        C50822We r02 = this.A0P;
        if (r02 != null) {
            ((AbstractC16300pa) r02).A01.A00();
        }
        if (this.A0B != null) {
            A0M(!set.isEmpty());
        }
        BottomSheetBehavior bottomSheetBehavior = this.A0J;
        if (bottomSheetBehavior == null) {
            return;
        }
        if (bottomSheetBehavior.A0B == 3) {
            this.A08.setVisibility(4);
            this.A0I.setVisibility(4);
            this.A04.setVisibility(4);
            this.A09.setVisibility(0);
            this.A09.setAlpha(1.0f);
            return;
        }
        View view = this.A08;
        int i = 8;
        if (A0R()) {
            i = 0;
        }
        view.setVisibility(i);
        this.A0I.setVisibility(0);
        this.A04.setVisibility(0);
        this.A09.setVisibility(4);
        this.A09.setAlpha(0.0f);
    }

    public void A0E(Bundle bundle) {
        bundle.putParcelableArrayList("multi_selected", new ArrayList<>(this.A1O));
        C08340aw r0 = this.A0T;
        if (r0 != null) {
            Bundle bundle2 = new Bundle();
            r0.A02(bundle2);
            bundle.putBundle("media_preview_params", bundle2);
            List<AbstractC53972e9> list = this.A1N;
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>(list.size());
            for (AbstractC53972e9 r1 : list) {
                arrayList.add(new C49092Oz(r1));
            }
            bundle.putParcelableArrayList("captured_media", arrayList);
            return;
        }
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0206  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0243  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0256  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0372  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x03e7  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x042a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0F(X.ActivityC004702f r41, X.AnonymousClass02N r42, long r43, X.AnonymousClass02U r45, boolean r46, java.lang.String r47, java.util.List r48, java.util.ArrayList r49, X.C08340aw r50, boolean r51, boolean r52) {
        /*
        // Method dump skipped, instructions count: 1084
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0YW.A0F(X.02f, X.02N, long, X.02U, boolean, java.lang.String, java.util.List, java.util.ArrayList, X.0aw, boolean, boolean):void");
    }

    public final void A0G(AbstractC48882Od r5, C59592ny r6, boolean z) {
        if (r5 == null) {
            Log.i("cameraui/showpreview/media-is-null");
            return;
        }
        Uri A4W = r5.A4W();
        StringBuilder sb = new StringBuilder("cameraui/showpreview ");
        sb.append(A4W);
        Log.i(sb.toString());
        if (!this.A0L.AB1()) {
            if (z) {
                this.A1N.add(0, r5);
            }
            this.A0T.A03(new AnonymousClass2PG(A4W));
            Set set = this.A1O;
            if (set.size() > 0) {
                this.A0f = true;
                set.add(A4W);
                ((AbstractC16300pa) this.A0P).A01.A00();
                A0M(true);
                A07();
                this.A0N.AN4();
                A0N(true);
                return;
            }
            A0J(Collections.singletonList(A4W), r6);
        }
    }

    public final void A0H(String str) {
        int i;
        int i2;
        Object obj;
        int i3;
        if ("off".equals(str)) {
            i = R.drawable.flash_off;
            i2 = R.string.flash_off;
        } else if ("on".equals(str)) {
            i = R.drawable.flash_on;
            i2 = R.string.flash_on;
        } else {
            boolean equals = "auto".equals(str);
            i = R.drawable.flash_off;
            i2 = R.string.flash_off;
            if (equals) {
                i = R.drawable.flash_auto;
                i2 = R.string.flash_auto;
            }
        }
        List flashModes = this.A0N.getFlashModes();
        if (flashModes.isEmpty()) {
            obj = null;
        } else {
            obj = flashModes.get((flashModes.indexOf(str) + 1) % flashModes.size());
        }
        if ("off".equals(obj)) {
            i3 = R.string.flash_off_action;
        } else if ("on".equals(obj)) {
            i3 = R.string.flash_on_action;
        } else {
            boolean equals2 = "auto".equals(obj);
            i3 = R.string.flash_off_action;
            if (equals2) {
                i3 = R.string.flash_auto_action;
            }
        }
        AnonymousClass01X r2 = this.A16;
        C002001d.A2w(r2, this.A0D, i3);
        this.A0D.setContentDescription(r2.A06(i2));
        int i4 = this.A00;
        if (i4 == i || i4 == 0) {
            this.A0D.setImageResource(i);
        } else {
            AnonymousClass2NN r4 = new AnonymousClass2NN(C004302a.A03(this.A0L, i4), C004302a.A03(this.A0L, i));
            int intrinsicHeight = r4.getIntrinsicHeight();
            r4.A00 = 120;
            r4.A01 = this.A0D.getPaddingTop() + intrinsicHeight;
            r4.A02 = 0;
            r4.invalidateSelf();
            this.A0D.setImageDrawable(r4);
        }
        this.A00 = i;
    }

    public final void A0I(ArrayList arrayList) {
        Set set = this.A1O;
        set.clear();
        if (arrayList != null) {
            set.addAll(arrayList);
        }
        this.A0d = true;
        A0M(!set.isEmpty());
        this.A0f = true;
        ((AbstractC16300pa) this.A0P).A01.A00();
        A0L(true);
    }

    public final void A0J(Collection collection, C59592ny r11) {
        Bitmap bitmap;
        AbstractC48882Od r7;
        ArrayList arrayList = null;
        if (!AnonymousClass2UT.A00 || r11 == null) {
            bitmap = null;
            r7 = null;
        } else {
            arrayList = new ArrayList();
            arrayList.add(new AnonymousClass02R(r11, AnonymousClass0Q7.A0G(r11)));
            View findViewById = this.A0L.findViewById(R.id.header_transition);
            arrayList.add(new AnonymousClass02R(findViewById, AnonymousClass0Q7.A0G(findViewById)));
            View findViewById2 = this.A0L.findViewById(R.id.footer_transition);
            arrayList.add(new AnonymousClass02R(findViewById2, AnonymousClass0Q7.A0G(findViewById2)));
            View findViewById3 = this.A0L.findViewById(R.id.filter_swipe_transition);
            arrayList.add(new AnonymousClass02R(findViewById3, AnonymousClass0Q7.A0G(findViewById3)));
            View findViewById4 = this.A0L.findViewById(R.id.send_button_transition);
            arrayList.add(new AnonymousClass02R(findViewById4, AnonymousClass0Q7.A0G(findViewById4)));
            bitmap = r11.A00;
            r7 = r11.A04;
        }
        A0K(collection, arrayList, bitmap, r7, this.A0O);
    }

    public void A0K(Collection collection, List list, Bitmap bitmap, AbstractC48882Od r27, AnonymousClass037 r28) {
        int intExtra;
        Bundle bundle;
        Uri uri;
        int intExtra2;
        Iterator it = collection.iterator();
        boolean z = false;
        loop0:
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            Iterator it2 = this.A1N.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (next.equals(((AbstractC48882Od) it2.next()).A4W())) {
                        z = true;
                        break loop0;
                    }
                }
            }
        }
        ArrayList arrayList = new ArrayList(collection);
        ActivityC004702f r0 = this.A0L;
        String A0D2 = AnonymousClass1VY.A0D(this.A0V);
        int i = 0;
        if (this.A01 == 0) {
            i = 30;
        }
        if (!(this instanceof AnonymousClass2WS)) {
            intExtra = 1;
        } else {
            intExtra = ((AnonymousClass2WS) this).A00.getIntent().getIntExtra("origin", 1);
        }
        int i2 = 2;
        if (intExtra != 1) {
            if (intExtra == 2) {
                i2 = 13;
                if (z) {
                    i2 = 12;
                }
            } else if (intExtra == 3) {
                i2 = 21;
                if (z) {
                    i2 = 7;
                }
            } else if (intExtra == 4) {
                i2 = 16;
                if (z) {
                    i2 = 15;
                }
            } else if (intExtra == 5) {
                i2 = 19;
                if (z) {
                    i2 = 18;
                }
            } else {
                StringBuilder A0S2 = AnonymousClass008.A0S("Invalid camera origin:");
                if (!(this instanceof AnonymousClass2WS)) {
                    intExtra2 = 1;
                } else {
                    intExtra2 = ((AnonymousClass2WS) this).A00.getIntent().getIntExtra("origin", 1);
                }
                A0S2.append(intExtra2);
                throw new IllegalStateException(A0S2.toString());
            }
        } else if (!z) {
            i2 = 10;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.A01;
        String A0D3 = AnonymousClass1VY.A0D(this.A0W);
        boolean z2 = this.A0g;
        if (!this.A0d) {
            Iterator it3 = new ArrayList(this.A0T.A00.values()).iterator();
            while (it3.hasNext()) {
                AnonymousClass2PG r3 = (AnonymousClass2PG) it3.next();
                r3.A0A(null);
                r3.A0B(null);
            }
            AnonymousClass2PG A002 = this.A0T.A00((Uri) arrayList.get(0));
            List list2 = this.A0c;
            if (list2 != null) {
                A002.A0B(C006803i.A0M(list2));
            }
            if (!TextUtils.isEmpty(this.A0b)) {
                A002.A0A(this.A0b);
            }
        }
        C08340aw r32 = this.A0T;
        Bundle bundle2 = new Bundle();
        r32.A02(bundle2);
        if (!AnonymousClass2UT.A00 || list == null || bitmap == null || r27 == null || r27.getContentLength() > 20000000 || collection.size() != 1) {
            bundle = null;
            uri = null;
        } else {
            uri = (Uri) collection.iterator().next();
            this.A0w.A03().A05(C28051Sr.A0q(uri), bitmap);
            bundle = C14460mJ.A00(this.A0L, (AnonymousClass02R[]) list.toArray(new AnonymousClass02R[0])).A01();
        }
        Intent intent = new Intent(r0, MediaPreviewActivity.class);
        intent.putExtra("android.intent.extra.STREAM", arrayList);
        intent.putExtra("android.intent.extra.TEXT", (String) null);
        intent.putExtra("jid", A0D2);
        intent.putExtra("jids", (Serializable) null);
        intent.putExtra("max_items", i);
        intent.putExtra("origin", i2);
        intent.putExtra("picker_open_time", elapsedRealtime);
        intent.putExtra("send", true);
        intent.putExtra("quoted_message_row_id", j);
        intent.putExtra("quoted_group_jid", A0D3);
        intent.putExtra("number_from_url", z2);
        intent.putExtra("media_preview_params", bundle2);
        intent.putExtra("smb_quick_reply", false);
        intent.putExtra("start_home", false);
        intent.putExtra("animate_uri", uri);
        intent.putExtra("preselected_image_uri", (Parcelable) null);
        intent.putExtra("scan_for_qr", true);
        r28.A0M(intent, 1, bundle);
        if (z && collection.size() == 1) {
            this.A0L.overridePendingTransition(17432576, 17432577);
        }
    }

    public void A0L(boolean z) {
        Log.i("cameraui/restoreui");
        boolean z2 = true;
        A0N(true);
        this.A0E.setVisibility(0);
        this.A0E.setImageResource(R.drawable.btn_shutter);
        this.A0F.setVisibility(0);
        this.A0m = true;
        if (z && this.A07.getVisibility() != 0) {
            this.A07.setVisibility(0);
        }
        boolean AB7 = this.A0N.AB7();
        this.A0E.setEnabled(AB7);
        this.A0C.setEnabled(AB7);
        this.A0D.setEnabled(AB7);
        if (z && !AB7) {
            this.A07.requestLayout();
            this.A07.getViewTreeObserver().addOnGlobalLayoutListener(new AnonymousClass2EA(this));
        }
        int i = 8;
        this.A0A.setVisibility(8);
        boolean z3 = false;
        if (this.A0C.getVisibility() == 0) {
            z3 = true;
        }
        View view = this.A0C;
        if (this.A0N.getNumberOfCameras() > 1) {
            i = 0;
        }
        view.setVisibility(i);
        if (!z3 && this.A0C.getVisibility() == 0) {
            ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.5f, 1, 0.5f);
            scaleAnimation.setDuration(200);
            this.A0C.startAnimation(scaleAnimation);
        }
        if (this.A0D.getVisibility() != 0) {
            z2 = false;
        }
        A0A();
        if (!z2 && this.A0D.getVisibility() == 0) {
            ScaleAnimation scaleAnimation2 = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.5f, 1, 0.5f);
            scaleAnimation2.setDuration(200);
            this.A0D.startAnimation(scaleAnimation2);
        }
    }

    public final void A0M(boolean z) {
        if (z) {
            if (this.A0B.getVisibility() != 0) {
                this.A0B.setVisibility(0);
                ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.5f, 1, 0.5f);
                scaleAnimation.setDuration(120);
                this.A0B.startAnimation(scaleAnimation);
            }
            TextView textView = this.A0H;
            Set set = this.A1O;
            textView.setText(String.valueOf(set.size()));
            this.A0H.setContentDescription(this.A16.A0A(R.plurals.n_items_selected, (long) set.size(), Integer.valueOf(set.size())));
        } else if (this.A0B.getVisibility() != 8) {
            this.A0B.setVisibility(8);
            ScaleAnimation scaleAnimation2 = new ScaleAnimation(1.0f, 0.0f, 1.0f, 0.0f, 1, 0.5f, 1, 0.5f);
            scaleAnimation2.setDuration(120);
            this.A0B.startAnimation(scaleAnimation2);
        }
    }

    public final void A0N(boolean z) {
        this.A0k = z;
        if (z) {
            if (this.A03.getVisibility() != 0) {
                this.A03.setVisibility(0);
            }
            A0M(!this.A1O.isEmpty());
            return;
        }
        if (this.A03.getVisibility() != 8) {
            this.A03.setVisibility(8);
            AnimationSet animationSet = new AnimationSet(true);
            TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 1.0f);
            animationSet.addAnimation(new AlphaAnimation(1.0f, 0.0f));
            animationSet.addAnimation(translateAnimation);
            animationSet.setDuration(300);
            this.A03.startAnimation(animationSet);
        }
        A0M(false);
    }

    public final void A0O(boolean z) {
        File file;
        Vibrator vibrator;
        this.A0E.setImageResource(R.drawable.btn_shutter);
        this.A0E.clearAnimation();
        StringBuilder sb = new StringBuilder("cameraui/stopvideocapture ");
        sb.append(z);
        Log.i(sb.toString());
        AnonymousClass0XR r8 = this.A0x;
        if (r8 != null) {
            r8.A06 = SystemClock.elapsedRealtime();
            this.A0N.AQH();
            AnonymousClass2E6 r1 = this.A0N;
            Integer valueOf = Integer.valueOf(r1.getCameraApi());
            int cameraType = r1.getCameraType();
            int i = !r1.AB5();
            String l = Long.toString(r1.getVideoResolution());
            if (r8 != null) {
                long elapsedRealtime = SystemClock.elapsedRealtime() - r8.A06;
                long j = r8.A04;
                C44101zV r12 = new C44101zV();
                r12.A02 = Integer.valueOf(cameraType);
                r12.A00 = valueOf;
                r12.A01 = Integer.valueOf(i);
                r12.A05 = l;
                r12.A03 = Long.valueOf(j);
                r12.A04 = Long.valueOf(elapsedRealtime);
                r8.A01(r12);
                A0B(0);
                this.A0L.setRequestedOrientation(-1);
                try {
                    if (!(Settings.System.getInt(this.A0L.getContentResolver(), "haptic_feedback_enabled") == 0 || (vibrator = (Vibrator) this.A0L.getSystemService("vibrator")) == null)) {
                        vibrator.vibrate(75);
                    }
                } catch (Settings.SettingNotFoundException e) {
                    Log.e("cameraui/stopvideocapture", e);
                }
                if (!z || (file = this.A0a) == null) {
                    File file2 = this.A0a;
                    if (file2 == null || !file2.exists()) {
                        StringBuilder A0S2 = AnonymousClass008.A0S("cameraui/video file doesn't exist: ");
                        A0S2.append(this.A0a);
                        Log.e(A0S2.toString());
                    } else if (!this.A0a.delete()) {
                        StringBuilder A0S3 = AnonymousClass008.A0S("cameraui/failed to delete video ");
                        A0S3.append(this.A0a.getAbsolutePath());
                        Log.e(A0S3.toString());
                    }
                    this.A0a = null;
                    A0L(true);
                    return;
                }
                A0G(new C59702o9(file), null, true);
                return;
            }
            throw null;
        }
        throw null;
    }

    public final void A0P(boolean z) {
        if (z) {
            this.A0C.setContentDescription(this.A13.A00.getResources().getString(R.string.switch_to_back_camera));
        } else {
            this.A0C.setContentDescription(this.A13.A00.getResources().getString(R.string.switch_to_front_camera));
        }
    }

    public boolean A0Q() {
        ActivityC004702f r3 = this.A0L;
        boolean z = false;
        if (r3 != null) {
            z = true;
        }
        if (z) {
            if (this.A0J.A0B == 3) {
                AnonymousClass037 A062 = r3.A04().A06(R.id.gallery_container);
                if (A062 instanceof CameraMediaPickerFragment) {
                    CameraMediaPickerFragment cameraMediaPickerFragment = (CameraMediaPickerFragment) A062;
                    if (cameraMediaPickerFragment.A0w()) {
                        cameraMediaPickerFragment.A0z();
                        return true;
                    }
                }
                this.A0J.A0D(4);
                return true;
            }
            Set set = this.A1O;
            if (!set.isEmpty()) {
                this.A0T = new C08340aw();
                set.clear();
                ((AbstractC16300pa) this.A0P).A01.A00();
                A0M(false);
                return true;
            }
        }
        List<AbstractC53972e9> list = this.A1N;
        if (!list.isEmpty()) {
            for (AbstractC53972e9 r0 : list) {
                File A6P = r0.A6P();
                if (!A6P.delete()) {
                    StringBuilder sb = new StringBuilder("cameraui/cannot-delete-file ");
                    sb.append(A6P);
                    Log.w(sb.toString());
                }
            }
            list.clear();
            ((AbstractC16300pa) this.A0P).A01.A00();
        }
        return false;
    }

    public final boolean A0R() {
        return this.A0I != null && this.A0P.A05() >= 12;
    }

    public boolean A0S(int i) {
        boolean z = false;
        if (this.A0L != null) {
            z = true;
        }
        if (!z) {
            return false;
        }
        if ((i != 25 && i != 24) || !this.A0N.AB7()) {
            return false;
        }
        if (!this.A0N.ABT()) {
            Handler handler = this.A0o;
            if (!handler.hasMessages(0)) {
                Log.i("cameraui/volume-key-down");
                this.A0E.setPressed(true);
                handler.sendMessageDelayed(handler.obtainMessage(0), 500);
            }
        }
        return true;
    }

    public boolean A0T(int i) {
        boolean z = false;
        if (this.A0L != null) {
            z = true;
        }
        if (!z) {
            return false;
        }
        if (i != 25 && i != 24) {
            return false;
        }
        this.A0o.removeMessages(0);
        if (this.A0N.ABT()) {
            Log.i("cameraui/volume-key-up/stop-video-capture");
            boolean z2 = false;
            if (System.currentTimeMillis() - this.A02 > 1000) {
                z2 = true;
            }
            A0O(z2);
        } else {
            Log.i("cameraui/volume-key-up/take-picture");
            A09();
        }
        this.A0E.setPressed(false);
        return true;
    }
}
