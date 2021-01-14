package com.whatsapp.search.views;

import X.AnonymousClass01X;
import X.AnonymousClass0D9;
import X.AnonymousClass0FI;
import X.AnonymousClass0M3;
import X.AnonymousClass0MI;
import X.AnonymousClass0MK;
import X.AnonymousClass0MN;
import X.AnonymousClass0ZB;
import X.AnonymousClass0ZC;
import X.C002001d;
import X.C02580Cq;
import X.C71183Nx;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.search.verification.client.R;
import com.whatsapp.WaImageView;

public class MessageThumbView extends WaImageView {
    public int A00;
    public View.OnClickListener A01;
    public View.OnClickListener A02;
    public AnonymousClass0M3 A03;
    public final AnonymousClass01X A04;
    public final AnonymousClass0D9 A05;
    public final C02580Cq A06;

    public MessageThumbView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C02580Cq A012;
        AnonymousClass01X r1 = null;
        if (isInEditMode()) {
            A012 = null;
        } else {
            A012 = C02580Cq.A01();
        }
        this.A06 = A012;
        this.A04 = !isInEditMode() ? AnonymousClass01X.A00() : r1;
        this.A05 = new C71183Nx(this);
    }

    private int getNotDownloadedContentDescription() {
        AnonymousClass0M3 r1 = this.A03;
        if ((r1 instanceof AnonymousClass0MI) || (r1 instanceof AnonymousClass0MN)) {
            return R.string.conversation_row_image_not_downloaded_content_description;
        }
        if (r1 instanceof AnonymousClass0ZB) {
            return R.string.conversation_row_gif_not_downloaded_content_description;
        }
        if ((r1 instanceof AnonymousClass0ZC) || (r1 instanceof AnonymousClass0MK)) {
            return R.string.conversation_row_video_not_downloaded_content_description;
        }
        return -1;
    }

    public void setMessage(AnonymousClass0M3 r4) {
        C02580Cq r2 = this.A06;
        if (r2 != null) {
            this.A03 = r4;
            AnonymousClass0D9 r1 = this.A05;
            r1.APt(this);
            r2.A0D(r4, this, r1, false);
        }
    }

    public void setRadius(int i) {
        this.A00 = i;
    }

    public void setStatus(int i) {
        AnonymousClass01X r6 = this.A04;
        if (r6 != null && this.A03 != null) {
            C002001d.A2j(this);
            if (i == 0 || i == 1) {
                setContentDescription(getResources().getString(R.string.image_transfer_in_progress));
                if (i == 0) {
                    setOnClickListener(this.A02);
                } else {
                    setOnClickListener(null);
                }
            } else if (i == 2 || i == 3) {
                setContentDescription(getResources().getString(R.string.action_open_image));
                setOnClickListener(this.A02);
            } else {
                C002001d.A2w(r6, this, R.string.button_download);
                setOnClickListener(this.A01);
                int notDownloadedContentDescription = getNotDownloadedContentDescription();
                if (notDownloadedContentDescription != -1) {
                    setContentDescription(getResources().getString(notDownloadedContentDescription, AnonymousClass0FI.A0A(r6, this.A03.A01)));
                }
            }
        }
    }
}
