package com.whatsapp.util;

import X.AbstractC007503q;
import X.AbstractC02860Dt;
import X.AbstractView$OnClickListenerC08330av;
import X.AnonymousClass01I;
import X.AnonymousClass02N;
import X.AnonymousClass0HR;
import X.AnonymousClass1L0;
import X.AnonymousClass2IP;
import X.AnonymousClass377;
import X.C007303n;
import X.C02770Dj;
import X.C02850Ds;
import X.C02900Dx;
import X.C09570dA;
import X.C27131Oe;
import X.C38521q1;
import X.C39601rn;
import X.C51812a4;
import X.C64192xm;
import X.ScaleGestureDetector$OnScaleGestureListenerC669436n;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import com.google.android.search.verification.client.R;
import com.whatsapp.Conversation;
import com.whatsapp.conversation.ConversationListView;
import com.whatsapp.jid.UserJid;
import com.whatsapp.location.GroupChatLiveLocationsActivity;
import com.whatsapp.location.GroupChatLiveLocationsActivity2;

public class ViewOnClickCListenerShape1S0500000_I1 extends AbstractView$OnClickListenerC08330av {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public final int A05;

    public ViewOnClickCListenerShape1S0500000_I1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.A05 = i;
        this.A00 = obj;
        this.A02 = obj2;
        this.A03 = obj3;
        this.A01 = obj4;
        this.A04 = obj5;
    }

    @Override // X.AbstractView$OnClickListenerC08330av
    public void A00(View view) {
        Class cls;
        UserJid userJid;
        switch (this.A05) {
            case 0:
                C02850Ds r3 = (C02850Ds) this.A03;
                C02900Dx r5 = r3.A02;
                if (r5 == null) {
                    if (r3.A0n.A02) {
                        AnonymousClass01I r0 = (AnonymousClass01I) this.A02;
                        r0.A04();
                        AnonymousClass0HR r02 = r0.A01;
                        if (r02 != null) {
                            userJid = (UserJid) r02.A09;
                        } else {
                            throw null;
                        }
                    } else {
                        userJid = (UserJid) this.A04;
                    }
                    if (userJid != null) {
                        r5 = new C02900Dx(userJid);
                        r5.A05 = r3.A0E;
                        r5.A00 = ((AbstractC02860Dt) r3).A00;
                        r5.A01 = ((AbstractC02860Dt) r3).A01;
                    } else {
                        throw null;
                    }
                }
                C02770Dj r2 = (C02770Dj) this.A01;
                Context context = (Context) this.A00;
                AnonymousClass02N r1 = r3.A0n.A00;
                if (r1 != null) {
                    if (r2.A09(context)) {
                        cls = GroupChatLiveLocationsActivity2.class;
                    } else {
                        cls = GroupChatLiveLocationsActivity.class;
                    }
                    Intent intent = new Intent(context, cls);
                    intent.putExtra("jid", r1.getRawString());
                    intent.putExtra("final_location_jid", r5.A06.getRawString());
                    intent.putExtra("final_location_timestamp", r5.A05);
                    intent.putExtra("final_location_latitude", r5.A00);
                    intent.putExtra("final_location_longitude", r5.A01);
                    context.startActivity(intent);
                    return;
                }
                throw null;
            case 1:
                Conversation conversation = (Conversation) ((AnonymousClass2IP) this.A00).A00;
                C64192xm r12 = (C64192xm) this.A02;
                String str = r12.A01;
                C007303n r7 = ((AbstractC007503q) this.A03).A0n;
                C51812a4 r8 = (C51812a4) this.A01;
                int i = r12.A00;
                Bitmap[] bitmapArr = (Bitmap[]) this.A04;
                if (conversation != null) {
                    StringBuilder sb = new StringBuilder("conversation/initInlinePlayback rowKey = ");
                    sb.append(r7);
                    sb.append(" url: ");
                    sb.append(str);
                    Log.i(sb.toString());
                    C27131Oe r13 = conversation.A0l;
                    if (r13 != null && r13.A0P()) {
                        r13.A01();
                    }
                    AnonymousClass377 r52 = conversation.A1D;
                    if (r52 == null || conversation.A1C == null) {
                        conversation.A0Q = (AccessibilityManager) conversation.getSystemService("accessibility");
                        ConversationListView conversationListView = (ConversationListView) conversation.findViewById(16908298);
                        ScaleGestureDetector$OnScaleGestureListenerC669436n r22 = new ScaleGestureDetector$OnScaleGestureListenerC669436n(conversation, conversationListView);
                        conversation.A1C = r22;
                        r22.setChildPadding(conversation.getResources().getDimensionPixelSize(R.dimen.inline_video_player_padding));
                        C39601rn r23 = new C39601rn(conversation);
                        C09570dA r03 = conversationListView.A00;
                        synchronized (r03.A00) {
                            r03.A00.add(r23);
                        }
                        conversation.A1C.getViewTreeObserver().addOnGlobalLayoutListener(new AnonymousClass1L0(conversation, new C38521q1(conversation), str, r7, r8, i, bitmapArr));
                        ((ViewGroup) conversation.getWindow().getDecorView()).addView(conversation.A1C, new ViewGroup.LayoutParams(-1, -1));
                        return;
                    }
                    r52.A0C(str, r7, r8, i, bitmapArr);
                    return;
                }
                throw null;
            default:
                super.A00(view);
                return;
        }
    }
}
