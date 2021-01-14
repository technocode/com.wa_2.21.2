package X;

import android.content.Context;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.components.ConversationListRowHeaderView;

/* renamed from: X.314  reason: invalid class name */
public abstract class AnonymousClass314 extends LinearLayout {
    public ViewGroup A00 = ((ViewGroup) findViewById(R.id.search_message_container_attachment));
    public ViewGroup A01 = ((ViewGroup) findViewById(R.id.search_message_container_content));
    public ViewGroup A02 = ((ViewGroup) findViewById(R.id.search_message_container_header));
    public ViewGroup A03 = ((ViewGroup) findViewById(R.id.search_message_container_media));

    public AnonymousClass314(Context context) {
        super(context);
        setOrientation(0);
        LinearLayout.inflate(getContext(), R.layout.search_message_container, this);
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(16843534, typedValue, true);
        setBackgroundResource(typedValue.resourceId);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.search_item_horizontal_margin);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.search_item_message_vertical_margin);
        setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
        setMinimumHeight(getResources().getDimensionPixelSize(R.dimen.search_message_min_height));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v4, resolved type: X.3OK */
    /* JADX DEBUG: Multi-variable search result rejected for r4v5, resolved type: X.3ZU */
    /* JADX DEBUG: Multi-variable search result rejected for r4v6, resolved type: X.3ZX */
    /* JADX DEBUG: Multi-variable search result rejected for r4v7, resolved type: X.3ZS */
    /* JADX DEBUG: Multi-variable search result rejected for r4v8, resolved type: X.3OI */
    /* JADX WARN: Multi-variable type inference failed */
    public void A00() {
        AnonymousClass3ZT r4;
        AnonymousClass3ON r1;
        AnonymousClass3OP r42 = (AnonymousClass3OP) this;
        ConversationListRowHeaderView conversationListRowHeaderView = new ConversationListRowHeaderView(r42.getContext());
        conversationListRowHeaderView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        conversationListRowHeaderView.A00.setIncludeFontPadding(false);
        conversationListRowHeaderView.A01.setIncludeFontPadding(false);
        AnonymousClass2I3 r0 = new AnonymousClass2I3(conversationListRowHeaderView, r42.A0A, r42.A0F, r42.A0I);
        r42.A02 = r0;
        C002301g.A03(r0.A00.A00);
        AnonymousClass2I3 r02 = r42.A02;
        int i = r42.A06;
        r02.A01.A01.setTextColor(i);
        this.A02.addView(conversationListRowHeaderView);
        r42.A01 = new TextEmojiLabel(r42.getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 3;
        r42.A01.setLayoutParams(layoutParams);
        r42.A01.setMaxLines(3);
        r42.A01.setEllipsize(TextUtils.TruncateAt.END);
        r42.A01.setTextColor(i);
        r42.A01.setLineHeight(r42.getResources().getDimensionPixelSize(R.dimen.search_message_line_height));
        r42.A01.setTypeface(null, 0);
        r42.A01.setText("");
        r42.A01.setPlaceholder(80);
        r42.A01.setLineSpacing((float) r42.getResources().getDimensionPixelSize(R.dimen.search_message_line_spacing), 1.0f);
        r42.A01.setId(R.id.search_message_text_content);
        TextEmojiLabel textEmojiLabel = r42.A01;
        if (textEmojiLabel != null) {
            this.A01.addView(textEmojiLabel);
        }
        if (this instanceof C74943bp) {
            C74943bp r03 = (C74943bp) this;
            AnonymousClass3ZT r43 = new AnonymousClass3ZT(r03.getContext());
            r03.A00 = r43;
            r4 = r43;
        } else if (this instanceof C74983bt) {
            C74983bt r04 = (C74983bt) this;
            AnonymousClass3OK r44 = new AnonymousClass3OK(r04.getContext());
            r04.A00 = r44;
            r4 = r44;
        } else if (this instanceof C74953bq) {
            C74953bq r05 = (C74953bq) this;
            AnonymousClass3ZU r45 = new AnonymousClass3ZU(r05.getContext(), r05.A0E, r05.A08, r05.A05, r05.A01, r05.A0F, r05.A02, r05.A04, r05.A03);
            r05.A00 = r45;
            r4 = r45;
        } else if (this instanceof C74893bk) {
            C74893bk r06 = (C74893bk) this;
            AnonymousClass3ZX r46 = new AnonymousClass3ZX(r06.getContext(), r06.A0F);
            r06.A00 = r46;
            r4 = r46;
        } else if (this instanceof C74883bj) {
            C74883bj r07 = (C74883bj) this;
            AnonymousClass3ZS r47 = new AnonymousClass3ZS(r07.getContext(), r07.A01, r07.A02, r07.A0F, r07.A04, r07.A03);
            r07.A00 = r47;
            r4 = r47;
        } else if (!(this instanceof C74873bi)) {
            r4 = null;
        } else {
            C74873bi r08 = (C74873bi) this;
            AnonymousClass3OI r48 = new AnonymousClass3OI(r08.getContext());
            r08.A00 = r48;
            r4 = r48;
        }
        if (r4 != null) {
            this.A00.addView(r4);
            this.A00.setVisibility(0);
        }
        if (this instanceof C74963br) {
            AnonymousClass3Za r2 = (AnonymousClass3Za) this;
            C74973bs r09 = new C74973bs(r2.getContext());
            r2.A00 = r09;
            r2.setUpThumbView(r09);
            r1 = r2.A00;
        } else if (this instanceof C74933bo) {
            AnonymousClass3Za r22 = (AnonymousClass3Za) this;
            C73853Zb r010 = new C73853Zb(r22.getContext());
            r22.A00 = r010;
            r22.setUpThumbView(r010);
            r1 = r22.A00;
        } else if (!(this instanceof C74903bl)) {
            r1 = null;
        } else {
            AnonymousClass3Za r23 = (AnonymousClass3Za) this;
            C74923bn r011 = new C74923bn(r23.getContext());
            r23.A00 = r011;
            r23.setUpThumbView(r011);
            r1 = r23.A00;
        }
        if (r1 != null) {
            this.A03.addView(r1);
        }
    }
}
