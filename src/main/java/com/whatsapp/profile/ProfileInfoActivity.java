package com.whatsapp.profile;

import X.AbstractC07640Yw;
import X.ActivityC004602e;
import X.ActivityC004702f;
import X.AnonymousClass00T;
import X.AnonymousClass00Y;
import X.AnonymousClass01I;
import X.AnonymousClass08B;
import X.AnonymousClass0BP;
import X.AnonymousClass0EY;
import X.AnonymousClass0HJ;
import X.AnonymousClass0HK;
import X.AnonymousClass0HR;
import X.AnonymousClass0S2;
import X.AnonymousClass0SE;
import X.AnonymousClass1PN;
import X.AnonymousClass1VY;
import X.AnonymousClass2C0;
import X.AnonymousClass2NU;
import X.AnonymousClass2UT;
import X.AnonymousClass30E;
import X.AnonymousClass323;
import X.AnonymousClass325;
import X.AnonymousClass3J7;
import X.AnonymousClass3J8;
import X.AnonymousClass3J9;
import X.AnonymousClass3JA;
import X.C002101e;
import X.C007003k;
import X.C03490Gl;
import X.C06930Vg;
import X.C12420i4;
import X.C40411tE;
import X.C64072xZ;
import X.RunnableC64062xY;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.transition.ChangeBounds;
import android.transition.Fade;
import android.transition.Transition;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import com.facebook.redex.ViewOnClickEBaseShape8S0100000_I1_6;
import com.google.android.search.verification.client.R;
import com.whatsapp.Main;
import com.whatsapp.PushnameEmojiBlacklistDialogFragment;
import com.whatsapp.ViewProfilePhoto;
import com.whatsapp.crop.CropImage;
import com.whatsapp.emoji.EmojiEditTextBottomSheetDialogFragment;
import com.whatsapp.util.Log;
import com.whatsapp.util.ViewOnClickCListenerShape13S0100000_I1_2;
import com.whatsapp.util.WhatsAppLibLoader;

public class ProfileInfoActivity extends ActivityC004602e implements AbstractC07640Yw {
    public Handler A00;
    public View A01;
    public View A02;
    public ImageView A03;
    public C007003k A04;
    public ProfileSettingsRowIconText A05;
    public ProfileSettingsRowIconText A06;
    public Runnable A07;
    public boolean A08;
    public final AnonymousClass01I A09 = AnonymousClass01I.A00();
    public final C03490Gl A0A = C03490Gl.A00();
    public final AnonymousClass0EY A0B = AnonymousClass0EY.A00();
    public final AnonymousClass1PN A0C = AnonymousClass1PN.A00();
    public final AnonymousClass0HJ A0D = AnonymousClass0HJ.A02();
    public final AnonymousClass0BP A0E = new AnonymousClass3J7(this);
    public final AnonymousClass08B A0F = AnonymousClass08B.A00;
    public final AnonymousClass0HK A0G = AnonymousClass0HK.A00();
    public final AnonymousClass00Y A0H = AnonymousClass00Y.A00();
    public final AnonymousClass30E A0I = AnonymousClass30E.A00();
    public final AnonymousClass323 A0J = AnonymousClass323.A00();
    public final AnonymousClass325 A0K = AnonymousClass325.A00();
    public final AnonymousClass00T A0L = C002101e.A00();
    public final WhatsAppLibLoader A0M = WhatsAppLibLoader.A00();

    public void A0T() {
        super.onBackPressed();
    }

