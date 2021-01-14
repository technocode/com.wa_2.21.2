package com.whatsapp.conversation.conversationrow;

import X.AbstractC51572Zg;
import X.AnonymousClass0OF;
import X.AnonymousClass0OJ;
import X.AnonymousClass0Z8;
import X.AnonymousClass2ZO;
import X.AnonymousClass35Y;
import X.C002001d;
import X.C002301g;
import X.C004302a;
import X.C02780Dk;
import X.C05270Nw;
import X.C05710Pt;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape1S0300000_I1;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;
import java.util.ArrayList;
import java.util.List;

public class TemplateRowContentLayout extends LinearLayout {
    public View A00;
    public TextEmojiLabel A01;
    public TextEmojiLabel A02;
    public final C02780Dk A03 = C02780Dk.A02();
    public final AnonymousClass35Y A04 = AnonymousClass35Y.A00();
    public final List A05 = new ArrayList();

    public TemplateRowContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOrientation(1);
        LinearLayout.inflate(context, R.layout.template_message_content, this);
        this.A02 = (TextEmojiLabel) findViewById(R.id.top_message);
        this.A01 = (TextEmojiLabel) findViewById(R.id.bottom_message);
        this.A00 = findViewById(R.id.button_divider);
        this.A05.add(findViewById(R.id.action_btn_1));
        this.A05.add(findViewById(R.id.action_btn_2));
        this.A05.add(findViewById(R.id.action_btn_3));
        for (TextView textView : this.A05) {
            C002301g.A03(textView);
        }
    }

    public void A00(AbstractC51572Zg r13) {
        int i;
        AnonymousClass0Z8 r5 = (AnonymousClass0Z8) r13.getFMessage();
        AnonymousClass0OF A9K = r5.A9K();
        String str = A9K.A01;
        String str2 = A9K.A00;
        int i2 = 8;
        if (!TextUtils.isEmpty(str)) {
            r13.A0b(str2, this.A02, r13.getFMessage(), true);
            setupContentView(this.A02);
            this.A01.A07 = null;
            this.A02.setVisibility(0);
            r13.A0b(str, this.A01, r13.getFMessage(), false);
            this.A01.setTextSize(AbstractC51572Zg.A02(r13.getResources(), r13.A0n, -1));
            this.A01.setTextColor(C004302a.A00(r13.getContext(), R.color.conversation_row_date));
        } else {
            r13.A0b(str2, this.A01, r13.getFMessage(), true);
            setupContentView(this.A01);
            this.A02.setVisibility(8);
            this.A01.setTextSize(r13.getTextFontSize());
            this.A01.setTextColor(C004302a.A00(r13.getContext(), R.color.conversation_template_top_message_text_color));
        }
        List list = r5.A9K().A02;
        boolean z = false;
        int i3 = 0;
        for (TextView textView : this.A05) {
            if (list == null || i3 >= list.size() || list.get(i3) == null || ((AnonymousClass0OJ) list.get(i3)).A03 == 1) {
                i = 8;
            } else {
                AnonymousClass0OJ r9 = (AnonymousClass0OJ) list.get(i3);
                AnonymousClass2ZO r52 = r13.A0i;
                Context context = getContext();
                int i4 = r9.A03;
                int i5 = R.drawable.ic_link_action;
                if (i4 == 3) {
                    i5 = R.drawable.ic_action_call;
                }
                Drawable A0e = C002001d.A0e(C004302a.A03(context, i5), textView.getCurrentTextColor());
                A0e.setAlpha(204);
                textView.setText(C05270Nw.A01(r9.A04, A0e, textView.getPaint()));
                textView.setOnClickListener(new ViewOnClickEBaseShape1S0300000_I1(this, r9, r52, 10));
                z = true;
                i = 0;
            }
            textView.setVisibility(i);
            i3++;
        }
        View view = this.A00;
        if (z) {
            i2 = 0;
        }
        view.setVisibility(i2);
    }

    public TextEmojiLabel getContentTextView() {
        return this.A02.getVisibility() == 0 ? this.A02 : this.A01;
    }

    public TextEmojiLabel getFooterTextView() {
        return this.A01;
    }

    public static void setupContentView(TextEmojiLabel textEmojiLabel) {
        textEmojiLabel.A07 = new C05710Pt();
        textEmojiLabel.setAutoLinkMask(0);
        textEmojiLabel.setLinksClickable(false);
        textEmojiLabel.setFocusable(false);
        textEmojiLabel.setClickable(false);
        textEmojiLabel.setLongClickable(false);
    }
}
