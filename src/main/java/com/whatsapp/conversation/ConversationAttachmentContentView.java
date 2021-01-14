package com.whatsapp.conversation;

import X.AbstractC000400g;
import X.AbstractC05890Qx;
import X.AbstractC658531u;
import X.AnonymousClass00D;
import X.AnonymousClass01I;
import X.AnonymousClass01T;
import X.AnonymousClass01X;
import X.AnonymousClass02N;
import X.AnonymousClass02X;
import X.AnonymousClass0Q7;
import X.AnonymousClass1M5;
import X.AnonymousClass1VY;
import X.AnonymousClass2Z6;
import X.AnonymousClass325;
import X.C000300f;
import X.C008805h;
import X.C02020Ai;
import X.C02040Ak;
import X.C09190cR;
import X.C28351Tz;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationSet;
import android.view.animation.OvershootInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.text.CondensedTextView;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ConversationAttachmentContentView extends ScrollView {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public LinearLayout A08;
    public AnonymousClass2Z6 A09;
    public AnonymousClass02N A0A;
    public LinkedHashMap A0B;
    public boolean A0C;
    public boolean A0D;
    public final AnonymousClass01I A0E;
    public final C09190cR A0F;
    public final C000300f A0G;
    public final AnonymousClass00D A0H;
    public final AnonymousClass01X A0I;
    public final AnonymousClass01T A0J;
    public final C02020Ai A0K;
    public final C02040Ak A0L;
    public final AbstractC658531u A0M;
    public final AnonymousClass325 A0N;

    public ConversationAttachmentContentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int A022;
        int A023;
        this.A0E = AnonymousClass01I.A00();
        this.A0N = AnonymousClass325.A00();
        this.A0F = C09190cR.A00();
        this.A0G = C000300f.A00();
        this.A0M = AbstractC658531u.A00();
        this.A0I = AnonymousClass01X.A00();
        this.A0H = AnonymousClass00D.A00();
        this.A0L = C02040Ak.A00();
        this.A0K = C02020Ai.A00();
        this.A0J = AnonymousClass01T.A00();
        this.A0B = new LinkedHashMap();
        this.A0D = false;
        this.A0D = this.A0G.A0D(AbstractC000400g.A0S);
        this.A02 = getResources().getDimensionPixelSize(R.dimen.attach_popup_icon_size);
        this.A01 = getResources().getDimensionPixelSize(R.dimen.attach_popup_icon_bottom_margin);
        this.A04 = getIconTextViewHeight();
        if (this.A0D) {
            A022 = getResources().getDimensionPixelSize(R.dimen.conversation_attachment_edge_padding);
        } else {
            A022 = C008805h.A02(getContext(), 25.0f);
        }
        this.A00 = A022;
        if (this.A0D) {
            A023 = getResources().getDimensionPixelSize(R.dimen.conversation_attachment_item_padding);
        } else {
            A023 = C008805h.A02(getContext(), 8.0f);
        }
        this.A03 = A023;
        ScrollView.inflate(getContext(), R.layout.conversation_attachment_content_view, this);
        this.A08 = (LinearLayout) AnonymousClass0Q7.A0D(this, R.id.row_content);
    }

    public int A00(View view) {
        if (!this.A0D) {
            return Integer.MAX_VALUE;
        }
        Point A092 = C008805h.A09(getContext());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return Math.max((getIconSize() * getNumberOfColumns()) + getMaxMarginSize(), (((view.getWidth() / 2) + iArr[0]) - (A092.x / 2)) << 1);
    }

    public int A01(View view) {
        int i;
        if (!this.A0D) {
            if (getResources().getConfiguration().orientation == 1) {
                i = this.A0H.A00.getInt("keyboard_height_portrait", 0);
            } else {
                i = this.A0H.A00.getInt("keyboard_height_landscape", 0);
            }
            int dimension = (int) getResources().getDimension(R.dimen.conversation_attachment_container_max_height);
            if (i == 0) {
                return dimension;
            }
            return i;
        }
        int ceil = (int) Math.ceil(((double) ((AbstractCollection) A05()).size()) / ((double) getNumberOfColumns()));
        int i2 = (this.A00 << 1) + ((ceil - 1) * this.A03) + ((this.A02 + this.A01 + this.A04 + this.A05) * ceil);
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int measuredHeight = (iArr[1] - view.getMeasuredHeight()) - getResources().getDimensionPixelSize(R.dimen.attach_popup_min_top_offset);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new TypedValue().data, new int[]{16843499});
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        obtainStyledAttributes.recycle();
        int i3 = measuredHeight - dimensionPixelSize;
        return (i3 >= i2 || i2 - (this.A02 / 2) <= i3) ? i2 : i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [android.graphics.drawable.Drawable] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.drawable.Drawable A02(int r9, int r10, int r11, int r12) {
        /*
        // Method dump skipped, instructions count: 135
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversation.ConversationAttachmentContentView.A02(int, int, int, int):android.graphics.drawable.Drawable");
    }

    public final View A03(LinearLayout linearLayout, int i, int i2, int i3, int i4, int i5, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener) {
        return A04(linearLayout, getContext().getResources().getDrawable(i), i2, i3, i4, i5, onClickListener, onLongClickListener);
    }

    public final View A04(LinearLayout linearLayout, Drawable drawable, int i, int i2, int i3, int i4, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener) {
        if (this.A0D) {
            View inflate = LayoutInflater.from(getContext()).inflate(R.layout.conversation_attachment_picker_row_item_v2, (ViewGroup) linearLayout, false);
            ImageView imageView = (ImageView) AnonymousClass0Q7.A0D(inflate, R.id.icon);
            imageView.setBackgroundDrawable(A02(i2, i, 0, 0));
            imageView.setImageDrawable(drawable);
            AnonymousClass0Q7.A0W(imageView, 2);
            ((TextView) AnonymousClass0Q7.A0D(inflate, R.id.text)).setText(this.A0I.A06(i3));
            inflate.setId(i4);
            imageView.setOnClickListener(onClickListener);
            inflate.setOnClickListener(onClickListener);
            if (onLongClickListener != null) {
                imageView.setOnLongClickListener(onLongClickListener);
                inflate.setOnLongClickListener(onLongClickListener);
            }
            return inflate;
        }
        View inflate2 = LayoutInflater.from(getContext()).inflate(R.layout.conversation_attachment_picker_row_item, (ViewGroup) linearLayout, false);
        ((ImageView) AnonymousClass0Q7.A0D(inflate2, R.id.icon)).setImageDrawable(drawable);
        ((TextView) AnonymousClass0Q7.A0D(inflate2, R.id.text)).setText(this.A0I.A06(i3));
        inflate2.setId(i4);
        inflate2.setOnClickListener(onClickListener);
        if (onLongClickListener != null) {
            inflate2.setOnLongClickListener(onLongClickListener);
        }
        return inflate2;
    }

    public final List A05() {
        boolean A062;
        ArrayList arrayList = new ArrayList();
        C02040Ak r3 = this.A0L;
        boolean z = false;
        if (r3.A02()) {
            AnonymousClass01I r4 = this.A0E;
            if (!r4.A09(this.A0A)) {
                AnonymousClass02N r1 = this.A0A;
                if (!AnonymousClass1VY.A0T(r1)) {
                    if (AnonymousClass1VY.A0Y(r1)) {
                        Iterator it = this.A0J.A01((AnonymousClass02X) r1).A04().iterator();
                        while (true) {
                            C28351Tz r12 = (C28351Tz) it;
                            if (!r12.hasNext()) {
                                A062 = false;
                                break;
                            }
                            UserJid userJid = ((AnonymousClass1M5) r12.next()).A03;
                            if (!r4.A09(userJid) && r3.A06(userJid)) {
                                A062 = true;
                                break;
                            }
                        }
                    } else {
                        A062 = r3.A06(UserJid.of(r1));
                    }
                    AbstractC05890Qx A012 = this.A0K.A01();
                    if (A012 != null) {
                        CharSequence A5f = A012.A5f(getContext());
                        if (A062 && !TextUtils.isEmpty(A5f)) {
                            z = true;
                        }
                    } else {
                        throw null;
                    }
                }
            }
        }
        boolean A072 = this.A0F.A07();
        if (this.A0D) {
            arrayList.add("document");
            arrayList.add("camera");
            arrayList.add("gallery");
            arrayList.add("audio");
            if (z) {
                arrayList.add("payment");
            }
            if (A072) {
                arrayList.add("room");
            }
            arrayList.add("location");
            arrayList.add("contact");
            return arrayList;
        }
        arrayList.add("document");
        if (z) {
            arrayList.add("payment");
        } else if (!A072) {
            arrayList.add("camera");
        } else {
            arrayList.add("room");
        }
        arrayList.add("gallery");
        arrayList.add("audio");
        arrayList.add("location");
        arrayList.add("contact");
        return arrayList;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x025b  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0079 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A06() {
        /*
        // Method dump skipped, instructions count: 680
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversation.ConversationAttachmentContentView.A06():void");
    }

    public void A07(int i, boolean z) {
        long j;
        boolean z2 = true;
        int[][] iArr = new int[3][];
        int[] iArr2 = {6, 0, 0, 0};
        if (z) {
            // fill-array-data instruction
            iArr2[0] = 2;
            iArr2[1] = 3;
            iArr2[2] = 6;
            iArr2[3] = 8;
            iArr[0] = iArr2;
            iArr[1] = new int[]{3, 6, 0, 0};
            iArr[2] = new int[]{6, 0, 0, 0};
        } else {
            iArr[0] = iArr2;
            iArr[1] = new int[]{3, 6, 0, 0};
            iArr[2] = new int[]{2, 3, 6, 8};
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.A0B.entrySet()) {
            arrayList.add(entry.getValue());
        }
        int i2 = 0;
        for (int i3 = 0; i3 < iArr.length; i3++) {
            int i4 = 0;
            while (i4 < iArr[i3].length) {
                if (i4 < getNumberOfColumns() && i2 < arrayList.size()) {
                    View view = (View) arrayList.get(i2);
                    int i5 = iArr[i3][i4];
                    AnimationSet animationSet = new AnimationSet(z2);
                    float f = 0.0f;
                    if (z) {
                        f = 1.0f;
                    }
                    int i6 = z2 ? 1 : 0;
                    int i7 = z2 ? 1 : 0;
                    int i8 = z2 ? 1 : 0;
                    int i9 = z2 ? 1 : 0;
                    animationSet.addAnimation(new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.5f, i6, f));
                    animationSet.setInterpolator(new OvershootInterpolator(1.0f));
                    animationSet.setDuration(300);
                    if (i5 == 0) {
                        j = 0;
                    } else {
                        j = (long) (i / i5);
                    }
                    animationSet.setStartOffset(j);
                    view.startAnimation(animationSet);
                    i2++;
                }
                i4++;
                z2 = true;
            }
        }
    }

    public int computeVerticalScrollOffset() {
        int computeVerticalScrollOffset = super.computeVerticalScrollOffset();
        int computeVerticalScrollRange = computeVerticalScrollRange() - getHeight();
        int i = this.A06;
        int i2 = computeVerticalScrollRange - (i << 1);
        return (i <= 0 || i2 <= 0) ? computeVerticalScrollOffset : ((computeVerticalScrollOffset * i2) / computeVerticalScrollRange) + i;
    }

    private int getIconSize() {
        return getResources().getDimensionPixelSize(R.dimen.quickaction_button_h);
    }

    private int getIconTextViewHeight() {
        CondensedTextView condensedTextView = new CondensedTextView(getContext(), null, R.style.AttachPickerLabelV2);
        condensedTextView.measure(View.MeasureSpec.makeMeasureSpec(getResources().getDisplayMetrics().widthPixels, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        return condensedTextView.getMeasuredHeight();
    }

    private int getMaxMarginSize() {
        return (getResources().getDimensionPixelSize(R.dimen.attach_popup_horizontal_max_padding) << 1) + getResources().getDimensionPixelSize(R.dimen.attach_popup_horizontal_margin);
    }

    private int getMinMarginSize() {
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.attach_popup_horizontal_min_padding);
        getResources().getDimensionPixelSize(R.dimen.attach_popup_horizontal_max_padding);
        return (dimensionPixelSize << 1) + getResources().getDimensionPixelSize(R.dimen.attach_popup_horizontal_margin);
    }

    private int getNumberOfColumns() {
        Point A092 = C008805h.A09(this.A08.getContext());
        return Math.min(4, Math.max(3, (A092.x - getMinMarginSize()) / getIconSize()));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00d8, code lost:
        if (java.lang.Math.abs(r5) < java.lang.Math.abs(r4)) goto L_0x00f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00f4, code lost:
        if (java.lang.Math.abs(r5) < java.lang.Math.abs(r4)) goto L_0x00f6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r19, int r20) {
        /*
        // Method dump skipped, instructions count: 262
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversation.ConversationAttachmentContentView.onMeasure(int, int):void");
    }

    public void setVerticalScrollbarInset(int i) {
        this.A06 = i;
    }
}
