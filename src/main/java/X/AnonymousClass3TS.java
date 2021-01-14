package X;

import android.view.ViewGroup;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.voipcalling.CallInfoFragment;
import com.whatsapp.voipcalling.Voip;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3TS  reason: invalid class name */
public class AnonymousClass3TS extends AbstractC16300pa {
    public List A00 = new ArrayList();
    public final /* synthetic */ CallInfoFragment A01;

    public AnonymousClass3TS(CallInfoFragment callInfoFragment) {
        this.A01 = callInfoFragment;
    }

    @Override // X.AbstractC16300pa
    public int A05() {
        return this.A00.size();
    }

    @Override // X.AbstractC16300pa
    public AbstractC11910hD A06(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return new AnonymousClass3TT(this.A01.A05().inflate(R.layout.voip_call_info_title_row, viewGroup, false));
        }
        boolean z = true;
        if (i == 1 || i == 3) {
            CallInfoFragment callInfoFragment = this.A01;
            return new AnonymousClass3TQ(callInfoFragment, callInfoFragment.A05().inflate(R.layout.voip_call_info_participant_row, viewGroup, false));
        } else if (i == 4) {
            return new AnonymousClass3TP(this.A01.A05().inflate(R.layout.voip_call_info_button_row, viewGroup, false));
        } else {
            if (i != 2) {
                z = false;
            }
            AnonymousClass00E.A08(z, "voip/CallInfoFragment/ParticipantsListAdapter/onCreateViewHolder invalid viewType");
            return new AnonymousClass3TR(this.A01.A05().inflate(R.layout.voip_call_info_divider_row, viewGroup, false));
        }
    }

    @Override // X.AbstractC16300pa
    public void A07(AbstractC11910hD r8, int i) {
        Object obj = this.A00.get(i);
        if (obj != null) {
            C674138m r4 = (C674138m) obj;
            int i2 = r4.A00;
            if (i2 == 0) {
                AnonymousClass00E.A06(r8 instanceof AnonymousClass3TT);
                String str = r4.A03;
                if (str != null) {
                    ((AnonymousClass3TT) r8).A00.setText(str);
                    return;
                }
                throw null;
            } else if (i2 == 1 || i2 == 3) {
                AnonymousClass00E.A06(r8 instanceof AnonymousClass3TQ);
                C007003k r6 = r4.A02;
                if (r6 != null) {
                    AnonymousClass3TQ r82 = (AnonymousClass3TQ) r8;
                    r82.A02.setVisibility(8);
                    CallInfoFragment callInfoFragment = this.A01;
                    AnonymousClass01I r1 = callInfoFragment.A04;
                    if (r1.A09(r6.A09)) {
                        r82.A03.A00();
                        AnonymousClass0YX r2 = callInfoFragment.A01;
                        r1.A04();
                        AnonymousClass0HR r12 = r1.A01;
                        if (r12 != null) {
                            r2.A02(r12, r82.A01);
                            r82.A01.setOnClickListener(null);
                            AnonymousClass0Q7.A0W(r82.A01, 2);
                            return;
                        }
                        throw null;
                    }
                    r82.A03.A03(r6, null);
                    callInfoFragment.A01.A02(r6, r82.A01);
                    if (r6.A07() && r6.A0O != null) {
                        r82.A02.setVisibility(0);
                        TextEmojiLabel textEmojiLabel = r82.A02;
                        StringBuilder A0S = AnonymousClass008.A0S("~");
                        A0S.append(r6.A0O);
                        textEmojiLabel.A02(A0S.toString());
                    }
                    if (r4.A00 == 3) {
                        r82.A00.setAlpha(0.56f);
                        return;
                    }
                    return;
                }
                throw null;
            } else if (i2 == 4) {
                AnonymousClass00E.A06(r8 instanceof AnonymousClass3TP);
                if (r4.A01 != null) {
                    boolean A3Y = C002001d.A3Y(Voip.getCallInfo(), this.A01.A05);
                    AnonymousClass3TP r22 = (AnonymousClass3TP) r8;
                    r22.A00.setOnClickListener(r4.A01);
                    r22.A00.setClickable(A3Y);
                    C28051Sr.A1S(r8.A0H, A3Y);
                    return;
                }
                throw null;
            }
        } else {
            throw null;
        }
    }
}
