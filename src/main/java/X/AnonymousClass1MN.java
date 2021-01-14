package X;

import android.app.Activity;
import android.text.InputFilter;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageButton;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.MentionableEntry;
import com.whatsapp.emoji.search.EmojiSearchContainer;

/* renamed from: X.1MN  reason: invalid class name */
public class AnonymousClass1MN {
    public final View A00;
    public final View A01;
    public final ViewTreeObserver.OnGlobalLayoutListener A02 = new AnonymousClass1MM(this);
    public final ImageButton A03;
    public final AbstractC26561Lk A04 = new C40221sq(this);
    public final MentionableEntry A05;
    public final C53392d8 A06;
    public final C48672Ng A07;
    public final C06170Sb A08;

    public AnonymousClass1MN(Activity activity, AnonymousClass0Eg r29, C06170Sb r30, C02590Cr r31, C02600Cs r32, C03930Ii r33, AnonymousClass03P r34, AnonymousClass01X r35, C53492dM r36, AnonymousClass00D r37, AnonymousClass022 r38, View view, AnonymousClass02N r40) {
        this.A01 = view;
        this.A08 = r30;
        this.A00 = view.findViewById(R.id.emoji_btn_holder);
        MentionableEntry mentionableEntry = (MentionableEntry) view.findViewById(R.id.comment);
        this.A05 = mentionableEntry;
        mentionableEntry.setInputEnterDone(true);
        this.A05.setFilters(new InputFilter[]{new AnonymousClass1M3(1024)});
        this.A05.setOnEditorActionListener(new AnonymousClass1IL(this));
        MentionableEntry mentionableEntry2 = this.A05;
        mentionableEntry2.addTextChangedListener(new C07850Zx(r31, r34, r35, r38, mentionableEntry2, (TextView) view.findViewById(R.id.counter), 1024, 30, true));
        if (AnonymousClass1VY.A0Y(r40)) {
            this.A05.A0B((ViewGroup) view.findViewById(R.id.mention_attach), AnonymousClass02U.A02(r40), false, true);
        }
        this.A03 = (ImageButton) view.findViewById(R.id.emoji_picker_btn);
        this.A06 = new C53392d8(activity, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, (AnonymousClass1MF) activity.findViewById(R.id.main), this.A03, this.A05);
        C48672Ng r1 = new C48672Ng((EmojiSearchContainer) view.findViewById(R.id.emoji_search_container), this.A06, activity, r31, r33, r35, r38);
        this.A07 = r1;
        r1.A00 = new C38751qO(this);
        C53392d8 r2 = this.A06;
        r2.A08(this.A04);
        r2.A0B = new RunnableEBaseShape6S0100000_I1_1(this, 16);
        view.getViewTreeObserver().addOnGlobalLayoutListener(this.A02);
    }

    public static Animation A00(boolean z) {
        float f = 0.0f;
        if (z) {
            f = -1.0f;
        }
        float f2 = -1.0f;
        if (z) {
            f2 = 0.0f;
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(1, f, 1, f2, 1, 0.0f, 1, 0.0f);
        translateAnimation.setDuration(100);
        return translateAnimation;
    }
}
