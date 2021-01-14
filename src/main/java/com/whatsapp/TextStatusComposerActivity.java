package com.whatsapp;

import X.AbstractC007503q;
import X.AbstractC26561Lk;
import X.AbstractC26651Lv;
import X.AbstractC49282Pv;
import X.ActivityC004602e;
import X.ActivityC004702f;
import X.AnonymousClass008;
import X.AnonymousClass00D;
import X.AnonymousClass00T;
import X.AnonymousClass00Y;
import X.AnonymousClass01K;
import X.AnonymousClass01X;
import X.AnonymousClass022;
import X.AnonymousClass03P;
import X.AnonymousClass088;
import X.AnonymousClass09E;
import X.AnonymousClass0CG;
import X.AnonymousClass0Eg;
import X.AnonymousClass0Gb;
import X.AnonymousClass0Gd;
import X.AnonymousClass0SE;
import X.AnonymousClass1MA;
import X.AnonymousClass1O5;
import X.AnonymousClass1Y8;
import X.AnonymousClass1u1;
import X.AnonymousClass1u2;
import X.AnonymousClass2C0;
import X.C000300f;
import X.C002001d;
import X.C002101e;
import X.C002301g;
import X.C002701k;
import X.C004302a;
import X.C008805h;
import X.C02590Cr;
import X.C02600Cs;
import X.C03400Ga;
import X.C03460Gi;
import X.C03930Ii;
import X.C04230Jo;
import X.C04360Kb;
import X.C05490Ot;
import X.C06170Sb;
import X.C06470Tj;
import X.C12060hU;
import X.C26061Jj;
import X.C26081Jl;
import X.C27241Os;
import X.C28051Sr;
import X.C39111qy;
import X.C39121qz;
import X.C39131r0;
import X.C48672Ng;
import X.C53492dM;
import X.C54402er;
import X.C59842oN;
import X.C660232m;
import X.View$OnLongClickListenerC26051Ji;
import X.View$OnLongClickListenerC26071Jk;
import android.content.Intent;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.ImageButton;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape3S0100000_I1_1;
import com.google.android.search.verification.client.R;
import com.whatsapp.conversation.conversationrow.WebPagePreviewView;
import com.whatsapp.emoji.search.EmojiSearchContainer;
import com.whatsapp.gif_search.GifSearchContainer;
import com.whatsapp.util.Log;
import com.whatsapp.util.ViewOnClickCListenerShape11S0100000_I1_0;
import com.whatsapp.util.ViewOnClickCListenerShape4S0200000_I1;

public class TextStatusComposerActivity extends ActivityC004602e implements AbstractC26651Lv {
    public static final int[] A0e = {R.string.color_name_medium_red_violet, R.string.color_name_wasabi, R.string.color_name_sundance, R.string.color_name_scarlett, R.string.color_name_brandy_rose, R.string.color_name_bright_sun, R.string.color_name_earls_green, R.string.color_name_prelude, R.string.color_name_ce_soir, R.string.color_name_mona_lisa, R.string.color_name_emerald, R.string.color_name_bittersweet, R.string.color_name_summer_sky, R.string.color_name_maya_blue, R.string.color_name_scorpion, R.string.color_name_bali_hai, R.string.color_name_maya_blue_1, R.string.color_name_vivid_violet, R.string.color_name_monte_carlo, R.string.color_name_elephant, R.string.color_name_polo_blue};
    public static final int[] A0f = {R.string.font_name_sans_serif, R.string.font_name_serif, R.string.font_name_bryndan_write, R.string.font_name_norican, R.string.font_name_oswald};
    public int A00;
    public int A01 = 0;
    public int A02;
    public View A03;
    public ViewGroup A04;
    public ImageButton A05;
    public ImageButton A06;
    public TextView A07;
    public MentionableEntry A08;
    public TextEmojiLabel A09;
    public C27241Os A0A;
    public WebPagePreviewView A0B;
    public C59842oN A0C;
    public C54402er A0D;
    public Runnable A0E;
    public String A0F;
    public String A0G;
    public boolean A0H;
    public final Handler A0I = new Handler(Looper.getMainLooper());
    public final AbstractC26561Lk A0J;
    public final AnonymousClass088 A0K = AnonymousClass088.A00();
    public final C000300f A0L = C000300f.A00();
    public final C04360Kb A0M = C04360Kb.A00();
    public final AnonymousClass03P A0N = AnonymousClass03P.A00();
    public final AnonymousClass09E A0O = AnonymousClass09E.A00();
    public final C02590Cr A0P = C02590Cr.A00();
    public final C03930Ii A0Q = C03930Ii.A00();
    public final C53492dM A0R;
    public final C002701k A0S = C002701k.A00();
    public final AnonymousClass00Y A0T = AnonymousClass00Y.A00();
    public final AnonymousClass0Eg A0U = AnonymousClass0Eg.A00();
    public final C03400Ga A0V = C03400Ga.A00();
    public final AnonymousClass0Gd A0W = AnonymousClass0Gd.A00;
    public final AbstractC49282Pv A0X;
    public final AnonymousClass0Gb A0Y = AnonymousClass0Gb.A00();
    public final C03460Gi A0Z = C03460Gi.A00();
    public final AnonymousClass022 A0a;
    public final C04230Jo A0b = C04230Jo.A00();
    public final AnonymousClass00T A0c = C002101e.A00();
    public final int[] A0d;

