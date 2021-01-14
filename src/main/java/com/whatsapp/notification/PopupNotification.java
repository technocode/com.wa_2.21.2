package com.whatsapp.notification;

import X.AbstractC007503q;
import X.AbstractC26561Lk;
import X.ActivityC004702f;
import X.AnonymousClass008;
import X.AnonymousClass00C;
import X.AnonymousClass00D;
import X.AnonymousClass00G;
import X.AnonymousClass00S;
import X.AnonymousClass00T;
import X.AnonymousClass00Y;
import X.AnonymousClass019;
import X.AnonymousClass01A;
import X.AnonymousClass01Q;
import X.AnonymousClass01S;
import X.AnonymousClass01T;
import X.AnonymousClass01X;
import X.AnonymousClass022;
import X.AnonymousClass02M;
import X.AnonymousClass02N;
import X.AnonymousClass03B;
import X.AnonymousClass03P;
import X.AnonymousClass03S;
import X.AnonymousClass088;
import X.AnonymousClass08B;
import X.AnonymousClass0AC;
import X.AnonymousClass0AL;
import X.AnonymousClass0AP;
import X.AnonymousClass0AQ;
import X.AnonymousClass0AV;
import X.AnonymousClass0BB;
import X.AnonymousClass0BP;
import X.AnonymousClass0CP;
import X.AnonymousClass0D1;
import X.AnonymousClass0ET;
import X.AnonymousClass0Eg;
import X.AnonymousClass0FE;
import X.AnonymousClass0Fh;
import X.AnonymousClass0Fk;
import X.AnonymousClass0GG;
import X.AnonymousClass0GZ;
import X.AnonymousClass0HJ;
import X.AnonymousClass0HK;
import X.AnonymousClass0I5;
import X.AnonymousClass0IY;
import X.AnonymousClass0JO;
import X.AnonymousClass0JQ;
import X.AnonymousClass0L2;
import X.AnonymousClass0LB;
import X.AnonymousClass0MB;
import X.AnonymousClass0XP;
import X.AnonymousClass0XY;
import X.AnonymousClass0YX;
import X.AnonymousClass0Z6;
import X.AnonymousClass0Z7;
import X.AnonymousClass0ZE;
import X.AnonymousClass1N3;
import X.AnonymousClass1VY;
import X.AnonymousClass2Iq;
import X.AnonymousClass2W0;
import X.AnonymousClass2W1;
import X.AnonymousClass2W2;
import X.AnonymousClass31y;
import X.C000300f;
import X.C002001d;
import X.C002101e;
import X.C002301g;
import X.C004302a;
import X.C006903j;
import X.C007003k;
import X.C007303n;
import X.C014308b;
import X.C017009c;
import X.C02150Av;
import X.C02580Cq;
import X.C02590Cr;
import X.C02600Cs;
import X.C03930Ii;
import X.C04260Jr;
import X.C04270Js;
import X.C04360Kb;
import X.C04410Kg;
import X.C04420Kh;
import X.C06170Sb;
import X.C06470Tj;
import X.C08430b6;
import X.C08440b7;
import X.C09050cD;
import X.C11930hF;
import X.C26481Lc;
import X.C27131Oe;
import X.C28301Tu;
import X.C29241Xq;
import X.C40991uH;
import X.C48672Ng;
import X.C50752Vx;
import X.C53392d8;
import X.C53492dM;
import X.C58622mE;
import X.C58632mF;
import X.C58662mI;
import X.C58672mJ;
import X.C58682mK;
import X.C58692mL;
import X.C58702mM;
import X.C58712mN;
import X.C58722mO;
import X.C60662pu;
import X.C60672pw;
import X.DialogInterface$OnClickListenerC50772Vz;
import X.View$OnTouchListenerC50762Vy;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.Html;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.method.TextKeyListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape1S0100000_I0_1;
import com.google.android.search.verification.client.R;
import com.whatsapp.Conversation;
import com.whatsapp.KeyboardPopupLayout;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.components.button.ThumbnailButton;
import com.whatsapp.emoji.search.EmojiSearchContainer;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.stickers.StickerView;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class PopupNotification extends ActivityC004702f {
    public float A00;
    public int A01;
    public Sensor A02;
    public SensorEventListener A03;
    public SensorManager A04;
    public PowerManager.WakeLock A05;
    public View.OnClickListener A06;
    public View A07;
    public View A08;
    public View A09;
    public Button A0A;
    public ImageButton A0B;
    public ImageButton A0C;
    public TextView A0D;
    public TextView A0E;
    public TextView A0F;
    public AbstractC26561Lk A0G;
    public C08440b7 A0H;
    public C11930hF A0I;
    public C002301g A0J;
    public C27131Oe A0K;
    public AnonymousClass0YX A0L;
    public C60672pw A0M;
    public C007003k A0N;
    public C48672Ng A0O;
    public AnonymousClass02N A0P;
    public PopupNotificationViewPager A0Q;
    public AbstractC007503q A0R;
    public Integer A0S;
    public HashSet A0T = new HashSet();
    public HashSet A0U = new HashSet();
    public HashSet A0V = new HashSet();
    public List A0W = new ArrayList();
    public boolean A0X;
    public boolean A0Y;
    public final Handler A0Z;
    public final Handler A0a;
    public final AnonymousClass0AV A0b = AnonymousClass0AV.A00();
    public final AnonymousClass0GG A0c = AnonymousClass0GG.A00();
    public final C09050cD A0d = C09050cD.A00();
    public final C26481Lc A0e = C26481Lc.A00();
    public final AnonymousClass088 A0f = AnonymousClass088.A00();
    public final AnonymousClass02M A0g = AnonymousClass02M.A00();
    public final AnonymousClass0Z6 A0h = AnonymousClass0Z6.A00();
    public final AnonymousClass0JQ A0i = AnonymousClass0JQ.A00();
    public final AnonymousClass0Fk A0j = AnonymousClass0Fk.A01;
    public final AnonymousClass1N3 A0k;
    public final AnonymousClass0XY A0l = AnonymousClass0XY.A01;
    public final AnonymousClass0I5 A0m = AnonymousClass0I5.A00();
    public final AnonymousClass03B A0n = AnonymousClass03B.A00();
    public final AnonymousClass0IY A0o = AnonymousClass0IY.A00();
    public final AnonymousClass0XP A0p = AnonymousClass0XP.A01();
    public final AnonymousClass0Z7 A0q = AnonymousClass0Z7.A00();
    public final AnonymousClass0GZ A0r = AnonymousClass0GZ.A00();
    public final C04360Kb A0s = C04360Kb.A00();
    public final C40991uH A0t = C40991uH.A00;
    public final C017009c A0u = C017009c.A00();
    public final AnonymousClass0HJ A0v = AnonymousClass0HJ.A02();
    public final AnonymousClass01A A0w = AnonymousClass01A.A00();
    public final AnonymousClass0BP A0x;
    public final AnonymousClass08B A0y;
    public final C014308b A0z = C014308b.A00();
    public final AnonymousClass0L2 A10 = AnonymousClass0L2.A01();
    public final AnonymousClass0HK A11 = AnonymousClass0HK.A00();
    public final C04410Kg A12 = C04410Kg.A00();
    public final AnonymousClass2Iq A13 = AnonymousClass2Iq.A00();
    public final AnonymousClass00C A14 = AnonymousClass00C.A00();
    public final AnonymousClass03P A15 = AnonymousClass03P.A00();
    public final AnonymousClass00S A16 = AnonymousClass00S.A00();
    public final AnonymousClass00G A17 = AnonymousClass00G.A01;
    public final AnonymousClass03S A18 = AnonymousClass03S.A00();
    public final AnonymousClass00D A19 = AnonymousClass00D.A00();
    public final AnonymousClass00D A1A = AnonymousClass00D.A00();
    public final AnonymousClass01X A1B = AnonymousClass01X.A00();
    public final C006903j A1C = C006903j.A00();
    public final AnonymousClass0AQ A1D = AnonymousClass0AQ.A00();
    public final AnonymousClass01Q A1E = AnonymousClass01Q.A00();
    public final AnonymousClass01T A1F = AnonymousClass01T.A00();
    public final AnonymousClass0AP A1G = AnonymousClass0AP.A00();
    public final AnonymousClass019 A1H;
    public final AnonymousClass0AC A1I;
    public final C02600Cs A1J = C02600Cs.A00();
    public final C02590Cr A1K = C02590Cr.A00();
    public final C03930Ii A1L = C03930Ii.A00();
    public final C53492dM A1M = C53492dM.A00();
    public final C04270Js A1N = C04270Js.A00();
    public final AnonymousClass0ET A1O = AnonymousClass0ET.A00();
    public final AnonymousClass00Y A1P = AnonymousClass00Y.A00();
    public final AnonymousClass0Eg A1Q = AnonymousClass0Eg.A00();
    public final AnonymousClass01S A1R = AnonymousClass01S.A00();
    public final AnonymousClass0CP A1S = AnonymousClass0CP.A00();
    public final C04420Kh A1T = C04420Kh.A00();
    public final AnonymousClass0FE A1U = AnonymousClass0FE.A00();
    public final C02150Av A1V = C02150Av.A02();
    public final AnonymousClass022 A1W = AnonymousClass022.A00();
    public final AnonymousClass0AL A1X = AnonymousClass0AL.A01();
    public final AnonymousClass0BB A1Y = AnonymousClass0BB.A00();
    public final AnonymousClass31y A1Z = AnonymousClass31y.A00();
    public final AnonymousClass0D1 A1a = AnonymousClass0D1.A00();
    public final C04260Jr A1b = C04260Jr.A00();
    public final C06170Sb A1c = C06170Sb.A00();
    public final C02580Cq A1d = C02580Cq.A01();
    public final AnonymousClass00T A1e = C002101e.A00();
    public final AnonymousClass0JO A1f = AnonymousClass0JO.A00;
    public final AnonymousClass0Fh A1g = AnonymousClass0Fh.A00();
    public final Runnable A1h;
    public final Runnable A1i;

    public PopupNotification() {
        AnonymousClass0LB.A00();
        this.A0k = new C58662mI(this);
        this.A1I = AnonymousClass0AC.A00;
        this.A1H = new C58672mJ(this);
        this.A0y = AnonymousClass08B.A00;
        this.A0x = new C58682mK(this);
        this.A0G = new C58722mO(this);
        this.A00 = 5.0f;
        this.A0Z = new Handler(Looper.getMainLooper());
        this.A1h = new RunnableEBaseShape3S0100000_I0_3(this, 27);
        this.A0a = new Handler(Looper.getMainLooper());
        this.A1i = new RunnableEBaseShape3S0100000_I0_3(this, 29);
    }

    public static void A04(PopupNotification popupNotification) {
        Log.i("popupnotification/wakeup");
        PowerManager.WakeLock wakeLock = popupNotification.A05;
        if (wakeLock != null && !wakeLock.isHeld()) {
            popupNotification.A05.acquire();
        }
        Handler handler = popupNotification.A0Z;
        Runnable runnable = popupNotification.A1h;
        handler.removeCallbacks(runnable);
        handler.postDelayed(runnable, 5000);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0016, code lost:
        if (A0a() != false) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0R() {
        /*
        // Method dump skipped, instructions count: 476
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.notification.PopupNotification.A0R():void");
    }

    public final void A0S() {
        findViewById(R.id.navigation_holder).setVisibility(8);
        findViewById(R.id.navigation_divider).setVisibility(8);
        this.A07.setVisibility(8);
        this.A08.setVisibility(8);
    }

    public final void A0T() {
        this.A12.A03((AnonymousClass02N) this.A0N.A02(AnonymousClass02N.class), true, true);
        InputMethodManager A0H2 = this.A15.A0H();
        if (A0H2 != null && A0H2.isFullscreenMode()) {
            A0H2.hideSoftInputFromWindow(this.A0M.getWindowToken(), 0);
        }
        int currentItem = this.A0Q.getCurrentItem();
        StringBuilder A0T2 = AnonymousClass008.A0T("popupnotification/moveToNextMessageOrExit/ message_pos:", currentItem, " messages.size:");
        A0T2.append(this.A0W.size());
        Log.i(A0T2.toString());
        this.A0U.add(((AbstractC007503q) this.A0W.get(currentItem)).A0n);
        if (this.A0W.size() == 1 || (this.A0P != null && this.A01 == 1)) {
            A0U();
            finish();
            return;
        }
        int i = currentItem + 1;
        if (currentItem == this.A0W.size() - 1) {
            i = currentItem - 1;
        }
        this.A0S = Integer.valueOf(currentItem);
        this.A0Q.A0O(i, true, false);
        if (this.A0W.size() == 1) {
            A0S();
        }
        AbstractC007503q r0 = this.A0R;
        if (r0 != null) {
            this.A0V.add(r0.A0n);
        }
        C007003k r02 = this.A0N;
        if (r02 != null) {
            this.A0T.add(r02.A02(AnonymousClass02N.class));
        }
    }

    public final void A0U() {
        StringBuilder A0S2 = AnonymousClass008.A0S("popupnotification/clearnotifications:");
        A0S2.append(this.A0T.size());
        Log.i(A0S2.toString());
        this.A0i.A02(true);
        this.A0P = null;
        Iterator it = this.A0T.iterator();
        while (it.hasNext()) {
            AnonymousClass02N r5 = (AnonymousClass02N) it.next();
            ArrayList arrayList = new ArrayList();
            int A012 = this.A1C.A01(r5);
            Iterator it2 = this.A0V.iterator();
            while (it2.hasNext()) {
                C007303n r1 = (C007303n) it2.next();
                AnonymousClass02N r0 = r1.A00;
                if (r0 != null && r0.equals(r5)) {
                    arrayList.add(r1);
                }
            }
            StringBuilder A0S3 = AnonymousClass008.A0S("popupnotification/msg:");
            A0S3.append(arrayList.size());
            A0S3.append("/");
            A0S3.append(A012);
            Log.i(A0S3.toString());
            if (arrayList.size() == A012) {
                this.A12.A03(r5, true, true);
                this.A0V.removeAll(arrayList);
            }
        }
        this.A0l.A00 = null;
        this.A1U.A04();
    }

    public final void A0V() {
        C007003k r2 = this.A0N;
        if (r2 != null) {
            if (this.A0c.A0H((UserJid) r2.A02(UserJid.class))) {
                C002001d.A2O(this, 106);
                return;
            }
            String trim = this.A0M.getText().toString().trim();
            if (trim.length() > 0) {
                if (C002001d.A3R(this.A15, this.A1W, trim)) {
                    this.A0s.A0T(Collections.singletonList(this.A0N.A02(AnonymousClass02N.class)), C002001d.A1l(trim), null, null, null, false, false);
                    TextKeyListener.clear(this.A0M.getText());
                } else {
                    this.A0g.A0C(this.A1B.A06(R.string.cannot_send_empty_text_message), 1);
                }
                A0T();
                return;
            }
            StringBuilder A0S2 = AnonymousClass008.A0S("popupnotification/sendentry/empty text ");
            A0S2.append(this.A0W.size());
            Log.i(A0S2.toString());
        }
    }

    public final void A0W() {
        C007003k r4 = this.A0N;
        if (r4 != null) {
            Bitmap A022 = this.A11.A02(r4, getResources().getDimensionPixelSize(R.dimen.small_avatar_size), getResources().getDimension(R.dimen.small_avatar_radius), true);
            if (A022 == null) {
                AnonymousClass0HJ r2 = this.A0v;
                A022 = r2.A00.A00(this, r2.A03(this.A0N));
            }
            ((ImageView) findViewById(R.id.popup_thumb)).setImageBitmap(A022);
        }
    }

    public final void A0X(int i) {
        int size;
        AnonymousClass02N r1;
        while (true) {
            size = this.A0W.size();
            if (i >= 0) {
                break;
            }
            i += size;
        }
        int i2 = i % size;
        AbstractC007503q r0 = (AbstractC007503q) this.A0W.get(i2);
        this.A0R = r0;
        AnonymousClass02N r2 = r0.A0n.A00;
        C27131Oe r3 = this.A0K;
        boolean A0P2 = r3.A0P();
        if (!A0P2) {
            if (!A0P2) {
                r3.A0X = r2;
            } else {
                throw new IllegalStateException("Do not update the ptt receiver once the recording has started");
            }
        }
        C007003k A022 = this.A1D.A02(r2);
        this.A0N = A022;
        boolean z = true;
        if (AnonymousClass1VY.A0a(A022.A09)) {
            this.A09.setVisibility(8);
            this.A0E.setVisibility(0);
            this.A0E.setText(this.A1B.A06(R.string.cant_send_official_announcements));
        } else if (!A022.A09() || this.A1F.A04((GroupJid) r2)) {
            if (this.A0N.A09()) {
                AnonymousClass01T r12 = this.A1F;
                GroupJid groupJid = (GroupJid) r2;
                if (r12.A04(groupJid) && this.A0N.A0Q && !r12.A05(groupJid)) {
                    this.A09.setVisibility(8);
                    this.A0E.setVisibility(0);
                    this.A0E.setText(Html.fromHtml(this.A1B.A0D(R.string.group_announcement_footer_description, "000000")).toString());
                }
            }
            this.A09.setVisibility(0);
            this.A0E.setVisibility(8);
        } else {
            this.A09.setVisibility(8);
            this.A0E.setVisibility(0);
            TextView textView = this.A0E;
            boolean z2 = this.A0N.A0S;
            int i3 = R.string.cannot_send_not_a_group_participant;
            if (z2) {
                i3 = R.string.cannot_send_chat_has_been_closed;
            }
            textView.setText(getString(i3));
        }
        boolean z3 = false;
        if (this.A0j.A00 == 3) {
            z3 = true;
        }
        if (!z3 && !this.A0N.A09() && (r1 = (AnonymousClass02N) this.A0N.A02(UserJid.class)) != null) {
            this.A0m.A06(r1);
        }
        if (this.A0W.size() == 1 || this.A0Y) {
            this.A0V.add(this.A0R.A0n);
            this.A0T.add(this.A0N.A02(AnonymousClass02N.class));
            this.A0Y = false;
        }
        A0W();
        int i4 = R.string.view;
        if (this.A0R.A0m == 3) {
            i4 = R.string.watch;
        }
        Button button = this.A0A;
        AnonymousClass01X r22 = this.A1B;
        button.setText(r22.A06(i4));
        this.A0I.A03(this.A0N, null);
        if (this.A0N.A09()) {
            AnonymousClass02N A072 = this.A0R.A07();
            if (A072 == null) {
                this.A0F.setVisibility(8);
            } else if (A072 != null) {
                this.A0F.setText(this.A0z.A08(this.A0w.A0A(A072), false));
                this.A0F.setVisibility(0);
            } else {
                throw null;
            }
        } else {
            String A012 = this.A0d.A01(this.A0N);
            if (TextUtils.isEmpty(A012)) {
                this.A0F.setVisibility(8);
            } else {
                this.A0F.setVisibility(0);
                this.A0F.setText(A012);
            }
        }
        this.A0D.setText(r22.A0D(R.string.media_view_x_of_y, Integer.valueOf(i2 + 1), Integer.valueOf(this.A0W.size())));
        ImageButton imageButton = this.A0B;
        if (this.A0M.getText().toString().length() == 0) {
            z = false;
        }
        imageButton.setEnabled(z);
    }

    public final void A0Y(ThumbnailButton thumbnailButton) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.popup_gallery_height);
        thumbnailButton.setMinimumHeight(dimensionPixelSize);
        thumbnailButton.setMaxHeight(dimensionPixelSize);
        thumbnailButton.setAdjustViewBounds(true);
        thumbnailButton.setScaleType(ImageView.ScaleType.FIT_CENTER);
        int i = (int) this.A0J.A02;
        thumbnailButton.setPadding(i, i, i, i);
        thumbnailButton.A02 = this.A0J.A03;
        if (thumbnailButton instanceof C60662pu) {
            C60662pu r3 = (C60662pu) thumbnailButton;
            r3.A00 = ((float) dimensionPixelSize) / 7.0f;
            r3.A03 = 5;
        }
    }

    public final void A0Z(AnonymousClass0ZE r11, StickerView stickerView) {
        C29241Xq A112 = r11.A11();
        if (A112.A07 == null) {
            stickerView.setImageResource(R.drawable.sticker_error_in_conversation);
        }
        int dimensionPixelSize = stickerView.getContext().getResources().getDimensionPixelSize(R.dimen.popup_notification_sticker_size);
        this.A1a.A06(A112, 1, stickerView, dimensionPixelSize, dimensionPixelSize, false, false, null);
    }

    public final boolean A0a() {
        return this.A0M.getText().toString().length() > 0 || this.A0K.A0P();
    }

    @Override // X.ActivityC004702f
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C28301Tu r0 = C28301Tu.A0i;
        return (r0 == null || !r0.A0L) && super.dispatchTouchEvent(motionEvent);
    }

    public /* synthetic */ void lambda$onCreate$2312$PopupNotification(View view) {
        this.A1b.A01();
        A0U();
        finish();
    }

    public void lambda$onCreate$2313$PopupNotification(View view) {
        this.A1b.A01();
        String trim = this.A0M.getText().toString().trim();
        C007003k r2 = this.A0N;
        if (r2 != null && trim.length() > 0) {
            Conversation.A4l.put(r2.A02(AnonymousClass02N.class), trim);
        }
        startActivity(Conversation.A04(this, this.A1D.A02(this.A0R.A0n.A00)));
        A0U();
        finish();
    }

    public void lambda$onCreate$2314$PopupNotification(View view) {
        if (!A0a()) {
            this.A0i.A02(true);
            AbstractC007503q r0 = this.A0R;
            if (r0 != null) {
                this.A0V.add(r0.A0n);
            }
            C007003k r2 = this.A0N;
            if (r2 != null) {
                this.A0T.add(r2.A02(AnonymousClass02N.class));
            }
            this.A0Y = true;
            if (this.A0W.size() > 1) {
                PopupNotificationViewPager popupNotificationViewPager = this.A0Q;
                int i = 0;
                popupNotificationViewPager.A0O(popupNotificationViewPager.getCurrentItem() + 1, true, false);
                int currentItem = this.A0Q.getCurrentItem();
                if (currentItem < this.A0W.size()) {
                    i = currentItem;
                }
                A0X(i);
            }
        }
    }

    public void lambda$onCreate$2315$PopupNotification(View view) {
        if (!A0a()) {
            this.A0i.A02(true);
            AbstractC007503q r0 = this.A0R;
            if (r0 != null) {
                this.A0V.add(r0.A0n);
            }
            C007003k r2 = this.A0N;
            if (r2 != null) {
                this.A0T.add(r2.A02(AnonymousClass02N.class));
            }
            this.A0Y = true;
            if (this.A0W.size() > 1) {
                PopupNotificationViewPager popupNotificationViewPager = this.A0Q;
                popupNotificationViewPager.A0O(popupNotificationViewPager.getCurrentItem() - 1, true, false);
                int currentItem = this.A0Q.getCurrentItem();
                if (currentItem < 0) {
                    currentItem = this.A0W.size() - 1;
                }
                A0X(currentItem);
            }
        }
    }

    public void lambda$onCreate$2316$PopupNotification(View view) {
        this.A0i.A02(true);
        AbstractC007503q r0 = this.A0R;
        if (r0 != null) {
            this.A0V.add(r0.A0n);
        }
        C007003k r2 = this.A0N;
        if (r2 != null) {
            this.A0T.add(r2.A02(AnonymousClass02N.class));
        }
    }

    public /* synthetic */ void lambda$onCreate$2319$PopupNotification(View view) {
        A0V();
    }

    @Override // X.ActivityC004702f, X.AnonymousClass02i
    public void onBackPressed() {
        A0U();
        super.onBackPressed();
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        requestWindowFeature(1);
        if (Build.VERSION.SDK_INT >= 17) {
            getWindow().getDecorView().setLayoutDirection(3);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().setStatusBarColor(C004302a.A00(this, 17170445));
        }
        super.onCreate(bundle);
        boolean z = this.A0o.A00;
        int i = R.color.popup_dim;
        if (z) {
            i = R.color.black;
        }
        getWindow().setBackgroundDrawable(new ColorDrawable(C004302a.A00(this, i)));
        AnonymousClass03P r0 = this.A15;
        SensorManager A072 = r0.A07();
        if (A072 != null) {
            this.A04 = A072;
            this.A02 = A072.getDefaultSensor(8);
            PowerManager A0C2 = r0.A0C();
            if (A0C2 == null) {
                Log.w("popupnotification/create pm=null");
            } else {
                this.A05 = C002001d.A0f(A0C2, 268435466, "popupnotification");
            }
            setContentView(getLayoutInflater().inflate(R.layout.popup_notification, (ViewGroup) null, false));
            this.A0J = C002301g.A0K;
            this.A0Q = (PopupNotificationViewPager) findViewById(R.id.message_view_pager);
            C60672pw r5 = (C60672pw) findViewById(R.id.entry);
            this.A0M = r5;
            r5.setFilters(new InputFilter[]{new C50752Vx(this)});
            this.A0A = (Button) findViewById(R.id.popup_action_btn);
            C014308b r52 = this.A0z;
            AnonymousClass01X r10 = this.A1B;
            this.A0I = new C11930hF((TextEmojiLabel) findViewById(R.id.popup_title), r52, r10, this.A1Z);
            this.A0F = (TextView) findViewById(R.id.conversation_contact_status);
            this.A0D = (TextView) findViewById(R.id.popup_count);
            ImageView imageView = (ImageView) findViewById(R.id.next_btn);
            imageView.setImageDrawable(new C06470Tj(r10, getResources().getDrawable(R.drawable.selector_media_next)));
            this.A07 = findViewById(R.id.next_btn_ext);
            ImageView imageView2 = (ImageView) findViewById(R.id.prev_btn);
            imageView2.setImageDrawable(new C06470Tj(r10, getResources().getDrawable(R.drawable.selector_media_prev)));
            this.A08 = findViewById(R.id.prev_btn_ext);
            this.A0E = (TextView) findViewById(R.id.read_only_chat_info);
            this.A09 = findViewById(R.id.emoji_popup_anchor);
            this.A0B = (ImageButton) findViewById(R.id.send);
            ImageButton imageButton = (ImageButton) findViewById(R.id.voice_note_btn);
            this.A0C = imageButton;
            imageButton.setLongClickable(true);
            C08440b7 r1 = new C08440b7(new C08430b6(this));
            this.A0H = r1;
            this.A0Q.setAdapter(r1);
            this.A0Q.setOnTouchListener(new View$OnTouchListenerC50762Vy(this));
            this.A0Q.A0F(new C58692mL(this));
            findViewById(R.id.popup_ok_btn).setOnClickListener(new ViewOnClickEBaseShape1S0100000_I0_1(this, 3));
            ViewOnClickEBaseShape1S0100000_I0_1 viewOnClickEBaseShape1S0100000_I0_1 = new ViewOnClickEBaseShape1S0100000_I0_1(this, 4);
            this.A06 = viewOnClickEBaseShape1S0100000_I0_1;
            this.A0A.setOnClickListener(viewOnClickEBaseShape1S0100000_I0_1);
            ViewOnClickEBaseShape1S0100000_I0_1 viewOnClickEBaseShape1S0100000_I0_12 = new ViewOnClickEBaseShape1S0100000_I0_1(this, 5);
            imageView.setOnClickListener(viewOnClickEBaseShape1S0100000_I0_12);
            this.A07.setOnClickListener(viewOnClickEBaseShape1S0100000_I0_12);
            ViewOnClickEBaseShape1S0100000_I0_1 viewOnClickEBaseShape1S0100000_I0_13 = new ViewOnClickEBaseShape1S0100000_I0_1(this, 8);
            imageView2.setOnClickListener(viewOnClickEBaseShape1S0100000_I0_13);
            this.A08.setOnClickListener(viewOnClickEBaseShape1S0100000_I0_13);
            this.A0B.setImageDrawable(new C06470Tj(r10, C004302a.A03(this, R.drawable.input_send)));
            View findViewById = findViewById(R.id.input_layout);
            findViewById.setBackgroundResource(R.drawable.ib_new_round);
            findViewById.setPadding(0, 0, 0, 0);
            View findViewById2 = findViewById(R.id.text_entry_layout);
            if (findViewById2 != null) {
                int max = Math.max(findViewById2.getPaddingLeft(), findViewById2.getPaddingRight());
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) findViewById2.getLayoutParams();
                if (r10.A0M()) {
                    layoutParams.rightMargin = max;
                } else {
                    layoutParams.leftMargin = max;
                }
                findViewById2.setLayoutParams(layoutParams);
                this.A0M.setOnClickListener(new ViewOnClickEBaseShape1S0100000_I0_1(this, 7));
                getLayoutInflater().inflate(R.layout.voice_note_view, (ViewGroup) findViewById(R.id.voice_note_stub), true);
                KeyboardPopupLayout keyboardPopupLayout = (KeyboardPopupLayout) findViewById(R.id.root_layout);
                AnonymousClass00S r02 = this.A16;
                AnonymousClass02M r03 = this.A0g;
                AnonymousClass00T r04 = this.A1e;
                AnonymousClass088 r05 = this.A0f;
                AnonymousClass00Y r06 = this.A1P;
                C000300f r07 = super.A0G;
                C04360Kb r08 = this.A0s;
                AnonymousClass0CP r09 = this.A1S;
                AnonymousClass0JO r010 = this.A1f;
                AnonymousClass0Fh r011 = this.A1g;
                AnonymousClass0AL r012 = this.A1X;
                AnonymousClass0GG r013 = this.A0c;
                AnonymousClass0ET r014 = this.A1O;
                AnonymousClass00C r15 = this.A14;
                C02580Cq r12 = this.A1d;
                C04270Js r8 = this.A1N;
                C40991uH r7 = this.A0t;
                AnonymousClass00D r6 = this.A19;
                AnonymousClass0AV r53 = this.A0b;
                C26481Lc r4 = this.A0e;
                C04420Kh r3 = this.A1T;
                AnonymousClass022 r015 = this.A1W;
                boolean z2 = false;
                if (Build.VERSION.SDK_INT != 26) {
                    z2 = true;
                }
                this.A0K = new C58702mM(this, this, this, keyboardPopupLayout, r02, r03, r04, r05, r06, r07, r08, r09, r010, r011, r0, r10, r012, r013, r014, r15, r12, r8, r7, r6, r53, r4, r3, r015, z2);
                this.A0C.setOnTouchListener(new AnonymousClass2W1(this));
                this.A0C.setVisibility(0);
                this.A0B.setVisibility(8);
                this.A0M.addTextChangedListener(new C58712mN(this));
                this.A0M.setOnEditorActionListener(new AnonymousClass2W0(this));
                this.A0B.setOnClickListener(new ViewOnClickEBaseShape1S0100000_I0_1(this, 6));
                AnonymousClass0Eg r82 = this.A1Q;
                C06170Sb r72 = this.A1c;
                C02590Cr r54 = this.A1K;
                C02600Cs r62 = this.A1J;
                C03930Ii r42 = this.A1L;
                C53392d8 r14 = new C53392d8(this, r82, r72, r54, r62, r42, r0, r10, this.A1M, this.A1A, r015, keyboardPopupLayout, (ImageButton) findViewById(R.id.emoji_picker_btn), this.A0M);
                r14.A08(this.A0G);
                r14.A08 = new C58622mE(this);
                C48672Ng r122 = new C48672Ng((EmojiSearchContainer) findViewById(R.id.popup_search_container), r14, this, r54, r42, r10, r015);
                this.A0O = r122;
                r122.A00 = new C58632mF(this);
                if (getIntent().getBooleanExtra("popup_notification_extra_dismiss_notification", false)) {
                    this.A1U.A0C(false);
                    this.A0i.A02(true);
                }
                AnonymousClass02N A012 = AnonymousClass02N.A01(getIntent().getStringExtra("popup_notification_extra_quick_reply_jid"));
                AnonymousClass008.A12("popupnotification/set-quick-reply-jid:", A012);
                this.A0P = A012;
                A0R();
                this.A1I.A01(this.A1H);
                this.A0y.A01(this.A0x);
                if (this.A0p.A02(this.A0n) > 0) {
                    APo(115);
                }
                if (this.A0P != null) {
                    getWindow().setSoftInputMode(4);
                }
                this.A0l.A00 = this.A0k;
                return;
            }
            throw null;
        }
        throw null;
    }

    public Dialog onCreateDialog(int i) {
        if (i == 106) {
            AnonymousClass0MB r4 = new AnonymousClass0MB(this);
            AnonymousClass01X r6 = this.A1B;
            r4.A01.A0E = r6.A0D(R.string.cannot_send_to_blocked_contact_1, this.A0z.A08(this.A0N, false));
            r4.A07(r6.A06(R.string.unblock), new AnonymousClass2W2(this));
            r4.A05(r6.A06(R.string.cancel), new DialogInterface$OnClickListenerC50772Vz(this));
            return r4.A00();
        } else if (i != 115) {
            return super.onCreateDialog(i);
        } else {
            Log.i("popupnotification/dialog-software-about-to-expire");
            return this.A0p.A03(this, this.A0r, this.A0n);
        }
    }

    @Override // X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onDestroy() {
        super.onDestroy();
        AnonymousClass0D1 r0 = this.A1a;
        if (r0 != null) {
            r0.A04();
        }
        AnonymousClass0YX r02 = this.A0L;
        if (r02 != null) {
            r02.A00();
            this.A0L = null;
        }
        C27131Oe r03 = this.A0K;
        if (r03 != null) {
            r03.A02();
        }
        this.A0P = null;
        this.A0Z.removeCallbacks(this.A1h);
        this.A0a.removeCallbacks(this.A1i);
        PowerManager.WakeLock wakeLock = this.A05;
        if (wakeLock != null && wakeLock.isHeld()) {
            this.A05.release();
        }
        SensorEventListener sensorEventListener = this.A03;
        if (sensorEventListener != null) {
            this.A04.unregisterListener(sensorEventListener);
        }
        C28301Tu.A05();
        this.A1I.A00(this.A1H);
        this.A0y.A00(this.A0x);
        this.A0l.A00 = null;
    }

    @Override // X.ActivityC004902h
    public void onNewIntent(Intent intent) {
        Log.i("popupnotification/new-intent");
        super.onNewIntent(intent);
        setIntent(intent);
        AnonymousClass02N A012 = AnonymousClass02N.A01(getIntent().getStringExtra("popup_notification_extra_quick_reply_jid"));
        AnonymousClass008.A12("popupnotification/set-quick-reply-jid:", A012);
        this.A0P = A012;
        if (intent.getBooleanExtra("popup_notification_extra_dismiss_notification", false)) {
            this.A1U.A0C(false);
            this.A0i.A02(true);
        }
        A0R();
    }

    @Override // X.ActivityC004702f, X.ActivityC004902h
    public void onPause() {
        super.onPause();
        this.A0K.A0N(false, false, true);
        this.A0i.A01();
    }

    @Override // X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onStart() {
        super.onStart();
        this.A0X = true;
    }

    @Override // X.ActivityC004802g, X.ActivityC004902h
    public void onStop() {
        super.onStop();
        this.A0X = false;
        this.A0K.A0N(false, false, true);
    }
}
