package com.whatsapp.util;

import X.AbstractC000400g;
import X.AbstractC007503q;
import X.AbstractC51572Zg;
import X.AbstractC661433b;
import X.AbstractView$OnClickListenerC08330av;
import X.AnonymousClass01A;
import X.AnonymousClass01K;
import X.AnonymousClass02N;
import X.AnonymousClass0Z9;
import X.AnonymousClass0ZE;
import X.AnonymousClass1LD;
import X.AnonymousClass1VY;
import X.AnonymousClass289;
import X.C006803i;
import X.C007303n;
import X.C02770Dj;
import X.C09100cI;
import X.C12060hU;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.view.View;
import com.google.android.search.verification.client.R;
import com.whatsapp.Conversation;
import com.whatsapp.jid.UserJid;
import com.whatsapp.status.playback.StatusPlaybackActivity;
import java.util.Stack;

public class ViewOnClickCListenerShape2S0400000_I1 extends AbstractView$OnClickListenerC08330av {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public ViewOnClickCListenerShape2S0400000_I1(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.A04 = i;
        this.A00 = obj;
        this.A03 = obj2;
        this.A01 = obj3;
        this.A02 = obj4;
    }

    @Override // X.AbstractView$OnClickListenerC08330av
    public void A00(View view) {
        switch (this.A04) {
            case 0:
                AbstractC007503q r3 = (AbstractC007503q) this.A03;
                if (r3 instanceof AnonymousClass289) {
                    AnonymousClass01A r1 = ((AbstractC51572Zg) this.A00).A0e;
                    AnonymousClass02N r2 = r3.A0n.A00;
                    if (r1.A08(r2) != null) {
                        Context context = (Context) this.A01;
                        context.startActivity(Conversation.A05(context, r2));
                        return;
                    }
                    return;
                }
                AbstractC51572Zg r9 = (AbstractC51572Zg) this.A00;
                AnonymousClass01K r5 = r9.A0p;
                C007303n r12 = r3.A0n;
                AbstractC007503q A05 = r5.A0J.A05(r12);
                if (A05 == null && r12.A02) {
                    A05 = r5.A0J.A05(new C007303n(C12060hU.A00, true, r12.A01));
                }
                if (r3 instanceof AnonymousClass0Z9) {
                    AnonymousClass0Z9 r32 = (AnonymousClass0Z9) r3;
                    if (r32.A0n.A01.startsWith("product_inquiry")) {
                        r9.A0a(r32, r9.A06.findViewById(R.id.quoted_thumb), true);
                        return;
                    }
                }
                if (A05 != null) {
                    C007303n r4 = A05.A0n;
                    AnonymousClass02N r13 = r4.A00;
                    if (AnonymousClass1VY.A0b(r13)) {
                        Context context2 = (Context) this.A01;
                        Intent intent = new Intent(context2, StatusPlaybackActivity.class);
                        intent.putExtra("jid", AnonymousClass1VY.A0D(A05.A07()));
                        C006803i.A05(intent, r4);
                        context2.startActivity(intent);
                        return;
                    } else if (r13 == null) {
                        throw null;
                    } else if (!r13.equals(((AbstractC007503q) this.A02).A0n.A00)) {
                        Context context3 = (Context) this.A01;
                        Intent A052 = Conversation.A05(context3, r13);
                        A052.putExtra("row_id", A05.A0p);
                        A052.putExtra("start_t", SystemClock.uptimeMillis());
                        C09100cI.A02.ABx(703934026);
                        C006803i.A05(A052, r4);
                        context3.startActivity(A052);
                        return;
                    } else {
                        Conversation conversation = (Conversation) ((Context) this.A01);
                        Stack stack = conversation.A4e;
                        if (!stack.isEmpty() && ((AnonymousClass1LD) stack.peek()).A01.A0p != r9.getFMessage().A0p) {
                            stack.clear();
                        }
                        stack.push(new AnonymousClass1LD(A05, r9.getFMessage(), r9.getTop()));
                        conversation.A1C(A05, conversation.getResources().getDimensionPixelSize(R.dimen.conversation_row_min_height));
                        if ((A05 instanceof AnonymousClass0ZE) && conversation.A2G.A0D(AbstractC000400g.A1k)) {
                            AbstractC51572Zg A0c = conversation.A0c(r4);
                            if (A0c instanceof AbstractC661433b) {
                                ((AbstractC661433b) A0c).AQ2();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                } else {
                    return;
                }
            case 1:
                C02770Dj r33 = (C02770Dj) this.A01;
                Context context4 = (Context) this.A00;
                AnonymousClass02N r14 = ((AbstractC007503q) this.A02).A0n.A00;
                if (r14 != null) {
                    r33.A08(context4, r14, (UserJid) this.A03);
                    return;
                }
                throw null;
            default:
                super.A00(view);
                return;
        }
    }
}
