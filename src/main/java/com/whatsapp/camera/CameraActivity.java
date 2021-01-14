package com.whatsapp.camera;

import X.AbstractC000400g;
import X.AbstractC07280Wv;
import X.AbstractC07290Ww;
import X.AbstractC07560Ye;
import X.ActivityC004602e;
import X.ActivityC004702f;
import X.AnonymousClass009;
import X.AnonymousClass00C;
import X.AnonymousClass00G;
import X.AnonymousClass00T;
import X.AnonymousClass00Y;
import X.AnonymousClass01A;
import X.AnonymousClass01I;
import X.AnonymousClass01P;
import X.AnonymousClass01Q;
import X.AnonymousClass01X;
import X.AnonymousClass022;
import X.AnonymousClass02M;
import X.AnonymousClass02N;
import X.AnonymousClass02U;
import X.AnonymousClass03P;
import X.AnonymousClass03S;
import X.AnonymousClass04j;
import X.AnonymousClass088;
import X.AnonymousClass08D;
import X.AnonymousClass09H;
import X.AnonymousClass0AI;
import X.AnonymousClass0EW;
import X.AnonymousClass0Fh;
import X.AnonymousClass0IA;
import X.AnonymousClass0JO;
import X.AnonymousClass0L6;
import X.AnonymousClass0Q7;
import X.AnonymousClass0XN;
import X.AnonymousClass0XO;
import X.AnonymousClass0XR;
import X.AnonymousClass0YW;
import X.AnonymousClass1VY;
import X.AnonymousClass2C0;
import X.AnonymousClass2WL;
import X.AnonymousClass2WS;
import X.C000300f;
import X.C002101e;
import X.C002701k;
import X.C007703s;
import X.C014508d;
import X.C014708f;
import X.C01970Ad;
import X.C02040Ak;
import X.C02780Dk;
import X.C06180Sc;
import X.C08340aw;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import com.google.android.search.verification.client.R;
import com.whatsapp.Main;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.util.WhatsAppLibLoader;
import java.util.ArrayList;
import java.util.List;

public class CameraActivity extends ActivityC004602e implements AbstractC07280Wv, AbstractC07290Ww {
    public AnonymousClass0YW A00;
    public final Rect A01 = new Rect();
    public final AnonymousClass0EW A02 = AnonymousClass0EW.A01;
    public final AnonymousClass088 A03 = AnonymousClass088.A00();
    public final AnonymousClass01I A04 = AnonymousClass01I.A00();
    public final C000300f A05 = C000300f.A00();
    public final AnonymousClass08D A06 = AnonymousClass08D.A00();
    public final AnonymousClass0XR A07 = AnonymousClass0XR.A00();
    public final AnonymousClass01A A08 = AnonymousClass01A.A00();
    public final AnonymousClass0AI A09 = AnonymousClass0AI.A00();
    public final AnonymousClass0XN A0A = AnonymousClass0XN.A00();
    public final AnonymousClass00C A0B = AnonymousClass00C.A00();
    public final AnonymousClass03P A0C = AnonymousClass03P.A00();
    public final AnonymousClass00G A0D = AnonymousClass00G.A01;
    public final AnonymousClass03S A0E = AnonymousClass03S.A00();
    public final AnonymousClass01Q A0F = AnonymousClass01Q.A00();
    public final C014508d A0G = C014508d.A00();
    public final AnonymousClass01P A0H = AnonymousClass01P.A00();
    public final C002701k A0I = C002701k.A00();
    public final AnonymousClass00Y A0J = AnonymousClass00Y.A00();
    public final AnonymousClass09H A0K = AnonymousClass09H.A01();
    public final AnonymousClass0IA A0L = AnonymousClass0IA.A00();
    public final C02040Ak A0M = C02040Ak.A00();
    public final C01970Ad A0N = C01970Ad.A00();
    public final AnonymousClass0L6 A0O = AnonymousClass0L6.A00();
    public final AnonymousClass0XO A0P = AnonymousClass0XO.A00();
    public final AnonymousClass022 A0Q = AnonymousClass022.A00();
    public final C014708f A0R = C014708f.A00();
    public final C007703s A0S = C007703s.A00();
    public final AnonymousClass00T A0T = C002101e.A00();
    public final WhatsAppLibLoader A0U = WhatsAppLibLoader.A00();
    public final AnonymousClass0JO A0V = AnonymousClass0JO.A00;
    public final AnonymousClass0Fh A0W = AnonymousClass0Fh.A00();