    public TextStatusComposerActivity() {
        int[] iArr = C660232m.A01;
        this.A00 = iArr[Math.abs(C660232m.A00.nextInt()) % iArr.length];
        AnonymousClass01K.A00();
        this.A0X = AbstractC49282Pv.A00();
        this.A0R = C53492dM.A00();
        AnonymousClass0CG.A00();
        this.A0a = AnonymousClass022.A00();
        this.A0J = new AnonymousClass1u1(this);
        this.A0d = new int[2];
    }

    public static int A04(CharSequence charSequence, int i, int i2) {
        int A0C2 = C28051Sr.A0C(charSequence, i, i2);
        int i3 = 0;
        int length = charSequence.length();
        if (i < 0 || i2 > length || i > i2) {
            throw new IndexOutOfBoundsException();
        }
        while (i < i2) {
            if (charSequence.charAt(i) == '\n') {
                i3++;
            }
            i++;
        }
        return (i3 * 49) + A0C2;
    }

    public static void A05(TextStatusComposerActivity textStatusComposerActivity) {
        textStatusComposerActivity.APr(((AnonymousClass2C0) textStatusComposerActivity).A01.A0A(R.plurals.status_update_exceeds_character_limit, 700, 700));
    }

    public final void A0T() {
        if (this.A04.getVisibility() == 0) {
            this.A04.setVisibility(8);
            TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 2.0f);
            translateAnimation.setDuration(160);
            this.A04.startAnimation(translateAnimation);
        }
    }

    public final void A0U() {
        int i = this.A00;
        int[] iArr = C660232m.A01;
        this.A00 = iArr[(C660232m.A00(iArr, i) + 1) % iArr.length];
        getWindow().setBackgroundDrawable(new ColorDrawable(this.A00));
    }

    public final void A0V() {
        String trim = this.A08.getText().toString().trim();
        if (!C002001d.A3R(this.A0N, this.A0a, trim)) {
            ((ActivityC004702f) this).A0F.A06(R.string.cannot_send_empty_text_message, 1);
        } else if (!this.A0O.A0H()) {
            APm(new FirstStatusConfirmationDialogFragment());
        } else {
            this.A06.setEnabled(false);
            C008805h.A16(this.A06, true, false);
            C04360Kb r2 = this.A0M;
            String A1l = C002001d.A1l(trim);
            int i = this.A00;
            int i2 = this.A01;
            C27241Os r14 = this.A0A;
            if (r2 != null) {
                TextData textData = new TextData();
                textData.backgroundColor = i;
                textData.textColor = -1;
                textData.fontStyle = i2;
                C05490Ot A042 = r2.A12.A04(C12060hU.A00, C660232m.A02(A1l), r2.A0L.A05(), r14, null, null);
                r2.A0K(A042);
                A042.A0v(textData);
                ((AbstractC007503q) A042).A04 = 5;
                r2.A0W.A0J(A042);
                r2.A09.A04(A042, 0, 1);
                ((ActivityC004702f) this).A0F.A06(R.string.sending_status, 0);
                getWindow().setSoftInputMode(3);
                this.A08.A00();
                finish();
                return;
            }
            throw null;
        }
    }

    public void A0W(C27241Os r13) {
        if (r13 == null) {
            this.A0A = null;
            A0T();
        } else if (!TextUtils.equals(this.A0G, r13.A0G)) {
        } else {
            if (r13.A0A()) {
                this.A0A = r13;
                Log.i("textstatus/showlinkpreview");
                if (this.A0B == null) {
                    WebPagePreviewView webPagePreviewView = new WebPagePreviewView(this);
                    this.A0B = webPagePreviewView;
                    this.A04.addView(webPagePreviewView);
                    AnonymousClass0SE.A06(((AnonymousClass2C0) this).A01, this.A0B.findViewById(R.id.title), 0, (int) (C002301g.A0K.A00 * 24.0f));
                    this.A0B.setProgressBarVisibility(false);
                    View findViewById = this.A0B.findViewById(R.id.cancel);
                    findViewById.setVisibility(0);
                    findViewById.setOnClickListener(new ViewOnClickCListenerShape11S0100000_I1_0(this, 17));
                    View findViewById2 = this.A0B.findViewById(R.id.thumb);
                    findViewById2.setOnClickListener(new ViewOnClickCListenerShape4S0200000_I1(this, findViewById2, 5));
                }
                if (this.A04.getVisibility() != 0) {
                    this.A04.setVisibility(0);
                    TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 2.0f, 1, 0.0f);
                    translateAnimation.setDuration(160);
                    translateAnimation.setInterpolator(new DecelerateInterpolator());
                    this.A04.startAnimation(translateAnimation);
                }
                this.A0B.A01(r13, null);
                return;
            }
            this.A0A = null;
            A0T();
        }
    }

    @Override // X.AbstractC26651Lv
    public void AKT() {
        A0V();
    }

    @Override // X.ActivityC004702f
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.A0D.A01()) {
            View view = this.A03;
            int[] iArr = this.A0d;
            view.getLocationOnScreen(iArr);
            if (motionEvent.getRawY() >= ((float) iArr[1])) {
                if (motionEvent.getRawY() < ((float) (this.A03.getHeight() + iArr[1]))) {
                    if (motionEvent.getAction() == 0) {
                        this.A0H = true;
                    } else if (motionEvent.getAction() == 1 && this.A0H) {
                        this.A0D.A00(true);
                        this.A0H = false;
                        return false;
                    }
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public /* synthetic */ void lambda$onCreate$1471$TextStatusComposerActivity(View view) {
        A0V();
    }

    public void lambda$onCreate$1472$TextStatusComposerActivity(View view) {
        A0U();
        C002001d.A2R(this, this.A0N, ((AnonymousClass2C0) this).A01.A06(A0e[C660232m.A00(C660232m.A01, this.A00)]));
    }

    public void lambda$onCreate$1474$TextStatusComposerActivity(View view) {
        int i = this.A01;
        int[] iArr = C660232m.A02;
        int i2 = iArr[(C660232m.A00(iArr, i) + 1) % iArr.length];
        this.A01 = i2;
        Typeface A012 = C660232m.A01(this, i2);
        this.A07.setTypeface(A012);
        this.A08.setTypeface(A012);
        C002001d.A2R(this, this.A0N, ((AnonymousClass2C0) this).A01.A06(A0f[C660232m.A00(iArr, this.A01)]));
    }

    @Override // X.ActivityC004902h
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1 && i2 == -1) {
            finish();
        }
    }

    @Override // X.ActivityC004702f, X.AnonymousClass02i
    public void onBackPressed() {
        if (!this.A0D.A02()) {
            super.onBackPressed();
        }
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 19) {
            getWindow().setFlags(67108864, 67108864);
        }
        super.onCreate(bundle);
        setContentView(R.layout.text_status_composer);
        if (bundle == null) {
            A0U();
        } else {
            this.A00 = bundle.getInt("background_color");
            getWindow().setBackgroundDrawable(new ColorDrawable(this.A00));
        }
        View findViewById = findViewById(R.id.send);
        if (findViewById != null) {
            ImageButton imageButton = (ImageButton) findViewById;
            this.A06 = imageButton;
            C008805h.A16(imageButton, false, false);
            ImageButton imageButton2 = this.A06;
            AnonymousClass01X r10 = ((AnonymousClass2C0) this).A01;
            imageButton2.setImageDrawable(new C06470Tj(r10, C004302a.A03(this, R.drawable.input_send)));
            this.A06.setOnClickListener(new ViewOnClickEBaseShape3S0100000_I1_1(this, 36));
            View findViewById2 = findViewById(R.id.color_picker_btn);
            findViewById2.setOnClickListener(new ViewOnClickEBaseShape3S0100000_I1_1(this, 37));
            findViewById2.setOnLongClickListener(new View$OnLongClickListenerC26071Jk(this));
            TextView textView = (TextView) findViewById(R.id.font_picker_btn);
            this.A07 = textView;
            textView.setOnClickListener(new ViewOnClickEBaseShape3S0100000_I1_1(this, 38));
            this.A07.setOnLongClickListener(new View$OnLongClickListenerC26051Ji(this));
            TextEmojiLabel textEmojiLabel = (TextEmojiLabel) findViewById(R.id.privacy_text);
            this.A09 = textEmojiLabel;
            textEmojiLabel.setText(C008805h.A0g(this.A0O, r10));
            this.A04 = (ViewGroup) findViewById(R.id.web_page_preview_container);
            View findViewById3 = findViewById(R.id.entry);
            if (findViewById3 != null) {
                MentionableEntry mentionableEntry = (MentionableEntry) findViewById3;
                this.A08 = mentionableEntry;
                mentionableEntry.addTextChangedListener(new AnonymousClass1u2(this));
                this.A08.setFilters(new InputFilter[]{new AnonymousClass1O5(this)});
                String stringExtra = getIntent().getStringExtra("android.intent.extra.TEXT");
                if (stringExtra == null || TextUtils.getTrimmedLength(stringExtra) == 0) {
                    this.A06.setEnabled(false);
                    C008805h.A16(this.A06, false, false);
                } else {
                    C008805h.A16(this.A06, true, true);
                    String A012 = AnonymousClass1Y8.A01(stringExtra);
                    MentionableEntry mentionableEntry2 = this.A08;
                    if (!TextUtils.isEmpty(A012)) {
                        stringExtra = AnonymousClass008.A0K(stringExtra, " ");
                    }
                    mentionableEntry2.setText(stringExtra);
                }
                this.A08.requestFocus();
                this.A08.setOnEditorActionListener(new C26081Jl(this));
                AnonymousClass1MA r2 = new AnonymousClass1MA();
                this.A08.A09 = new C39121qz(this, r2);
                this.A03 = findViewById(R.id.controls);
                View findViewById4 = findViewById(R.id.emoji_picker_btn);
                if (findViewById4 != null) {
                    this.A05 = (ImageButton) findViewById4;
                    C002701k r0 = this.A0S;
                    AnonymousClass0Eg r02 = this.A0U;
                    C06170Sb r03 = ((ActivityC004602e) this).A0H;
                    AnonymousClass00T r04 = this.A0c;
                    C03400Ga r05 = this.A0V;
                    AnonymousClass0Gb r06 = this.A0Y;
                    AnonymousClass00Y r15 = this.A0T;
                    C02590Cr r07 = this.A0P;
                    C000300f r14 = this.A0L;
                    C03460Gi r13 = this.A0Z;
                    C02600Cs r12 = super.A0L;
                    AnonymousClass0Gd r9 = this.A0W;
                    C03930Ii r08 = this.A0Q;
                    C04230Jo r8 = this.A0b;
                    AnonymousClass03P r7 = this.A0N;
                    AbstractC49282Pv r6 = this.A0X;
                    C53492dM r5 = this.A0R;
                    AnonymousClass00D r4 = super.A0J;
                    AnonymousClass022 r09 = this.A0a;
                    C59842oN r010 = new C59842oN(r0, this, r02, r03, r04, r05, r06, r15, r07, r14, r13, r12, r9, r08, r8, r7, r10, r6, r5, r4, r09, (KeyboardPopupLayout) findViewById(R.id.main), this.A05, this.A08, null, null, null, null, null);
                    this.A0C = r010;
                    r010.A08(this.A0J);
                    r010.setOnDismissListener(new C26061Jj(this));
                    C54402er r1 = new C54402er((GifSearchContainer) findViewById(R.id.gif_search_container), (EmojiSearchContainer) findViewById(R.id.emoji_search_container), this.A0C, this, r07, r08, r10, r09);
                    this.A0D = r1;
                    ((C48672Ng) r1).A00 = new C39131r0(this);
                    r1.A00 = new C39111qy(this);
                    return;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }

    @Override // X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onDestroy() {
        super.onDestroy();
        C59842oN r0 = this.A0C;
        if (r0 != null) {
            r0.A09();
        }
    }

    @Override // X.ActivityC004602e, X.ActivityC004802g
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!keyEvent.isPrintingKey() || !this.A08.isShown() || this.A08.hasFocus()) {
            return super.onKeyDown(i, keyEvent);
        }
        this.A08.requestFocus();
        dispatchKeyEvent(keyEvent);
        return true;
    }

    @Override // X.ActivityC004602e
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if ((i != 82 && i != 4) || !this.A0C.isShowing()) {
            return super.onKeyUp(i, keyEvent);
        }
        this.A0C.dismiss();
        return false;
    }

    @Override // X.ActivityC004802g, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("background_color", this.A00);
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
    }
}
