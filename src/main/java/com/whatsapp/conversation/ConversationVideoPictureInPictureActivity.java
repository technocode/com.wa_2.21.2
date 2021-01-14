package com.whatsapp.conversation;

import X.ActivityC004802g;
import X.AnonymousClass008;
import X.AnonymousClass009;
import X.AnonymousClass00G;
import X.AnonymousClass00T;
import X.AnonymousClass01X;
import X.AnonymousClass02M;
import X.AnonymousClass03P;
import X.AnonymousClass0W2;
import X.AnonymousClass2H5;
import X.AnonymousClass2H6;
import X.AnonymousClass2HX;
import X.AnonymousClass2HY;
import X.AnonymousClass2ZD;
import X.AnonymousClass374;
import X.AnonymousClass37C;
import X.AnonymousClass37D;
import X.AnonymousClass37M;
import X.AnonymousClass3T2;
import X.C001801b;
import X.C002101e;
import X.C02780Dk;
import X.C47502If;
import X.C51882aC;
import X.C72283Sg;
import X.C72293Sh;
import X.C72303Si;
import X.C72313Sj;
import X.C72403Ss;
import X.C72463Sy;
import X.C74303ab;
import android.app.PendingIntent;
import android.app.PictureInPictureParams;
import android.app.RemoteAction;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Rational;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.facebook.redex.ViewOnClickEBaseShape9S0100000_I1_7;
import com.google.android.search.verification.client.R;
import com.whatsapp.Mp4Ops;
import com.whatsapp.util.Log;
import java.util.ArrayList;

public class ConversationVideoPictureInPictureActivity extends ActivityC004802g implements AnonymousClass37C {
    public int A00;
    public int A01;
    public PictureInPictureParams.Builder A02 = new PictureInPictureParams.Builder();
    public BroadcastReceiver A03;
    public GestureDetector A04;
    public AnonymousClass374 A05;
    public AnonymousClass37D A06;
    public final C02780Dk A07 = C02780Dk.A02();
    public final AnonymousClass009 A08 = AnonymousClass009.A00();
    public final AnonymousClass02M A09 = AnonymousClass02M.A00();
    public final Mp4Ops A0A = Mp4Ops.A00();
    public final C47502If A0B = new AnonymousClass2ZD(this);
    public final C51882aC A0C = C51882aC.A00;
    public final AnonymousClass03P A0D = AnonymousClass03P.A00();
    public final AnonymousClass00G A0E = AnonymousClass00G.A01;
    public final AnonymousClass01X A0F = AnonymousClass01X.A00();
    public final AnonymousClass00T A0G = C002101e.A00();

    public static Intent A00() {
        return new Intent("finish_pip");
    }

