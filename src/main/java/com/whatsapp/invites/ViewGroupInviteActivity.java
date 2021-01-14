package com.whatsapp.invites;

import X.AbstractC007503q;
import X.ActivityC004602e;
import X.ActivityC004702f;
import X.AnonymousClass008;
import X.AnonymousClass00S;
import X.AnonymousClass00T;
import X.AnonymousClass01A;
import X.AnonymousClass01K;
import X.AnonymousClass01T;
import X.AnonymousClass01X;
import X.AnonymousClass02U;
import X.AnonymousClass0A8;
import X.AnonymousClass0AR;
import X.AnonymousClass0BR;
import X.AnonymousClass0L2;
import X.AnonymousClass0YX;
import X.AnonymousClass0ZF;
import X.AnonymousClass2Ra;
import X.AnonymousClass2Rb;
import X.C002101e;
import X.C004302a;
import X.C006903j;
import X.C007303n;
import X.C014308b;
import X.C08840bo;
import X.C10270eM;
import X.C29111Xc;
import X.C55502ge;
import X.C60062oj;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.redex.ViewOnClickEBaseShape6S0100000_I1_4;
import com.google.android.search.verification.client.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.ViewOnClickCListenerShape13S0100000_I1_2;

public class ViewGroupInviteActivity extends ActivityC004602e implements AnonymousClass2Ra {
    public View A00;
    public ViewGroup A01;
    public ViewGroup A02;
    public ViewGroup A03;
    public ImageView A04;
    public TextView A05;
    public TextView A06;
    public AnonymousClass0YX A07;
    public C08840bo A08;
    public AnonymousClass02U A09;
    public UserJid A0A;
    public C29111Xc A0B;
    public AnonymousClass0ZF A0C;
    public Runnable A0D;
    public boolean A0E;
    public final AnonymousClass01A A0F = AnonymousClass01A.A00();
    public final C014308b A0G = C014308b.A00();
    public final AnonymousClass0L2 A0H = AnonymousClass0L2.A01();
    public final AnonymousClass00S A0I = AnonymousClass00S.A00();
    public final AnonymousClass01X A0J = AnonymousClass01X.A00();
    public final C006903j A0K = C006903j.A00();
    public final AnonymousClass0BR A0L = new C55502ge(this);
    public final AnonymousClass0A8 A0M = AnonymousClass0A8.A00;
    public final AnonymousClass01K A0N = AnonymousClass01K.A00();
    public final AnonymousClass01T A0O = AnonymousClass01T.A00();
    public final AnonymousClass0AR A0P = AnonymousClass0AR.A00();
    public final AnonymousClass00T A0Q = C002101e.A00();

    public final void A0T(int i) {
        this.A05.setText(this.A0J.A06(i));
        this.A03.setVisibility(4);
        this.A01.setVisibility(0);
        this.A02.setVisibility(4);
        this.A00.setVisibility(8);
    }

    @Override // X.AnonymousClass2Ra
    public void AJk(UserJid userJid) {
        this.A06.setText(this.A0J.A06(R.string.revoking_invite));
        this.A03.setVisibility(0);
        this.A02.setVisibility(4);
        AnonymousClass00T r2 = this.A0Q;
        AnonymousClass02U r0 = this.A09;
        if (r0 != null) {
            r2.ANC(new C60062oj(this, r0, userJid), new Void[0]);
            return;
        }
        throw null;
    }

    public /* synthetic */ void lambda$onCreate$2208$ViewGroupInviteActivity(View view) {
        finish();
    }

    public /* synthetic */ void lambda$onCreate$2209$ViewGroupInviteActivity(View view) {
        finish();
    }

