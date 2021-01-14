package com.whatsapp.qrcode.contactqr;

import X.AbstractC07290Ww;
import X.ActivityC004902h;
import X.AnonymousClass008;
import X.AnonymousClass00T;
import X.AnonymousClass00Y;
import X.AnonymousClass01A;
import X.AnonymousClass01I;
import X.AnonymousClass01P;
import X.AnonymousClass01X;
import X.AnonymousClass037;
import X.AnonymousClass03P;
import X.AnonymousClass03S;
import X.AnonymousClass08B;
import X.AnonymousClass0AI;
import X.AnonymousClass0BP;
import X.AnonymousClass0HN;
import X.AnonymousClass0L2;
import X.AnonymousClass0Q7;
import X.AnonymousClass0QW;
import X.AnonymousClass0YX;
import X.AnonymousClass31y;
import X.AnonymousClass3MJ;
import X.C000300f;
import X.C002001d;
import X.C002101e;
import X.C007003k;
import X.C014308b;
import X.C02590Cr;
import X.C09060cE;
import X.C09110cJ;
import X.C12420i4;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.facebook.redex.ViewOnClickEBaseShape8S0100000_I1_6;
import com.google.android.search.verification.client.R;
import com.whatsapp.Conversation;
import com.whatsapp.RoundedBottomSheetDialogFragment;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.jid.UserJid;

public class ScannedCodeDialogFragment extends RoundedBottomSheetDialogFragment {
    public int A00;
    public View.OnClickListener A01 = new ViewOnClickEBaseShape8S0100000_I1_6(this, 20);
    public View.OnClickListener A02 = new ViewOnClickEBaseShape8S0100000_I1_6(this, 17);
    public ImageView A03;
    public AnonymousClass0YX A04;
    public C007003k A05;
    public UserJid A06;
    public AbstractC07290Ww A07;
    public C09110cJ A08;
    public String A09;
    public String A0A;
    public String A0B;
    public final AnonymousClass01I A0C = AnonymousClass01I.A00();
    public final C000300f A0D = C000300f.A00();
    public final AnonymousClass01A A0E = AnonymousClass01A.A00();
    public final AnonymousClass0BP A0F = new AnonymousClass3MJ(this);
    public final AnonymousClass08B A0G = AnonymousClass08B.A00;
    public final AnonymousClass0AI A0H = AnonymousClass0AI.A00();
    public final C014308b A0I = C014308b.A00();
    public final AnonymousClass0L2 A0J = AnonymousClass0L2.A01();
    public final AnonymousClass0HN A0K = AnonymousClass0HN.A00();
    public final AnonymousClass03P A0L = AnonymousClass03P.A00();
    public final AnonymousClass03S A0M = AnonymousClass03S.A00();
    public final AnonymousClass01X A0N = AnonymousClass01X.A00();
    public final AnonymousClass01P A0O = AnonymousClass01P.A00();
    public final C02590Cr A0P = C02590Cr.A00();
    public final AnonymousClass00Y A0Q = AnonymousClass00Y.A00();
    public final AnonymousClass31y A0R = AnonymousClass31y.A00();
    public final C09060cE A0S = C09060cE.A01();
    public final AnonymousClass00T A0T = C002101e.A00();

    @Override // X.AnonymousClass037, androidx.fragment.app.DialogFragment
    public void A0Y() {
        super.A0Y();
        this.A0G.A00(this.A0F);
    }

