package com.whatsapp.identity;

import X.AbstractC02380Bt;
import X.AbstractC49432Ql;
import X.ActivityC004602e;
import X.ActivityC004702f;
import X.AnonymousClass00D;
import X.AnonymousClass01A;
import X.AnonymousClass01I;
import X.AnonymousClass01M;
import X.AnonymousClass01V;
import X.AnonymousClass01X;
import X.AnonymousClass02H;
import X.AnonymousClass02M;
import X.AnonymousClass02Y;
import X.AnonymousClass03P;
import X.AnonymousClass03S;
import X.AnonymousClass088;
import X.AnonymousClass0By;
import X.AnonymousClass0CB;
import X.AnonymousClass0Fh;
import X.AnonymousClass0JW;
import X.AnonymousClass0L3;
import X.AnonymousClass0M9;
import X.AnonymousClass0S2;
import X.AnonymousClass0SE;
import X.AnonymousClass1G3;
import X.AnonymousClass1GH;
import X.AnonymousClass1GJ;
import X.AnonymousClass1UI;
import X.AnonymousClass1VF;
import X.AnonymousClass1VI;
import X.AnonymousClass2C0;
import X.AnonymousClass2F8;
import X.C002301g;
import X.C006803i;
import X.C007003k;
import X.C014308b;
import X.C015808q;
import X.C016508x;
import X.C02430Bz;
import X.C05350Oe;
import X.C05690Pr;
import X.C05710Pt;
import X.C05720Pu;
import X.C10320eR;
import X.C25191Fl;
import X.C37251nt;
import X.C49422Qk;
import X.C49442Qm;
import X.C55102g0;
import X.C55112g1;
import X.C55122g2;
import X.EnumC25121Fd;
import X.EnumC25131Fe;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Point;
import android.hardware.Camera;
import android.nfc.NdefMessage;
import android.nfc.NfcAdapter;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.style.URLSpan;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape6S0100000_I1_4;
import com.google.android.search.verification.client.R;
import com.whatsapp.QrImageView;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.qrcode.QrScannerView;
import com.whatsapp.util.Log;
import com.whatsapp.util.ViewOnClickCListenerShape13S0100000_I1_2;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;
import java.util.Set;

public class IdentityVerificationActivity extends ActivityC004602e implements AnonymousClass0By, AnonymousClass01V, AbstractC49432Ql, AbstractC02380Bt, AnonymousClass1VF {
    public Handler A00;
    public HandlerThread A01;
    public MenuItem A02;
    public View A03;
    public ImageView A04;
    public ProgressBar A05;
    public TextView A06;
    public TextView A07;
    public AnonymousClass1GJ A08;
    public AnonymousClass1UI A09;
    public C007003k A0A;
    public QrScannerView A0B;
    public String A0C;
    public boolean A0D;
    public final Camera.PreviewCallback A0E = new C49442Qm(this);
    public final C37251nt A0F = new C37251nt();
    public final AnonymousClass088 A0G = AnonymousClass088.A00();
    public final AnonymousClass01M A0H = AnonymousClass01M.A00();
    public final AnonymousClass01I A0I = AnonymousClass01I.A00();
    public final AnonymousClass01A A0J = AnonymousClass01A.A00();
    public final C014308b A0K = C014308b.A00();
    public final AnonymousClass0L3 A0L = AnonymousClass0L3.A00;
    public final AnonymousClass03P A0M = AnonymousClass03P.A00();
    public final AnonymousClass03S A0N = AnonymousClass03S.A00();
    public final C016508x A0O = C016508x.A00;
    public final C02430Bz A0P = C02430Bz.A00();
    public final AnonymousClass0M9 A0Q = AnonymousClass0M9.A01();
    public final AnonymousClass0CB A0R = AnonymousClass0CB.A00();
    public final C015808q A0S = C015808q.A00();
    public final AnonymousClass0Fh A0T = AnonymousClass0Fh.A00();
    public final Runnable A0U = new RunnableEBaseShape10S0100000_I1_5(this, 25);
    public final Map A0V = Collections.singletonMap(EnumC25121Fd.CHARACTER_SET, "ISO-8859-1");

