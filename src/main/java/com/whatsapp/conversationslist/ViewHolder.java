package com.whatsapp.conversationslist;

import X.AbstractC10770fA;
import X.AbstractC11890hA;
import X.AbstractC11900hC;
import X.AbstractC11990hN;
import X.AnonymousClass00G;
import X.AnonymousClass00S;
import X.AnonymousClass01A;
import X.AnonymousClass01I;
import X.AnonymousClass01X;
import X.AnonymousClass082;
import X.AnonymousClass0A9;
import X.AnonymousClass0AP;
import X.AnonymousClass0BB;
import X.AnonymousClass0GG;
import X.AnonymousClass0HJ;
import X.AnonymousClass0Q7;
import X.AnonymousClass0SL;
import X.AnonymousClass0Y5;
import X.AnonymousClass0YX;
import X.AnonymousClass0Z6;
import X.AnonymousClass0Z7;
import X.AnonymousClass2I3;
import X.AnonymousClass31y;
import X.C000300f;
import X.C002001d;
import X.C002301g;
import X.C004302a;
import X.C006803i;
import X.C006903j;
import X.C014308b;
import X.C017009c;
import X.C02150Av;
import X.C09030cB;
import X.C09050cD;
import X.C09610dF;
import X.C10760f9;
import X.C11980hM;
import X.C12000hO;
import X.C52242ao;
import X.C52252ap;
import X.C52392b3;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.OnLifecycleEvent;
import com.google.android.search.verification.client.R;
import com.whatsapp.SelectionCheckView;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaTextView;
import com.whatsapp.components.ConversationListRowHeaderView;

public class ViewHolder extends AbstractC11900hC implements AnonymousClass0SL {
    public AnonymousClass2I3 A00;
    public AbstractC11990hN A01;
    public AbstractC10770fA A02;
    public final View A03;
    public final View A04;
    public final View A05;
    public final View A06;
    public final ImageView A07;
    public final ImageView A08;
    public final ImageView A09;
    public final ImageView A0A;
    public final ImageView A0B;
    public final ImageView A0C;
    public final ImageView A0D;
    public final TextView A0E;
    public final AnonymousClass0GG A0F;
    public final C09050cD A0G;
    public final AnonymousClass01I A0H;
    public final AnonymousClass0Z6 A0I;
    public final SelectionCheckView A0J;
    public final C000300f A0K;
    public final AnonymousClass0Z7 A0L;
    public final TextEmojiLabel A0M;
    public final TextEmojiLabel A0N;
    public final WaTextView A0O;
    public final C017009c A0P;
    public final AnonymousClass0HJ A0Q;
    public final AnonymousClass01A A0R;
    public final C014308b A0S;
    public final AnonymousClass0YX A0T;
    public final C09030cB A0U;
    public final AnonymousClass0Y5 A0V;
    public final AnonymousClass00S A0W;
    public final AnonymousClass00G A0X;
    public final AnonymousClass01X A0Y;
    public final C006903j A0Z;
    public final AnonymousClass0A9 A0a;
    public final AnonymousClass0AP A0b;
    public final C02150Av A0c;
    public final AnonymousClass0BB A0d;
    public final AbstractC11890hA A0e;