    @Override // X.AnonymousClass037
    public View A0Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String obj;
        Bundle bundle2 = ((AnonymousClass037) this).A06;
        if (bundle2 != null) {
            this.A00 = bundle2.getInt("ARG_TYPE");
            this.A06 = UserJid.getNullable(bundle2.getString("ARG_JID"));
            this.A0A = bundle2.getString("ARG_MESSAGE");
            this.A09 = bundle2.getString("ARG_SOURCE");
            this.A0B = bundle2.getString("ARG_QR_CODE_ID");
            AnonymousClass01A r1 = this.A0E;
            UserJid userJid = this.A06;
            if (userJid != null) {
                this.A05 = r1.A0A(userJid);
                boolean A092 = this.A0C.A09(this.A06);
                ActivityC004902h A0A2 = A0A();
                if (A0A2 != null) {
                    View inflate = A0A2.getLayoutInflater().inflate(R.layout.view_scanned_qr_code, (ViewGroup) null);
                    TextView textView = (TextView) AnonymousClass0Q7.A0D(inflate, R.id.title);
                    TextView textView2 = (TextView) AnonymousClass0Q7.A0D(inflate, R.id.positive_button);
                    this.A03 = (ImageView) AnonymousClass0Q7.A0D(inflate, R.id.profile_picture);
                    View A0D2 = AnonymousClass0Q7.A0D(inflate, R.id.contact_info);
                    TextView textView3 = (TextView) AnonymousClass0Q7.A0D(inflate, R.id.result_title);
                    TextEmojiLabel textEmojiLabel = (TextEmojiLabel) AnonymousClass0Q7.A0D(inflate, R.id.result_subtitle);
                    if (!this.A05.A06()) {
                        textView3.setText(this.A0N.A0F(C12420i4.A02(this.A06)));
                        C014308b r9 = this.A0I;
                        C007003k r3 = this.A05;
                        if (r9.A00.A09(r3.A09)) {
                            obj = r9.A02.A06(R.string.you);
                        } else if (r3.A08 != null) {
                            obj = r9.A08(r3, false);
                        } else {
                            if (!TextUtils.isEmpty(r3.A0O)) {
                                StringBuilder A0S2 = AnonymousClass008.A0S("~");
                                A0S2.append(r3.A0O);
                                obj = A0S2.toString();
                            }
                            textEmojiLabel.setVisibility(8);
                        }
                        if (obj != null) {
                            textEmojiLabel.A04(obj, null, false, 0);
                        }
                        textEmojiLabel.setVisibility(8);
                    } else {
                        TextEmojiLabel textEmojiLabel2 = (TextEmojiLabel) A0D2.findViewById(R.id.result_title);
                        C014308b r12 = this.A0I;
                        C007003k r0 = this.A05;
                        if (r12 != null) {
                            textView3.setText(C002001d.A1H(r0.A04(), A00(), textView3.getPaint(), this.A0P));
                            textEmojiLabel2.A01(R.drawable.ic_verified);
                            textEmojiLabel.setText(A0F(R.string.business_info_official_business_account));
                        } else {
                            throw null;
                        }
                    }
                    this.A04.A02(this.A05, this.A03);
                    int i = this.A00;
                    if (i == 0) {
                        textView.setText(A0F(R.string.qr_title_add_account));
                        if (A092) {
                            textView2.setText(A0F(R.string.ok));
                            textView2.setOnClickListener(this.A02);
                            return inflate;
                        }
                        AnonymousClass0QW r13 = this.A05.A08;
                        int i2 = R.string.contact_qr_add_contact_add;
                        if (r13 != null) {
                            i2 = R.string.contact_qr_contact_message;
                        }
                        textView2.setText(A0F(i2));
                        textView2.setOnClickListener(this.A01);
                        AnonymousClass0Q7.A0D(inflate, R.id.details_row).setOnClickListener(new ViewOnClickEBaseShape8S0100000_I1_6(this, 18));
                        return inflate;
                    } else if (i == 1) {
                        A0w(false, false);
                        return inflate;
                    } else if (i == 2) {
                        textView.setText(A0F(R.string.qr_title_add_account));
                        textView2.setText(R.string.message_qr_continue_to_chat);
                        textView2.setOnClickListener(this.A01);
                        AnonymousClass0Q7.A0D(inflate, R.id.details_row).setOnClickListener(new ViewOnClickEBaseShape8S0100000_I1_6(this, 19));
                        return inflate;
                    } else {
                        throw new IllegalArgumentException("Unhandled type");
                    }
                } else {
                    throw null;
                }
            } else {
                throw null;
            }
        } else {
            throw null;
        }
    }

    @Override // X.AnonymousClass037, androidx.fragment.app.DialogFragment
    public void A0a(Context context) {
        super.A0a(context);
        this.A08 = new C09110cJ(this.A0Q, this.A0D, this.A0L, this.A0M);
        if (context instanceof AbstractC07290Ww) {
            this.A07 = (AbstractC07290Ww) context;
        }
        this.A0G.A01(this.A0F);
    }

    @Override // X.AnonymousClass037
    public void A0c() {
        this.A0U = true;
        this.A04.A00();
    }

    @Override // X.AnonymousClass037
    public void A0g(int i, int i2, Intent intent) {
        if (i == 1) {
            if (i2 == -1) {
                this.A0K.A06();
                Intent A052 = Conversation.A05(A01(), this.A06);
                A052.putExtra("added_by_qr_code", true);
                A0h(A052);
            }
            A0w(false, false);
            this.A08.A00();
        }
    }

    @Override // X.AnonymousClass037, androidx.fragment.app.DialogFragment
    public void A0i(Bundle bundle) {
        super.A0i(bundle);
        this.A04 = this.A0J.A03(A01());
    }

    @Override // androidx.fragment.app.DialogFragment
    public void onDismiss(DialogInterface dialogInterface) {
        if (!((DialogFragment) this).A0C) {
            A0w(true, true);
        }
        AbstractC07290Ww r0 = this.A07;
        if (r0 != null) {
            r0.AIx();
        }
    }
}
