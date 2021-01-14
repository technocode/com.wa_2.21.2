package com.whatsapp;

import X.AbstractC007503q;
import X.AbstractC03650Hc;
import X.AbstractC03660Hd;
import X.AbstractC03700Hh;
import X.AbstractC07200Wh;
import X.AbstractC26561Lk;
import X.AbstractC49282Pv;
import X.AbstractC51572Zg;
import X.ActivityC004602e;
import X.ActivityC004702f;
import X.AnonymousClass00C;
import X.AnonymousClass00D;
import X.AnonymousClass00E;
import X.AnonymousClass00S;
import X.AnonymousClass00T;
import X.AnonymousClass00Y;
import X.AnonymousClass01A;
import X.AnonymousClass01I;
import X.AnonymousClass01K;
import X.AnonymousClass01X;
import X.AnonymousClass022;
import X.AnonymousClass02M;
import X.AnonymousClass02N;
import X.AnonymousClass02U;
import X.AnonymousClass03P;
import X.AnonymousClass03S;
import X.AnonymousClass088;
import X.AnonymousClass0AL;
import X.AnonymousClass0AV;
import X.AnonymousClass0CP;
import X.AnonymousClass0D1;
import X.AnonymousClass0ET;
import X.AnonymousClass0Eg;
import X.AnonymousClass0Fh;
import X.AnonymousClass0GG;
import X.AnonymousClass0Gb;
import X.AnonymousClass0Gd;
import X.AnonymousClass0JO;
import X.AnonymousClass0JW;
import X.AnonymousClass0L2;
import X.AnonymousClass0L6;
import X.AnonymousClass0MB;
import X.AnonymousClass0MC;
import X.AnonymousClass0Q7;
import X.AnonymousClass0YX;
import X.AnonymousClass1IT;
import X.AnonymousClass1IU;
import X.AnonymousClass1IV;
import X.AnonymousClass1IW;
import X.AnonymousClass1IX;
import X.AnonymousClass1IY;
import X.AnonymousClass1IZ;
import X.AnonymousClass1MA;
import X.AnonymousClass1ME;
import X.AnonymousClass1S6;
import X.AnonymousClass1VY;
import X.AnonymousClass2C0;
import X.AnonymousClass2HH;
import X.AnonymousClass2Iq;
import X.AnonymousClass2Z6;
import X.C000300f;
import X.C002001d;
import X.C002101e;
import X.C002301g;
import X.C002701k;
import X.C003701u;
import X.C004302a;
import X.C006803i;
import X.C007003k;
import X.C007303n;
import X.C014308b;
import X.C02040Ak;
import X.C02220Bc;
import X.C02580Cq;
import X.C02590Cr;
import X.C02600Cs;
import X.C02770Dj;
import X.C03400Ga;
import X.C03460Gi;
import X.C03570Gt;
import X.C03620Gz;
import X.C03930Ii;
import X.C04230Jo;
import X.C04270Js;
import X.C04350Ka;
import X.C04360Kb;
import X.C04420Kh;
import X.C05390Oi;
import X.C06170Sb;
import X.C06470Tj;
import X.C09190cR;
import X.C14270lr;
import X.C26481Lc;
import X.C27131Oe;
import X.C28051Sr;
import X.C38341pi;
import X.C38791qS;
import X.C38801qT;
import X.C38811qU;
import X.C38821qV;
import X.C38831qW;
import X.C38841qX;
import X.C39241rB;
import X.C39261rD;
import X.C39441rX;
import X.C40331t6;
import X.C40341t7;
import X.C40351t8;
import X.C40361t9;
import X.C40371tA;
import X.C40991uH;
import X.C48672Ng;
import X.C49252Pr;
import X.C49262Ps;
import X.C53392d8;
import X.C53492dM;
import X.C54402er;
import X.C59842oN;
import X.C60672pw;
import X.C662733o;
import X.C68453Dg;
import X.C69873Iw;
import X.DialogInterface$OnClickListenerC25711Ia;
import android.app.Application;
import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.DialogFragment;
import com.facebook.redex.ViewOnClickEBaseShape2S0100000_I1_0;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.search.verification.client.R;
import com.whatsapp.emoji.search.EmojiSearchContainer;
import com.whatsapp.gif_search.GifSearchContainer;
import com.whatsapp.jid.UserJid;
import com.whatsapp.picker.search.PickerSearchDialogFragment;
import com.whatsapp.status.playback.StatusReplyActivity;
import com.whatsapp.util.Log;
import com.whatsapp.util.ViewOnClickCListenerShape11S0100000_I1_0;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class MessageReplyActivity extends ActivityC004602e implements AbstractC03650Hc, AbstractC03660Hd, AbstractC03700Hh {
    public static final HashMap A1F = new HashMap();
    public static final HashMap A1G = new HashMap();
    public View A00;
    public View A01;
    public View A02;
    public ImageButton A03;
    public ImageButton A04;
    public ImageButton A05;
    public ImageButton A06;
    public C39441rX A07;
    public MentionableEntry A08;
    public C27131Oe A09;
    public AnonymousClass0YX A0A;
    public AnonymousClass2Z6 A0B;
    public C59842oN A0C;
    public C54402er A0D;
    public AnonymousClass02N A0E;
    public C69873Iw A0F;
    public AbstractC007503q A0G;
    public C662733o A0H;
    public boolean A0I = false;
    public boolean A0J;
    public final AnonymousClass0AV A0K = AnonymousClass0AV.A00();
    public final AnonymousClass0GG A0L = AnonymousClass0GG.A00();
    public final C26481Lc A0M = C26481Lc.A00();
    public final AbstractC26561Lk A0N = new C40341t7(this);
    public final AnonymousClass088 A0O = AnonymousClass088.A00();
    public final AnonymousClass01I A0P = AnonymousClass01I.A00();
    public final C09190cR A0Q = C09190cR.A00();
    public final C04350Ka A0R = C04350Ka.A00();
    public final C000300f A0S = C000300f.A00();
    public final C04360Kb A0T = C04360Kb.A00();
    public final C40991uH A0U = C40991uH.A00;
    public final AnonymousClass1S6 A0V = AnonymousClass1S6.A00();
    public final AnonymousClass01A A0W = AnonymousClass01A.A00();
    public final C014308b A0X = C014308b.A00();
    public final AnonymousClass0L2 A0Y = AnonymousClass0L2.A01();
    public final AnonymousClass2Iq A0Z = AnonymousClass2Iq.A00();
    public final AbstractC07200Wh A0a = new C40331t6(this);
    public final AnonymousClass00C A0b = AnonymousClass00C.A00();
    public final AnonymousClass03P A0c = AnonymousClass03P.A00();
    public final AnonymousClass00S A0d = AnonymousClass00S.A00();
    public final AnonymousClass03S A0e = AnonymousClass03S.A00();
    public final AnonymousClass00D A0f = AnonymousClass00D.A00();
    public final AnonymousClass01K A0g = AnonymousClass01K.A00();
    public final C02590Cr A0h = C02590Cr.A00();
    public final C03930Ii A0i = C03930Ii.A00();
    public final C53492dM A0j = C53492dM.A00();
    public final C04270Js A0k = C04270Js.A00();
    public final C002701k A0l = C002701k.A00();
    public final AnonymousClass0ET A0m = AnonymousClass0ET.A00();
    public final AnonymousClass00Y A0n = AnonymousClass00Y.A00();
    public final AnonymousClass0Eg A0o = AnonymousClass0Eg.A00();
    public final C03400Ga A0p = C03400Ga.A00();
    public final AnonymousClass0Gd A0q = AnonymousClass0Gd.A00;
    public final AbstractC49282Pv A0r = AbstractC49282Pv.A00();
    public final AnonymousClass0Gb A0s = AnonymousClass0Gb.A00();
    public final C03460Gi A0t = C03460Gi.A00();
    public final C02770Dj A0u = C02770Dj.A00();
    public final AnonymousClass0CP A0v = AnonymousClass0CP.A00();
    public final C04420Kh A0w = C04420Kh.A00();
    public final C68453Dg A0x = C68453Dg.A00();
    public final C02040Ak A0y = C02040Ak.A00();
    public final AnonymousClass0L6 A0z = AnonymousClass0L6.A00();
    public final AnonymousClass022 A10 = AnonymousClass022.A00();
    public final AnonymousClass0AL A11 = AnonymousClass0AL.A01();
    public final C04230Jo A12 = C04230Jo.A00();
    public final AnonymousClass0D1 A13 = AnonymousClass0D1.A00();
    public final C03620Gz A14 = C03620Gz.A00();
    public final C03570Gt A15 = C03570Gt.A00();
    public final C02220Bc A16 = C02220Bc.A00();
    public final C02580Cq A17 = C02580Cq.A01();
    public final AnonymousClass00T A18 = C002101e.A00();
    public final AnonymousClass0JO A19 = AnonymousClass0JO.A00;
    public final AnonymousClass0Fh A1A = AnonymousClass0Fh.A00();
    public final Set A1B = new HashSet();
    public final Set A1C = new HashSet();
    public final Set A1D = new HashSet();
    public final int[] A1E = new int[2];

    @Override // X.AbstractC03650Hc
    public void A27() {
    }

    @Override // X.AbstractC03650Hc
    public void AN0() {
    }

    public void A0T() {
        if (this instanceof StatusReplyActivity) {
            StatusReplyActivity statusReplyActivity = (StatusReplyActivity) this;
            statusReplyActivity.A02.A03(((MessageReplyActivity) statusReplyActivity).A0G, 2);
        }
    }

    public final void A0U() {
        if (this instanceof StatusReplyActivity) {
            StatusReplyActivity statusReplyActivity = (StatusReplyActivity) this;
            statusReplyActivity.A02.A03(((MessageReplyActivity) statusReplyActivity).A0G, 1);
        }
        ((ActivityC004702f) this).A0F.A06(R.string.sending_reply, 0);
        A1G.remove(this.A0G.A0n);
        A1F.remove(this.A0G.A0n);
        finish();
    }

    public final void A0V() {
        A1G.put(this.A0G.A0n, C002001d.A1l(this.A08.getStringText()));
        A1F.put(this.A0G.A0n, C006803i.A0M(this.A08.getMentions()));
    }

    public void A0W(C49262Ps r15) {
        if (this.A0L.A0H(UserJid.of(this.A0E))) {
            C002001d.A2O(this, 106);
            return;
        }
        ArrayList arrayList = new ArrayList();
        AnonymousClass02N r4 = this.A0E;
        arrayList.add(r4);
        C49252Pr r1 = r15.A01;
        int i = r1.A01;
        if (i <= 0) {
            i = r15.A02.A01;
        }
        int i2 = r1.A00;
        if (i2 <= 0) {
            i2 = r15.A02.A00;
        }
        String str = r15.A02.A02;
        String str2 = r1.A02;
        String str3 = r15.A03.A02;
        int i3 = r15.A00;
        int i4 = 22;
        if (AnonymousClass1VY.A0b(r4)) {
            i4 = 24;
        }
        startActivityForResult(GifVideoPreviewActivity.A04(this, arrayList, str, str2, str3, i3, false, false, i4).putExtra("jid", this.A0E.getRawString()).putExtra("media_width", i).putExtra("media_height", i2).putExtra("mentions", AnonymousClass1VY.A0F(this.A08.getMentions())).putExtra("caption", C002001d.A1l(this.A08.getStringText())), 25);
    }

    public final void A0X(boolean z) {
        if (this.A0L.A0H(UserJid.of(this.A0E))) {
            C002001d.A2O(this, 106);
            return;
        }
        C27131Oe r1 = this.A09;
        if (r1 != null) {
            if (r1.A0P()) {
                r1.A0N(true, false, true);
                A0U();
                return;
            }
            File file = r1.A0e;
            if (file != null) {
                if (file != null) {
                    r1.A0F(file, false);
                    r1.A0e = null;
                }
                this.A09.A0H(true);
                A0U();
                return;
            }
        }
        this.A05.setEnabled(false);
        String trim = this.A08.getStringText().trim();
        if (!C002001d.A3R(this.A0c, this.A10, trim)) {
            ((ActivityC004702f) this).A0F.A06(R.string.cannot_send_empty_text_message, 1);
            return;
        }
        if (z) {
            trim = C003701u.A07(trim, 65536);
        } else if (trim.codePointCount(0, trim.length()) > 65536) {
            C002001d.A2O(this, 17);
            return;
        }
        this.A0T.A0T(Collections.singletonList(this.A0E), C002001d.A1l(trim), null, this.A0G, this.A08.getMentions(), false, false);
        A0U();
    }

    @Override // X.AbstractC03650Hc
    public void A28() {
        A0U();
    }

    @Override // X.AbstractC03650Hc
    public AbstractC007503q A8c() {
        return this.A0G;
    }

    @Override // X.AbstractC03660Hd
    public void ACz(PickerSearchDialogFragment pickerSearchDialogFragment) {
        C69873Iw r1 = this.A0F;
        r1.A07 = true;
        r1.A03 = pickerSearchDialogFragment;
        r1.A08.A00 = r1;
        pickerSearchDialogFragment.A00 = r1;
    }

    @Override // X.AbstractC03700Hh
    public void AJ8() {
        this.A0B.A01();
    }

    @Override // X.AbstractC03700Hh
    public void AKv() {
        this.A0B.A00();
    }

    @Override // X.AbstractC03660Hd
    public void APk(DialogFragment dialogFragment) {
        APm(dialogFragment);
        getWindow().setSoftInputMode(1);
    }

    @Override // X.ActivityC004702f
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.A0D.A01()) {
            View view = this.A00;
            int[] iArr = this.A1E;
            view.getLocationOnScreen(iArr);
            if (motionEvent.getRawY() >= ((float) iArr[1])) {
                if (motionEvent.getRawY() < ((float) (this.A00.getHeight() + iArr[1]))) {
                    if (motionEvent.getAction() == 0) {
                        this.A0J = true;
                    } else if (motionEvent.getAction() == 1) {
                        if (this.A0J) {
                            this.A0D.A00(true);
                            this.A00.requestFocus();
                        }
                        this.A0J = false;
                    }
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public /* synthetic */ void lambda$onCreate$1252$MessageReplyActivity(View view) {
        AnonymousClass2Z6 r2 = this.A0B;
        int i = 2;
        if (this.A0I) {
            i = 5;
        }
        r2.A08(i);
    }

    public /* synthetic */ void lambda$onCreate$1258$MessageReplyActivity(View view) {
        A0X(false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0084, code lost:
        if (r8.A0F != null) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0086, code lost:
        r4 = r22.getIntExtra("provider", 0);
        r1 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008e, code lost:
        if (r4 == 1) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0090, code lost:
        r1 = 2;
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0092, code lost:
        if (r4 != 2) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0094, code lost:
        r0 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0095, code lost:
        r8.A05 = r0;
        r19.A0T.A07(new X.C40531tQ(java.util.Collections.singletonList(r19.A0v.A05(r19.A0E, r8, (byte) 13, 0, r22.getStringExtra("caption"), r12, r19.A0G, null, X.AnonymousClass1VY.A0G(com.whatsapp.jid.UserJid.class, r22.getStringArrayListExtra("mentions")), false, 0, null))), r5);
        r19.A0D.A00(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00cf, code lost:
        A0U();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00fb, code lost:
        if (r12 == null) goto L_0x0082;
     */
    @Override // X.ActivityC004902h
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r20, int r21, android.content.Intent r22) {
        /*
        // Method dump skipped, instructions count: 260
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.MessageReplyActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C03570Gt r11 = this.A15;
        AnonymousClass00T r10 = this.A18;
        C04230Jo r9 = this.A12;
        C03620Gz r8 = this.A14;
        C662733o r1 = new C662733o(r11, r10, r9, r8);
        this.A0H = r1;
        this.A0F = new C69873Iw(r1);
        setContentView(R.layout.message_reply);
        C007303n A082 = C006803i.A08(getIntent());
        AbstractC007503q A052 = this.A0g.A0J.A05(A082);
        this.A0G = A052;
        if (A052 == null || (A052 instanceof C05390Oi)) {
            StringBuilder sb = new StringBuilder("messagereply/message-deleted/");
            sb.append(A082);
            Log.i(sb.toString());
            ((ActivityC004702f) this).A0F.A0C(((AnonymousClass2C0) this).A01.A06(R.string.status_deleted), 0);
            finish();
            return;
        }
        AnonymousClass02N r12 = A052.A0n.A00;
        boolean A0b2 = AnonymousClass1VY.A0b(r12);
        this.A0I = A0b2;
        if (A0b2) {
            r12 = A052.A07();
            if (r12 == null) {
                throw null;
            }
        } else {
            AnonymousClass00E.A04(r12, "chatJid must not be null");
        }
        this.A0E = r12;
        View findViewById = findViewById(R.id.main);
        if (findViewById != null) {
            this.A02 = findViewById;
            View findViewById2 = findViewById(R.id.bottom_sheet);
            if (findViewById2 != null) {
                View findViewById3 = findViewById(R.id.conversation_entry_holder);
                if (findViewById3 != null) {
                    this.A01 = findViewById3;
                    this.A00 = findViewById(R.id.edit_layout);
                    View findViewById4 = findViewById(R.id.send);
                    if (findViewById4 != null) {
                        this.A05 = (ImageButton) findViewById4;
                        View findViewById5 = findViewById(R.id.voice_note_btn);
                        if (findViewById5 != null) {
                            ImageButton imageButton = (ImageButton) findViewById5;
                            this.A06 = imageButton;
                            imageButton.setLongClickable(true);
                            this.A06.setOnTouchListener(new AnonymousClass1IW(this));
                            View findViewById6 = findViewById(R.id.camera_btn);
                            if (findViewById6 != null) {
                                ImageButton imageButton2 = (ImageButton) findViewById6;
                                this.A03 = imageButton2;
                                imageButton2.setVisibility(0);
                                this.A03.setOnClickListener(new ViewOnClickEBaseShape2S0100000_I1_0(this, 26));
                                View findViewById7 = findViewById(R.id.input_attach_button);
                                if (findViewById7 != null) {
                                    ImageButton imageButton3 = (ImageButton) findViewById7;
                                    this.A04 = imageButton3;
                                    imageButton3.setVisibility(0);
                                    this.A04.setOnClickListener(new ViewOnClickCListenerShape11S0100000_I1_0(this, 6));
                                    getLayoutInflater().inflate(R.layout.voice_note_view, (ViewGroup) findViewById(R.id.voice_note_stub), true);
                                    View view = this.A02;
                                    AnonymousClass00S r0 = this.A0d;
                                    AnonymousClass02M r02 = ((ActivityC004702f) this).A0F;
                                    AnonymousClass088 r03 = this.A0O;
                                    AnonymousClass00Y r04 = this.A0n;
                                    C000300f r05 = this.A0S;
                                    C04360Kb r06 = this.A0T;
                                    AnonymousClass0CP r07 = this.A0v;
                                    AnonymousClass0JO r08 = this.A19;
                                    AnonymousClass0Fh r09 = this.A1A;
                                    AnonymousClass03P r010 = this.A0c;
                                    AnonymousClass01X r5 = ((AnonymousClass2C0) this).A01;
                                    AnonymousClass0AL r011 = this.A11;
                                    AnonymousClass0GG r012 = this.A0L;
                                    AnonymousClass0ET r013 = this.A0m;
                                    AnonymousClass00C r014 = this.A0b;
                                    C02580Cq r015 = this.A17;
                                    C04270Js r15 = this.A0k;
                                    C40991uH r13 = this.A0U;
                                    AnonymousClass00D r122 = this.A0f;
                                    AnonymousClass0AV r4 = this.A0K;
                                    C26481Lc r3 = this.A0M;
                                    C04420Kh r2 = this.A0w;
                                    AnonymousClass022 r016 = this.A10;
                                    boolean z = false;
                                    if (Build.VERSION.SDK_INT != 26) {
                                        z = true;
                                    }
                                    C40351t8 r017 = new C40351t8(this, this, this, view, r0, r02, r10, r03, r04, r05, r06, r07, r08, r09, r010, r5, r011, r012, r013, r014, r015, r15, r13, r122, r4, r3, r2, r016, z);
                                    this.A09 = r017;
                                    AnonymousClass02N r42 = this.A0E;
                                    AnonymousClass00E.A0A(!r017.A0P(), "Do not update the ptt receiver once the recording has started");
                                    r017.A0X = r42;
                                    r017.A0Z = this.A0G;
                                    View findViewById8 = findViewById(R.id.entry);
                                    if (findViewById8 != null) {
                                        MentionableEntry mentionableEntry = (MentionableEntry) findViewById8;
                                        this.A08 = mentionableEntry;
                                        mentionableEntry.setFilters(new InputFilter[]{new AnonymousClass1IV(this)});
                                        AnonymousClass1MA r32 = new AnonymousClass1MA();
                                        this.A08.A09 = new C38791qS(this, r32);
                                        View findViewById9 = findViewById(R.id.input_layout);
                                        findViewById9.setBackgroundResource(R.drawable.ib_new_expanded);
                                        findViewById9.setPadding(0, 0, 0, 0);
                                        if (AnonymousClass1VY.A0Y(this.A0E)) {
                                            MentionableEntry mentionableEntry2 = this.A08;
                                            mentionableEntry2.A04 = findViewById9;
                                            mentionableEntry2.A06 = new C38801qT(findViewById9);
                                            mentionableEntry2.A0B((ViewGroup) findViewById(R.id.mention_attach), AnonymousClass02U.A02(this.A0E), false, false);
                                        }
                                        String str = (String) A1G.get(this.A0G.A0n);
                                        if (!TextUtils.isEmpty(str)) {
                                            this.A08.setMentionableText(str, C006803i.A0O((String) A1F.get(this.A0G.A0n)));
                                            C002001d.A2U(this, this.A0h, r010, r016, this.A08.getEditableText(), this.A08.getPaint(), 1.3f);
                                        }
                                        if (C003701u.A0E(str)) {
                                            this.A06.setVisibility(0);
                                            this.A03.setVisibility(0);
                                            this.A05.setVisibility(8);
                                        } else {
                                            this.A06.setVisibility(8);
                                            this.A03.setVisibility(8);
                                            this.A05.setVisibility(0);
                                        }
                                        this.A05.setImageDrawable(new C06470Tj(r5, C004302a.A03(this, R.drawable.input_send)));
                                        View findViewById10 = findViewById(R.id.text_entry_layout);
                                        if (findViewById10 != null) {
                                            int max = Math.max(findViewById10.getPaddingLeft(), findViewById10.getPaddingRight());
                                            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) findViewById10.getLayoutParams();
                                            if (r5.A0M()) {
                                                layoutParams.rightMargin = max;
                                            } else {
                                                layoutParams.leftMargin = max;
                                            }
                                            findViewById10.setLayoutParams(layoutParams);
                                            this.A08.addTextChangedListener(new C40361t9(this, this.A0W.A0A(this.A0E)));
                                            MentionableEntry mentionableEntry3 = this.A08;
                                            ((C60672pw) mentionableEntry3).A00 = new C38811qU(this);
                                            mentionableEntry3.setOnEditorActionListener(new AnonymousClass1IT(this));
                                            this.A05.setOnClickListener(new ViewOnClickEBaseShape2S0100000_I1_0(this, 27));
                                            View findViewById11 = findViewById(R.id.emoji_picker_btn);
                                            if (findViewById11 != null) {
                                                C002701k r018 = this.A0l;
                                                AnonymousClass0Eg r019 = this.A0o;
                                                C06170Sb r020 = ((ActivityC004602e) this).A0H;
                                                C03400Ga r021 = this.A0p;
                                                AnonymousClass0Gb r022 = this.A0s;
                                                C02590Cr r023 = this.A0h;
                                                C03460Gi r024 = this.A0t;
                                                C02600Cs r025 = super.A0L;
                                                AnonymousClass0Gd r026 = this.A0q;
                                                C03930Ii r027 = this.A0i;
                                                AbstractC49282Pv r14 = this.A0r;
                                                C53492dM r132 = this.A0j;
                                                AnonymousClass00D r028 = super.A0J;
                                                KeyboardPopupLayout keyboardPopupLayout = (KeyboardPopupLayout) findViewById(R.id.main_ccl);
                                                MentionableEntry mentionableEntry4 = this.A08;
                                                AnonymousClass0D1 r43 = this.A13;
                                                C59842oN r33 = new C59842oN(r018, this, r019, r020, r10, r021, r022, r04, r023, r05, r024, r025, r026, r027, r9, r010, r5, r14, r132, r028, r016, keyboardPopupLayout, (ImageButton) findViewById11, mentionableEntry4, r8, r11, r43, this.A0H, null);
                                                this.A0C = r33;
                                                C69873Iw r029 = this.A0F;
                                                r029.A02 = this;
                                                r029.A00 = r33;
                                                r33.A0J = r029;
                                                r33.A08(this.A0N);
                                                ((C53392d8) r33).A08 = new C38831qW(this);
                                                C54402er r16 = new C54402er((GifSearchContainer) findViewById(R.id.gif_search_container), (EmojiSearchContainer) findViewById(R.id.emoji_search_container), this.A0C, this, r023, r027, r5, r016);
                                                this.A0D = r16;
                                                ((C48672Ng) r16).A00 = new C38821qV(this);
                                                r16.A00 = new C39261rD(this);
                                                this.A0C.A0L = new C39241rB(this);
                                                C69873Iw r17 = this.A0F;
                                                r17.A01 = new C38341pi(this);
                                                r17.A04 = new C39241rB(this);
                                                C662733o r030 = this.A0H;
                                                r030.A06.A01(r030.A05);
                                                View inflate = getLayoutInflater().inflate(R.layout.quoted_message, (ViewGroup) null, false);
                                                ((FrameLayout) inflate.findViewById(R.id.quoted_message_frame)).setForeground(C28051Sr.A0N(this));
                                                View findViewById12 = findViewById(R.id.quoted_message_preview_container);
                                                if (findViewById12 != null) {
                                                    ViewGroup viewGroup = (ViewGroup) findViewById12;
                                                    viewGroup.setVisibility(0);
                                                    viewGroup.addView(inflate);
                                                    TextView textView = (TextView) inflate.findViewById(R.id.quoted_title);
                                                    TextView textView2 = (TextView) inflate.findViewById(R.id.quoted_bullet_divider);
                                                    TextView textView3 = (TextView) inflate.findViewById(R.id.quoted_subtitle);
                                                    float A012 = AbstractC51572Zg.A01(getResources(), r5);
                                                    textView.setTextSize(A012);
                                                    textView2.setTextSize(A012);
                                                    textView3.setTextSize(A012);
                                                    C002301g.A03(textView);
                                                    C002301g.A03(textView2);
                                                    C002301g.A03(textView3);
                                                    AnonymousClass2Iq r34 = this.A0Z;
                                                    AnonymousClass02N r22 = this.A0E;
                                                    AbstractC007503q r18 = this.A0G;
                                                    AnonymousClass0YX r031 = this.A0A;
                                                    if (r031 == null) {
                                                        r031 = this.A0Y.A03(this);
                                                        this.A0A = r031;
                                                    }
                                                    r34.A02(inflate, r22, r18, r43, r031);
                                                    TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
                                                    translateAnimation.setDuration(200);
                                                    translateAnimation.setStartOffset(300);
                                                    translateAnimation.setFillBefore(true);
                                                    translateAnimation.setFillAfter(true);
                                                    translateAnimation.setInterpolator(new DecelerateInterpolator());
                                                    this.A01.startAnimation(translateAnimation);
                                                    AnonymousClass6 r19 = new BottomSheetBehavior() {
                                                        /* class com.whatsapp.MessageReplyActivity.AnonymousClass6 */
                                                        public final int[] A00 = new int[2];

                                                        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, X.AbstractC07570Yg
                                                        public boolean A04(CoordinatorLayout coordinatorLayout, View view, int i) {
                                                            super.A04(coordinatorLayout, view, i);
                                                            AnonymousClass0Q7.A0U(view, -view.getTop());
                                                            return true;
                                                        }

                                                        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, X.AbstractC07570Yg
                                                        public boolean A05(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
                                                            boolean A05 = super.A05(coordinatorLayout, view, motionEvent);
                                                            if (!A05) {
                                                                return A05;
                                                            }
                                                            MessageReplyActivity messageReplyActivity = MessageReplyActivity.this;
                                                            if (messageReplyActivity.A08.getScrollY() > 0) {
                                                                float rawX = motionEvent.getRawX();
                                                                float rawY = motionEvent.getRawY();
                                                                MentionableEntry mentionableEntry = messageReplyActivity.A08;
                                                                int[] iArr = this.A00;
                                                                mentionableEntry.getLocationOnScreen(iArr);
                                                                int i = iArr[0];
                                                                if (rawX > ((float) i) && rawX < ((float) (messageReplyActivity.A08.getWidth() + i))) {
                                                                    int i2 = iArr[1];
                                                                    if (rawY > ((float) i2) && rawY < ((float) (messageReplyActivity.A08.getHeight() + i2))) {
                                                                        return false;
                                                                    }
                                                                }
                                                            }
                                                            if (messageReplyActivity.A09.A0P()) {
                                                                return false;
                                                            }
                                                            return A05;
                                                        }
                                                    };
                                                    ((C14270lr) findViewById2.getLayoutParams()).A00(r19);
                                                    r19.A0E = new C40371tA(this);
                                                    findViewById2.setOnClickListener(new ViewOnClickCListenerShape11S0100000_I1_0(this, 7));
                                                    if (r012.A0H(UserJid.of(this.A0E))) {
                                                        C002001d.A2O(this, 106);
                                                    }
                                                    AnonymousClass2Z6 r133 = new AnonymousClass2Z6(this, this, r02, r020, this.A0P, this.A0R, r03, r04, this.A0Q, r05, this.A0V, this.A0u, ((ActivityC004602e) this).A0F, this.A16, r010, r012, this.A0z, r014, this.A0e, r028, this.A0y, this.A0x, ((ActivityC004602e) this).A07, r016, this, this.A0a, this.A0E, false, this.A08, new AnonymousClass2HH());
                                                    this.A0B = r133;
                                                    Set<Application.ActivityLifecycleCallbacks> set = this.A1C;
                                                    set.add(r133);
                                                    this.A1B.add(this.A0B);
                                                    this.A1D.add(this.A0B);
                                                    for (Application.ActivityLifecycleCallbacks activityLifecycleCallbacks : set) {
                                                        activityLifecycleCallbacks.onActivityCreated(this, bundle);
                                                    }
                                                    return;
                                                }
                                                throw null;
                                            }
                                            throw null;
                                        }
                                        throw null;
                                    }
                                    throw null;
                                }
                                throw null;
                            }
                            throw null;
                        }
                        throw null;
                    }
                    throw null;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }

    @Override // X.ActivityC004602e
    public Dialog onCreateDialog(int i) {
        if (i == 17) {
            AnonymousClass0MB r4 = new AnonymousClass0MB(this);
            AnonymousClass01X r3 = ((AnonymousClass2C0) this).A01;
            r4.A01.A0E = r3.A0D(R.string.cant_send_message_too_long_with_placeholder, 65536);
            r4.A07(r3.A06(R.string.send), new AnonymousClass1IX(this));
            r4.A05(r3.A06(R.string.cancel), new AnonymousClass1IU(this));
            return r4.A00();
        } else if (i != 106) {
            return super.onCreateDialog(i);
        } else {
            C007003k A0A2 = this.A0W.A0A(this.A0E);
            AnonymousClass0MB r42 = new AnonymousClass0MB(this);
            AnonymousClass01X r32 = ((AnonymousClass2C0) this).A01;
            String A0D2 = r32.A0D(R.string.cannot_send_to_blocked_contact_1, this.A0X.A08(A0A2, false));
            AnonymousClass0MC r2 = r42.A01;
            r2.A0E = A0D2;
            r42.A07(r32.A06(R.string.unblock), new DialogInterface$OnClickListenerC25711Ia(this, A0A2));
            r42.A05(r32.A06(R.string.cancel), new AnonymousClass1IZ(this));
            r2.A02 = new AnonymousClass1IY(this);
            return r42.A00();
        }
    }

    @Override // X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onDestroy() {
        super.onDestroy();
        C69873Iw r1 = this.A0F;
        C59842oN r0 = r1.A00;
        if (r0 != null) {
            r0.A0J = null;
            r1.A00 = null;
        }
        r1.A02 = null;
        r1.A01 = null;
        r1.A04 = null;
        r1.A03 = null;
        C27131Oe r02 = this.A09;
        if (r02 != null) {
            r02.A02();
        }
        C59842oN r03 = this.A0C;
        if (r03 != null) {
            r03.A09();
        }
        AnonymousClass0D1 r04 = this.A13;
        if (r04 != null) {
            r04.A04();
        }
        AnonymousClass0YX r05 = this.A0A;
        if (r05 != null) {
            r05.A00();
            this.A0A = null;
        }
        C39441rX r06 = this.A07;
        if (r06 != null) {
            ((AnonymousClass0JW) r06).A00.cancel(true);
            this.A07 = null;
        }
        Set<Application.ActivityLifecycleCallbacks> set = this.A1C;
        for (Application.ActivityLifecycleCallbacks activityLifecycleCallbacks : set) {
            activityLifecycleCallbacks.onActivityDestroyed(this);
        }
        set.clear();
        this.A1B.clear();
        this.A1D.clear();
        C662733o r07 = this.A0H;
        r07.A06.A00(r07.A05);
    }

    @Override // X.ActivityC004602e, X.ActivityC004802g
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        for (AnonymousClass1ME r0 : this.A1D) {
            if (r0.onKeyDown(i, keyEvent)) {
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // X.ActivityC004602e, X.ActivityC004702f, X.ActivityC004902h
    public void onPause() {
        super.onPause();
        C27131Oe r1 = this.A09;
        if (r1 != null && r1.A0P()) {
            r1.A01();
        }
    }

    @Override // X.ActivityC004602e, X.ActivityC004702f, X.ActivityC004902h
    public void onResume() {
        super.onResume();
        for (Application.ActivityLifecycleCallbacks activityLifecycleCallbacks : this.A1C) {
            activityLifecycleCallbacks.onActivityResumed(this);
        }
    }

    @Override // X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onStart() {
        super.onStart();
        Window window = getWindow();
        int i = 4;
        if (this.A0C.isShowing()) {
            i = 2;
        }
        window.setSoftInputMode(i | 1);
        if (!this.A0C.isShowing()) {
            this.A08.A01(true);
        }
        C39441rX r0 = this.A07;
        if (r0 != null) {
            ((AnonymousClass0JW) r0).A00.cancel(true);
            this.A07 = null;
        }
        C39441rX r2 = new C39441rX(this.A0g, this.A0M, new C38841qX(this), this.A0E);
        this.A07 = r2;
        this.A18.ANC(r2, new Void[0]);
    }
}