    public /* synthetic */ void lambda$onCreate$2210$ViewGroupInviteActivity(View view) {
        finish();
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        C29111Xc r8;
        String str;
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent.hasExtra("from_me") && intent.hasExtra("key_remote_jid") && intent.hasExtra("key_id")) {
            this.A0E = intent.getBooleanExtra("from_me", false);
            UserJid nullable = UserJid.getNullable(intent.getStringExtra("key_remote_jid"));
            this.A0A = nullable;
            if (nullable != null) {
                AbstractC007503q A052 = this.A0N.A0J.A05(new C007303n(nullable, this.A0E, intent.getStringExtra("key_id")));
                if (A052 instanceof AnonymousClass0ZF) {
                    AnonymousClass0ZF r2 = (AnonymousClass0ZF) A052;
                    this.A0C = r2;
                    AnonymousClass02U r9 = r2.A01;
                    this.A09 = r9;
                    if (r9 == null) {
                        ((ActivityC004702f) this).A0F.A0C(this.A0J.A06(R.string.failed_accept_bad_invite_link), 1);
                    } else {
                        UserJid of = UserJid.of(r2.A0n.A00);
                        if (r9 == null || (str = r2.A05) == null || of == null) {
                            r8 = null;
                        } else {
                            r8 = new C29111Xc(r9, of, str, r2.A00);
                        }
                        this.A0B = r8;
                        if (r8 == null) {
                            ((ActivityC004702f) this).A0F.A0C(this.A0J.A06(R.string.failed_accept_bad_invite_link), 1);
                        } else {
                            AnonymousClass01X r12 = this.A0J;
                            setTitle(r12.A06(R.string.app_name));
                            setContentView(R.layout.view_group_invite);
                            View findViewById = findViewById(R.id.invite_container);
                            findViewById.getViewTreeObserver().addOnGlobalLayoutListener(new AnonymousClass2Rb(findViewById, findViewById(R.id.background)));
                            this.A07 = this.A0H.A03(this);
                            this.A03 = (ViewGroup) findViewById(R.id.progress);
                            this.A02 = (ViewGroup) findViewById(R.id.group_info);
                            this.A01 = (ViewGroup) findViewById(R.id.error);
                            this.A06 = (TextView) findViewById(R.id.progress_text);
                            this.A05 = (TextView) findViewById(R.id.error_text);
                            this.A04 = (ImageView) findViewById(R.id.group_photo);
                            this.A00 = findViewById(R.id.group_photo_container);
                            C08840bo r6 = new C08840bo(this, this.A0I, this.A0K, this.A0F, this.A0G, r12, this.A07, (ViewGroup) findViewById(R.id.invite_root));
                            this.A08 = r6;
                            r6.A0G = false;
                            findViewById(R.id.invite_ignore).setOnClickListener(new ViewOnClickEBaseShape6S0100000_I1_4(this, 37));
                            TextView textView = (TextView) findViewById(R.id.invite_accept);
                            textView.setOnClickListener(new ViewOnClickCListenerShape13S0100000_I1_2(this, 28));
                            boolean z = this.A0E;
                            int i = R.string.join_group_by_link;
                            if (z) {
                                i = R.string.revoke_invite;
                            }
                            textView.setText(r12.A06(i));
                            findViewById(R.id.ok).setOnClickListener(new ViewOnClickEBaseShape6S0100000_I1_4(this, 35));
                            this.A0M.A00(this.A0L);
                            findViewById(R.id.filler).setOnClickListener(new ViewOnClickEBaseShape6S0100000_I1_4(this, 36));
                            AnonymousClass00T r4 = this.A0Q;
                            AnonymousClass0ZF r3 = this.A0C;
                            if (r3 != null) {
                                C29111Xc r1 = this.A0B;
                                if (r1 != null) {
                                    r4.ANC(new C10270eM(this, r3, r1), new Void[0]);
                                    if (Build.VERSION.SDK_INT >= 21) {
                                        getWindow().addFlags(EditorInfoCompat.IME_FLAG_FORCE_ASCII);
                                        getWindow().setStatusBarColor(0);
                                        getWindow().setNavigationBarColor(C004302a.A00(this, R.color.black));
                                    }
                                    findViewById(R.id.invite_container).startAnimation(AnonymousClass008.A02(0.0f, 1.0f, 150));
                                    return;
                                }
                                throw null;
                            }
                            throw null;
                        }
                    }
                }
            }
        }
        finish();
    }

    @Override // X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onDestroy() {
        super.onDestroy();
        Runnable runnable = this.A0D;
        if (runnable != null) {
            ((ActivityC004702f) this).A0F.A02.removeCallbacks(runnable);
            this.A0D = null;
        }
        this.A0M.A01(this.A0L);
        this.A07.A00();
    }
}
