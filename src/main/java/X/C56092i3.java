package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape1S0200000_I1_0;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.util.ViewOnClickCListenerShape13S0100000_I1_2;
import java.util.Calendar;
import java.util.List;

/* renamed from: X.2i3  reason: invalid class name and case insensitive filesystem */
public class C56092i3 extends AbstractC16300pa {
    public final List A00;
    public final boolean A01;
    public final /* synthetic */ AbstractView$OnCreateContextMenuListenerC56112i5 A02;

    public C56092i3(AbstractView$OnCreateContextMenuListenerC56112i5 r1, List list, boolean z) {
        this.A02 = r1;
        this.A00 = list;
        this.A01 = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
        if (r3.A01 != false) goto L_0x0015;
     */
    @Override // X.AbstractC16300pa
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A05() {
        /*
            r3 = this;
            java.util.List r0 = r3.A00
            int r2 = r0.size()
            X.2i5 r1 = r3.A02
            X.0Dx r0 = r1.A0n
            if (r0 != 0) goto L_0x0015
            X.0Dx r0 = r1.A0m
            if (r0 != 0) goto L_0x0015
            boolean r1 = r3.A01
            r0 = 1
            if (r1 == 0) goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            int r2 = r2 + r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56092i3.A05():int");
    }

    @Override // X.AbstractC16300pa
    public AbstractC11910hD A06(ViewGroup viewGroup, int i) {
        int i2 = R.layout.location_sharing_participant_my_row;
        if (i != 0) {
            if (i == 1) {
                i2 = R.layout.location_sharing_participant_row;
            } else if (i != 3) {
                i2 = R.layout.location_sharing_participant_ended;
                if (i != 4) {
                    i2 = R.layout.location_sharing_participant_selected_row;
                }
            } else {
                i2 = R.layout.location_sharing_participant_share_back_row;
            }
        }
        AbstractView$OnCreateContextMenuListenerC56112i5 r2 = this.A02;
        View inflate = r2.A0E.getLayoutInflater().inflate(i2, viewGroup, false);
        if (i == 2) {
            return new C60132or(r2, inflate);
        }
        if (i == 3) {
            return new C60142os(r2, inflate);
        }
        if (i != 4) {
            return new C60122oq(r2, inflate);
        }
        return new C60112op(r2, inflate);
    }

    @Override // X.AbstractC16300pa
    public void A07(AbstractC11910hD r14, int i) {
        C02900Dx r3;
        String str;
        String A0D;
        String str2;
        String A0D2;
        int i2;
        AbstractC56102i4 r142 = (AbstractC56102i4) r14;
        AbstractView$OnCreateContextMenuListenerC56112i5 r2 = this.A02;
        if (r2.A0n != null || r2.A0m != null || this.A01) {
            r3 = (C02900Dx) this.A00.get(i);
        } else if (i != 0) {
            r3 = (C02900Dx) this.A00.get(i - 1);
        } else {
            return;
        }
        C007003k A09 = r2.A10.A09(r3.A06);
        if (A09 == null) {
            return;
        }
        if (r142 instanceof C60132or) {
            C60132or r143 = (C60132or) r142;
            r143.A00 = A09;
            r143.A0H.setOnClickListener(new ViewOnClickEBaseShape1S0200000_I1_0(r143, r3, 49));
            C007003k r1 = r143.A00;
            AbstractView$OnCreateContextMenuListenerC56112i5 r32 = r143.A04;
            AnonymousClass01I r0 = r32.A0y;
            r0.A04();
            if (r1.equals(r0.A01)) {
                TextEmojiLabel textEmojiLabel = r143.A02;
                AnonymousClass01X r7 = r32.A18;
                textEmojiLabel.setText(r7.A06(R.string.you));
                String A1Z = C002001d.A1Z(r7, r32.A1D.A04(r32.A0e) - r32.A16.A05());
                TextEmojiLabel textEmojiLabel2 = r143.A03;
                textEmojiLabel2.setText(A1Z);
                textEmojiLabel2.setVisibility(0);
            } else {
                r143.A02.setText(r32.A13.A08(r143.A00, false));
                if (r143.A00.A07()) {
                    TextEmojiLabel textEmojiLabel3 = r143.A03;
                    textEmojiLabel3.setVisibility(0);
                    String str3 = r143.A00.A0O;
                    if (str3 != null) {
                        StringBuilder A0S = AnonymousClass008.A0S("~");
                        A0S.append(str3);
                        str = A0S.toString();
                    } else {
                        str = null;
                    }
                    textEmojiLabel3.A02(str);
                } else {
                    r143.A03.setVisibility(8);
                }
            }
            r32.A0d.A03(r143.A00, r143.A01);
        } else if (r142 instanceof C60122oq) {
            C60122oq r144 = (C60122oq) r142;
            r144.A00 = A09;
            r144.A0H.setOnClickListener(new ViewOnClickEBaseShape1S0200000_I1_0(r144, r3, 48));
            AbstractView$OnCreateContextMenuListenerC56112i5 r72 = r144.A06;
            AnonymousClass00S r10 = r72.A16;
            long A05 = r10.A05();
            C007003k r12 = r144.A00;
            AnonymousClass01I r02 = r72.A0y;
            r02.A04();
            if (r12.equals(r02.A01)) {
                TextEmojiLabel textEmojiLabel4 = r144.A04;
                AnonymousClass01X r5 = r72.A18;
                textEmojiLabel4.setText(r5.A06(R.string.you));
                r144.A02.setOnClickListener(new ViewOnClickCListenerShape13S0100000_I1_2(r144, 34));
                long A04 = r72.A1D.A04(r72.A0e) - A05;
                if (A04 >= 0) {
                    String A1Z2 = C002001d.A1Z(r5, A04);
                    TextView textView = r144.A03;
                    textView.setText(A1Z2);
                    textView.setVisibility(0);
                } else {
                    r144.A03.setVisibility(8);
                }
            } else {
                r144.A04.setText(r72.A13.A08(r144.A00, false));
                long j = r3.A05;
                if (A05 - j < 60000) {
                    A0D = r72.A18.A06(R.string.location_just_now);
                } else {
                    AnonymousClass01X r6 = r72.A18;
                    A0D = r6.A0D(R.string.live_location_last_updated, AnonymousClass0OZ.A00(r6, r10.A06(j)));
                }
                r144.A02.setText(A0D);
                if (r144.A00.A07()) {
                    TextEmojiLabel textEmojiLabel5 = r144.A05;
                    textEmojiLabel5.setVisibility(0);
                    String str4 = r144.A00.A0O;
                    if (str4 != null) {
                        StringBuilder A0S2 = AnonymousClass008.A0S("~");
                        A0S2.append(str4);
                        str2 = A0S2.toString();
                    } else {
                        str2 = null;
                    }
                    textEmojiLabel5.A02(str2);
                } else {
                    r144.A05.setVisibility(8);
                }
            }
            r72.A0d.A03(r144.A00, r144.A01);
        } else if (r142 instanceof C60112op) {
            C60112op r145 = (C60112op) r142;
            TextView textView2 = r145.A00;
            AbstractView$OnCreateContextMenuListenerC56112i5 r22 = r145.A01;
            AnonymousClass00S r73 = r22.A16;
            long A06 = r73.A06(r3.A05);
            int A002 = AnonymousClass0OY.A00(r73.A05(), A06);
            if (A002 <= 6) {
                if (A002 != 0) {
                    if (A002 != 1) {
                        Calendar instance = Calendar.getInstance();
                        instance.setTimeInMillis(A06);
                        switch (instance.get(7)) {
                            case 1:
                                i2 = R.string.live_location_final_update_sunday;
                                break;
                            case 2:
                                i2 = R.string.live_location_final_update_monday;
                                break;
                            case 3:
                                i2 = R.string.live_location_final_update_tuesday;
                                break;
                            case 4:
                                i2 = R.string.live_location_final_update_wednesday;
                                break;
                            case 5:
                                i2 = R.string.live_location_final_update_thursday;
                                break;
                            case 6:
                                i2 = R.string.live_location_final_update_friday;
                                break;
                            case 7:
                                i2 = R.string.live_location_final_update_saturday;
                                break;
                            default:
                                i2 = 0;
                                break;
                        }
                    } else {
                        i2 = R.string.live_location_final_update_yesterday;
                    }
                } else {
                    i2 = R.string.live_location_final_update_today;
                }
                AnonymousClass01X r23 = r22.A18;
                A0D2 = AnonymousClass0OZ.A01(r23, r23.A0D(i2, AnonymousClass0OZ.A00(r23, A06)), A06);
            } else {
                AnonymousClass01X r33 = r22.A18;
                A0D2 = r33.A0D(R.string.live_location_final_update, C002001d.A1U(r33, A002, A06));
            }
            textView2.setText(A0D2);
        }
    }
}
