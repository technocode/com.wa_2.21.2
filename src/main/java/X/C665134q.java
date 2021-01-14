package X;

import android.app.Activity;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageButton;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.MentionableEntry;
import com.whatsapp.emoji.search.EmojiSearchContainer;
import java.util.List;

/* renamed from: X.34q  reason: invalid class name and case insensitive filesystem */
public class C665134q {
    public final View A00;
    public final ViewTreeObserver.OnGlobalLayoutListener A01 = new ViewTreeObserver$OnGlobalLayoutListenerC665034p(this);
    public final AbstractC26561Lk A02 = new C72203Rx(this);
    public final MentionableEntry A03;
    public final C53392d8 A04;
    public final C48672Ng A05;
    public final C06170Sb A06;

    public C665134q(Activity activity, AnonymousClass0Eg r29, C06170Sb r30, C02590Cr r31, C02600Cs r32, C03930Ii r33, AnonymousClass03P r34, AnonymousClass01X r35, C53492dM r36, AnonymousClass00D r37, AnonymousClass022 r38, View view, C007003k r40, String str, List list) {
        this.A00 = view;
        this.A06 = r30;
        MentionableEntry mentionableEntry = (MentionableEntry) view.findViewById(R.id.caption);
        this.A03 = mentionableEntry;
        mentionableEntry.setInputEnterDone(true);
        this.A03.setFilters(new InputFilter[]{new AnonymousClass1M3(1024)});
        this.A03.setOnEditorActionListener(new C664934o(this));
        MentionableEntry mentionableEntry2 = this.A03;
        mentionableEntry2.addTextChangedListener(new C07850Zx(r31, r34, r35, r38, mentionableEntry2, (TextView) view.findViewById(R.id.counter), 1024, 30, true));
        if (r40 != null && r40.A09()) {
            this.A03.A0B((ViewGroup) view.findViewById(R.id.mention_attach), (AnonymousClass02U) r40.A02(AnonymousClass02U.class), true, true);
        }
        if (!TextUtils.isEmpty(str)) {
            this.A03.setMentionableText(str, list);
        }
        C53392d8 r5 = new C53392d8(activity, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, (AnonymousClass1MF) activity.findViewById(R.id.main), (ImageButton) view.findViewById(R.id.emoji_picker_btn), this.A03);
        this.A04 = r5;
        r5.A00 = R.drawable.input_emoji_white;
        r5.A02 = R.drawable.input_kbd_white;
        C48672Ng r1 = new C48672Ng((EmojiSearchContainer) view.findViewById(R.id.emoji_search_container), this.A04, activity, r31, r33, r35, r38);
        this.A05 = r1;
        r1.A00 = new C72183Rv(this);
        C53392d8 r2 = this.A04;
        r2.A08(this.A02);
        r2.A0B = new RunnableEBaseShape13S0100000_I1_8(this, 19);
        view.getViewTreeObserver().addOnGlobalLayoutListener(this.A01);
    }
}