    public final void A0U() {
        this.A02.setVisibility(8);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.pref_profile_photo_size);
        AnonymousClass01I r0 = this.A09;
        r0.A04();
        if (C40411tE.A00(r0.A03)) {
            this.A03.setEnabled(false);
            this.A02.setVisibility(0);
        } else {
            this.A03.setEnabled(true);
            this.A02.setVisibility(4);
        }
        Bitmap A022 = this.A0G.A02(this.A04, dimensionPixelSize, -1.0f, false);
        if (A022 == null) {
            C007003k r1 = this.A04;
            if (r1.A02 == 0 && r1.A01 == 0) {
                this.A02.setVisibility(0);
                Handler handler = this.A00;
                if (handler == null) {
                    handler = new Handler(Looper.getMainLooper());
                    this.A00 = handler;
                    this.A07 = new RunnableEBaseShape12S0100000_I1_7(this, 0);
                }
                handler.removeCallbacks(this.A07);
                this.A00.postDelayed(this.A07, 30000);
            } else {
                this.A02.setVisibility(4);
            }
            if (this.A0D != null) {
                A022 = AnonymousClass0HJ.A01(this, R.drawable.avatar_contact, dimensionPixelSize, -1.0f);
                this.A08 = false;
            } else {
                throw null;
            }
        } else {
            this.A08 = true;
        }
        this.A03.setImageBitmap(A022);
    }

    public final void A0V(Runnable runnable) {
        View view = this.A01;
        if (view == null) {
            runnable.run();
        } else {
            view.animate().scaleX(0.0f).scaleY(0.0f).setDuration(125).setListener(new C64072xZ(this, runnable));
        }
    }

    @Override // X.AbstractC07640Yw
    public void ADZ(String str) {
        APm(PushnameEmojiBlacklistDialogFragment.A00(str));
    }

    @Override // X.AbstractC07640Yw
    public void AFQ(int i, String str) {
        if (i == 0 && str.length() != 0) {
            this.A0L.ANF(new RunnableEBaseShape1S1100000_I1(this, str, 24));
            this.A05.setSubText(str);
        }
    }

    public void lambda$onCreate$2335$ProfileInfoActivity(View view) {
        APm(EmojiEditTextBottomSheetDialogFragment.A00(0, R.string.settings_dialog_title, R.string.no_empty_name, this.A09.A02(), 25, AnonymousClass2NU.A01, 8193));
    }

    public void lambda$onCreate$2336$ProfileInfoActivity(View view) {
        if (this.A08) {
            Intent intent = new Intent(this, ViewProfilePhoto.class);
            AnonymousClass01I r0 = this.A09;
            r0.A04();
            intent.putExtra("jid", AnonymousClass1VY.A0D(r0.A03));
            intent.putExtra("circular_transition", true);
            if (Build.VERSION.SDK_INT >= 21) {
                intent.putExtra("start_transition_status_bar_color", getWindow().getStatusBarColor());
            }
            startActivity(intent, AnonymousClass2UT.A01(this, this.A03, this.A0C.A01(R.string.transition_photo)));
            return;
        }
        this.A0B.A05(this, this.A04, 12);
    }

    public /* synthetic */ void lambda$onCreate$2337$ProfileInfoActivity(View view) {
        this.A0B.A05(this, this.A04, 12);
    }

    @Override // X.ActivityC004902h
    public void onActivityResult(int i, int i2, Intent intent) {
        switch (i) {
            case 12:
                if (i2 == -1) {
                    if (intent == null || !intent.getBooleanExtra("is_reset", false)) {
                        Intent A012 = this.A0B.A01(this, this, intent);
                        if (A012 != null) {
                            startActivityForResult(A012, 13);
                        }
                    } else {
                        this.A02.setVisibility(0);
                        this.A0B.A06(this.A04);
                    }
                }
                if (((double) this.A01.getScaleX()) == 0.0d && ((double) this.A01.getScaleY()) == 0.0d) {
                    this.A01.animate().scaleX(1.0f).scaleY(1.0f).setDuration(125);
                    return;
                }
                return;
            case 13:
                AnonymousClass0EY r2 = this.A0B;
                r2.A04().delete();
                if (i2 == -1) {
                    if (r2.A09(this.A04)) {
                        A0U();
                        return;
                    }
                    return;
                } else if (i2 == 0 && intent != null) {
                    CropImage.A00(r2.A02, intent, this, r2.A0C);
                    return;
                } else {
                    return;
                }
            case 14:
                if (i2 == -1) {
                    this.A05.setSubText(this.A09.A02());
                    return;
                }
                return;
            default:
                super.onActivityResult(i, i2, intent);
                return;
        }
    }

    @Override // X.ActivityC004702f, X.AnonymousClass02i
    public void onBackPressed() {
        RunnableEBaseShape11S0100000_I1_6 runnableEBaseShape11S0100000_I1_6 = new RunnableEBaseShape11S0100000_I1_6(this, 49);
        if (AnonymousClass2UT.A00) {
            A0V(runnableEBaseShape11S0100000_I1_6);
        } else {
            super.onBackPressed();
        }
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        if (AnonymousClass2UT.A00) {
            Window window = getWindow();
            window.requestFeature(12);
            window.requestFeature(13);
            ChangeBounds changeBounds = new ChangeBounds();
            changeBounds.setDuration(200);
            changeBounds.setInterpolator(new C06930Vg());
            changeBounds.excludeTarget(16908335, true);
            changeBounds.excludeTarget(16908336, true);
            changeBounds.excludeTarget(R.id.action_bar_container, true);
            window.setSharedElementEnterTransition(changeBounds);
            window.setSharedElementExitTransition(changeBounds);
            Fade fade = new Fade();
            Fade fade2 = new Fade();
            fade.setDuration(220);
            fade.excludeTarget(16908335, true);
            fade.excludeTarget(16908336, true);
            fade.excludeTarget(R.id.action_bar_container, true);
            fade.excludeTarget(R.id.catalog_image_list_toolbar, true);
            fade2.setDuration(240);
            fade2.excludeTarget(16908335, true);
            fade2.excludeTarget(16908336, true);
            fade2.excludeTarget(R.id.action_bar_container, true);
            fade2.excludeTarget(R.id.catalog_image_list_toolbar, true);
            window.setEnterTransition(fade);
            window.setReturnTransition(fade2);
        }
        super.onCreate(bundle);
        if (!this.A0M.A04()) {
            Log.i("aborting due to native libraries missing");
            finish();
            return;
        }
        setContentView(R.layout.profile_info);
        AnonymousClass0S2 A092 = A09();
        if (A092 != null) {
            A092.A0A(true);
        }
        AnonymousClass01I r3 = this.A09;
        r3.A04();
        AnonymousClass0HR r0 = r3.A01;
        this.A04 = r0;
        if (r0 == null) {
            Log.i("profileinfo/create/no-me");
            if (((ActivityC004702f) this).A0F != null) {
                startActivity(new Intent(this, Main.class));
                finish();
                return;
            }
            throw null;
        }
        ProfileSettingsRowIconText profileSettingsRowIconText = (ProfileSettingsRowIconText) findViewById(R.id.profile_info_name_card);
        this.A05 = profileSettingsRowIconText;
        profileSettingsRowIconText.setSubText(r3.A02());
        this.A05.setOnClickListener(new ViewOnClickEBaseShape8S0100000_I1_6(this, 10));
        ImageView imageView = (ImageView) findViewById(R.id.photo_btn);
        this.A03 = imageView;
        imageView.setOnClickListener(new ViewOnClickEBaseShape8S0100000_I1_6(this, 8));
        View findViewById = findViewById(R.id.change_photo_btn);
        this.A01 = findViewById;
        findViewById.setOnClickListener(new ViewOnClickEBaseShape8S0100000_I1_6(this, 9));
        if (Build.VERSION.SDK_INT >= 21 && bundle == null) {
            Transition sharedElementEnterTransition = getWindow().getSharedElementEnterTransition();
            getWindow().setSharedElementExitTransition(sharedElementEnterTransition.clone());
            getWindow().setSharedElementReenterTransition(sharedElementEnterTransition.clone());
            getWindow().setSharedElementReturnTransition(sharedElementEnterTransition.clone());
            this.A01.setScaleX(0.0f);
            this.A01.setScaleY(0.0f);
            this.A01.setVisibility(0);
            getWindow().getSharedElementEnterTransition().addListener(new AnonymousClass3J8(this));
            getWindow().getSharedElementExitTransition().addListener(new AnonymousClass3J9(this));
            getWindow().getSharedElementReenterTransition().addListener(new AnonymousClass3JA(this));
        }
        this.A02 = findViewById(R.id.change_photo_progress);
        A0U();
        ProfileSettingsRowIconText profileSettingsRowIconText2 = (ProfileSettingsRowIconText) findViewById(R.id.profile_phone_info);
        AnonymousClass0SE.A03(profileSettingsRowIconText2.A00);
        profileSettingsRowIconText2.setSubText(C12420i4.A00(this.A04));
        profileSettingsRowIconText2.setOnClickListener(new ViewOnClickCListenerShape13S0100000_I1_2(this, 42));
        ProfileSettingsRowIconText profileSettingsRowIconText3 = (ProfileSettingsRowIconText) findViewById(R.id.profile_info_status_card);
        this.A06 = profileSettingsRowIconText3;
        profileSettingsRowIconText3.setOnClickListener(new ViewOnClickCListenerShape13S0100000_I1_2(this, 43));
        this.A06.setSubText(this.A0A.A01());
        this.A0F.A01(this.A0E);
        if ("android.intent.action.ATTACH_DATA".equals(getIntent().getAction())) {
            setTitle(((AnonymousClass2C0) this).A01.A06(R.string.set_as_profile_photo));
            Intent A012 = this.A0B.A01(this, this, getIntent());
            if (A012 != null) {
                startActivityForResult(A012, 13);
                return;
            }
            return;
        }
        setTitle(R.string.settings_profile_info);
    }

    @Override // X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onDestroy() {
        super.onDestroy();
        this.A0F.A00(this.A0E);
        Handler handler = this.A00;
        if (handler != null) {
            handler.removeCallbacks(this.A07);
        }
    }

    @Override // X.ActivityC004702f
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        if (AnonymousClass2UT.A00) {
            A0V(new RunnableC64062xY(this));
            return true;
        }
        finish();
        return true;
    }
}
