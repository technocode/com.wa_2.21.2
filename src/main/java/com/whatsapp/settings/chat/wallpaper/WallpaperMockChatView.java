package com.whatsapp.settings.chat.wallpaper;

import X.AbstractC51572Zg;
import X.AnonymousClass00S;
import X.AnonymousClass01I;
import X.AnonymousClass0AL;
import X.AnonymousClass0FI;
import X.AnonymousClass0Q7;
import X.C05490Ot;
import X.C59242nJ;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.search.verification.client.R;

public class WallpaperMockChatView extends LinearLayout {
    public View A00;
    public View A01;
    public TextView A02;
    public TextView A03;
    public TextView A04;
    public AbstractC51572Zg A05;
    public AbstractC51572Zg A06;
    public final AnonymousClass01I A07 = AnonymousClass01I.A00();
    public final AnonymousClass00S A08 = AnonymousClass00S.A00();
    public final AnonymousClass0AL A09 = AnonymousClass0AL.A01();

    public WallpaperMockChatView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AbstractC51572Zg getOutgoingRow() {
        return this.A06;
    }

    public void setMessages(String str, String str2) {
        Context context = getContext();
        AnonymousClass0AL r8 = this.A09;
        AnonymousClass00S r7 = this.A08;
        AnonymousClass01I r9 = this.A07;
        C05490Ot r6 = (C05490Ot) r8.A02(AnonymousClass0FI.A07(r7, r9, null, false), r7.A05(), (byte) 0);
        r6.A0d(str);
        r9.A04();
        C05490Ot r4 = (C05490Ot) r8.A02(AnonymousClass0FI.A07(r7, r9, r9.A03, true), r7.A05(), (byte) 0);
        r4.A0E = r7.A05();
        r4.A0T(5);
        r4.A0d(str2);
        setBackgroundResource(0);
        setOrientation(1);
        C59242nJ r0 = new C59242nJ(context, r6);
        this.A05 = r0;
        r0.A0d(true);
        this.A05.setEnabled(false);
        this.A00 = AnonymousClass0Q7.A0D(this.A05, R.id.date_wrapper);
        this.A03 = (TextView) AnonymousClass0Q7.A0D(this.A05, R.id.message_text);
        this.A02 = (TextView) AnonymousClass0Q7.A0D(this.A05, R.id.conversation_row_date_divider);
        C59242nJ r02 = new C59242nJ(context, r4);
        this.A06 = r02;
        r02.A0d(false);
        this.A06.setEnabled(false);
        this.A01 = AnonymousClass0Q7.A0D(this.A06, R.id.date_wrapper);
        this.A04 = (TextView) AnonymousClass0Q7.A0D(this.A06, R.id.message_text);
        addView(this.A05);
        addView(this.A06);
    }
}
