package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.search.verification.client.R;

/* renamed from: X.3R3  reason: invalid class name */
public class AnonymousClass3R3 extends AbstractC11910hD {
    public boolean A00 = true;
    public final View A01;
    public final View A02;
    public final View A03;
    public final View A04;
    public final View A05;
    public final ViewGroup A06;
    public final ViewGroup A07;
    public final AnonymousClass01X A08;

    public AnonymousClass3R3(Context context, AnonymousClass01X r5, ViewGroup viewGroup) {
        super(LayoutInflater.from(context).inflate(R.layout.sticker_picker_reactions, viewGroup, false));
        this.A08 = r5;
        View view = this.A0H;
        this.A01 = view.findViewById(R.id.reactions_bg);
        this.A02 = view.findViewById(R.id.reaction_lol);
        this.A04 = view.findViewById(R.id.reaction_sad);
        this.A03 = view.findViewById(R.id.reaction_love);
        this.A05 = view.findViewById(R.id.reaction_wow);
        this.A07 = (ViewGroup) view.findViewById(R.id.reactions_right);
        this.A06 = (ViewGroup) view.findViewById(R.id.reactions_left);
    }

    public void A0C() {
        if (!this.A00) {
            this.A01.setBackgroundResource(0);
            C09370cm.A01((ViewGroup) this.A0H, new C30811bz());
            this.A05.setVisibility(8);
            this.A02.setVisibility(8);
            this.A04.setVisibility(8);
            this.A03.setSelected(false);
            this.A00 = true;
        }
    }
}