    public void A0D() {
        if (isInPictureInPictureMode()) {
            Log.i("ConversationVideoPictureInPictureActivity/enterPictureInPicture/already-in-pip");
            return;
        }
        Rational rational = new Rational(this.A01, this.A00);
        this.A02.setAspectRatio(rational);
        StringBuilder sb = new StringBuilder("ConversationVideoPictureInPictureActivity/enterPictureInPicture/aspect-ratio:");
        sb.append(rational);
        Log.i(sb.toString());
        try {
            if (!enterPictureInPictureMode(this.A02.build())) {
                Log.i("ConversationVideoPictureInPictureActivity/enterPictureInPicture/cannot-enter-pip");
                finish();
            }
        } catch (IllegalArgumentException e) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("enterPictureInPicture/incorrect params provided for pip mode/video width: ");
            sb2.append(this.A01);
            sb2.append(" video height: ");
            sb2.append(this.A00);
            Log.w(sb2.toString(), e);
        } catch (IllegalStateException e2) {
            Log.w("enterPictureInPicture/exception trying to enter pip mode", e2);
        } catch (Throwable th) {
            Log.i("ConversationVideoPictureInPictureActivity/enterPictureInPicture/cannot-enter-pip");
            finish();
            throw th;
        }
    }

    public void A0E() {
        Log.i("ConversationVideoPictureInPictureActivity/setup/set-pause-action");
        A0H(R.drawable.ic_video_pause_conv, R.string.play, 102, 1);
    }

    public void A0F() {
        Log.i("ConversationVideoPictureInPictureActivity/setup/set-play-action");
        A0H(R.drawable.ic_video_play_conv, R.string.pause, 101, 0);
    }

    public final void A0G() {
        AnonymousClass37M r7;
        Intent intent = getIntent();
        this.A01 = intent.getIntExtra("video_width", 16);
        this.A00 = intent.getIntExtra("video_height", 9);
        boolean booleanExtra = intent.getBooleanExtra("is_video_playing", true);
        StringBuilder A0S = AnonymousClass008.A0S("ConversationVideoPictureInPictureActivity/width: ");
        A0S.append(this.A01);
        A0S.append(", height: ");
        AnonymousClass008.A1L(A0S, this.A00);
        if (booleanExtra) {
            A0E();
        } else {
            A0F();
        }
        AnonymousClass37D r1 = this.A06;
        if (r1 != null) {
            r1.A05 = intent.getStringExtra("video_url");
            Bitmap bitmap = (Bitmap) intent.getParcelableExtra("video_thumbnail");
            r1.A00 = intent.getIntExtra("video_seek_position", 0);
            r1.A01 = intent.getIntExtra("video_type", 0);
            boolean booleanExtra2 = intent.getBooleanExtra("is_video_playing", true);
            if (bitmap != null) {
                ((ImageView) r1.A02.findViewById(R.id.background)).setImageBitmap(bitmap);
            }
            r1.A02.setCloseBtnListener(new C72313Sj(r1));
            r1.A02.setFullscreenButtonClickListener(new C72293Sh(r1));
            r1.A02.A04 = new AnonymousClass3T2(r1);
            if (r1.A01 == 4) {
                r7 = new C72463Sy(r1.A08.getContext(), r1.A0A, r1.A05, r1.A02, bitmap);
            } else {
                AnonymousClass02M r8 = r1.A0A;
                AnonymousClass00T r9 = r1.A0F;
                AnonymousClass03P r10 = r1.A0C;
                AnonymousClass01X r11 = r1.A0E;
                Context context = r1.A06;
                r7 = new C72403Ss(r8, r9, r10, r11, C02780Dk.A00(context), Uri.parse(r1.A05), new C74303ab(r1.A0D, r1.A0B, r1.A09, AnonymousClass0W2.A05(context, C001801b.A0V(context))), null);
            }
            r1.A04 = r7;
            CoordinatorLayout coordinatorLayout = r1.A08;
            coordinatorLayout.removeAllViews();
            FrameLayout frameLayout = r1.A07;
            frameLayout.removeAllViews();
            frameLayout.addView(r1.A02);
            frameLayout.addView(r1.A04.A04(), 0);
            coordinatorLayout.addView(frameLayout);
            frameLayout.setOnClickListener(new ViewOnClickEBaseShape9S0100000_I1_7(r1, 21));
            r1.A04.A04().setBackgroundColor(-16777216);
            r1.A02.setPlayer(r1.A04);
            AnonymousClass37M r4 = r1.A04;
            r4.A03 = new C72283Sg(r1, booleanExtra2);
            r4.A01 = new C72303Si(r1);
            AnonymousClass374 r3 = r1.A02;
            if (r3.A05 != null) {
                r3.A0H.setVisibility(0);
            }
            r3.A0Q.setVisibility(8);
            r3.A09 = true;
            r3.A07();
            r1.A04.A07();
            ((ConversationVideoPictureInPictureActivity) r1.A03).A0D();
            return;
        }
        throw null;
    }

    public final void A0H(int i, int i2, int i3, int i4) {
        Log.i("ConversationVideoPictureInPictureActivity/updatePictureInPictureActions");
        ArrayList arrayList = new ArrayList();
        String A062 = this.A0F.A06(i2);
        arrayList.add(new RemoteAction(Icon.createWithResource(this, i), A062, A062, PendingIntent.getBroadcast(this, i3, new Intent("media_control").putExtra("control_type", i4), 0)));
        this.A02.setActions(arrayList);
        try {
            setPictureInPictureParams(this.A02.build());
        } catch (IllegalArgumentException | IllegalStateException e) {
            Log.w("updatePictureInPictureActions/unable to set pip params", e);
        }
    }

    public /* synthetic */ boolean A0I(MotionEvent motionEvent) {
        return this.A04.onTouchEvent(motionEvent) || super.onTouchEvent(motionEvent);
    }

    @Override // X.AnonymousClass37C
    public void finish() {
        super.finish();
        Log.i("ConversationVideoPictureInPictureActivity/finish/destroy-video-player");
        this.A06.A00();
        overridePendingTransition(0, 0);
    }

    @Override // X.AnonymousClass02i
    public void onBackPressed() {
        this.A05.A02();
        Log.i("ConversationVideoPictureInPictureActivity/onBackPressed/enter-pip");
        A0D();
    }

    @Override // X.ActivityC004802g, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setFlags(512, 512);
        C02780Dk.A04(window);
        setContentView(R.layout.activity_conversation_picture_in_picture);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) findViewById(R.id.root_view);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.container);
        AnonymousClass374 r4 = new AnonymousClass374(this, null);
        this.A05 = r4;
        int i = Build.VERSION.SDK_INT;
        int i2 = 262;
        if (i >= 19) {
            i2 = 4358;
        }
        r4.setSystemUiVisibility(i2);
        this.A06 = new AnonymousClass37D(this, this.A0E, this.A0G, this.A0A, this.A09, this.A08, this.A0D, this.A0F, coordinatorLayout, frameLayout, this.A05, this);
        View decorView = window.getDecorView();
        if (i >= 21) {
            decorView.setSystemUiVisibility(1792);
            window.setStatusBarColor(-16777216);
            coordinatorLayout.setOnApplyWindowInsetsListener(AnonymousClass2H5.A00);
        } else {
            decorView.setSystemUiVisibility(1280);
        }
        this.A04 = new GestureDetector(this, new AnonymousClass2HY(this));
        frameLayout.setOnTouchListener(new AnonymousClass2H6(this));
        this.A0C.A01(this.A0B);
        A0G();
    }

    @Override // X.ActivityC004802g, X.ActivityC004902h
    public void onDestroy() {
        super.onDestroy();
        Log.i("ConversationVideoPictureInPictureActivity/onDestroy/unregister-messageAudioObserver");
        this.A0C.A00(this.A0B);
    }

    @Override // X.ActivityC004902h
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.i("ConversationVideoPictureInPictureActivity/onNewIntent/destroy-video-player");
        this.A06.A00();
        setIntent(intent);
        A0G();
    }

    @Override // X.ActivityC004902h
    public void onPictureInPictureModeChanged(boolean z) {
        super.A07.A00.A03.A0p(z);
        if (z) {
            this.A05.A02();
        } else {
            this.A05.A05();
        }
    }

    @Override // X.ActivityC004802g, X.ActivityC004902h
    public void onStart() {
        super.onStart();
        BroadcastReceiver broadcastReceiver = this.A03;
        if (broadcastReceiver != null) {
            unregisterReceiver(broadcastReceiver);
            this.A03 = null;
        }
        Log.i("ConversationVideoPictureInPictureActivity/onStart/register-pipReceiver");
        this.A03 = new AnonymousClass2HX(this);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("finish_pip");
        intentFilter.addAction("media_control");
        registerReceiver(this.A03, intentFilter);
    }

    @Override // X.ActivityC004802g, X.ActivityC004902h
    public void onStop() {
        super.onStop();
        this.A06.A02();
        if (this.A03 != null) {
            Log.i("ConversationVideoPictureInPictureActivity/onStop/unregister-pipReceiver");
            unregisterReceiver(this.A03);
            this.A03 = null;
        }
    }

    public void onUserLeaveHint() {
        this.A05.A02();
        Log.i("ConversationVideoPictureInPictureActivity/onUserLeaveHint/enter-pip");
        A0D();
    }
}
