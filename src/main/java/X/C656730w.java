package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;
import java.util.List;

/* renamed from: X.30w  reason: invalid class name and case insensitive filesystem */
public class C656730w extends LinearLayout {
    public boolean A00 = false;
    public final int A01;
    public final int A02;
    public final TextEmojiLabel A03;
    public final TextEmojiLabel A04;
    public final TextEmojiLabel A05;
    public final AnonymousClass01X A06 = AnonymousClass01X.A00();

    public C656730w(Context context) {
        super(context);
        setOrientation(1);
        setGravity(16);
        LinearLayout.inflate(getContext(), R.layout.file_attachment_metadata, this);
        View findViewById = findViewById(R.id.file_attachment_metadata_title);
        if (findViewById != null) {
            this.A05 = (TextEmojiLabel) findViewById;
            View findViewById2 = findViewById(R.id.file_attachment_metadata_description);
            if (findViewById2 != null) {
                this.A03 = (TextEmojiLabel) findViewById2;
                View findViewById3 = findViewById(R.id.file_attachment_metadata_subtext);
                if (findViewById3 != null) {
                    this.A04 = (TextEmojiLabel) findViewById3;
                    this.A01 = C004302a.A00(context, R.color.list_item_sub_title);
                    this.A02 = C004302a.A00(context, R.color.list_item_title);
                    C002301g.A03(this.A05);
                    return;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }

    public void onMeasure(int i, int i2) {
        this.A00 = true;
        TextEmojiLabel textEmojiLabel = this.A05;
        measureChild(textEmojiLabel, i, i2);
        setupTitleAndDescriptionMaxLines(textEmojiLabel.getText().toString());
        super.onMeasure(i, i2);
    }

    public void setSubText(String str, List list) {
        TextEmojiLabel textEmojiLabel = this.A04;
        int i = 0;
        if (TextUtils.isEmpty(str)) {
            i = 8;
        }
        textEmojiLabel.setVisibility(i);
        if (!TextUtils.isEmpty(str)) {
            textEmojiLabel.A04(AbstractC11890hA.A01(getContext(), str, list, this.A06), null, false, 0);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (r6.A05.getMeasuredWidth() != 0) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setTitleAndDescription(java.lang.String r7, java.lang.String r8, java.util.List r9) {
        /*
            r6 = this;
            com.whatsapp.TextEmojiLabel r5 = r6.A03
            boolean r1 = android.text.TextUtils.isEmpty(r8)
            r4 = 0
            r0 = 0
            if (r1 == 0) goto L_0x000c
            r0 = 8
        L_0x000c:
            r5.setVisibility(r0)
            boolean r0 = r6.A00
            if (r0 != 0) goto L_0x001c
            com.whatsapp.TextEmojiLabel r0 = r6.A05
            int r1 = r0.getMeasuredWidth()
            r0 = 0
            if (r1 == 0) goto L_0x001d
        L_0x001c:
            r0 = 1
        L_0x001d:
            r6.A00 = r0
            if (r0 == 0) goto L_0x0024
            r6.setupTitleAndDescriptionMaxLines(r7)
        L_0x0024:
            if (r9 == 0) goto L_0x0052
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto L_0x0052
            com.whatsapp.TextEmojiLabel r3 = r6.A05
            int r0 = r6.A01
            r3.setTextColor(r0)
        L_0x0033:
            android.content.Context r0 = r6.getContext()
            X.01X r2 = r6.A06
            java.lang.CharSequence r0 = X.AbstractC11890hA.A01(r0, r7, r9, r2)
            r1 = 0
            r3.A04(r0, r1, r4, r4)
            if (r8 == 0) goto L_0x004f
            android.content.Context r0 = r6.getContext()
            java.lang.CharSequence r0 = X.AbstractC11890hA.A01(r0, r8, r9, r2)
        L_0x004b:
            r5.A04(r0, r1, r4, r4)
            return
        L_0x004f:
            java.lang.String r0 = ""
            goto L_0x004b
        L_0x0052:
            com.whatsapp.TextEmojiLabel r3 = r6.A05
            int r0 = r6.A02
            r3.setTextColor(r0)
            goto L_0x0033
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C656730w.setTitleAndDescription(java.lang.String, java.lang.String, java.util.List):void");
    }

    private void setupTitleAndDescriptionMaxLines(String str) {
        TextEmojiLabel textEmojiLabel = this.A05;
        if (textEmojiLabel.getPaint().measureText(str) > ((float) textEmojiLabel.getMeasuredWidth())) {
            textEmojiLabel.setMaxLines(2);
            this.A03.setMaxLines(1);
            return;
        }
        textEmojiLabel.setMaxLines(1);
        this.A03.setMaxLines(2);
    }
}
