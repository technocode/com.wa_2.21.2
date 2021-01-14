package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass01X;
import X.AnonymousClass0Q7;
import X.C000300f;
import X.C002001d;
import X.C004302a;
import X.C05490Ot;
import X.C06190Sd;
import X.C27231Or;
import X.C27241Os;
import X.C48032Kq;
import X.C52162ag;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.components.button.ThumbnailButton;
import java.util.List;
import java.util.Set;

public class WebPagePreviewView extends FrameLayout {
    public View A00;
    public FrameLayout A01;
    public ProgressBar A02;
    public TextView A03;
    public TextView A04;
    public TextView A05;
    public ThumbnailButton A06;
    public final C000300f A07;
    public final AnonymousClass01X A08;
    public final C48032Kq A09;
    public final C06190Sd A0A;

    public WebPagePreviewView(Context context) {
        super(context);
        AnonymousClass01X A002;
        C48032Kq r1 = null;
        if (isInEditMode()) {
            A002 = null;
        } else {
            A002 = AnonymousClass01X.A00();
        }
        this.A08 = A002;
        this.A09 = !isInEditMode() ? C48032Kq.A00() : r1;
        this.A07 = C000300f.A00();
        this.A0A = C06190Sd.A00();
        A00(context);
    }

    public WebPagePreviewView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AnonymousClass01X A002;
        C48032Kq r1 = null;
        if (isInEditMode()) {
            A002 = null;
        } else {
            A002 = AnonymousClass01X.A00();
        }
        this.A08 = A002;
        this.A09 = !isInEditMode() ? C48032Kq.A00() : r1;
        this.A07 = C000300f.A00();
        this.A0A = C06190Sd.A00();
        A00(context);
    }

    public final void A00(Context context) {
        FrameLayout.inflate(context, R.layout.web_page_preview, this);
        this.A02 = (ProgressBar) AnonymousClass0Q7.A0D(this, R.id.progress);
        this.A04 = (TextView) AnonymousClass0Q7.A0D(this, R.id.title);
        this.A06 = (ThumbnailButton) AnonymousClass0Q7.A0D(this, R.id.thumb);
        this.A01 = (FrameLayout) AnonymousClass0Q7.A0D(this, R.id.large_thumb_frame);
        this.A05 = (TextView) AnonymousClass0Q7.A0D(this, R.id.url);
        this.A00 = AnonymousClass0Q7.A0D(this, R.id.gif_size_bullet);
        this.A03 = (TextView) AnonymousClass0Q7.A0D(this, R.id.gif_size);
        Drawable A032 = C004302a.A03(context, R.drawable.balloon_incoming_frame);
        if (A032 != null) {
            Drawable A0d = C002001d.A0d(A032.mutate());
            C002001d.A2Z(A0d, C004302a.A00(context, R.color.bubble_color_incoming));
            setForeground(A0d);
            if (getId() == -1) {
                setId(R.id.link_preview_frame);
                return;
            }
            return;
        }
        throw null;
    }

    public void A01(C27241Os r12, List list) {
        String str;
        int i;
        boolean z;
        String str2 = r12.A0C;
        String str3 = r12.A0A;
        if (TextUtils.isEmpty(r12.A09)) {
            str = r12.A0G;
        } else {
            str = r12.A09;
        }
        byte[] bArr = r12.A0E;
        String str4 = r12.A0G;
        C27231Or r0 = r12.A07;
        if (r0 != null) {
            i = r0.A00;
        } else {
            i = -1;
        }
        if (!(r12 instanceof C52162ag)) {
            z = false;
        } else {
            z = ((C52162ag) r12).A01;
        }
        A03(str2, str3, str, bArr, str4, false, list, i, z, r12 instanceof C52162ag);
    }

    public final void A02(C05490Ot r15, String str, String str2, String str3, List list, boolean z) {
        Set A012 = this.A09.A01(r15, str2, r15.A08());
        String str4 = r15.A04;
        String str5 = r15.A02;
        byte[] A0y = r15.A0y();
        boolean z2 = false;
        if (A012 != null) {
            z2 = true;
        }
        A03(str4, str5, str, A0y, str3, z2, list, -1, z, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v3, types: [java.lang.CharSequence] */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001f, code lost:
        if (android.text.TextUtils.isEmpty(com.whatsapp.AcceptInviteLinkActivity.A04(android.net.Uri.parse(r25))) != false) goto L_0x0021;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0108  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(java.lang.String r21, java.lang.String r22, java.lang.String r23, byte[] r24, java.lang.String r25, boolean r26, java.util.List r27, int r28, boolean r29, boolean r30) {
        /*
        // Method dump skipped, instructions count: 622
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversation.conversationrow.WebPagePreviewView.A03(java.lang.String, java.lang.String, java.lang.String, byte[], java.lang.String, boolean, java.util.List, int, boolean, boolean):void");
    }

    public void setLargeThumbFrameVisibility(boolean z) {
        FrameLayout frameLayout = this.A01;
        int i = 8;
        if (z) {
            i = 0;
        }
        frameLayout.setVisibility(i);
    }

    public void setProgressBarVisibility(boolean z) {
        ProgressBar progressBar = this.A02;
        int i = 8;
        if (z) {
            i = 0;
        }
        progressBar.setVisibility(i);
    }

    private void setTitle(CharSequence charSequence) {
        this.A04.setText(charSequence);
    }
}