    @Override // X.AbstractC07280Wv
    public AnonymousClass0YW A5A() {
        return this.A00;
    }

    @Override // X.AbstractC07290Ww
    public void AIx() {
        ((AbstractC07560Ye) this.A00.A0X).A0D = false;
    }

    @Override // X.ActivityC004902h
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 30) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            this.A00.A06();
        } else {
            finish();
        }
    }

    @Override // X.ActivityC004702f, X.AnonymousClass02i
    public void onBackPressed() {
        if (!this.A00.A0Q()) {
            super.onBackPressed();
        }
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        C08340aw r6;
        boolean A0D2;
        super.onCreate(bundle);
        AnonymousClass00G r0 = this.A0D;
        AnonymousClass08D r02 = this.A06;
        C002701k r03 = this.A0I;
        AnonymousClass02M r1 = ((ActivityC004702f) this).A0F;
        AnonymousClass009 r04 = ((ActivityC004702f) this).A0D;
        AnonymousClass01I r2 = this.A04;
        AnonymousClass00T r05 = this.A0T;
        AnonymousClass088 r06 = this.A03;
        AnonymousClass00Y r07 = this.A0J;
        C000300f r3 = this.A05;
        C06180Sc r08 = ((ActivityC004602e) this).A05;
        AnonymousClass0JO r09 = this.A0V;
        AnonymousClass09H r010 = this.A0K;
        AnonymousClass0Fh r011 = this.A0W;
        AnonymousClass01A r012 = this.A08;
        AnonymousClass03P r013 = this.A0C;
        AnonymousClass01X r5 = ((AnonymousClass2C0) this).A01;
        AnonymousClass0EW r014 = this.A02;
        C01970Ad r015 = this.A0N;
        AnonymousClass0XN r016 = this.A0A;
        AnonymousClass0XO r017 = this.A0P;
        AnonymousClass04j r14 = ((ActivityC004702f) this).A0H;
        AnonymousClass01P r13 = this.A0H;
        AnonymousClass03S r018 = this.A0E;
        this.A00 = new AnonymousClass2WS(this, r0, r02, r03, r1, r04, r2, r05, r06, r07, r3, r08, r09, r010, r011, r012, r013, r5, r014, r015, r016, r017, r14, r13, r018, super.A0J, this.A0F, this.A0S, this.A0M, this.A0L, this.A07, this.A0Q, this.A09);
        setTitle(r5.A06(R.string.camera_shortcut));
        r2.A04();
        ArrayList arrayList = null;
        if (r2.A00 != null) {
            C014508d r019 = this.A0G;
            r019.A05();
            if (r019.A01 && this.A0R.A02()) {
                if (!this.A0U.A04()) {
                    Log.i("aborting due to native libraries missing");
                    finish();
                    return;
                } else if ("android.intent.action.CREATE_SHORTCUT".equals(getIntent().getAction())) {
                    Intent intent = new Intent(this, LauncherCameraActivity.class);
                    intent.addFlags(268435456);
                    Intent intent2 = new Intent();
                    intent2.putExtra("android.intent.extra.shortcut.INTENT", intent);
                    intent2.putExtra("android.intent.extra.shortcut.NAME", r5.A06(R.string.camera_shortcut));
                    intent2.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(this, R.drawable.launcher_camera));
                    setResult(-1, intent2);
                    finish();
                    return;
                } else if (this.A0B.A02() < ((long) ((r3.A06(AbstractC000400g.A3a) << 10) << 10))) {
                    r1.A04(R.string.error_no_disc_space, 1);
                    finish();
                    return;
                } else if ((getIntent().getFlags() & 1073741824) != 0) {
                    Log.i("cameraactivity/create/restart-old-shortcut");
                    Intent intent3 = new Intent(this, LauncherCameraActivity.class);
                    intent3.addFlags(268435456);
                    intent3.putExtra("origin", 1);
                    startActivity(intent3);
                    finish();
                    return;
                } else {
                    getWindow().setBackgroundDrawable(new ColorDrawable(-16777216));
                    C02780Dk.A04(getWindow());
                    setContentView(R.layout.camera);
                    View findViewById = findViewById(R.id.root_view);
                    findViewById.setSystemUiVisibility(4);
                    if (Build.VERSION.SDK_INT >= 21) {
                        getWindow().addFlags(134217728);
                        AnonymousClass0Q7.A0e(findViewById, new AnonymousClass2WL(this));
                    }
                    if (getIntent() == null || getIntent().getExtras() == null || !getIntent().getExtras().containsKey("media_preview_params")) {
                        r6 = null;
                    } else {
                        r6 = new C08340aw();
                        r6.A01(getIntent().getExtras());
                    }
                    AnonymousClass0YW r15 = this.A00;
                    AnonymousClass02N A012 = AnonymousClass02N.A01(getIntent().getStringExtra("jid"));
                    long longExtra = getIntent().getLongExtra("quoted_message_row_id", 0);
                    AnonymousClass02U A032 = AnonymousClass02U.A03(getIntent().getStringExtra("quoted_group_jid"));
                    boolean booleanExtra = getIntent().getBooleanExtra("chat_opened_from_url", false);
                    String stringExtra = getIntent().getStringExtra("android.intent.extra.TEXT");
                    List A0G2 = AnonymousClass1VY.A0G(UserJid.class, getIntent().getStringArrayListExtra("mentions"));
                    if (bundle == null) {
                        arrayList = getIntent().getParcelableArrayListExtra("uris");
                    } else {
                        r6 = null;
                    }
                    if (!(this instanceof LauncherCameraActivity)) {
                        A0D2 = false;
                    } else {
                        A0D2 = this.A05.A0D(AbstractC000400g.A29);
                    }
                    r15.A0F(this, A012, longExtra, A032, booleanExtra, stringExtra, A0G2, arrayList, r6, A0D2, getIntent().getBooleanExtra("add_more_image", false));
                    if (RequestPermissionActivity.A0K(this, r018, 30)) {
                        this.A00.A06();
                        return;
                    } else {
                        this.A00.A0x.A01 = 0;
                        return;
                    }
                }
            }
        }
        Log.i("cameraactivity/create/no-me-or-msgstore-db");
        if (r1 != null) {
            startActivity(new Intent(this, Main.class));
            finish();
            return;
        }
        throw null;
    }

    @Override // X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onDestroy() {
        super.onDestroy();
        this.A00.A02();
        this.A06.A03().A00.A06(-1);
    }

    @Override // X.ActivityC004602e, X.ActivityC004802g
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return this.A00.A0S(i) || super.onKeyDown(i, keyEvent);
    }

    @Override // X.ActivityC004602e
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        return this.A00.A0T(i) || super.onKeyUp(i, keyEvent);
    }

    @Override // X.ActivityC004602e, X.ActivityC004702f, X.ActivityC004902h
    public void onPause() {
        super.onPause();
        this.A0O.A01();
        this.A00.A03();
    }

    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.A00.A0D(bundle);
    }

    @Override // X.ActivityC004602e, X.ActivityC004702f, X.ActivityC004902h
    public void onResume() {
        super.onResume();
        this.A00.A04();
    }

    @Override // X.ActivityC004802g, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.A00.A0E(bundle);
    }
}
