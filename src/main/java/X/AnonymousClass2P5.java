package X;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.SpannedString;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.KeyboardPopupLayout;
import com.whatsapp.MentionableEntry;
import com.whatsapp.emoji.search.EmojiSearchContainer;
import com.whatsapp.util.ViewOnClickCListenerShape12S0100000_I1_1;
import java.util.List;

/* renamed from: X.2P5  reason: invalid class name */
public class AnonymousClass2P5 extends Dialog {
    public ImageButton A00;
    public MentionableEntry A01;
    public C53392d8 A02;
    public C48672Ng A03;
    public CharSequence A04;
    public CharSequence A05;
    public String A06;
    public List A07;
    public boolean A08;
    public final Activity A09;
    public final AbstractC26561Lk A0A = new C54062eI(this);
    public final AnonymousClass03P A0B;
    public final AnonymousClass00D A0C;
    public final AnonymousClass01X A0D;
    public final C02600Cs A0E;
    public final C02590Cr A0F;
    public final C03930Ii A0G;
    public final C53492dM A0H;
    public final AnonymousClass0Eg A0I;
    public final AnonymousClass02N A0J;
    public final AnonymousClass022 A0K;
    public final C06170Sb A0L;

    public AnonymousClass2P5(Activity activity, AnonymousClass0Eg r3, C06170Sb r4, C02590Cr r5, C02600Cs r6, C03930Ii r7, AnonymousClass03P r8, AnonymousClass01X r9, C53492dM r10, AnonymousClass00D r11, AnonymousClass022 r12, AnonymousClass02N r13, CharSequence charSequence) {
        super(activity, R.style.DoodleTextDialog);
        this.A0J = r13;
        this.A05 = charSequence;
        this.A09 = activity;
        this.A0I = r3;
        this.A0L = r4;
        this.A0F = r5;
        this.A0E = r6;
        this.A0G = r7;
        this.A0B = r8;
        this.A0D = r9;
        this.A0H = r10;
        this.A0C = r11;
        this.A0K = r12;
    }

    public void dismiss() {
        super.dismiss();
        if (this.A02.isShowing()) {
            this.A02.dismiss();
        }
        this.A06 = this.A01.getStringText();
        this.A07 = this.A01.getMentions();
        this.A04 = new SpannedString(this.A01.getText());
        this.A01.A06();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AnonymousClass01X r1 = this.A0D;
        AnonymousClass0SE.A09(r1, getWindow());
        setContentView(getLayoutInflater().inflate(R.layout.capture_send_dialog, (ViewGroup) null, false));
        getWindow().setLayout(-1, -1);
        Activity activity = this.A09;
        if ((activity.getWindow().getAttributes().flags & 1024) != 0) {
            getWindow().setFlags(1024, 1024);
            getWindow().clearFlags(256);
        }
        getWindow().setSoftInputMode(1);
        KeyboardPopupLayout keyboardPopupLayout = (KeyboardPopupLayout) findViewById(R.id.main);
        keyboardPopupLayout.setOnClickListener(new ViewOnClickCListenerShape12S0100000_I1_1(this, 44));
        ImageView imageView = (ImageView) findViewById(R.id.send);
        AnonymousClass02N r4 = this.A0J;
        if (r4 != null) {
            imageView.setImageDrawable(new C06470Tj(r1, C004302a.A03(activity, R.drawable.input_send)));
            imageView.setContentDescription(r1.A06(R.string.send));
        } else {
            imageView.setImageResource(R.drawable.ic_done);
            imageView.setContentDescription(r1.A06(R.string.done));
        }
        imageView.setOnClickListener(new ViewOnClickCListenerShape12S0100000_I1_1(this, 45));
        MentionableEntry mentionableEntry = (MentionableEntry) findViewById(R.id.caption);
        this.A01 = mentionableEntry;
        mentionableEntry.setText(this.A05);
        this.A01.setSelection(this.A05.length(), this.A05.length());
        this.A01.setInputEnterDone(true);
        this.A01.setFilters(new InputFilter[]{new AnonymousClass1M3(1024)});
        this.A01.setOnEditorActionListener(new C49012Oq(this));
        MentionableEntry mentionableEntry2 = this.A01;
        C02590Cr r13 = this.A0F;
        AnonymousClass03P r5 = this.A0B;
        AnonymousClass022 r0 = this.A0K;
        mentionableEntry2.addTextChangedListener(new C07850Zx(r13, r5, r1, r0, mentionableEntry2, (TextView) findViewById(R.id.counter), 1024, 30, true));
        this.A01.setOnEditorActionListener(new C49002Op(this));
        ((C60672pw) this.A01).A00 = new C53922e3(this);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.mention_attach);
        if (AnonymousClass1VY.A0Y(r4)) {
            this.A01.A0B(viewGroup, AnonymousClass02U.A02(r4), true, true);
        }
        ImageButton imageButton = (ImageButton) findViewById(R.id.emoji_picker_btn);
        this.A00 = imageButton;
        AnonymousClass0Eg r11 = this.A0I;
        C06170Sb r12 = this.A0L;
        C02600Cs r14 = this.A0E;
        C03930Ii r15 = this.A0G;
        C53392d8 r9 = new C53392d8(activity, r11, r12, r13, r14, r15, r5, r1, this.A0H, this.A0C, r0, keyboardPopupLayout, imageButton, this.A01);
        this.A02 = r9;
        r9.A00 = R.drawable.input_emoji_white;
        r9.A02 = R.drawable.input_kbd_white;
        r9.A0B = new RunnableEBaseShape9S0100000_I1_4(this, 38);
        C48672Ng r42 = new C48672Ng((EmojiSearchContainer) findViewById(R.id.emoji_search_container), this.A02, activity, r13, r15, r1, r0);
        this.A03 = r42;
        r42.A00 = new C53912e2(this);
        this.A02.A08(this.A0A);
        findViewById(R.id.emoji_btn_holder).setVisibility(0);
        findViewById(R.id.no_emoji_padding).setVisibility(8);
        this.A00.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.capture_preview_caption_left_padding) + (-this.A00.getMeasuredWidth());
        if (!r1.A0M()) {
            dimensionPixelSize = -dimensionPixelSize;
        }
        TranslateAnimation translateAnimation = new TranslateAnimation((float) dimensionPixelSize, 0.0f, 0.0f, 0.0f);
        translateAnimation.setDuration(220);
        translateAnimation.setInterpolator(new DecelerateInterpolator());
        findViewById(R.id.emoji_btn_holder).startAnimation(translateAnimation);
        findViewById(R.id.caption).startAnimation(translateAnimation);
        getWindow().setSoftInputMode(5);
        this.A01.A01(true);
    }
}
