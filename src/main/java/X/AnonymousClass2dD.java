package X;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.search.verification.client.R;
import com.whatsapp.Conversation;
import com.whatsapp.InterceptingEditText;
import com.whatsapp.emoji.search.EmojiSearchContainer;
import com.whatsapp.util.ViewOnClickCListenerShape12S0100000_I1_1;

/* renamed from: X.2dD  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2dD {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ AnonymousClass01X A01;
    public final /* synthetic */ C02590Cr A02;
    public final /* synthetic */ C53392d8 A03;
    public final /* synthetic */ C03930Ii A04;
    public final /* synthetic */ EmojiSearchContainer A05;
    public final /* synthetic */ C48672Ng A06;
    public final /* synthetic */ AnonymousClass022 A07;

    public /* synthetic */ AnonymousClass2dD(C48672Ng r1, C53392d8 r2, EmojiSearchContainer emojiSearchContainer, Activity activity, C02590Cr r5, C03930Ii r6, AnonymousClass01X r7, AnonymousClass022 r8) {
        this.A06 = r1;
        this.A03 = r2;
        this.A05 = emojiSearchContainer;
        this.A00 = activity;
        this.A02 = r5;
        this.A04 = r6;
        this.A01 = r7;
        this.A07 = r8;
    }

    public final void A00(C53492dM r16) {
        C48672Ng r2 = this.A06;
        C53392d8 r6 = this.A03;
        EmojiSearchContainer emojiSearchContainer = this.A05;
        Activity activity = this.A00;
        C02590Cr r4 = this.A02;
        C03930Ii r3 = this.A04;
        AnonymousClass01X r5 = this.A01;
        AnonymousClass022 r1 = this.A07;
        r6.A03(r6.A0G);
        r6.A0A = r2;
        C53412dC r0 = new C53412dC(r2);
        emojiSearchContainer.A00 = activity;
        emojiSearchContainer.A06 = r4;
        emojiSearchContainer.A05 = r5;
        emojiSearchContainer.A07 = r3;
        emojiSearchContainer.A09 = r16;
        emojiSearchContainer.A0A = r0;
        emojiSearchContainer.A0B = r1;
        if (!emojiSearchContainer.A0D) {
            emojiSearchContainer.A0D = true;
            activity.getLayoutInflater().inflate(R.layout.emoji_search, (ViewGroup) emojiSearchContainer, true);
            emojiSearchContainer.A02 = emojiSearchContainer.findViewById(R.id.no_results);
            emojiSearchContainer.A03 = (RecyclerView) emojiSearchContainer.findViewById(R.id.search_result);
            emojiSearchContainer.A03.A0j(new C53472dK(emojiSearchContainer.getResources().getDimensionPixelSize(R.dimen.selected_contacts_top_offset)));
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1);
            linearLayoutManager.A1A(0);
            emojiSearchContainer.A03.setLayoutManager(linearLayoutManager);
            emojiSearchContainer.A01 = emojiSearchContainer.findViewById(R.id.progress_container);
            InterceptingEditText interceptingEditText = (InterceptingEditText) emojiSearchContainer.findViewById(R.id.search_bar);
            emojiSearchContainer.A04 = interceptingEditText;
            interceptingEditText.setHint(r5.A06(R.string.emoji_search_hint));
            View findViewById = emojiSearchContainer.findViewById(R.id.clear_search_btn);
            findViewById.setOnClickListener(new ViewOnClickCListenerShape12S0100000_I1_1(emojiSearchContainer, 42));
            emojiSearchContainer.setOnTouchListener(View$OnTouchListenerC48662Ne.A00);
            InterceptingEditText interceptingEditText2 = emojiSearchContainer.A04;
            interceptingEditText2.A00 = new AnonymousClass2dE(r2);
            interceptingEditText2.addTextChangedListener(new C53482dL(emojiSearchContainer, findViewById));
            emojiSearchContainer.findViewById(R.id.back).setOnClickListener(new ViewOnClickCListenerShape12S0100000_I1_1(r2));
            ((ImageView) emojiSearchContainer.findViewById(R.id.back)).setImageDrawable(new C06470Tj(r5, C004302a.A03(emojiSearchContainer.getContext(), R.drawable.ic_emoji_search_back)));
        }
        emojiSearchContainer.setVisibility(0);
        emojiSearchContainer.A02.setVisibility(0);
        emojiSearchContainer.A01.setVisibility(8);
        C59512nn r7 = new C59512nn(emojiSearchContainer, emojiSearchContainer.A00, emojiSearchContainer.A06, emojiSearchContainer.A05, new C53402dB(emojiSearchContainer), emojiSearchContainer.A0B, emojiSearchContainer.getResources().getDimensionPixelSize(R.dimen.emoji_picker_item));
        emojiSearchContainer.A08 = r7;
        emojiSearchContainer.A03.setAdapter(r7);
        emojiSearchContainer.A0C = "";
        emojiSearchContainer.A00("");
        emojiSearchContainer.A04.setText("");
        emojiSearchContainer.A04.requestFocus();
        emojiSearchContainer.A04.A01(false);
        AbstractC03790Hq r22 = r2.A01;
        if (r22 != null) {
            Conversation conversation = (Conversation) r22;
            conversation.A0Y.setTranscriptMode(2);
            conversation.A1n.sendEmptyMessageDelayed(0, 1000);
        }
    }
}