    @Override // X.AnonymousClass0By
    public void AF0(C05350Oe r1, int i) {
    }

    @Override // X.AnonymousClass0By
    public void AF1(AnonymousClass2F8 r1) {
    }

    @Override // X.AnonymousClass0By
    public void AF3(AnonymousClass1VI r1) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0056, code lost:
        if (X.AnonymousClass05B.A02(r2, r3) == false) goto L_0x0058;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x005d A[Catch:{ 0Jk -> 0x00fd }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0065 A[Catch:{ 0Jk -> 0x00fd }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x006f A[Catch:{ 0Jk -> 0x00fd }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0092 A[Catch:{ 0Jk -> 0x00fd }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x009a A[Catch:{ 0Jk -> 0x00fd }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a4 A[Catch:{ 0Jk -> 0x00fd }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00c8 A[Catch:{ 0Jk -> 0x00fd }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00d0 A[Catch:{ 0Jk -> 0x00fd }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00da A[Catch:{ 0Jk -> 0x00fd }] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0103  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A0T(byte[] r7) {
        /*
        // Method dump skipped, instructions count: 274
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.identity.IdentityVerificationActivity.A0T(byte[]):int");
    }

    public final void A0U() {
        super.A0K.A00();
        AnonymousClass0CB r4 = this.A0R;
        UserJid userJid = (UserJid) this.A0A.A02(UserJid.class);
        AnonymousClass02H r3 = r4.A04;
        synchronized (r3) {
            r3.A03.clear();
        }
        ((AnonymousClass0JW) new C10320eR(r4, userJid, this)).A00.executeOnExecutor(r3, new Void[0]);
    }

    public final void A0V() {
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, -1.0f);
        translateAnimation.setAnimationListener(new C55112g1(this));
        translateAnimation.setDuration(300);
        this.A03.startAnimation(translateAnimation);
    }

    public final void A0W() {
        AnonymousClass02M r2 = ((ActivityC004702f) this).A0F;
        r2.A02.post(new RunnableEBaseShape10S0100000_I1_5(this, 24));
    }

    public final void A0X() {
        if (!A0e()) {
            if (this.A0N.A02("android.permission.CAMERA") != 0) {
                startActivityForResult(new Intent(this, RequestPermissionActivity.class).putExtra("drawable_id", R.drawable.permission_cam).putExtra("message_id", R.string.permission_cam_access_on_verify_identity_request).putExtra("perm_denial_message_id", R.string.permission_cam_access_on_verify_identity).putExtra("permissions", new String[]{"android.permission.CAMERA"}), 1);
                return;
            }
            findViewById(R.id.overlay).setVisibility(0);
            this.A0B.setVisibility(0);
            this.A06.setVisibility(8);
            AnonymousClass02M r0 = ((ActivityC004702f) this).A0F;
            r0.A02.removeCallbacks(this.A0U);
            if (this.A0D) {
                this.A0B.A04.setOneShotPreviewCallback(this.A0E);
            }
        }
    }

    public final void A0Y(Intent intent) {
        NdefMessage ndefMessage = (NdefMessage) intent.getParcelableArrayExtra("android.nfc.extra.NDEF_MESSAGES")[0];
        byte[] payload = ndefMessage.getRecords()[0].getPayload();
        UserJid nullable = UserJid.getNullable(new String(ndefMessage.getRecords()[0].getId(), Charset.forName("US-ASCII")));
        if (nullable != null) {
            C007003k A0A2 = this.A0J.A0A(nullable);
            this.A0A = A0A2;
            String A042 = this.A0K.A04(A0A2);
            AnonymousClass01X r5 = ((AnonymousClass2C0) this).A01;
            A0K(r5.A0D(R.string.verify_identity_names, A042));
            A0U();
            if (this.A09 == null) {
                Log.w("idverification/ndef/no-fingerprint");
                return;
            }
            int A0T2 = A0T(payload);
            if (A0T2 == -3) {
                ((ActivityC004702f) this).A0F.A0C(r5.A0D(R.string.verify_identity_result_wrong_you, A042), 1);
            } else if (A0T2 != -2) {
                if (A0T2 != 1) {
                    if (A0T2 == 2) {
                        A0d(false);
                    } else {
                        return;
                    }
                }
                A0d(true);
            } else {
                ((ActivityC004702f) this).A0F.A0C(r5.A0D(R.string.verify_identity_result_wrong_contact, A042), 1);
            }
        }
    }

    public final void A0Z(AnonymousClass1UI r20, Set set, Set set2) {
        int size;
        int size2;
        String obj;
        String A0D2;
        this.A05.setVisibility(8);
        if (r20 == null) {
            A0c(false);
            this.A07.setText(((AnonymousClass2C0) this).A01.A0D(R.string.verify_identity_no_keys, this.A0K.A04(this.A0A)));
            return;
        }
        if (set == null) {
            size = 0;
        } else {
            size = set.size();
        }
        if (set2 == null) {
            size2 = 0;
        } else {
            size2 = set2.size() - 1;
        }
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) findViewById(R.id.verify_identity_tip);
        textEmojiLabel.setFocusable(false);
        textEmojiLabel.A07 = new C05710Pt();
        if (this.A0S.A01() || size2 > 0) {
            obj = this.A0Q.A03("general", "26000361", null).toString();
        } else {
            obj = this.A0Q.A03("general", "28030015", null).toString();
        }
        if (size > 0) {
            AnonymousClass01X r8 = ((AnonymousClass2C0) this).A01;
            if (size2 > 0) {
                A0D2 = r8.A0A(R.plurals.verify_identity_tip_both_multiple_device, (long) size2, this.A0K.A04(this.A0A), obj, Integer.valueOf(size2));
            } else {
                A0D2 = r8.A0D(R.string.verify_identity_tip_self_multiple_device, this.A0K.A04(this.A0A), obj);
            }
        } else {
            AnonymousClass01X r82 = ((AnonymousClass2C0) this).A01;
            if (size2 > 0) {
                A0D2 = r82.A0A(R.plurals.verify_identity_tip_contact_multiple_device, (long) size2, this.A0K.A04(this.A0A), obj, Integer.valueOf(size2));
            } else {
                A0D2 = r82.A0D(R.string.verify_identity_tip, this.A0K.A04(this.A0A), obj);
            }
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(Html.fromHtml(A0D2));
        URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class);
        if (uRLSpanArr != null) {
            for (URLSpan uRLSpan : uRLSpanArr) {
                spannableStringBuilder.setSpan(new C05690Pr(this, ((ActivityC004702f) this).A0F, this.A0M, ((ActivityC004602e) this).A05, uRLSpan.getURL()), spannableStringBuilder.getSpanStart(uRLSpan), spannableStringBuilder.getSpanEnd(uRLSpan), spannableStringBuilder.getSpanFlags(uRLSpan));
            }
            for (URLSpan uRLSpan2 : uRLSpanArr) {
                spannableStringBuilder.removeSpan(uRLSpan2);
            }
        }
        textEmojiLabel.setAccessibilityHelper(new C05720Pu(textEmojiLabel));
        textEmojiLabel.setText(spannableStringBuilder, TextView.BufferType.SPANNABLE);
        this.A09 = r20;
        this.A0C = r20.A00.A00();
        QrImageView qrImageView = (QrImageView) findViewById(R.id.qr_code);
        try {
            AnonymousClass1GJ A012 = AnonymousClass1GH.A01(new String(r20.A01.A09(), "ISO-8859-1"), AnonymousClass1G3.L, new EnumMap(EnumC25131Fe.class));
            this.A08 = A012;
            qrImageView.setQrCode(A012, null);
        } catch (C25191Fl | UnsupportedEncodingException e) {
            Log.w("idverification/", e);
        }
        StringBuilder sb = new StringBuilder();
        int length = this.A0C.length();
        String str = null;
        for (int i = 1; i <= length; i++) {
            sb.append(this.A0C.charAt(i - 1));
            if (i != length) {
                if (i % 20 == 0) {
                    if (str == null) {
                        str = sb.toString();
                    }
                    sb.append('\n');
                } else if (i % 5 == 0) {
                    sb.append("     ");
                } else {
                    sb.append(' ');
                }
            }
        }
        float textSize = this.A07.getTextSize();
        float measureText = this.A07.getPaint().measureText(str);
        Point point = new Point();
        getWindowManager().getDefaultDisplay().getSize(point);
        float min = ((float) Math.min(point.x, point.y)) - ((C002301g.A0K.A00 * 2.0f) * 16.0f);
        while (measureText > min && textSize > 1.0f) {
            textSize -= 1.0f;
            this.A07.setTextSize(textSize);
            measureText = this.A07.getPaint().measureText(str);
        }
        this.A07.setText(sb.toString());
        AnonymousClass0SE.A03(this.A07);
        A0c(true);
    }

    public final void A0a(UserJid userJid) {
        AnonymousClass01I r0 = this.A0I;
        r0.A04();
        if (userJid.equals(r0.A03) || userJid.equals(this.A0A.A02(UserJid.class))) {
            runOnUiThread(new RunnableEBaseShape10S0100000_I1_5(this, 20));
        }
    }

    public final void A0b(Runnable runnable) {
        if (A0e()) {
            findViewById(R.id.main_layout).setVisibility(0);
            findViewById(R.id.scan_code).setVisibility(0);
            findViewById(R.id.verify_identity_qr_tip).setVisibility(8);
            findViewById(R.id.overlay).setVisibility(8);
            this.A06.setVisibility(8);
            TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
            translateAnimation.setInterpolator(new DecelerateInterpolator());
            translateAnimation.setDuration((long) getResources().getInteger(17694721));
            translateAnimation.setAnimationListener(new C55122g2(this, runnable));
            findViewById(R.id.main_layout).startAnimation(translateAnimation);
            this.A0D = false;
        }
    }

    public final void A0c(boolean z) {
        MenuItem menuItem = this.A02;
        if (menuItem != null) {
            menuItem.setVisible(z);
        }
        View findViewById = findViewById(R.id.footer);
        int i = 0;
        int i2 = 8;
        if (z) {
            i2 = 0;
        }
        findViewById.setVisibility(i2);
        View findViewById2 = findViewById(R.id.verify_identity_tip);
        int i3 = 8;
        if (z) {
            i3 = 0;
        }
        findViewById2.setVisibility(i3);
        View findViewById3 = findViewById(R.id.qr_code_group);
        if (!z) {
            i = 8;
        }
        findViewById3.setVisibility(i);
    }

    public final void A0d(boolean z) {
        this.A04.setVisibility(0);
        ImageView imageView = this.A04;
        int i = R.drawable.red_circle;
        if (z) {
            i = R.drawable.green_circle;
        }
        imageView.setBackgroundResource(i);
        ImageView imageView2 = this.A04;
        AnonymousClass01X r1 = ((AnonymousClass2C0) this).A01;
        int i2 = R.string.identity_not_verified;
        if (z) {
            i2 = R.string.identity_verified;
        }
        imageView2.setContentDescription(r1.A06(i2));
        ImageView imageView3 = this.A04;
        int i3 = R.drawable.ill_verification_failure;
        if (z) {
            i3 = R.drawable.ill_verification_success;
        }
        imageView3.setImageResource(i3);
        AnimationSet animationSet = new AnimationSet(true);
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.5f, 1, 0.5f);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        animationSet.addAnimation(scaleAnimation);
        animationSet.addAnimation(alphaAnimation);
        animationSet.setInterpolator(new OvershootInterpolator());
        animationSet.setDuration((long) getResources().getInteger(17694721));
        this.A04.startAnimation(animationSet);
        this.A04.setFocusable(true);
        this.A04.setFocusableInTouchMode(true);
        this.A04.requestFocus();
        AnonymousClass02M r0 = ((ActivityC004702f) this).A0F;
        r0.A02.postDelayed(this.A0U, 4000);
    }

    public final boolean A0e() {
        QrScannerView qrScannerView = this.A0B;
        return qrScannerView != null && qrScannerView.getVisibility() == 0;
    }

    @Override // X.AbstractC02380Bt
    public void ADF(DeviceJid deviceJid) {
        UserJid userJid;
        if (deviceJid == null) {
            userJid = null;
        } else {
            userJid = deviceJid.userJid;
        }
        if (C006803i.A0q(this.A0A.A02(UserJid.class), userJid)) {
            A0U();
        }
    }

    @Override // X.AnonymousClass0By
    public void AEz(AnonymousClass2F8 r2) {
        AnonymousClass01I r0 = this.A0I;
        r0.A04();
        A0a(r0.A03);
    }

    @Override // X.AnonymousClass0By
    public void AF2(C05350Oe r2) {
        AnonymousClass01I r0 = this.A0I;
        r0.A04();
        A0a(r0.A03);
    }

    @Override // X.AbstractC49432Ql
    public void AG9(AnonymousClass1UI r1, Set set, Set set2) {
        A0Z(r1, set, set2);
    }

    @Override // X.AnonymousClass01V
    public void AGS(DeviceJid deviceJid, int i) {
        runOnUiThread(new RunnableEBaseShape8S0200000_I1_3(this, deviceJid, 16));
    }

    @Override // X.AnonymousClass01V
    public void AGh(DeviceJid deviceJid) {
        A0a(deviceJid.userJid);
    }

    @Override // X.AnonymousClass01V
    public void AGi(DeviceJid deviceJid) {
        A0a(deviceJid.userJid);
    }

    @Override // X.AnonymousClass01V
    public void AGj(DeviceJid deviceJid) {
        A0a(deviceJid.userJid);
    }

    @Override // X.AbstractC49432Ql
    public void AIg() {
        this.A05.setVisibility(0);
    }

    @Override // X.AnonymousClass1VF
    public void ALa(UserJid userJid, Set set, Set set2) {
        if (!set.isEmpty() || !set2.isEmpty()) {
            A0a(userJid);
        }
    }

    public void finish() {
        if (!A0e() || findViewById(R.id.main_layout).getVisibility() != 8) {
            super.finish();
        } else {
            A0b(null);
        }
    }

    public void lambda$onCreate$2184$IdentityVerificationActivity(View view) {
        AnonymousClass02M r2 = ((ActivityC004702f) this).A0F;
        r2.A02.post(new RunnableEBaseShape10S0100000_I1_5(this, 22));
    }

    public /* synthetic */ void lambda$onCreate$2186$IdentityVerificationActivity(View view) {
        A0X();
    }

    @Override // X.ActivityC004902h
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 1) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            A0X();
        }
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AnonymousClass01X r5 = ((AnonymousClass2C0) this).A01;
        setTitle(r5.A06(R.string.verify_identity));
        AnonymousClass0S2 A092 = A09();
        if (A092 != null) {
            A092.A0A(true);
            try {
                C007003k A0A2 = this.A0J.A0A(UserJid.get(getIntent().getStringExtra("jid")));
                this.A0A = A0A2;
                A0K(r5.A0D(R.string.verify_identity_names, this.A0K.A04(A0A2)));
                setContentView(R.layout.identity_verification);
                this.A07 = (TextView) findViewById(R.id.identity_text);
                this.A05 = (ProgressBar) findViewById(R.id.progress_bar);
                HandlerThread handlerThread = new HandlerThread("IdDecode");
                this.A01 = handlerThread;
                handlerThread.start();
                this.A00 = new Handler(this.A01.getLooper());
                this.A06 = (TextView) findViewById(R.id.error_indicator);
                this.A0B = (QrScannerView) findViewById(R.id.camera);
                this.A03 = findViewById(R.id.header);
                AnonymousClass00D r4 = super.A0J;
                if (!r4.A00.getBoolean("security_notifications", false) && r4.A0n(2592000000L, "security_notifications_alert_timestamp")) {
                    this.A03.postDelayed(new RunnableEBaseShape10S0100000_I1_5(this, 23), 1000);
                }
                findViewById(R.id.enable).setOnClickListener(new ViewOnClickEBaseShape6S0100000_I1_4(this, 25));
                findViewById(R.id.close).setOnClickListener(new ViewOnClickCListenerShape13S0100000_I1_2(this, 26));
                QrScannerView qrScannerView = this.A0B;
                qrScannerView.A05 = this.A00;
                qrScannerView.A06 = new C55102g0(this);
                A0c(false);
                A0U();
                View findViewById = findViewById(R.id.result);
                if (findViewById != null) {
                    this.A04 = (ImageView) findViewById;
                    View findViewById2 = findViewById(R.id.scan_code);
                    if (findViewById2 != null) {
                        findViewById2.setOnClickListener(new ViewOnClickEBaseShape6S0100000_I1_4(this, 26));
                        if (this.A0N.A02("android.permission.NFC") == 0) {
                            NfcAdapter defaultAdapter = NfcAdapter.getDefaultAdapter(this);
                            if (defaultAdapter != null) {
                                try {
                                    defaultAdapter.setNdefPushMessageCallback(new C49422Qk(this), this, new Activity[0]);
                                } catch (IllegalStateException | SecurityException e) {
                                    Log.w("idverification/ ", e);
                                }
                            }
                            if ("android.nfc.action.NDEF_DISCOVERED".equals(getIntent().getAction())) {
                                A0Y(getIntent());
                            }
                        }
                        this.A0L.A01(this);
                        this.A0H.A00(this);
                        this.A0O.A00(this);
                        this.A0P.A00(this);
                        return;
                    }
                    throw null;
                }
                throw null;
            } catch (AnonymousClass02Y e2) {
                Log.e("idverification/finishing due to invalid jid", e2);
                finish();
            }
        } else {
            throw null;
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        boolean z = false;
        MenuItem icon = menu.add(0, R.id.menuitem_share, 0, ((AnonymousClass2C0) this).A01.A06(R.string.share)).setIcon(R.drawable.ic_action_share);
        this.A02 = icon;
        icon.setShowAsAction(2);
        MenuItem menuItem = this.A02;
        if (this.A09 != null) {
            z = true;
        }
        menuItem.setVisible(z);
        return super.onCreateOptionsMenu(menu);
    }

    @Override // X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onDestroy() {
        super.onDestroy();
        HandlerThread handlerThread = this.A01;
        if (handlerThread != null) {
            handlerThread.quit();
        }
        this.A0L.A00(this);
        this.A0H.A01(this);
        this.A0O.A01(this);
        this.A0P.A01(this);
        AnonymousClass02M r0 = ((ActivityC004702f) this).A0F;
        r0.A02.removeCallbacks(this.A0U);
    }

    @Override // X.ActivityC004902h
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        if ("android.nfc.action.NDEF_DISCOVERED".equals(intent.getAction())) {
            A0Y(intent);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00bf, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00c3, code lost:
        throw r0;
     */
    @Override // X.ActivityC004702f
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onOptionsItemSelected(android.view.MenuItem r24) {
        /*
        // Method dump skipped, instructions count: 480
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.identity.IdentityVerificationActivity.onOptionsItemSelected(android.view.MenuItem):boolean");
    }

    @Override // X.ActivityC004602e, X.ActivityC004702f, X.ActivityC004902h
    public void onPause() {
        super.onPause();
        if (this.A0B.getVisibility() == 0) {
            this.A0B.setVisibility(4);
        }
    }

    @Override // X.ActivityC004602e, X.ActivityC004702f, X.ActivityC004902h
    public void onResume() {
        super.onResume();
        if (this.A0B.getVisibility() == 4) {
            this.A0B.setVisibility(0);
        }
    }
}