    public ViewHolder(Context context, View view, AnonymousClass00S r8, AnonymousClass0Z6 r9, AnonymousClass01I r10, AnonymousClass00G r11, C006903j r12, C000300f r13, C02150Av r14, AnonymousClass0HJ r15, AnonymousClass01A r16, C09050cD r17, AnonymousClass0A9 r18, C014308b r19, AnonymousClass01X r20, AbstractC11890hA r21, AnonymousClass0GG r22, AnonymousClass0AP r23, AnonymousClass31y r24, AnonymousClass0BB r25, AnonymousClass0YX r26, C09030cB r27, C017009c r28, AnonymousClass0Z7 r29, AnonymousClass0Y5 r30) {
        super(view);
        this.A0W = r8;
        this.A0I = r9;
        this.A0H = r10;
        this.A0X = r11;
        this.A0Z = r12;
        this.A0K = r13;
        this.A0c = r14;
        this.A0Q = r15;
        this.A0R = r16;
        this.A0G = r17;
        this.A0a = r18;
        this.A0S = r19;
        this.A0Y = r20;
        this.A0e = r21;
        this.A0F = r22;
        this.A0b = r23;
        this.A0d = r25;
        this.A0T = r26;
        this.A0U = r27;
        this.A0P = r28;
        this.A0L = r29;
        this.A0V = r30;
        this.A00 = new AnonymousClass2I3((ConversationListRowHeaderView) AnonymousClass0Q7.A0D(view, R.id.conversations_row_header), r19, r20, r24);
        this.A05 = AnonymousClass0Q7.A0D(view, R.id.contact_row_container);
        C002301g.A03(this.A00.A00.A00);
        this.A06 = AnonymousClass0Q7.A0D(view, R.id.progressbar_small);
        this.A08 = (ImageView) AnonymousClass0Q7.A0D(view, R.id.contact_photo);
        this.A04 = AnonymousClass0Q7.A0D(view, R.id.contact_selector);
        this.A0M = (TextEmojiLabel) AnonymousClass0Q7.A0D(view, R.id.single_msg_tv);
        this.A0N = (TextEmojiLabel) AnonymousClass0Q7.A0D(view, R.id.msg_from_tv);
        this.A0E = (TextView) AnonymousClass0Q7.A0D(view, R.id.conversations_row_message_count);
        this.A0D = (ImageView) AnonymousClass0Q7.A0D(view, R.id.status_indicator);
        this.A0A = (ImageView) AnonymousClass0Q7.A0D(view, R.id.media_indicator);
        this.A0O = (WaTextView) AnonymousClass0Q7.A0D(view, R.id.payments_indicator);
        this.A0B = (ImageView) AnonymousClass0Q7.A0D(view, R.id.mute_indicator);
        ImageView imageView = (ImageView) AnonymousClass0Q7.A0D(view, R.id.pin_indicator);
        this.A0C = imageView;
        C002001d.A2m(imageView, C004302a.A00(context, R.color.conversationBadgeTint));
        this.A09 = (ImageView) AnonymousClass0Q7.A0D(view, R.id.live_location_indicator);
        this.A03 = AnonymousClass0Q7.A0D(view, R.id.archived_indicator);
        this.A0J = (SelectionCheckView) AnonymousClass0Q7.A0D(view, R.id.selection_check);
        this.A07 = (ImageView) AnonymousClass0Q7.A0D(view, R.id.conversations_row_ephemeral_status);
    }

    public void A0F(AbstractC10770fA r44, boolean z, Context context, Activity activity, C09610dF r48, boolean z2) {
        if (!C006803i.A0q(this.A02, r44)) {
            AbstractC11990hN r0 = this.A01;
            if (r0 != null) {
                r0.A00();
            }
            this.A02 = r44;
        }
        this.A08.setTag(null);
        if (r44 instanceof C10760f9) {
            this.A01 = new C11980hM(z2, this, context, activity, r48, this.A0W, this.A0I, this.A0H, this.A0X, this.A0Z, this.A0K, this.A0c, this.A0Q, this.A0R, this.A0G, this.A0a, this.A0S, this.A0Y, this.A0e, this.A0F, this.A0b, this.A0d, this.A0T, this.A0U, this.A0P, this.A0L, this.A0V);
        } else if (r44 instanceof C52242ao) {
            this.A01 = new C52252ap(this, context, activity, r48, this.A0W, this.A0I, this.A0H, this.A0X, this.A0K, this.A0c, this.A0a, this.A0S, this.A0Y, this.A0e, this.A0F, this.A0T, this.A0P, this.A0L, this.A0V);
        } else if (r44 instanceof C52392b3) {
            this.A01 = new C12000hO(this, context, activity, r48, this.A0W, this.A0I, this.A0H, this.A0X, this.A0K, this.A0c, this.A0a, this.A0S, this.A0Y, this.A0e, this.A0F, this.A0U, this.A0P, this.A0L, this.A0V);
        }
        this.A01.A01(this.A02, z);
    }

    @OnLifecycleEvent(AnonymousClass082.ON_DESTROY)
    public void onDestroy() {
        AbstractC11990hN r0 = this.A01;
        if (r0 != null) {
            r0.A00();
        }
    }
}
